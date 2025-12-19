import com.vaadin.flow.component.tailwind.TW;

/**
 * Example usage of the generated Tailwind CSS constants.
 *
 * This demonstrates how to use the TW class with Vaadin components.
 */
public class ExampleUsage {

    public static void main(String[] args) {
        // Basic usage - display some constants
        System.out.println("=== Tailwind CSS Java Constants Example ===\n");

        System.out.println("Version: " + TW.TAILWIND_VERSION);
        System.out.println();

        // Layout constants
        System.out.println("Layout constants:");
        System.out.println("  FLEX = " + TW.Layout.FLEX);
        System.out.println("  GRID = " + TW.Layout.GRID);
        System.out.println("  HIDDEN = " + TW.Layout.HIDDEN);
        System.out.println();

        // Flexbox constants
        System.out.println("Flexbox constants:");
        System.out.println("  FLEX_ROW = " + TW.Flex.ROW);
        System.out.println("  FLEX_COL = " + TW.Flex.COL);
        System.out.println("  ITEMS_CENTER = " + TW.Flex.AlignItems.CENTER);
        System.out.println("  JUSTIFY_BETWEEN = " + TW.Flex.JustifyContent.BETWEEN);
        System.out.println();

        // Spacing constants
        System.out.println("Spacing constants:");
        System.out.println("  P_0 = " + TW.Spacing.Padding.P_0);
        System.out.println("  P_4 = " + TW.Spacing.Padding.P_4);
        System.out.println("  P_8 = " + TW.Spacing.Padding.P_8);
        System.out.println("  M_AUTO = " + TW.Spacing.Margin.M_AUTO);
        System.out.println();

        // Color constants
        System.out.println("Color constants:");
        System.out.println("  BG_WHITE = " + TW.Background.WHITE);
        System.out.println("  BG_GRAY_100 = " + TW.Background.GRAY_100);
        System.out.println("  BG_BLUE_500 = " + TW.Background.BLUE_500);
        System.out.println("  TEXT_RED_500 = " + TW.Text.RED_500);
        System.out.println();

        // Typography constants
        System.out.println("Typography constants:");
        System.out.println("  TEXT_XS = " + TW.Typography.FontSize.XS);
        System.out.println("  TEXT_BASE = " + TW.Typography.FontSize.BASE);
        System.out.println("  TEXT_2XL = " + TW.Typography.FontSize.XXLARGE);
        System.out.println("  FONT_BOLD = " + TW.Typography.FontWeight.BOLD);
        System.out.println();

        // Responsive modifiers
        System.out.println("Responsive modifiers:");
        System.out.println("  sm:flex = " + TW.Responsive.sm(TW.Layout.FLEX));
        System.out.println("  md:grid = " + TW.Responsive.md(TW.Layout.GRID));
        System.out.println("  lg:flex-row = " + TW.Responsive.lg(TW.Flex.ROW));
        System.out.println();

        // State modifiers
        System.out.println("State modifiers:");
        System.out.println("  hover:bg-blue-600 = " + TW.State.hover(TW.Background.BLUE_600));
        System.out.println("  focus:ring-2 = " + TW.State.focus(TW.Other.RING_2));
        System.out.println("  dark:bg-gray-800 = " + TW.State.dark(TW.Background.GRAY_800));
        System.out.println();

        // Example: Building a card component
        System.out.println("Example: Card component classes");
        String[] cardClasses = {
            TW.Background.WHITE,
            TW.Border.ROUNDED_LG,
            TW.Effects.Shadow.LG,
            TW.Spacing.Padding.P_6,
            TW.Sizing.MaxWidth.W_SM,
            TW.Responsive.md(TW.Sizing.MaxWidth.W_MD)
        };
        System.out.println("  " + String.join(" ", cardClasses));
        System.out.println();

        System.out.println("=== Example Complete ===");
    }
}
