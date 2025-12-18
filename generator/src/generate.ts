import * as fs from 'fs';
import * as path from 'path';
import { loadConfig, GeneratorConfig, Metadata } from './config';

interface CategorizedUtilities {
  [category: string]: string[];
}

/**
 * Normalizes a class name by removing escape characters
 */
function normalizeClassName(className: string): string {
  // Remove backslash escapes that come from CSS parsing
  return className.replace(/\\/g, '');
}

/**
 * Converts a Tailwind class name to a Java constant name
 */
function toConstantName(className: string): string {
  // Normalize first to remove escapes
  className = normalizeClassName(className);

  // Handle negative values
  const isNegative = className.startsWith('-');
  if (isNegative) {
    className = className.substring(1);
  }

  // Replace hyphens with underscores
  let constantName = className.replace(/-/g, '_');

  // Replace dots with underscores
  constantName = constantName.replace(/\./g, '_');

  // Replace slashes with underscores
  constantName = constantName.replace(/\//g, '_');

  // Convert to uppercase
  constantName = constantName.toUpperCase();

  // Add NEG prefix for negative values
  if (isNegative) {
    constantName = 'NEG_' + constantName;
  }

  // Handle Java reserved keywords
  const javaKeywords = ['ABSTRACT', 'ASSERT', 'BOOLEAN', 'BREAK', 'BYTE', 'CASE', 'CATCH', 'CHAR', 'CLASS', 'CONST', 'CONTINUE', 'DEFAULT', 'DO', 'DOUBLE', 'ELSE', 'ENUM', 'EXTENDS', 'FINAL', 'FINALLY', 'FLOAT', 'FOR', 'GOTO', 'IF', 'IMPLEMENTS', 'IMPORT', 'INSTANCEOF', 'INT', 'INTERFACE', 'LONG', 'NATIVE', 'NEW', 'PACKAGE', 'PRIVATE', 'PROTECTED', 'PUBLIC', 'RETURN', 'SHORT', 'STATIC', 'STRICTFP', 'SUPER', 'SWITCH', 'SYNCHRONIZED', 'THIS', 'THROW', 'THROWS', 'TRANSIENT', 'TRY', 'VOID', 'VOLATILE', 'WHILE'];

  if (javaKeywords.includes(constantName)) {
    constantName = constantName + '_CLASS';
  }

  return constantName;
}

/**
 * Generates JavaDoc for a constant
 */
function generateJavaDoc(className: string, constantName: string): string {
  return `    /** Tailwind class: {@code ${className}} */`;
}

/**
 * Groups constants by their prefix for better organization
 */
function groupByPrefix(utilities: string[]): Map<string, string[]> {
  const groups = new Map<string, string[]>();

  utilities.forEach(className => {
    // Get prefix (first part before hyphen or number)
    const match = className.match(/^([a-z]+)/);
    const prefix = match ? match[1] : 'other';

    if (!groups.has(prefix)) {
      groups.set(prefix, []);
    }
    groups.get(prefix)?.push(className);
  });

  return groups;
}

/**
 * Generates the main TW.java class
 */
function generateTWClass(categorized: CategorizedUtilities, config: GeneratorConfig, metadata: Metadata): string {
  const lines: string[] = [];

  // Package and imports
  lines.push(`package ${config.java.package};`);
  lines.push('');
  lines.push('import java.io.Serializable;');
  lines.push('');

  // Class JavaDoc
  lines.push('/**');
  lines.push(` * Tailwind CSS utility class constants for type-safe styling in Vaadin Flow.`);
  lines.push(' * <p>');
  lines.push(` * This class provides constants for Tailwind CSS v${metadata.tailwindVersion} utility classes,`);
  lines.push(' * enabling IDE autocomplete and compile-time validation of class names.');
  lines.push(' *');
  lines.push(' * <h2>Usage Example</h2>');
  lines.push(' * <pre>{@code');
  lines.push(' * Div container = new Div();');
  lines.push(` * container.addClassNames(${config.java.className}.FLEX, ${config.java.className}.ITEMS_CENTER, ${config.java.className}.P_4, ${config.java.className}.BG_GRAY_100);`);
  lines.push(' *');
  lines.push(' * // With responsive modifiers');
  lines.push(' * container.addClassNames(');
  lines.push(` *     ${config.java.className}.FLEX,`);
  lines.push(` *     ${config.java.className}.Responsive.sm(${config.java.className}.FLEX_COL),`);
  lines.push(` *     ${config.java.className}.Responsive.md(${config.java.className}.FLEX_ROW)`);
  lines.push(' * );');
  lines.push(' * }</pre>');
  lines.push(' *');
  lines.push(` * <p>Generated on: ${metadata.generatedDate}</p>`);
  lines.push(' *');
  lines.push(' * @see <a href="https://tailwindcss.com/docs">Tailwind CSS Documentation</a>');
  lines.push(` * @since ${config.java.sinceVersion}`);
  lines.push(' */');
  lines.push(`public final class ${config.java.className} implements Serializable {`);
  lines.push('');

  // Version constants
  lines.push('    /** Tailwind CSS version these constants were generated from */');
  lines.push(`    public static final String TAILWIND_VERSION = "${metadata.tailwindVersion}";`);
  lines.push('');
  lines.push('    /** Date these constants were generated */');
  lines.push(`    public static final String GENERATED_DATE = "${metadata.generatedDate}";`);
  lines.push('');

  // Sort categories for better organization
  const categoryOrder = [
    'display', 'position', 'visibility', 'z-index', 'overflow',
    'flex-direction', 'flex-wrap', 'flex-grow-shrink', 'flex-basis',
    'align-items', 'align-content', 'align-self',
    'justify-content', 'justify-items', 'justify-self',
    'place-content', 'place-items', 'place-self',
    'grid-template-columns', 'grid-template-rows', 'grid-column', 'grid-row', 'grid-flow',
    'grid-auto-columns', 'grid-auto-rows', 'gap',
    'padding', 'margin', 'space-between',
    'width', 'min-width', 'max-width', 'height', 'min-height', 'max-height', 'size',
    'font-family', 'font-size', 'font-weight', 'font-style',
    'line-height', 'text-align', 'text-color', 'text-decoration', 'text-decoration-color',
    'text-decoration-style', 'text-transform',
    'background-color', 'border-radius', 'border-width', 'border-color', 'border-style',
    'box-shadow', 'opacity',
    'transition', 'duration', 'ease', 'delay', 'animation',
    'scale', 'rotate', 'translate', 'skew',
    'cursor'
  ];

  // Generate constants for ordered categories
  categoryOrder.forEach(category => {
    if (categorized[category]) {
      generateCategorySection(lines, category, categorized[category]);
    }
  });

  // Generate remaining categories not in the order list
  Object.keys(categorized)
    .filter(cat => !categoryOrder.includes(cat))
    .sort()
    .forEach(category => {
      generateCategorySection(lines, category, categorized[category]);
    });

  // Add nested classes
  lines.push('');
  lines.push('    // ========== RESPONSIVE MODIFIERS ==========');
  lines.push('');
  lines.push('    /**');
  lines.push('     * Responsive modifier utilities for different breakpoints.');
  lines.push('     * <p>');
  lines.push('     * <pre>{@code');
  lines.push('     * // Apply flex on medium screens and up');
  lines.push(`     * div.addClassName(${config.java.className}.Responsive.md(${config.java.className}.FLEX));`);
  lines.push('     * // Result: "md:flex"');
  lines.push('     * }</pre>');
  lines.push('     */');
  lines.push('    public static final class Responsive {');
  lines.push('');

  // Generate breakpoint methods from config
  Object.entries(config.breakpoints).forEach(([name, value]) => {
    const methodName = name === '2xl' ? 'xxl' : name;
    const description = name.charAt(0).toUpperCase() + name.slice(1);

    lines.push(`        /** ${description} breakpoint (${value}) - prefix: {@code ${name}:} */`);
    lines.push(`        public static String ${methodName}(String utility) {`);
    lines.push(`            return "${name}:" + utility;`);
    lines.push('        }');
    lines.push('');
  });

  lines.push('        private Responsive() {}');
  lines.push('    }');
  lines.push('');

  lines.push('    // ========== STATE VARIANTS ==========');
  lines.push('');
  lines.push('    /**');
  lines.push('     * State variant utilities (hover, focus, active, etc.)');
  lines.push('     * <p>');
  lines.push('     * <pre>{@code');
  lines.push('     * // Apply blue background on hover');
  lines.push(`     * button.addClassName(${config.java.className}.State.hover(${config.java.className}.BG_BLUE_600));`);
  lines.push('     * // Result: "hover:bg-blue-600"');
  lines.push('     * }</pre>');
  lines.push('     */');
  lines.push('    public static final class State {');
  lines.push('');
  lines.push('        /** Hover state - prefix: {@code hover:} */');
  lines.push('        public static String hover(String utility) {');
  lines.push('            return "hover:" + utility;');
  lines.push('        }');
  lines.push('');
  lines.push('        /** Focus state - prefix: {@code focus:} */');
  lines.push('        public static String focus(String utility) {');
  lines.push('            return "focus:" + utility;');
  lines.push('        }');
  lines.push('');
  lines.push('        /** Active state - prefix: {@code active:} */');
  lines.push('        public static String active(String utility) {');
  lines.push('            return "active:" + utility;');
  lines.push('        }');
  lines.push('');
  lines.push('        /** Dark mode - prefix: {@code dark:} */');
  lines.push('        public static String dark(String utility) {');
  lines.push('            return "dark:" + utility;');
  lines.push('        }');
  lines.push('');
  lines.push('        /** Disabled state - prefix: {@code disabled:} */');
  lines.push('        public static String disabled(String utility) {');
  lines.push('            return "disabled:" + utility;');
  lines.push('        }');
  lines.push('');
  lines.push('        private State() {}');
  lines.push('    }');
  lines.push('');

  // Private constructor
  lines.push(`    private ${config.java.className}() {`);
  lines.push('        // Prevent instantiation');
  lines.push('    }');
  lines.push('}');

  return lines.join('\n');
}

/**
 * Generates a section for a specific category
 */
function generateCategorySection(lines: string[], category: string, utilities: string[]): void {
  // Category header
  lines.push('');
  lines.push(`    // ========== ${category.toUpperCase().replace(/-/g, ' ')} ==========`);
  lines.push('');

  // Sort utilities for consistent output
  const sortedUtilities = [...utilities].sort((a, b) => {
    // Sort by prefix, then by numeric value if present
    const aMatch = a.match(/\d+/);
    const bMatch = b.match(/\d+/);
    const aNum = parseInt(aMatch ? aMatch[0] : '0');
    const bNum = parseInt(bMatch ? bMatch[0] : '0');

    if (aNum !== bNum) {
      return aNum - bNum;
    }
    return a.localeCompare(b);
  });

  sortedUtilities.forEach(className => {
    const normalizedClassName = normalizeClassName(className);
    const constantName = toConstantName(className);
    const javaDoc = generateJavaDoc(normalizedClassName, constantName);

    lines.push(javaDoc);
    lines.push(`    public static final String ${constantName} = "${normalizedClassName}";`);
    lines.push('');
  });
}

/**
 * Main generation function
 */
function main() {
  console.log('=== Tailwind CSS Java Generator ===\n');

  // Load configuration
  const config = loadConfig();

  // Read categorized utilities with metadata
  const inputPath = path.join(__dirname, '..', 'categorized-utilities.json');
  console.log(`Reading: ${inputPath}`);

  if (!fs.existsSync(inputPath)) {
    console.error('Error: categorized-utilities.json not found. Run extract script first.');
    process.exit(1);
  }

  const data = JSON.parse(fs.readFileSync(inputPath, 'utf-8'));

  // Handle both old format (just utilities) and new format (with metadata)
  let categorized: CategorizedUtilities;
  let metadata: Metadata;

  if (data.metadata && data.utilities) {
    // New format with metadata
    categorized = data.utilities;
    metadata = data.metadata;
  } else {
    // Old format - just utilities
    categorized = data;
    const totalUtilities = Object.values(categorized).reduce((sum, arr) => sum + arr.length, 0);
    metadata = {
      tailwindVersion: config.tailwind.version,
      generatedDate: new Date().toISOString(),
      totalUtilities
    };
  }

  // Print info
  console.log(`Tailwind version: ${metadata.tailwindVersion}`);
  console.log(`Total utilities: ${metadata.totalUtilities}`);
  console.log(`Categories: ${Object.keys(categorized).length}`);
  console.log(`Package: ${config.java.package}`);
  console.log(`Class name: ${config.java.className}`);

  // Generate Java class
  console.log(`\nGenerating ${config.java.className}.java...`);
  const javaCode = generateTWClass(categorized, config, metadata);

  // Write output - use config for path
  const packageParts = config.java.package.split('.');
  const outputDir = config.output.createPackageStructure
    ? path.join(__dirname, '..', config.output.directory, ...packageParts)
    : path.join(__dirname, '..', config.output.directory);

  fs.mkdirSync(outputDir, { recursive: true });

  const outputPath = path.join(outputDir, `${config.java.className}.java`);
  fs.writeFileSync(outputPath, javaCode);

  console.log(`\nWrote Java class to: ${outputPath}`);
  console.log(`File size: ${(javaCode.length / 1024).toFixed(2)} KB`);
  console.log(`Lines of code: ${javaCode.split('\n').length}`);

  console.log('\n=== Generation complete! ===');
}

main();
