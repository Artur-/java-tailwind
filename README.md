# Tailwind CSS Java Constants Generator

A tool that generates type-safe Java constants for Tailwind CSS utility classes, providing IDE autocomplete and compile-time validation for Vaadin Flow applications.

## Overview

This generator extracts all Tailwind CSS utility classes from a Tailwind build and creates Java constants that can be used in place of string literals when styling Vaadin components.

**Generated:** 1,407 utility constants from Tailwind CSS v4.1.18

## Features

- ✅ **Type-Safe Constants**: Replace string literals with Java constants
- ✅ **IDE Autocomplete**: Full IntelliJ/Eclipse/VS Code support
- ✅ **Responsive Modifiers**: Methods for `sm:`, `md:`, `lg:`, `xl:`, `2xl:`
- ✅ **State Variants**: Methods for `hover:`, `focus:`, `active:`, `dark:`, `disabled:`
- ✅ **Comprehensive Coverage**: 1,407 utility classes across 64 categories
- ✅ **Automatic Generation**: Always in sync with Tailwind CSS version

## Quick Start

### Generate Java Constants

```bash
cd generator
npm install
npm run all  # Extracts utilities and generates Java code
```

### Use in Your Project

The generator creates a nested structure similar to Vaadin's `LumoUtility` for better organization:

```java
import com.vaadin.flow.component.tailwind.TW;

// Basic usage with nested structure
Div card = new Div();
card.addClassNames(
    TW.Background.WHITE,
    TW.Border.ROUNDED_LG,
    TW.Effects.Shadow.LG,
    TW.Spacing.Padding.P_6,
    TW.Sizing.MaxWidth.W_SM
);

// Responsive design
card.addClassNames(
    TW.Flex.FLEX_COL,                      // Mobile-first: column layout
    TW.Responsive.md(TW.Flex.FLEX_ROW),    // md and up: row layout
    TW.Responsive.lg(TW.Spacing.Gap.GAP_8) // lg and up: 2rem gap
);

// State variants
Button button = new Button("Click me");
button.addClassNames(
    TW.Background.BLUE_500,
    TW.Text.WHITE,
    TW.Spacing.Padding.X_4,
    TW.Spacing.Padding.Y_2,
    TW.Border.ROUNDED,
    TW.State.hover(TW.Background.BLUE_600),
    TW.State.focus(TW.Border.RING_2)
);
```

## Configuration

The generator is fully configurable through a combination of config file and command-line arguments.

### Config File

Edit `generator/generator.config.json` to customize generation:

```json
{
  "tailwind": {
    "version": "auto",              // "auto" reads from package.json, or specify like "4.2.0"
    "configFile": "tailwind.config.js",
    "inputCss": "input.css",
    "testContent": "test-content.html"
  },
  "java": {
    "package": "com.vaadin.flow.component.tailwind",
    "className": "TW",
    "sinceVersion": "25.1"
  },
  "output": {
    "directory": "../../output",
    "createPackageStructure": true  // Creates com/vaadin/flow/... subdirectories
  },
  "breakpoints": {
    "sm": "640px",
    "md": "768px",
    "lg": "1024px",
    "xl": "1280px",
    "2xl": "1536px"
  }
}
```

### Command-Line Arguments

Override config file values using CLI arguments:

```bash
cd generator
npm run generate -- \
  --package com.example.tailwind \
  --version 4.2.0 \
  --since 2.0 \
  --output ./custom-output \
  --class-name TailwindClasses
```

Available arguments:
- `--config <path>` - Path to config file (default: `generator.config.json`)
- `--package <name>` - Java package name
- `--version <version>` - Tailwind CSS version or "auto"
- `--since <version>` - Version for `@since` JavaDoc tag
- `--output <path>` - Output directory path
- `--class-name <name>` - Java class name (default: `TW`)

### Auto-Detection

Set `"version": "auto"` in the config to automatically detect the Tailwind CSS version from `package.json`:

```bash
cd generator
npm install tailwindcss@4.2.0
npm run all  # Automatically uses v4.2.0
```

The generator reads the version from `dependencies.tailwindcss` or `devDependencies.tailwindcss` and uses it for:
- Tailwind CLI command (`npx @tailwindcss/cli@4`)
- JavaDoc version string
- `TAILWIND_VERSION` constant in generated code

### Example Scenarios

**Generate for different package:**
```bash
npm run generate -- --package com.myapp.styles --since 1.0
```

**Use specific Tailwind version:**
```bash
npm run generate -- --version 4.2.0
```

**Custom output location:**
```bash
npm run generate -- --output ./src/main/java --package com.example.ui
```

**Combine multiple options:**
```bash
npm run generate -- \
  --package org.acme.tailwind \
  --class-name Tailwind \
  --since 3.0 \
  --output ../my-project/src
```

## Nested Structure

The generator organizes Tailwind CSS utilities into a hierarchical structure similar to Vaadin's `LumoUtility`, making it easier to discover and use related utilities through IDE autocomplete.

### Top-Level Categories

- **TW.Spacing** - Padding, Margin, Gap, Space utilities
- **TW.Layout** - Display utilities (flex, grid, block, etc.)
- **TW.Sizing** - Width, Height, Min/Max Width/Height
- **TW.Background** - Background colors
- **TW.Text** - Text colors
- **TW.Border** - Border width, style, radius, and colors
- **TW.Flex** - Flexbox utilities (AlignItems, JustifyContent, etc.)
- **TW.Grid** - Grid layout utilities
- **TW.Typography** - FontSize, FontWeight, TextAlign, etc.
- **TW.Effects** - Shadow, Opacity
- **TW.Position** - Position types and inset values
- **TW.Overflow** - Overflow utilities
- **TW.Transitions** - Transition, duration, ease, delay, animation
- **TW.Transforms** - Scale, rotate, translate, skew
- **TW.Other** - Miscellaneous utilities

### Constant Naming Convention

Constants follow these patterns for better organization:

```java
// Spacing with direction prefixes
TW.Spacing.Padding.LEFT_4      // pl-4
TW.Spacing.Padding.RIGHT_8     // pr-8
TW.Spacing.Padding.X_4         // px-4 (horizontal)
TW.Spacing.Padding.Y_4         // py-4 (vertical)
TW.Spacing.Padding.P_4         // p-4 (all sides)

// Margins including negative values
TW.Spacing.Margin.LEFT_4       // ml-4
TW.Spacing.Margin.NEG_LEFT_4   // -ml-4

// Colors without prefix
TW.Background.BLUE_500         // bg-blue-500
TW.Text.GRAY_900               // text-gray-900
TW.Border.RED_300              // border-red-300

// Sizing with semantic names
TW.Sizing.Width.W_FULL         // w-full
TW.Sizing.Width.W_1_2          // w-1/2
TW.Sizing.Height.H_SCREEN      // h-screen
```

### Configuring Grouping

The nested structure is controlled by `generator.config.json`:

```json
{
  "grouping": {
    "enabled": true,
    "structure": {
      "Spacing": {
        "subcategories": ["Padding", "Margin", "Gap", "Space"],
        "categories": ["padding", "margin", "gap", "space-between"]
      },
      ...
    }
  }
}
```

Set `"enabled": false` to generate a flat structure instead of nested classes.

## Usage Examples

### Layout with Flexbox

```java
import com.vaadin.flow.component.tailwind.TW;

Div container = new Div();
container.addClassNames(
    TW.Layout.FLEX,
    TW.Flex.FLEX_COL,
    TW.Flex.AlignItems.CENTER,
    TW.Flex.JustifyContent.CENTER,
    TW.Spacing.Gap.GAP_4,
    TW.Spacing.Padding.P_8
);
```

### Responsive Grid

```java
import com.vaadin.flow.component.tailwind.TW;

Div grid = new Div();
grid.addClassNames(
    TW.Layout.GRID,
    TW.Grid.COLS_1,                           // 1 column on mobile
    TW.Responsive.md(TW.Grid.COLS_2),         // 2 columns on tablet
    TW.Responsive.lg(TW.Grid.COLS_3),         // 3 columns on desktop
    TW.Spacing.Gap.GAP_6
);
```

### Interactive Button

```java
import com.vaadin.flow.component.tailwind.TW;

Button button = new Button("Submit");
button.addClassNames(
    TW.Background.BLUE_500,
    TW.Text.WHITE,
    TW.Typography.FontWeight.BOLD,
    TW.Spacing.Padding.Y_2,
    TW.Spacing.Padding.X_4,
    TW.Border.ROUNDED,
    TW.State.hover(TW.Background.BLUE_600),
    TW.State.focus(TW.Border.RING_2),
    TW.State.disabled(TW.Effects.Opacity.OPACITY_50)
);
```

### Dark Mode Support

```java
import com.vaadin.flow.component.tailwind.TW;

Div card = new Div();
card.addClassNames(
    TW.Background.WHITE,
    TW.Text.GRAY_900,
    TW.State.dark(TW.Background.GRAY_800),
    TW.State.dark(TW.Text.GRAY_100),
    TW.Border.ROUNDED_LG,
    TW.Spacing.Padding.P_6
);
```

### Complex Component

```java
import com.vaadin.flow.component.tailwind.TW;

public class CardComponent extends Div {
    public CardComponent(String title, String content) {
        // Container styling
        addClassNames(
            TW.Background.WHITE,
            TW.Border.ROUNDED_XL,
            TW.Effects.Shadow.LG,
            TW.Spacing.Padding.P_6,
            TW.Sizing.MaxWidth.W_SM,
            TW.State.hover(TW.Effects.Shadow.XL),
            TW.Responsive.md(TW.Sizing.MaxWidth.W_MD),
            TW.State.dark(TW.Background.GRAY_800)
        );

        // Heading
        H2 heading = new H2(title);
        heading.addClassNames(
            TW.Typography.FontSize.XXLARGE,
            TW.Typography.FontWeight.BOLD,
            TW.Spacing.Margin.BOTTOM_4,
            TW.Text.GRAY_900,
            TW.State.dark(TW.Text.WHITE)
        );

        // Content
        Paragraph text = new Paragraph(content);
        text.addClassNames(
            TW.Text.GRAY_700,
            TW.State.dark(TW.Text.GRAY_300)
        );

        add(heading, text);
    }
}
```

## API Reference

### Nested Constants

All Tailwind utility classes are organized in a nested structure:

```java
// Layout
TW.Layout.FLEX                    // "flex"
TW.Layout.GRID                    // "grid"
TW.Layout.BLOCK                   // "block"

// Flexbox
TW.Flex.FLEX_COL                  // "flex-col"
TW.Flex.AlignItems.CENTER         // "items-center"
TW.Flex.JustifyContent.BETWEEN    // "justify-between"

// Spacing
TW.Spacing.Padding.P_4            // "p-4"
TW.Spacing.Padding.P_0_5          // "p-0.5"  (decimal values)
TW.Spacing.Padding.LEFT_4         // "pl-4"  (direction prefix)
TW.Spacing.Padding.X_4            // "px-4"  (axis shortcut)
TW.Spacing.Margin.NEG_M_4         // "-m-4"  (negative values)

// Sizing
TW.Sizing.Width.W_1_2             // "w-1/2"  (fractional values)
TW.Sizing.Width.W_FULL            // "w-full"

// Colors
TW.Background.BLUE_500            // "bg-blue-500"
TW.Text.GRAY_900                  // "text-gray-900"
TW.Border.RED_300                 // "border-red-300"

// Effects
TW.Effects.Shadow.LG              // "shadow-lg"
TW.Effects.Opacity.OPACITY_50     // "opacity-50"

// Typography
TW.Typography.FontSize.XL         // "text-xl"
TW.Typography.FontWeight.BOLD     // "font-bold"
```

### Responsive Modifiers

Apply utilities at specific breakpoints:

```java
TW.Responsive.sm(String utility)   // 640px+
TW.Responsive.md(String utility)   // 768px+
TW.Responsive.lg(String utility)   // 1024px+
TW.Responsive.xl(String utility)   // 1280px+
TW.Responsive.xxl(String utility)  // 1536px+  (for "2xl:")
```

**Example:**
```java
div.addClassName(TW.Responsive.md(TW.FLEX));  // "md:flex"
```

### State Variants

Apply utilities on specific states:

```java
TW.State.hover(String utility)    // hover:
TW.State.focus(String utility)    // focus:
TW.State.active(String utility)   // active:
TW.State.dark(String utility)     // dark:
TW.State.disabled(String utility) // disabled:
```

**Example:**
```java
button.addClassName(TW.State.hover(TW.BG_BLUE_600));  // "hover:bg-blue-600"
```

## Project Structure

```
java-tailwind/
├── generator/                  # Generator tool (Node.js/TypeScript)
│   ├── src/
│   │   ├── extract.ts         # Extracts utilities from Tailwind CSS
│   │   └── generate.ts        # Generates Java source code
│   ├── package.json
│   ├── tailwind.config.js
│   ├── input.css              # Tailwind CSS entry point
│   ├── test-content.html      # Comprehensive test coverage
│   └── categorized-utilities.json  # Extracted utilities
├── output/                    # Generated Java files
│   └── com/vaadin/flow/component/tailwind/
│       └── TW.java            # Generated constants (152 KB, 4531 lines)
└── README.md
```

## Generator Details

### How It Works

1. **Extract** (`npm run extract`):
   - Uses Tailwind CSS CLI to build CSS from comprehensive test content
   - Parses generated CSS using `css-tree`
   - Extracts and categorizes all utility class selectors
   - Outputs `categorized-utilities.json`

2. **Generate** (`npm run generate`):
   - Reads categorized utilities
   - Converts class names to Java constants (e.g., `items-center` → `ITEMS_CENTER`)
   - Generates `TW.java` with proper JavaDoc
   - Creates nested classes for Responsive and State modifiers

### Naming Conventions

| Tailwind Class | Java Constant | Rule |
|----------------|---------------|------|
| `flex` | `FLEX` | Uppercase |
| `items-center` | `ITEMS_CENTER` | Hyphen → underscore |
| `p-4` | `P_4` | Hyphen → underscore |
| `p-0.5` | `P_0_5` | Dot → underscore |
| `bg-gray-100` | `BG_GRAY_100` | Multiple hyphens → underscores |
| `-m-4` | `NEG_M_4` | Negative prefix |
| `w-1/2` | `W_1_2` | Slash → underscore |

## Statistics

- **Total Utilities**: 1,407
- **Categories**: 64
- **Generated Code**: 152 KB, 4,531 lines
- **Compilation**: ✅ Java 11+ compatible
- **Tailwind Version**: 4.1.18

### Top Categories

| Category | Count |
|----------|-------|
| Other | 458 |
| Text Color | 97 |
| Margin | 68 |
| Padding | 64 |
| Position | 54 |
| Gap | 42 |
| Width | 41 |
| Background Color | 39 |
| Height | 36 |
| Cursor | 36 |

## Requirements

### Generator Requirements

- Node.js 18+
- npm or pnpm
- Tailwind CSS 4.1.18

### Usage Requirements

- Java 11+
- Vaadin Flow 25.1+ (or any Java project using Tailwind CSS)

## Installation

### Option 1: Use in Vaadin Flow

1. Copy `output/com/vaadin/flow/component/tailwind/TW.java` to your project's source directory
2. Import and use the constants

### Option 2: Integrate into Build

1. Copy `generator/` directory to your project (e.g., `scripts/tailwind-generator/`)
2. Add Maven/Gradle task to run generator during build
3. Configure output directory to your source path

## Regenerating

When upgrading Tailwind CSS or adding custom utilities:

```bash
cd generator
npm run all  # Extract + Generate
```

The generated `TW.java` will be updated with the latest utilities.

## Customization

### Adding Custom Utilities

1. Edit `test-content.html` to include your custom classes
2. Run `npm run all`
3. Custom utilities will be extracted and included

### Modifying Categories

Edit `src/extract.ts` to adjust categorization logic:

```typescript
// Add new category
if (className.startsWith('custom-')) {
  categories.custom.push(className);
  categorized = true;
}
```

## Benefits

### Before (String Literals)

```java
div.addClassNames("flex", "items-center", "p-4", "bg-gray-100");
//                 ^^^^^^  ^^^^^^^^^^^^^^^  ^^^^  ^^^^^^^^^^^^^
//                 No autocomplete, no validation, typos at runtime
```

### After (Type-Safe Constants)

```java
import static com.vaadin.flow.component.tailwind.TW.*;

div.addClassNames(FLEX, ITEMS_CENTER, P_4, BG_GRAY_100);
//                ^^^^  ^^^^^^^^^^^^^  ^^^  ^^^^^^^^^^^
//                ✅ Autocomplete  ✅ Compile-time validation  ✅ Refactoring support
```

## Limitations

- **Arbitrary Values**: Not included as constants (use string literals: `"p-[13px]"`)
- **Custom Classes**: Must be in test content to be extracted
- **JIT Mode**: Some dynamic classes may not be extracted

## Contributing

To extend or improve the generator:

1. Modify `src/extract.ts` for extraction logic
2. Modify `src/generate.ts` for Java code generation
3. Run `npm run all` to test
4. Validate with `javac` and example code

## License

This generator tool can be used freely in any project.

## Credits

- **Tailwind CSS**: https://tailwindcss.com/
- **Vaadin Flow**: https://vaadin.com/
- **css-tree**: CSS parser used for extraction

---

**Generated with ❤️ for type-safe Vaadin + Tailwind development**
