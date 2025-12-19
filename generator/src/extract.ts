import { execSync } from 'child_process';
import * as fs from 'fs';
import * as path from 'path';
import * as csstree from 'css-tree';
import { loadConfig, createMetadata, GeneratorConfig } from './config';

interface UtilityClass {
  className: string;
  category: string;
  css?: string;
}

interface CategorizedUtilities {
  [category: string]: string[];
}

/**
 * Builds Tailwind CSS and returns the output CSS content
 */
function buildTailwindCSS(config: GeneratorConfig): string {
  console.log('Building Tailwind CSS...');

  try {
    // Use Tailwind CLI to build CSS
    const outputPath = path.join(__dirname, '..', 'output.css');
    const inputPath = path.join(__dirname, '..', config.tailwind.inputCss);
    const configPath = path.join(__dirname, '..', config.tailwind.configFile);

    // Use major version for CLI (e.g., "4.1.18" -> "4")
    const majorVersion = config.tailwind.version.split('.')[0];
    const command = `npx @tailwindcss/cli@${majorVersion} -i "${inputPath}" -o "${outputPath}" -c "${configPath}" --minify`;

    console.log(`Using Tailwind CSS v${config.tailwind.version}`);
    console.log(`Running: ${command}`);
    execSync(command, { stdio: 'inherit' });

    const cssContent = fs.readFileSync(outputPath, 'utf-8');
    console.log(`Generated CSS size: ${(cssContent.length / 1024).toFixed(2)} KB`);

    return cssContent;
  } catch (error) {
    console.error('Error building Tailwind CSS:', error);
    throw error;
  }
}

/**
 * Parses CSS and extracts utility class names
 */
function extractUtilityClasses(cssContent: string): Set<string> {
  console.log('Parsing CSS and extracting utility classes...');

  const utilities = new Set<string>();

  try {
    const ast = csstree.parse(cssContent);

    csstree.walk(ast, {
      visit: 'Rule',
      enter(node) {
        if (node.prelude && node.prelude.type === 'SelectorList') {
          csstree.walk(node.prelude, {
            visit: 'ClassSelector',
            enter(classNode) {
              if (classNode.name) {
                // Normalize class name by removing escape characters
                const className = classNode.name.replace(/\\/g, '');

                // Filter out non-utility classes
                if (!className.startsWith('group') &&
                    !className.startsWith('peer') &&
                    !className.includes(':')) {  // Skip modifiers (hover:, focus:, etc.)
                  utilities.add(className);
                }
              }
            }
          });
        }
      }
    });

    console.log(`Extracted ${utilities.size} unique utility classes`);
    return utilities;
  } catch (error) {
    console.error('Error parsing CSS:', error);
    throw error;
  }
}

/**
 * Categorizes utility classes by pattern
 */
function categorizeUtilities(utilities: Set<string>): CategorizedUtilities {
  console.log('Categorizing utilities...');

  const categories: CategorizedUtilities = {
    // Layout
    display: [],
    position: [],
    visibility: [],
    'z-index': [],
    overflow: [],
    overscroll: [],

    // Flexbox
    'flex-direction': [],
    'flex-wrap': [],
    'flex-grow-shrink': [],
    'flex-basis': [],
    'align-items': [],
    'align-content': [],
    'align-self': [],
    'justify-content': [],
    'justify-items': [],
    'justify-self': [],
    'place-content': [],
    'place-items': [],
    'place-self': [],

    // Grid
    'grid-template-columns': [],
    'grid-template-rows': [],
    'grid-column': [],
    'grid-row': [],
    'grid-flow': [],
    'grid-auto-columns': [],
    'grid-auto-rows': [],
    gap: [],

    // Spacing
    padding: [],
    margin: [],
    'space-between': [],

    // Sizing
    width: [],
    'min-width': [],
    'max-width': [],
    height: [],
    'min-height': [],
    'max-height': [],
    size: [],

    // Typography
    'font-family': [],
    'font-size': [],
    'font-weight': [],
    'font-style': [],
    'font-variant-numeric': [],
    'line-height': [],
    'letter-spacing': [],
    'text-align': [],
    'text-color': [],
    'text-decoration': [],
    'text-decoration-color': [],
    'text-decoration-style': [],
    'text-decoration-thickness': [],
    'text-underline-offset': [],
    'text-transform': [],
    'text-overflow': [],
    'text-indent': [],
    'text-wrap': [],
    'vertical-align': [],
    whitespace: [],
    'word-break': [],
    hyphens: [],
    content: [],

    // Backgrounds
    'background-color': [],
    'background-position': [],
    'background-size': [],
    'background-repeat': [],
    'background-clip': [],
    'background-origin': [],
    'background-blend': [],

    // Borders
    'border-radius': [],
    'border-width': [],
    'border-color': [],
    'border-style': [],
    'border-spacing': [],
    divide: [],
    outline: [],
    ring: [],

    // Effects
    'box-shadow': [],
    'box-shadow-color': [],
    opacity: [],
    'mix-blend': [],

    // Filters
    blur: [],
    brightness: [],
    contrast: [],
    'drop-shadow': [],
    grayscale: [],
    'hue-rotate': [],
    invert: [],
    saturate: [],
    sepia: [],
    backdrop: [],

    // Transitions & Animations
    transition: [],
    duration: [],
    ease: [],
    delay: [],
    animation: [],

    // Transforms
    scale: [],
    rotate: [],
    translate: [],
    skew: [],
    'transform-origin': [],

    // Interactivity
    accent: [],
    appearance: [],
    cursor: [],
    caret: [],
    'pointer-events': [],
    resize: [],
    'scroll-behavior': [],
    'scroll-margin': [],
    'scroll-padding': [],
    'scroll-snap-align': [],
    'scroll-snap-stop': [],
    'scroll-snap-type': [],
    'touch-action': [],
    'user-select': [],
    'will-change': [],

    // SVG
    fill: [],
    stroke: [],
    'stroke-width': [],

    // Tables
    'border-collapse': [],
    'border-spacing-table': [],
    'table-layout': [],
    'caption-side': [],

    // Accessibility
    'screen-readers': [],
    'forced-color-adjust': [],

    // Other
    float: [],
    clear: [],
    isolation: [],
    'object-fit': [],
    'object-position': [],
    'aspect-ratio': [],
    columns: [],
    'break-after': [],
    'break-before': [],
    'break-inside': [],
    'box-decoration-break': [],
    'box-sizing': [],
    order: [],
    'list-style-type': [],
    'list-style-position': [],

    // Catch-all for uncategorized
    other: []
  };

  utilities.forEach(className => {
    let categorized = false;

    // Display
    if (['block', 'inline', 'inline-block', 'flex', 'inline-flex', 'grid', 'inline-grid', 'table', 'inline-table', 'table-caption', 'table-cell', 'table-column', 'table-column-group', 'table-footer-group', 'table-header-group', 'table-row-group', 'table-row', 'flow-root', 'contents', 'list-item', 'hidden'].includes(className)) {
      categories.display.push(className);
      categorized = true;
    }
    // Position
    else if (['static', 'fixed', 'absolute', 'relative', 'sticky'].includes(className)) {
      categories.position.push(className);
      categorized = true;
    }
    // Position values
    else if (className.startsWith('inset-') || className.startsWith('top-') || className.startsWith('right-') || className.startsWith('bottom-') || className.startsWith('left-') || className.startsWith('start-') || className.startsWith('end-')) {
      categories.position.push(className);
      categorized = true;
    }
    // Visibility
    else if (['visible', 'invisible', 'collapse'].includes(className)) {
      categories.visibility.push(className);
      categorized = true;
    }
    // Z-index
    else if (className.startsWith('z-')) {
      categories['z-index'].push(className);
      categorized = true;
    }
    // Flexbox
    else if (className.startsWith('flex-row') || className.startsWith('flex-col')) {
      categories['flex-direction'].push(className);
      categorized = true;
    }
    else if (className.startsWith('flex-wrap') || className.startsWith('flex-nowrap')) {
      categories['flex-wrap'].push(className);
      categorized = true;
    }
    else if (className.startsWith('flex-grow') || className.startsWith('flex-shrink') || ['flex-1', 'flex-auto', 'flex-initial', 'flex-none'].includes(className)) {
      categories['flex-grow-shrink'].push(className);
      categorized = true;
    }
    else if (className.startsWith('basis-')) {
      categories['flex-basis'].push(className);
      categorized = true;
    }
    else if (className.startsWith('items-')) {
      categories['align-items'].push(className);
      categorized = true;
    }
    else if (className.startsWith('content-')) {
      categories['align-content'].push(className);
      categorized = true;
    }
    else if (className.startsWith('self-')) {
      categories['align-self'].push(className);
      categorized = true;
    }
    else if (className.startsWith('justify-content-') || (className.startsWith('justify-') && !className.startsWith('justify-items-') && !className.startsWith('justify-self-'))) {
      categories['justify-content'].push(className);
      categorized = true;
    }
    else if (className.startsWith('justify-items-')) {
      categories['justify-items'].push(className);
      categorized = true;
    }
    else if (className.startsWith('justify-self-')) {
      categories['justify-self'].push(className);
      categorized = true;
    }
    else if (className.startsWith('place-content-')) {
      categories['place-content'].push(className);
      categorized = true;
    }
    else if (className.startsWith('place-items-')) {
      categories['place-items'].push(className);
      categorized = true;
    }
    else if (className.startsWith('place-self-')) {
      categories['place-self'].push(className);
      categorized = true;
    }
    // Grid
    else if (className.startsWith('grid-cols-')) {
      categories['grid-template-columns'].push(className);
      categorized = true;
    }
    else if (className.startsWith('grid-rows-')) {
      categories['grid-template-rows'].push(className);
      categorized = true;
    }
    else if (className.startsWith('col-')) {
      categories['grid-column'].push(className);
      categorized = true;
    }
    else if (className.startsWith('row-')) {
      categories['grid-row'].push(className);
      categorized = true;
    }
    else if (className.startsWith('grid-flow-')) {
      categories['grid-flow'].push(className);
      categorized = true;
    }
    else if (className.startsWith('auto-cols-')) {
      categories['grid-auto-columns'].push(className);
      categorized = true;
    }
    else if (className.startsWith('auto-rows-')) {
      categories['grid-auto-rows'].push(className);
      categorized = true;
    }
    else if (className.startsWith('gap-')) {
      categories.gap.push(className);
      categorized = true;
    }
    // Padding
    else if (className.startsWith('p-') || className.startsWith('px-') || className.startsWith('py-') || className.startsWith('pt-') || className.startsWith('pr-') || className.startsWith('pb-') || className.startsWith('pl-') || className.startsWith('ps-') || className.startsWith('pe-')) {
      categories.padding.push(className);
      categorized = true;
    }
    // Margin
    else if (className.startsWith('m-') || className.startsWith('mx-') || className.startsWith('my-') || className.startsWith('mt-') || className.startsWith('mr-') || className.startsWith('mb-') || className.startsWith('ml-') || className.startsWith('ms-') || className.startsWith('me-') || className.startsWith('-m-') || className.startsWith('-mx-') || className.startsWith('-my-') || className.startsWith('-mt-') || className.startsWith('-mr-') || className.startsWith('-mb-') || className.startsWith('-ml-')) {
      categories.margin.push(className);
      categorized = true;
    }
    // Space between
    else if (className.startsWith('space-x-') || className.startsWith('space-y-')) {
      categories['space-between'].push(className);
      categorized = true;
    }
    // Width
    else if (className.startsWith('w-')) {
      categories.width.push(className);
      categorized = true;
    }
    else if (className.startsWith('min-w-')) {
      categories['min-width'].push(className);
      categorized = true;
    }
    else if (className.startsWith('max-w-')) {
      categories['max-width'].push(className);
      categorized = true;
    }
    // Height
    else if (className.startsWith('h-')) {
      categories.height.push(className);
      categorized = true;
    }
    else if (className.startsWith('min-h-')) {
      categories['min-height'].push(className);
      categorized = true;
    }
    else if (className.startsWith('max-h-')) {
      categories['max-height'].push(className);
      categorized = true;
    }
    // Size
    else if (className.startsWith('size-')) {
      categories.size.push(className);
      categorized = true;
    }
    // Font
    else if (className.startsWith('font-sans') || className.startsWith('font-serif') || className.startsWith('font-mono')) {
      categories['font-family'].push(className);
      categorized = true;
    }
    else if (className.startsWith('text-xs') || className.startsWith('text-sm') || className.startsWith('text-base') || className.startsWith('text-lg') || className.startsWith('text-xl') || className.startsWith('text-2xl') || className.startsWith('text-3xl') || className.startsWith('text-4xl') || className.startsWith('text-5xl') || className.startsWith('text-6xl') || className.startsWith('text-7xl') || className.startsWith('text-8xl') || className.startsWith('text-9xl')) {
      categories['font-size'].push(className);
      categorized = true;
    }
    else if (className.startsWith('font-thin') || className.startsWith('font-extralight') || className.startsWith('font-light') || className.startsWith('font-normal') || className.startsWith('font-medium') || className.startsWith('font-semibold') || className.startsWith('font-bold') || className.startsWith('font-extrabold') || className.startsWith('font-black')) {
      categories['font-weight'].push(className);
      categorized = true;
    }
    else if (['italic', 'not-italic'].includes(className)) {
      categories['font-style'].push(className);
      categorized = true;
    }
    // Text color
    else if (className.startsWith('text-') && !className.startsWith('text-xs') && !className.startsWith('text-sm') && !className.startsWith('text-base') && !className.startsWith('text-lg') && !className.startsWith('text-xl') && !className.startsWith('text-left') && !className.startsWith('text-center') && !className.startsWith('text-right') && !className.startsWith('text-justify') && !className.startsWith('text-start') && !className.startsWith('text-end') && !className.startsWith('text-ellipsis') && !className.startsWith('text-clip') && !className.startsWith('text-wrap') && !className.startsWith('text-nowrap') && !className.startsWith('text-balance') && !className.startsWith('text-pretty')) {
      categories['text-color'].push(className);
      categorized = true;
    }
    // Text alignment
    else if (className.startsWith('text-left') || className.startsWith('text-center') || className.startsWith('text-right') || className.startsWith('text-justify') || className.startsWith('text-start') || className.startsWith('text-end')) {
      categories['text-align'].push(className);
      categorized = true;
    }
    // Text decoration
    else if (['underline', 'overline', 'line-through', 'no-underline'].includes(className)) {
      categories['text-decoration'].push(className);
      categorized = true;
    }
    else if (className.startsWith('decoration-') && !className.startsWith('decoration-solid') && !className.startsWith('decoration-double') && !className.startsWith('decoration-dotted') && !className.startsWith('decoration-dashed') && !className.startsWith('decoration-wavy')) {
      categories['text-decoration-color'].push(className);
      categorized = true;
    }
    else if (className.startsWith('decoration-solid') || className.startsWith('decoration-double') || className.startsWith('decoration-dotted') || className.startsWith('decoration-dashed') || className.startsWith('decoration-wavy')) {
      categories['text-decoration-style'].push(className);
      categorized = true;
    }
    // Text transform
    else if (['uppercase', 'lowercase', 'capitalize', 'normal-case'].includes(className)) {
      categories['text-transform'].push(className);
      categorized = true;
    }
    // Background color
    else if (className.startsWith('bg-') && !className.startsWith('bg-clip-') && !className.startsWith('bg-origin-') && !className.startsWith('bg-repeat') && !className.startsWith('bg-no-repeat') && !className.startsWith('bg-auto') && !className.startsWith('bg-cover') && !className.startsWith('bg-contain') && !className.startsWith('bg-fixed') && !className.startsWith('bg-local') && !className.startsWith('bg-scroll') && !className.startsWith('bg-bottom') && !className.startsWith('bg-center') && !className.startsWith('bg-left') && !className.startsWith('bg-right') && !className.startsWith('bg-top') && !className.startsWith('bg-blend-')) {
      categories['background-color'].push(className);
      categorized = true;
    }
    // Border radius
    else if (className.startsWith('rounded-') || className === 'rounded') {
      categories['border-radius'].push(className);
      categorized = true;
    }
    // Border width
    else if (className.startsWith('border-') && !className.startsWith('border-solid') && !className.startsWith('border-dashed') && !className.startsWith('border-dotted') && !className.startsWith('border-double') && !className.startsWith('border-hidden') && !className.startsWith('border-none') && !className.startsWith('border-collapse') && !className.startsWith('border-separate') && !className.startsWith('border-spacing-') && className.match(/^border-(\d|x-|y-|t-|r-|b-|l-|s-|e-)/)) {
      categories['border-width'].push(className);
      categorized = true;
    }
    else if (className === 'border') {
      categories['border-width'].push(className);
      categorized = true;
    }
    // Border color
    else if (className.startsWith('border-') && !className.match(/^border-(\d|x-|y-|t-|r-|b-|l-|s-|e-|solid|dashed|dotted|double|hidden|none|collapse|separate|spacing)/)) {
      categories['border-color'].push(className);
      categorized = true;
    }
    // Border style
    else if (className.startsWith('border-solid') || className.startsWith('border-dashed') || className.startsWith('border-dotted') || className.startsWith('border-double') || className.startsWith('border-hidden') || className.startsWith('border-none')) {
      categories['border-style'].push(className);
      categorized = true;
    }
    // Shadow
    else if (className.startsWith('shadow-') || className === 'shadow') {
      categories['box-shadow'].push(className);
      categorized = true;
    }
    // Opacity
    else if (className.startsWith('opacity-')) {
      categories.opacity.push(className);
      categorized = true;
    }
    // Transitions
    else if (className.startsWith('transition-') || className === 'transition') {
      categories.transition.push(className);
      categorized = true;
    }
    else if (className.startsWith('duration-')) {
      categories.duration.push(className);
      categorized = true;
    }
    else if (className.startsWith('ease-')) {
      categories.ease.push(className);
      categorized = true;
    }
    else if (className.startsWith('delay-')) {
      categories.delay.push(className);
      categorized = true;
    }
    // Animation
    else if (className.startsWith('animate-')) {
      categories.animation.push(className);
      categorized = true;
    }
    // Transforms
    else if (className.startsWith('scale-')) {
      categories.scale.push(className);
      categorized = true;
    }
    else if (className.startsWith('rotate-') || className.startsWith('-rotate-')) {
      categories.rotate.push(className);
      categorized = true;
    }
    else if (className.startsWith('translate-') || className.startsWith('-translate-')) {
      categories.translate.push(className);
      categorized = true;
    }
    else if (className.startsWith('skew-') || className.startsWith('-skew-')) {
      categories.skew.push(className);
      categorized = true;
    }
    // Cursor
    else if (className.startsWith('cursor-')) {
      categories.cursor.push(className);
      categorized = true;
    }
    // Overflow
    else if (className.startsWith('overflow-')) {
      categories.overflow.push(className);
      categorized = true;
    }

    if (!categorized) {
      categories.other.push(className);
    }
  });

  // Remove empty categories
  Object.keys(categories).forEach(key => {
    if (categories[key].length === 0) {
      delete categories[key];
    }
  });

  // Sort each category
  Object.keys(categories).forEach(key => {
    categories[key].sort();
  });

  console.log(`Categorized into ${Object.keys(categories).length} categories`);
  return categories;
}

/**
 * Main extraction function
 */
function main() {
  console.log('=== Tailwind CSS Utility Extractor ===\n');

  // Load configuration
  const config = loadConfig();

  // Build Tailwind CSS
  const cssContent = buildTailwindCSS(config);

  // Extract utility classes
  const utilities = extractUtilityClasses(cssContent);

  // Categorize utilities
  const categorized = categorizeUtilities(utilities);

  // Create metadata
  const metadata = createMetadata(config.tailwind.version, utilities.size);

  // Write output with metadata
  const outputPath = path.join(__dirname, '..', 'categorized-utilities.json');
  const output = {
    metadata,
    utilities: categorized
  };
  fs.writeFileSync(outputPath, JSON.stringify(output, null, 2));
  console.log(`\nWrote categorized utilities to: ${outputPath}`);

  // Print statistics
  console.log('\n=== Statistics ===');
  console.log(`Tailwind version: ${metadata.tailwindVersion}`);
  console.log(`Total utilities: ${utilities.size}`);
  console.log(`Categories: ${Object.keys(categorized).length}`);
  console.log(`Generated: ${metadata.generatedDate}`);
  console.log('\nUtilities per category:');
  Object.entries(categorized)
    .sort(([, a], [, b]) => b.length - a.length)
    .forEach(([category, utils]) => {
      console.log(`  ${category}: ${utils.length}`);
    });

  console.log('\n=== Extraction complete! ===');
}

main();
