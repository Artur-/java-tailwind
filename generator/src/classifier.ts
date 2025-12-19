import { GroupingConfig } from './config';

export interface ClassifiedUtility {
  topLevel: string;        // e.g., "Spacing"
  subCategory?: string;    // e.g., "Padding"
  constantName: string;    // e.g., "LEFT_4"
  className: string;       // e.g., "pl-4"
}

/**
 * Converts a Tailwind class name to a Java constant name
 * (from generate.ts - reused here)
 */
function toConstantName(className: string): string {
  // Remove backslash escapes
  className = className.replace(/\\/g, '');

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

  // Handle constant names starting with digits (invalid in Java)
  if (/^\d/.test(constantName)) {
    constantName = 'N' + constantName;
  }

  // Handle Java reserved keywords
  const javaKeywords = ['ABSTRACT', 'ASSERT', 'BOOLEAN', 'BREAK', 'BYTE', 'CASE', 'CATCH', 'CHAR', 'CLASS', 'CONST', 'CONTINUE', 'DEFAULT', 'DO', 'DOUBLE', 'ELSE', 'ENUM', 'EXTENDS', 'FINAL', 'FINALLY', 'FLOAT', 'FOR', 'GOTO', 'IF', 'IMPLEMENTS', 'IMPORT', 'INSTANCEOF', 'INT', 'INTERFACE', 'LONG', 'NATIVE', 'NEW', 'PACKAGE', 'PRIVATE', 'PROTECTED', 'PUBLIC', 'RETURN', 'SHORT', 'STATIC', 'STRICTFP', 'SUPER', 'SWITCH', 'SYNCHRONIZED', 'THIS', 'THROW', 'THROWS', 'TRANSIENT', 'TRY', 'VOID', 'VOLATILE', 'WHILE'];

  if (javaKeywords.includes(constantName)) {
    constantName = constantName + '_CLASS';
  }

  return constantName;
}

/**
 * Extracts the value part from a class name (e.g., "pl-4" -> "4", "p-0.5" -> "0_5")
 */
function extractValue(className: string): string {
  const match = className.match(/-([\d.]+|auto|full|screen|px|xs|sm|md|lg|xl|xxl|max|min|fit)$/);
  if (match) {
    return match[1].replace(/\./g, '_').toUpperCase();
  }
  return '';
}

/**
 * Classifies a utility based on its category and class name
 */
export function classifyUtility(
  category: string,
  className: string,
  groupingConfig: GroupingConfig
): ClassifiedUtility {
  // Normalize className (remove escape characters)
  const normalizedClassName = className.replace(/\\/g, '');

  // Find which top-level group this category belongs to
  for (const [topLevel, config] of Object.entries(groupingConfig.structure)) {
    if (config.categories.includes(category)) {
      // Determine subcategory if applicable
      const subCategory = determineSubcategory(category, normalizedClassName, config);

      // Generate constant name with proper prefix
      const constantName = generateConstantName(normalizedClassName, category, subCategory);

      return {
        topLevel,
        subCategory,
        constantName,
        className: normalizedClassName
      };
    }
  }

  // Default to Other category
  return {
    topLevel: "Other",
    constantName: toConstantName(normalizedClassName),
    className: normalizedClassName
  };
}

/**
 * Determines subcategory based on class name patterns
 */
function determineSubcategory(
  category: string,
  className: string,
  config: { subcategories?: string[] }
): string | undefined {
  if (!config.subcategories) return undefined;

  // For spacing
  if (category === 'padding') return 'Padding';
  if (category === 'margin') return 'Margin';
  if (category === 'gap') return 'Gap';
  if (category === 'space-between') return 'Space';

  // For sizing
  if (category === 'width') return 'Width';
  if (category === 'min-width') return 'MinWidth';
  if (category === 'max-width') return 'MaxWidth';
  if (category === 'height') return 'Height';
  if (category === 'min-height') return 'MinHeight';
  if (category === 'max-height') return 'MaxHeight';
  if (category === 'size') return 'Size';

  // For typography
  if (category === 'font-size') return 'FontSize';
  if (category === 'font-weight') return 'FontWeight';
  if (category === 'font-family') return 'FontFamily';
  if (category === 'font-style') return 'FontStyle';
  if (category === 'line-height') return 'LineHeight';
  if (category === 'text-align') return 'TextAlign';
  if (category === 'text-transform') return 'TextTransform';
  if (category === 'text-decoration' || category === 'text-decoration-color' || category === 'text-decoration-style') {
    return 'TextDecoration';
  }

  // For flex
  if (category === 'align-items') return 'AlignItems';
  if (category === 'justify-content') return 'JustifyContent';
  if (category === 'align-content') return 'AlignContent';
  if (category === 'align-self') return 'AlignSelf';

  // For effects
  if (category === 'box-shadow') return 'Shadow';
  if (category === 'opacity') return 'Opacity';

  return undefined;
}

/**
 * Generates constant name with appropriate prefix based on category
 */
function generateConstantName(
  className: string,
  category: string,
  subCategory?: string
): string {
  const normalized = className.replace(/\\/g, '');

  // For padding: pl-4 -> LEFT_4, px-4 -> X_4, p-4 -> P_4
  if (category === 'padding') {
    if (normalized.startsWith('pl-')) return 'LEFT_' + extractValue(normalized);
    if (normalized.startsWith('pr-')) return 'RIGHT_' + extractValue(normalized);
    if (normalized.startsWith('pt-')) return 'TOP_' + extractValue(normalized);
    if (normalized.startsWith('pb-')) return 'BOTTOM_' + extractValue(normalized);
    if (normalized.startsWith('px-')) return 'X_' + extractValue(normalized);
    if (normalized.startsWith('py-')) return 'Y_' + extractValue(normalized);
    if (normalized.startsWith('p-')) return 'P_' + extractValue(normalized);
  }

  // For margin: ml-4 -> LEFT_4, -ml-4 -> NEG_LEFT_4, mx-4 -> X_4, m-4 -> M_4
  if (category === 'margin') {
    const isNegative = normalized.startsWith('-');
    const withoutNeg = isNegative ? normalized.substring(1) : normalized;

    let constantName = '';
    if (withoutNeg.startsWith('ml-')) constantName = 'LEFT_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('mr-')) constantName = 'RIGHT_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('mt-')) constantName = 'TOP_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('mb-')) constantName = 'BOTTOM_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('mx-')) constantName = 'X_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('my-')) constantName = 'Y_' + extractValue(withoutNeg);
    else if (withoutNeg.startsWith('m-')) constantName = 'M_' + extractValue(withoutNeg);
    else constantName = toConstantName(withoutNeg);

    return isNegative ? 'NEG_' + constantName : constantName;
  }

  // For gap: gap-x-4 -> X_4, gap-y-4 -> Y_4, gap-4 -> GAP_4
  if (category === 'gap') {
    if (normalized.startsWith('gap-x-')) return 'X_' + extractValue(normalized);
    if (normalized.startsWith('gap-y-')) return 'Y_' + extractValue(normalized);
    if (normalized.startsWith('gap-')) return 'GAP_' + extractValue(normalized);
  }

  // For space-between: space-x-4 -> X_4, space-y-4 -> Y_4
  if (category === 'space-between') {
    if (normalized.startsWith('space-x-')) return 'X_' + extractValue(normalized);
    if (normalized.startsWith('space-y-')) return 'Y_' + extractValue(normalized);
  }

  // For width: w-full -> FULL, w-1/2 -> 1_2, w-64 -> W_64
  if (category === 'width' || category === 'min-width' || category === 'max-width') {
    const prefix = category === 'width' ? 'w-' :
                   category === 'min-width' ? 'min-w-' : 'max-w-';

    if (normalized.startsWith(prefix)) {
      const value = normalized.substring(prefix.length);
      // For special values like "full", "screen", "auto", don't add prefix
      if (['full', 'screen', 'auto', 'min', 'max', 'fit'].includes(value) ||
          value.startsWith('screen-')) {
        return value.replace(/-/g, '_').replace(/\//g, '_').toUpperCase();
      }
      // For numeric values, add W_ prefix
      return 'W_' + value.replace(/-/g, '_').replace(/\//g, '_').replace(/\./g, '_').toUpperCase();
    }
  }

  // For height: h-full -> FULL, h-64 -> H_64
  if (category === 'height' || category === 'min-height' || category === 'max-height') {
    const prefix = category === 'height' ? 'h-' :
                   category === 'min-height' ? 'min-h-' : 'max-h-';

    if (normalized.startsWith(prefix)) {
      const value = normalized.substring(prefix.length);
      // For special values like "full", "screen", "auto", don't add prefix
      if (['full', 'screen', 'auto', 'min', 'max', 'fit'].includes(value) ||
          value.startsWith('screen-')) {
        return value.replace(/-/g, '_').replace(/\//g, '_').toUpperCase();
      }
      // For numeric values, add H_ prefix
      return 'H_' + value.replace(/-/g, '_').replace(/\//g, '_').replace(/\./g, '_').toUpperCase();
    }
  }

  // For size: size-4 -> SIZE_4
  if (category === 'size') {
    if (normalized.startsWith('size-')) {
      return 'SIZE_' + extractValue(normalized);
    }
  }

  // For background colors: bg-blue-500 -> BLUE_500, bg-white -> WHITE
  if (category === 'background-color') {
    return normalized.replace('bg-', '').replace(/-/g, '_').toUpperCase();
  }

  // For text colors: text-gray-900 -> GRAY_900, text-white -> WHITE
  if (category === 'text-color') {
    return normalized.replace('text-', '').replace(/-/g, '_').toUpperCase();
  }

  // For border colors: border-blue-500 -> BLUE_500
  if (category === 'border-color') {
    return normalized.replace('border-', '').replace(/-/g, '_').toUpperCase();
  }

  // For border radius: rounded-lg -> ROUNDED_LG, rounded -> ROUNDED
  if (category === 'border-radius') {
    return normalized.replace(/-/g, '_').toUpperCase();
  }

  // For border width: border-2 -> BORDER_2, border -> BORDER
  if (category === 'border-width') {
    return normalized.replace(/-/g, '_').toUpperCase();
  }

  // For border style: border-dashed -> DASHED, border-solid -> SOLID
  if (category === 'border-style') {
    return normalized.replace('border-', '').replace(/-/g, '_').toUpperCase();
  }

  // For font-size: text-xl -> XL, text-2xl -> XXLARGE (map to friendly names)
  if (category === 'font-size') {
    const sizeMap: { [key: string]: string } = {
      'text-xs': 'XS',
      'text-sm': 'SM',
      'text-base': 'BASE',
      'text-lg': 'LG',
      'text-xl': 'XL',
      'text-2xl': 'XXLARGE',
      'text-3xl': 'XXXLARGE',
      'text-4xl': 'XXXXLARGE',
      'text-5xl': 'XXXXXLARGE',
      'text-6xl': 'XXXXXXLARGE',
      'text-7xl': 'XXXXXXXLARGE',
      'text-8xl': 'XXXXXXXXLARGE',
      'text-9xl': 'XXXXXXXXXLARGE'
    };
    return sizeMap[normalized] || toConstantName(normalized);
  }

  // For font-weight: font-bold -> BOLD, font-semibold -> SEMIBOLD
  if (category === 'font-weight') {
    return normalized.replace('font-', '').replace(/-/g, '_').toUpperCase();
  }

  // For font-family: font-sans -> SANS, font-serif -> SERIF
  if (category === 'font-family') {
    return normalized.replace('font-', '').toUpperCase();
  }

  // For text-align: text-left -> LEFT, text-center -> CENTER
  if (category === 'text-align') {
    return normalized.replace('text-', '').toUpperCase();
  }

  // For display: flex -> FLEX, grid -> GRID, block -> BLOCK
  if (category === 'display') {
    return normalized.replace(/-/g, '_').toUpperCase();
  }

  // For flex items: items-center -> CENTER, items-start -> START
  if (category === 'align-items') {
    return normalized.replace('items-', '').toUpperCase();
  }

  // For justify-content: justify-center -> CENTER, justify-between -> BETWEEN
  if (category === 'justify-content') {
    return normalized.replace('justify-', '').toUpperCase();
  }

  // For align-content: content-center -> CENTER, content-between -> BETWEEN
  if (category === 'align-content') {
    return normalized.replace('content-', '').toUpperCase();
  }

  // For align-self: self-center -> CENTER, self-start -> START
  if (category === 'align-self') {
    return normalized.replace('self-', '').toUpperCase();
  }

  // For flex direction: flex-row -> ROW, flex-col -> COL
  if (category === 'flex-direction') {
    return normalized.replace('flex-', '').replace(/-/g, '_').toUpperCase();
  }

  // For flex wrap: flex-wrap -> WRAP, flex-nowrap -> NOWRAP
  if (category === 'flex-wrap') {
    return normalized.replace('flex-', '').replace(/-/g, '_').toUpperCase();
  }

  // For box-shadow: shadow-lg -> LG, shadow-sm -> SM, shadow -> DEFAULT
  if (category === 'box-shadow') {
    if (normalized === 'shadow') return 'DEFAULT';
    let constantName = normalized.replace('shadow-', '').replace(/-/g, '_').toUpperCase();
    // Handle constant names starting with digits (invalid in Java)
    if (/^\d/.test(constantName)) {
      constantName = 'N' + constantName;
    }
    return constantName;
  }

  // For opacity: opacity-50 -> OPACITY_50
  if (category === 'opacity') {
    return normalized.replace(/-/g, '_').toUpperCase();
  }

  // For position: absolute -> ABSOLUTE, relative -> RELATIVE
  if (category === 'position') {
    // Position values like "top-0", "left-4", etc.
    if (normalized.match(/^(top|right|bottom|left|inset)-/)) {
      return normalized.replace(/-/g, '_').replace(/\./g, '_').toUpperCase();
    }
    // Position types: absolute, relative, etc.
    return normalized.toUpperCase();
  }

  // For z-index: z-10 -> Z_10, z-auto -> AUTO
  if (category === 'z-index') {
    if (normalized === 'z-auto') return 'AUTO';
    return normalized.replace(/-/g, '_').toUpperCase();
  }

  // For grid: grid-cols-2 -> COLS_2, col-span-2 -> SPAN_2
  if (category.startsWith('grid-')) {
    return normalized.replace(/^grid-/, '').replace(/-/g, '_').toUpperCase();
  }

  // Default: convert entire class name using toConstantName
  return toConstantName(normalized);
}
