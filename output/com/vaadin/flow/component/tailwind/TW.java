package com.vaadin.flow.component.tailwind;

import java.io.Serializable;

/**
 * Tailwind CSS utility class constants for type-safe styling in Vaadin Flow.
 * <p>
 * This class provides constants for Tailwind CSS v4.1.18 utility classes,
 * enabling IDE autocomplete and compile-time validation of class names.
 *
 * <h2>Usage Example</h2>
 * <pre>{@code
 * Div container = new Div();
 * container.addClassNames(TW.Layout.FLEX, TW.Flex.AlignItems.CENTER, TW.Spacing.Padding.P_4, TW.Background.GRAY_100);
 *
 * // With responsive modifiers
 * container.addClassNames(
 *     TW.Layout.FLEX,
 *     TW.Responsive.sm(TW.Flex.COL),
 *     TW.Responsive.md(TW.Flex.ROW)
 * );
 * }</pre>
 *
 * @see <a href="https://tailwindcss.com/docs">Tailwind CSS Documentation</a>
 */
public final class TW implements Serializable {

    /** Tailwind CSS version these constants were generated from */
    public static final String TAILWIND_VERSION = "4.1.18";


    // ========== SPACING ==========

    /**
     * Spacing utilities
     */
    public static final class Spacing {

        /**
         * Gap utilities
         */
        public static final class Gap {

            /** Tailwind class: {@code gap-0} */
            public static final String GAP_0 = "gap-0";

            /** Tailwind class: {@code gap-0.5} */
            public static final String GAP_0_5 = "gap-0.5";

            /** Tailwind class: {@code gap-x-0} */
            public static final String X_0 = "gap-x-0";

            /** Tailwind class: {@code gap-y-0} */
            public static final String Y_0 = "gap-y-0";

            /** Tailwind class: {@code gap-1} */
            public static final String GAP_1 = "gap-1";

            /** Tailwind class: {@code gap-1.5} */
            public static final String GAP_1_5 = "gap-1.5";

            /** Tailwind class: {@code gap-x-1} */
            public static final String X_1 = "gap-x-1";

            /** Tailwind class: {@code gap-y-1} */
            public static final String Y_1 = "gap-y-1";

            /** Tailwind class: {@code gap-2} */
            public static final String GAP_2 = "gap-2";

            /** Tailwind class: {@code gap-2.5} */
            public static final String GAP_2_5 = "gap-2.5";

            /** Tailwind class: {@code gap-x-2} */
            public static final String X_2 = "gap-x-2";

            /** Tailwind class: {@code gap-y-2} */
            public static final String Y_2 = "gap-y-2";

            /** Tailwind class: {@code gap-3} */
            public static final String GAP_3 = "gap-3";

            /** Tailwind class: {@code gap-3.5} */
            public static final String GAP_3_5 = "gap-3.5";

            /** Tailwind class: {@code gap-4} */
            public static final String GAP_4 = "gap-4";

            /** Tailwind class: {@code gap-x-4} */
            public static final String X_4 = "gap-x-4";

            /** Tailwind class: {@code gap-y-4} */
            public static final String Y_4 = "gap-y-4";

            /** Tailwind class: {@code gap-5} */
            public static final String GAP_5 = "gap-5";

            /** Tailwind class: {@code gap-6} */
            public static final String GAP_6 = "gap-6";

            /** Tailwind class: {@code gap-7} */
            public static final String GAP_7 = "gap-7";

            /** Tailwind class: {@code gap-8} */
            public static final String GAP_8 = "gap-8";

            /** Tailwind class: {@code gap-9} */
            public static final String GAP_9 = "gap-9";

            /** Tailwind class: {@code gap-10} */
            public static final String GAP_10 = "gap-10";

            /** Tailwind class: {@code gap-11} */
            public static final String GAP_11 = "gap-11";

            /** Tailwind class: {@code gap-12} */
            public static final String GAP_12 = "gap-12";

            /** Tailwind class: {@code gap-14} */
            public static final String GAP_14 = "gap-14";

            /** Tailwind class: {@code gap-16} */
            public static final String GAP_16 = "gap-16";

            /** Tailwind class: {@code gap-20} */
            public static final String GAP_20 = "gap-20";

            /** Tailwind class: {@code gap-24} */
            public static final String GAP_24 = "gap-24";

            /** Tailwind class: {@code gap-28} */
            public static final String GAP_28 = "gap-28";

            /** Tailwind class: {@code gap-32} */
            public static final String GAP_32 = "gap-32";

            /** Tailwind class: {@code gap-36} */
            public static final String GAP_36 = "gap-36";

            /** Tailwind class: {@code gap-40} */
            public static final String GAP_40 = "gap-40";

            /** Tailwind class: {@code gap-44} */
            public static final String GAP_44 = "gap-44";

            /** Tailwind class: {@code gap-48} */
            public static final String GAP_48 = "gap-48";

            /** Tailwind class: {@code gap-52} */
            public static final String GAP_52 = "gap-52";

            /** Tailwind class: {@code gap-56} */
            public static final String GAP_56 = "gap-56";

            /** Tailwind class: {@code gap-60} */
            public static final String GAP_60 = "gap-60";

            /** Tailwind class: {@code gap-64} */
            public static final String GAP_64 = "gap-64";

            /** Tailwind class: {@code gap-72} */
            public static final String GAP_72 = "gap-72";

            /** Tailwind class: {@code gap-80} */
            public static final String GAP_80 = "gap-80";

            /** Tailwind class: {@code gap-96} */
            public static final String GAP_96 = "gap-96";

            /** Tailwind class: {@code gap-px} */
            public static final String GAP_PX = "gap-px";

            private Gap() {}
        }

        /**
         * Margin utilities
         */
        public static final class Margin {

            /** Tailwind class: {@code mb-0} */
            public static final String BOTTOM_0 = "mb-0";

            /** Tailwind class: {@code ml-0} */
            public static final String LEFT_0 = "ml-0";

            /** Tailwind class: {@code m-0} */
            public static final String M_0 = "m-0";

            /** Tailwind class: {@code m-0.5} */
            public static final String M_0_5 = "m-0.5";

            /** Tailwind class: {@code -m-0} */
            public static final String NEG_M_0 = "-m-0";

            /** Tailwind class: {@code mr-0} */
            public static final String RIGHT_0 = "mr-0";

            /** Tailwind class: {@code mt-0} */
            public static final String TOP_0 = "mt-0";

            /** Tailwind class: {@code mx-0} */
            public static final String X_0 = "mx-0";

            /** Tailwind class: {@code my-0} */
            public static final String Y_0 = "my-0";

            /** Tailwind class: {@code mb-1} */
            public static final String BOTTOM_1 = "mb-1";

            /** Tailwind class: {@code ml-1} */
            public static final String LEFT_1 = "ml-1";

            /** Tailwind class: {@code m-1} */
            public static final String M_1 = "m-1";

            /** Tailwind class: {@code m-1.5} */
            public static final String M_1_5 = "m-1.5";

            /** Tailwind class: {@code -mb-1} */
            public static final String NEG_BOTTOM_1 = "-mb-1";

            /** Tailwind class: {@code -ml-1} */
            public static final String NEG_LEFT_1 = "-ml-1";

            /** Tailwind class: {@code -m-1} */
            public static final String NEG_M_1 = "-m-1";

            /** Tailwind class: {@code -mr-1} */
            public static final String NEG_RIGHT_1 = "-mr-1";

            /** Tailwind class: {@code -mt-1} */
            public static final String NEG_TOP_1 = "-mt-1";

            /** Tailwind class: {@code -mx-1} */
            public static final String NEG_X_1 = "-mx-1";

            /** Tailwind class: {@code -my-1} */
            public static final String NEG_Y_1 = "-my-1";

            /** Tailwind class: {@code mr-1} */
            public static final String RIGHT_1 = "mr-1";

            /** Tailwind class: {@code mt-1} */
            public static final String TOP_1 = "mt-1";

            /** Tailwind class: {@code mx-1} */
            public static final String X_1 = "mx-1";

            /** Tailwind class: {@code my-1} */
            public static final String Y_1 = "my-1";

            /** Tailwind class: {@code mb-2} */
            public static final String BOTTOM_2 = "mb-2";

            /** Tailwind class: {@code ml-2} */
            public static final String LEFT_2 = "ml-2";

            /** Tailwind class: {@code m-2} */
            public static final String M_2 = "m-2";

            /** Tailwind class: {@code m-2.5} */
            public static final String M_2_5 = "m-2.5";

            /** Tailwind class: {@code -m-2} */
            public static final String NEG_M_2 = "-m-2";

            /** Tailwind class: {@code mr-2} */
            public static final String RIGHT_2 = "mr-2";

            /** Tailwind class: {@code mt-2} */
            public static final String TOP_2 = "mt-2";

            /** Tailwind class: {@code mx-2} */
            public static final String X_2 = "mx-2";

            /** Tailwind class: {@code my-2} */
            public static final String Y_2 = "my-2";

            /** Tailwind class: {@code m-3} */
            public static final String M_3 = "m-3";

            /** Tailwind class: {@code m-3.5} */
            public static final String M_3_5 = "m-3.5";

            /** Tailwind class: {@code ml-4} */
            public static final String LEFT_4 = "ml-4";

            /** Tailwind class: {@code m-4} */
            public static final String M_4 = "m-4";

            /** Tailwind class: {@code -ml-4} */
            public static final String NEG_LEFT_4 = "-ml-4";

            /** Tailwind class: {@code -m-4} */
            public static final String NEG_M_4 = "-m-4";

            /** Tailwind class: {@code mt-4} */
            public static final String TOP_4 = "mt-4";

            /** Tailwind class: {@code mx-4} */
            public static final String X_4 = "mx-4";

            /** Tailwind class: {@code m-5} */
            public static final String M_5 = "m-5";

            /** Tailwind class: {@code m-6} */
            public static final String M_6 = "m-6";

            /** Tailwind class: {@code m-7} */
            public static final String M_7 = "m-7";

            /** Tailwind class: {@code m-8} */
            public static final String M_8 = "m-8";

            /** Tailwind class: {@code m-9} */
            public static final String M_9 = "m-9";

            /** Tailwind class: {@code m-10} */
            public static final String M_10 = "m-10";

            /** Tailwind class: {@code m-11} */
            public static final String M_11 = "m-11";

            /** Tailwind class: {@code m-12} */
            public static final String M_12 = "m-12";

            /** Tailwind class: {@code m-14} */
            public static final String M_14 = "m-14";

            /** Tailwind class: {@code m-16} */
            public static final String M_16 = "m-16";

            /** Tailwind class: {@code m-20} */
            public static final String M_20 = "m-20";

            /** Tailwind class: {@code m-24} */
            public static final String M_24 = "m-24";

            /** Tailwind class: {@code m-28} */
            public static final String M_28 = "m-28";

            /** Tailwind class: {@code m-32} */
            public static final String M_32 = "m-32";

            /** Tailwind class: {@code m-36} */
            public static final String M_36 = "m-36";

            /** Tailwind class: {@code m-40} */
            public static final String M_40 = "m-40";

            /** Tailwind class: {@code m-44} */
            public static final String M_44 = "m-44";

            /** Tailwind class: {@code m-48} */
            public static final String M_48 = "m-48";

            /** Tailwind class: {@code m-52} */
            public static final String M_52 = "m-52";

            /** Tailwind class: {@code m-56} */
            public static final String M_56 = "m-56";

            /** Tailwind class: {@code m-60} */
            public static final String M_60 = "m-60";

            /** Tailwind class: {@code m-64} */
            public static final String M_64 = "m-64";

            /** Tailwind class: {@code m-72} */
            public static final String M_72 = "m-72";

            /** Tailwind class: {@code m-80} */
            public static final String M_80 = "m-80";

            /** Tailwind class: {@code m-96} */
            public static final String M_96 = "m-96";

            /** Tailwind class: {@code m-auto} */
            public static final String M_AUTO = "m-auto";

            /** Tailwind class: {@code m-px} */
            public static final String M_PX = "m-px";

            /** Tailwind class: {@code mx-auto} */
            public static final String X_AUTO = "mx-auto";

            /** Tailwind class: {@code my-auto} */
            public static final String Y_AUTO = "my-auto";

            private Margin() {}
        }

        /**
         * Padding utilities
         */
        public static final class Padding {

            /** Tailwind class: {@code pb-0} */
            public static final String BOTTOM_0 = "pb-0";

            /** Tailwind class: {@code pl-0} */
            public static final String LEFT_0 = "pl-0";

            /** Tailwind class: {@code p-0} */
            public static final String P_0 = "p-0";

            /** Tailwind class: {@code p-0.5} */
            public static final String P_0_5 = "p-0.5";

            /** Tailwind class: {@code pe-0} */
            public static final String PE_0 = "pe-0";

            /** Tailwind class: {@code ps-0} */
            public static final String PS_0 = "ps-0";

            /** Tailwind class: {@code pr-0} */
            public static final String RIGHT_0 = "pr-0";

            /** Tailwind class: {@code pt-0} */
            public static final String TOP_0 = "pt-0";

            /** Tailwind class: {@code px-0} */
            public static final String X_0 = "px-0";

            /** Tailwind class: {@code py-0} */
            public static final String Y_0 = "py-0";

            /** Tailwind class: {@code pb-1} */
            public static final String BOTTOM_1 = "pb-1";

            /** Tailwind class: {@code pl-1} */
            public static final String LEFT_1 = "pl-1";

            /** Tailwind class: {@code p-1} */
            public static final String P_1 = "p-1";

            /** Tailwind class: {@code p-1.5} */
            public static final String P_1_5 = "p-1.5";

            /** Tailwind class: {@code pe-1} */
            public static final String PE_1 = "pe-1";

            /** Tailwind class: {@code ps-1} */
            public static final String PS_1 = "ps-1";

            /** Tailwind class: {@code pr-1} */
            public static final String RIGHT_1 = "pr-1";

            /** Tailwind class: {@code pt-1} */
            public static final String TOP_1 = "pt-1";

            /** Tailwind class: {@code px-1} */
            public static final String X_1 = "px-1";

            /** Tailwind class: {@code py-1} */
            public static final String Y_1 = "py-1";

            /** Tailwind class: {@code pb-2} */
            public static final String BOTTOM_2 = "pb-2";

            /** Tailwind class: {@code pl-2} */
            public static final String LEFT_2 = "pl-2";

            /** Tailwind class: {@code p-2} */
            public static final String P_2 = "p-2";

            /** Tailwind class: {@code p-2.5} */
            public static final String P_2_5 = "p-2.5";

            /** Tailwind class: {@code pe-2} */
            public static final String PE_2 = "pe-2";

            /** Tailwind class: {@code ps-2} */
            public static final String PS_2 = "ps-2";

            /** Tailwind class: {@code pr-2} */
            public static final String RIGHT_2 = "pr-2";

            /** Tailwind class: {@code pt-2} */
            public static final String TOP_2 = "pt-2";

            /** Tailwind class: {@code px-2} */
            public static final String X_2 = "px-2";

            /** Tailwind class: {@code py-2} */
            public static final String Y_2 = "py-2";

            /** Tailwind class: {@code p-3} */
            public static final String P_3 = "p-3";

            /** Tailwind class: {@code p-3.5} */
            public static final String P_3_5 = "p-3.5";

            /** Tailwind class: {@code pl-4} */
            public static final String LEFT_4 = "pl-4";

            /** Tailwind class: {@code p-4} */
            public static final String P_4 = "p-4";

            /** Tailwind class: {@code pt-4} */
            public static final String TOP_4 = "pt-4";

            /** Tailwind class: {@code py-4} */
            public static final String Y_4 = "py-4";

            /** Tailwind class: {@code px-6} */
            public static final String X_6 = "px-6";

            /** Tailwind class: {@code px-8} */
            public static final String X_8 = "px-8";

            /** Tailwind class: {@code p-96} */
            public static final String P_96 = "p-96";

            /** Tailwind class: {@code p-px} */
            public static final String P_PX = "p-px";

            /** Tailwind class: {@code px-4} */
            public static final String X_4 = "px-4";

            /** Tailwind class: {@code p-5} */
            public static final String P_5 = "p-5";

            /** Tailwind class: {@code p-6} */
            public static final String P_6 = "p-6";

            /** Tailwind class: {@code p-7} */
            public static final String P_7 = "p-7";

            /** Tailwind class: {@code p-8} */
            public static final String P_8 = "p-8";

            /** Tailwind class: {@code p-9} */
            public static final String P_9 = "p-9";

            /** Tailwind class: {@code p-10} */
            public static final String P_10 = "p-10";

            /** Tailwind class: {@code p-11} */
            public static final String P_11 = "p-11";

            /** Tailwind class: {@code p-12} */
            public static final String P_12 = "p-12";

            /** Tailwind class: {@code p-14} */
            public static final String P_14 = "p-14";

            /** Tailwind class: {@code p-16} */
            public static final String P_16 = "p-16";

            /** Tailwind class: {@code p-20} */
            public static final String P_20 = "p-20";

            /** Tailwind class: {@code p-24} */
            public static final String P_24 = "p-24";

            /** Tailwind class: {@code p-28} */
            public static final String P_28 = "p-28";

            /** Tailwind class: {@code p-32} */
            public static final String P_32 = "p-32";

            /** Tailwind class: {@code p-36} */
            public static final String P_36 = "p-36";

            /** Tailwind class: {@code p-40} */
            public static final String P_40 = "p-40";

            /** Tailwind class: {@code p-44} */
            public static final String P_44 = "p-44";

            /** Tailwind class: {@code p-48} */
            public static final String P_48 = "p-48";

            /** Tailwind class: {@code p-52} */
            public static final String P_52 = "p-52";

            /** Tailwind class: {@code p-56} */
            public static final String P_56 = "p-56";

            /** Tailwind class: {@code p-60} */
            public static final String P_60 = "p-60";

            /** Tailwind class: {@code p-64} */
            public static final String P_64 = "p-64";

            /** Tailwind class: {@code p-72} */
            public static final String P_72 = "p-72";

            /** Tailwind class: {@code p-80} */
            public static final String P_80 = "p-80";

            private Padding() {}
        }

        /**
         * Space utilities
         */
        public static final class Space {

            /** Tailwind class: {@code space-x-reverse} */
            public static final String X_ = "space-x-reverse";

            /** Tailwind class: {@code space-x-0} */
            public static final String X_0 = "space-x-0";

            /** Tailwind class: {@code space-y-reverse} */
            public static final String Y_ = "space-y-reverse";

            /** Tailwind class: {@code space-y-0} */
            public static final String Y_0 = "space-y-0";

            /** Tailwind class: {@code space-x-1} */
            public static final String X_1 = "space-x-1";

            /** Tailwind class: {@code space-y-1} */
            public static final String Y_1 = "space-y-1";

            /** Tailwind class: {@code space-x-2} */
            public static final String X_2 = "space-x-2";

            /** Tailwind class: {@code space-y-2} */
            public static final String Y_2 = "space-y-2";

            /** Tailwind class: {@code space-x-4} */
            public static final String X_4 = "space-x-4";

            /** Tailwind class: {@code space-y-4} */
            public static final String Y_4 = "space-y-4";

            private Space() {}
        }

        private Spacing() {}
    }

    // ========== LAYOUT ==========

    /**
     * Layout utilities
     */
    public static final class Layout {

        /** Tailwind class: {@code block} */
        public static final String BLOCK = "block";

        /** Tailwind class: {@code contents} */
        public static final String CONTENTS = "contents";

        /** Tailwind class: {@code flex} */
        public static final String FLEX = "flex";

        /** Tailwind class: {@code flow-root} */
        public static final String FLOW_ROOT = "flow-root";

        /** Tailwind class: {@code grid} */
        public static final String GRID = "grid";

        /** Tailwind class: {@code hidden} */
        public static final String HIDDEN = "hidden";

        /** Tailwind class: {@code inline} */
        public static final String INLINE = "inline";

        /** Tailwind class: {@code inline-block} */
        public static final String INLINE_BLOCK = "inline-block";

        /** Tailwind class: {@code inline-flex} */
        public static final String INLINE_FLEX = "inline-flex";

        /** Tailwind class: {@code inline-grid} */
        public static final String INLINE_GRID = "inline-grid";

        /** Tailwind class: {@code inline-table} */
        public static final String INLINE_TABLE = "inline-table";

        /** Tailwind class: {@code list-item} */
        public static final String LIST_ITEM = "list-item";

        /** Tailwind class: {@code table} */
        public static final String TABLE = "table";

        /** Tailwind class: {@code table-caption} */
        public static final String TABLE_CAPTION = "table-caption";

        /** Tailwind class: {@code table-cell} */
        public static final String TABLE_CELL = "table-cell";

        /** Tailwind class: {@code table-column} */
        public static final String TABLE_COLUMN = "table-column";

        /** Tailwind class: {@code table-column-group} */
        public static final String TABLE_COLUMN_GROUP = "table-column-group";

        /** Tailwind class: {@code table-footer-group} */
        public static final String TABLE_FOOTER_GROUP = "table-footer-group";

        /** Tailwind class: {@code table-header-group} */
        public static final String TABLE_HEADER_GROUP = "table-header-group";

        /** Tailwind class: {@code table-row} */
        public static final String TABLE_ROW = "table-row";

        /** Tailwind class: {@code table-row-group} */
        public static final String TABLE_ROW_GROUP = "table-row-group";

        private Layout() {}
    }

    // ========== SIZING ==========

    /**
     * Sizing utilities
     */
    public static final class Sizing {

        /**
         * Height utilities
         */
        public static final class Height {

            /** Tailwind class: {@code h-auto} */
            public static final String AUTO = "h-auto";

            /** Tailwind class: {@code h-fit} */
            public static final String FIT = "h-fit";

            /** Tailwind class: {@code h-full} */
            public static final String FULL = "h-full";

            /** Tailwind class: {@code h-0} */
            public static final String H_0 = "h-0";

            /** Tailwind class: {@code h-0.5} */
            public static final String H_0_5 = "h-0.5";

            /** Tailwind class: {@code h-1} */
            public static final String H_1 = "h-1";

            /** Tailwind class: {@code h-1/2} */
            public static final String H_1_2 = "h-1/2";

            /** Tailwind class: {@code h-1/3} */
            public static final String H_1_3 = "h-1/3";

            /** Tailwind class: {@code h-1/4} */
            public static final String H_1_4 = "h-1/4";

            /** Tailwind class: {@code h-1/5} */
            public static final String H_1_5 = "h-1/5";

            /** Tailwind class: {@code h-1/6} */
            public static final String H_1_6 = "h-1/6";

            /** Tailwind class: {@code h-2} */
            public static final String H_2 = "h-2";

            /** Tailwind class: {@code h-2/3} */
            public static final String H_2_3 = "h-2/3";

            /** Tailwind class: {@code h-3} */
            public static final String H_3 = "h-3";

            /** Tailwind class: {@code h-3/4} */
            public static final String H_3_4 = "h-3/4";

            /** Tailwind class: {@code h-4} */
            public static final String H_4 = "h-4";

            /** Tailwind class: {@code h-5} */
            public static final String H_5 = "h-5";

            /** Tailwind class: {@code h-6} */
            public static final String H_6 = "h-6";

            /** Tailwind class: {@code h-8} */
            public static final String H_8 = "h-8";

            /** Tailwind class: {@code h-10} */
            public static final String H_10 = "h-10";

            /** Tailwind class: {@code h-12} */
            public static final String H_12 = "h-12";

            /** Tailwind class: {@code h-16} */
            public static final String H_16 = "h-16";

            /** Tailwind class: {@code h-20} */
            public static final String H_20 = "h-20";

            /** Tailwind class: {@code h-24} */
            public static final String H_24 = "h-24";

            /** Tailwind class: {@code h-32} */
            public static final String H_32 = "h-32";

            /** Tailwind class: {@code h-40} */
            public static final String H_40 = "h-40";

            /** Tailwind class: {@code h-48} */
            public static final String H_48 = "h-48";

            /** Tailwind class: {@code h-56} */
            public static final String H_56 = "h-56";

            /** Tailwind class: {@code h-64} */
            public static final String H_64 = "h-64";

            /** Tailwind class: {@code h-72} */
            public static final String H_72 = "h-72";

            /** Tailwind class: {@code h-80} */
            public static final String H_80 = "h-80";

            /** Tailwind class: {@code h-96} */
            public static final String H_96 = "h-96";

            /** Tailwind class: {@code h-px} */
            public static final String H_PX = "h-px";

            /** Tailwind class: {@code h-max} */
            public static final String MAX = "h-max";

            /** Tailwind class: {@code h-min} */
            public static final String MIN = "h-min";

            /** Tailwind class: {@code h-screen} */
            public static final String SCREEN = "h-screen";

            private Height() {}
        }

        /**
         * MaxHeight utilities
         */
        public static final class MaxHeight {

            /** Tailwind class: {@code max-h-fit} */
            public static final String FIT = "max-h-fit";

            /** Tailwind class: {@code max-h-full} */
            public static final String FULL = "max-h-full";

            /** Tailwind class: {@code max-h-0} */
            public static final String H_0 = "max-h-0";

            /** Tailwind class: {@code max-h-max} */
            public static final String MAX = "max-h-max";

            /** Tailwind class: {@code max-h-min} */
            public static final String MIN = "max-h-min";

            /** Tailwind class: {@code max-h-screen} */
            public static final String SCREEN = "max-h-screen";

            private MaxHeight() {}
        }

        /**
         * MaxWidth utilities
         */
        public static final class MaxWidth {

            /** Tailwind class: {@code max-w-fit} */
            public static final String FIT = "max-w-fit";

            /** Tailwind class: {@code max-w-full} */
            public static final String FULL = "max-w-full";

            /** Tailwind class: {@code max-w-max} */
            public static final String MAX = "max-w-max";

            /** Tailwind class: {@code max-w-min} */
            public static final String MIN = "max-w-min";

            /** Tailwind class: {@code max-w-screen-lg} */
            public static final String SCREEN_LG = "max-w-screen-lg";

            /** Tailwind class: {@code max-w-0} */
            public static final String W_0 = "max-w-0";

            /** Tailwind class: {@code max-w-screen-2xl} */
            public static final String SCREEN_2XL = "max-w-screen-2xl";

            /** Tailwind class: {@code max-w-screen-md} */
            public static final String SCREEN_MD = "max-w-screen-md";

            /** Tailwind class: {@code max-w-screen-sm} */
            public static final String SCREEN_SM = "max-w-screen-sm";

            /** Tailwind class: {@code max-w-screen-xl} */
            public static final String SCREEN_XL = "max-w-screen-xl";

            /** Tailwind class: {@code max-w-2xl} */
            public static final String W_2XL = "max-w-2xl";

            /** Tailwind class: {@code max-w-3xl} */
            public static final String W_3XL = "max-w-3xl";

            /** Tailwind class: {@code max-w-4xl} */
            public static final String W_4XL = "max-w-4xl";

            /** Tailwind class: {@code max-w-5xl} */
            public static final String W_5XL = "max-w-5xl";

            /** Tailwind class: {@code max-w-6xl} */
            public static final String W_6XL = "max-w-6xl";

            /** Tailwind class: {@code max-w-7xl} */
            public static final String W_7XL = "max-w-7xl";

            /** Tailwind class: {@code max-w-lg} */
            public static final String W_LG = "max-w-lg";

            /** Tailwind class: {@code max-w-md} */
            public static final String W_MD = "max-w-md";

            /** Tailwind class: {@code max-w-none} */
            public static final String W_NONE = "max-w-none";

            /** Tailwind class: {@code max-w-prose} */
            public static final String W_PROSE = "max-w-prose";

            /** Tailwind class: {@code max-w-sm} */
            public static final String W_SM = "max-w-sm";

            /** Tailwind class: {@code max-w-xl} */
            public static final String W_XL = "max-w-xl";

            /** Tailwind class: {@code max-w-xs} */
            public static final String W_XS = "max-w-xs";

            private MaxWidth() {}
        }

        /**
         * MinHeight utilities
         */
        public static final class MinHeight {

            /** Tailwind class: {@code min-h-fit} */
            public static final String FIT = "min-h-fit";

            /** Tailwind class: {@code min-h-full} */
            public static final String FULL = "min-h-full";

            /** Tailwind class: {@code min-h-0} */
            public static final String H_0 = "min-h-0";

            /** Tailwind class: {@code min-h-max} */
            public static final String MAX = "min-h-max";

            /** Tailwind class: {@code min-h-min} */
            public static final String MIN = "min-h-min";

            /** Tailwind class: {@code min-h-screen} */
            public static final String SCREEN = "min-h-screen";

            private MinHeight() {}
        }

        /**
         * MinWidth utilities
         */
        public static final class MinWidth {

            /** Tailwind class: {@code min-w-fit} */
            public static final String FIT = "min-w-fit";

            /** Tailwind class: {@code min-w-full} */
            public static final String FULL = "min-w-full";

            /** Tailwind class: {@code min-w-max} */
            public static final String MAX = "min-w-max";

            /** Tailwind class: {@code min-w-min} */
            public static final String MIN = "min-w-min";

            /** Tailwind class: {@code min-w-0} */
            public static final String W_0 = "min-w-0";

            private MinWidth() {}
        }

        /**
         * Size utilities
         */
        public static final class Size {

            /** Tailwind class: {@code size-0} */
            public static final String SIZE_0 = "size-0";

            /** Tailwind class: {@code size-1} */
            public static final String SIZE_1 = "size-1";

            /** Tailwind class: {@code size-2} */
            public static final String SIZE_2 = "size-2";

            /** Tailwind class: {@code size-4} */
            public static final String SIZE_4 = "size-4";

            /** Tailwind class: {@code size-8} */
            public static final String SIZE_8 = "size-8";

            /** Tailwind class: {@code size-auto} */
            public static final String SIZE_AUTO = "size-auto";

            /** Tailwind class: {@code size-full} */
            public static final String SIZE_FULL = "size-full";

            private Size() {}
        }

        /**
         * Width utilities
         */
        public static final class Width {

            /** Tailwind class: {@code w-auto} */
            public static final String AUTO = "w-auto";

            /** Tailwind class: {@code w-fit} */
            public static final String FIT = "w-fit";

            /** Tailwind class: {@code w-full} */
            public static final String FULL = "w-full";

            /** Tailwind class: {@code w-max} */
            public static final String MAX = "w-max";

            /** Tailwind class: {@code w-min} */
            public static final String MIN = "w-min";

            /** Tailwind class: {@code w-screen} */
            public static final String SCREEN = "w-screen";

            /** Tailwind class: {@code w-0} */
            public static final String W_0 = "w-0";

            /** Tailwind class: {@code w-0.5} */
            public static final String W_0_5 = "w-0.5";

            /** Tailwind class: {@code w-1} */
            public static final String W_1 = "w-1";

            /** Tailwind class: {@code w-1/12} */
            public static final String W_1_12 = "w-1/12";

            /** Tailwind class: {@code w-1/2} */
            public static final String W_1_2 = "w-1/2";

            /** Tailwind class: {@code w-1/3} */
            public static final String W_1_3 = "w-1/3";

            /** Tailwind class: {@code w-1/4} */
            public static final String W_1_4 = "w-1/4";

            /** Tailwind class: {@code w-1/5} */
            public static final String W_1_5 = "w-1/5";

            /** Tailwind class: {@code w-1/6} */
            public static final String W_1_6 = "w-1/6";

            /** Tailwind class: {@code w-2} */
            public static final String W_2 = "w-2";

            /** Tailwind class: {@code w-2/3} */
            public static final String W_2_3 = "w-2/3";

            /** Tailwind class: {@code w-2/4} */
            public static final String W_2_4 = "w-2/4";

            /** Tailwind class: {@code w-2/5} */
            public static final String W_2_5 = "w-2/5";

            /** Tailwind class: {@code w-3} */
            public static final String W_3 = "w-3";

            /** Tailwind class: {@code w-3/4} */
            public static final String W_3_4 = "w-3/4";

            /** Tailwind class: {@code w-3/5} */
            public static final String W_3_5 = "w-3/5";

            /** Tailwind class: {@code w-4} */
            public static final String W_4 = "w-4";

            /** Tailwind class: {@code w-4/5} */
            public static final String W_4_5 = "w-4/5";

            /** Tailwind class: {@code w-5} */
            public static final String W_5 = "w-5";

            /** Tailwind class: {@code w-6} */
            public static final String W_6 = "w-6";

            /** Tailwind class: {@code w-8} */
            public static final String W_8 = "w-8";

            /** Tailwind class: {@code w-10} */
            public static final String W_10 = "w-10";

            /** Tailwind class: {@code w-12} */
            public static final String W_12 = "w-12";

            /** Tailwind class: {@code w-16} */
            public static final String W_16 = "w-16";

            /** Tailwind class: {@code w-20} */
            public static final String W_20 = "w-20";

            /** Tailwind class: {@code w-24} */
            public static final String W_24 = "w-24";

            /** Tailwind class: {@code w-32} */
            public static final String W_32 = "w-32";

            /** Tailwind class: {@code w-40} */
            public static final String W_40 = "w-40";

            /** Tailwind class: {@code w-48} */
            public static final String W_48 = "w-48";

            /** Tailwind class: {@code w-56} */
            public static final String W_56 = "w-56";

            /** Tailwind class: {@code w-64} */
            public static final String W_64 = "w-64";

            /** Tailwind class: {@code w-72} */
            public static final String W_72 = "w-72";

            /** Tailwind class: {@code w-80} */
            public static final String W_80 = "w-80";

            /** Tailwind class: {@code w-96} */
            public static final String W_96 = "w-96";

            /** Tailwind class: {@code w-px} */
            public static final String W_PX = "w-px";

            private Width() {}
        }

        private Sizing() {}
    }

    // ========== BACKGROUND ==========

    /**
     * Background utilities
     */
    public static final class Background {

        /** Tailwind class: {@code bg-black} */
        public static final String BLACK = "bg-black";

        /** Tailwind class: {@code bg-blue-50} */
        public static final String BLUE_50 = "bg-blue-50";

        /** Tailwind class: {@code bg-gray-50} */
        public static final String GRAY_50 = "bg-gray-50";

        /** Tailwind class: {@code bg-green-50} */
        public static final String GREEN_50 = "bg-green-50";

        /** Tailwind class: {@code bg-orange-50} */
        public static final String ORANGE_50 = "bg-orange-50";

        /** Tailwind class: {@code bg-red-50} */
        public static final String RED_50 = "bg-red-50";

        /** Tailwind class: {@code bg-slate-50} */
        public static final String SLATE_50 = "bg-slate-50";

        /** Tailwind class: {@code bg-zinc-50} */
        public static final String ZINC_50 = "bg-zinc-50";

        /** Tailwind class: {@code bg-blue-100} */
        public static final String BLUE_100 = "bg-blue-100";

        /** Tailwind class: {@code bg-gray-100} */
        public static final String GRAY_100 = "bg-gray-100";

        /** Tailwind class: {@code bg-red-100} */
        public static final String RED_100 = "bg-red-100";

        /** Tailwind class: {@code bg-slate-100} */
        public static final String SLATE_100 = "bg-slate-100";

        /** Tailwind class: {@code bg-gray-200} */
        public static final String GRAY_200 = "bg-gray-200";

        /** Tailwind class: {@code bg-gray-300} */
        public static final String GRAY_300 = "bg-gray-300";

        /** Tailwind class: {@code bg-gray-400} */
        public static final String GRAY_400 = "bg-gray-400";

        /** Tailwind class: {@code bg-blue-500} */
        public static final String BLUE_500 = "bg-blue-500";

        /** Tailwind class: {@code bg-gray-500} */
        public static final String GRAY_500 = "bg-gray-500";

        /** Tailwind class: {@code bg-green-500} */
        public static final String GREEN_500 = "bg-green-500";

        /** Tailwind class: {@code bg-orange-500} */
        public static final String ORANGE_500 = "bg-orange-500";

        /** Tailwind class: {@code bg-red-500} */
        public static final String RED_500 = "bg-red-500";

        /** Tailwind class: {@code bg-slate-500} */
        public static final String SLATE_500 = "bg-slate-500";

        /** Tailwind class: {@code bg-blue-600} */
        public static final String BLUE_600 = "bg-blue-600";

        /** Tailwind class: {@code bg-gray-600} */
        public static final String GRAY_600 = "bg-gray-600";

        /** Tailwind class: {@code bg-blue-700} */
        public static final String BLUE_700 = "bg-blue-700";

        /** Tailwind class: {@code bg-gray-700} */
        public static final String GRAY_700 = "bg-gray-700";

        /** Tailwind class: {@code bg-gray-800} */
        public static final String GRAY_800 = "bg-gray-800";

        /** Tailwind class: {@code bg-gray-900} */
        public static final String GRAY_900 = "bg-gray-900";

        /** Tailwind class: {@code bg-blue-950} */
        public static final String BLUE_950 = "bg-blue-950";

        /** Tailwind class: {@code bg-current} */
        public static final String CURRENT = "bg-current";

        /** Tailwind class: {@code bg-gray-950} */
        public static final String GRAY_950 = "bg-gray-950";

        /** Tailwind class: {@code bg-green-950} */
        public static final String GREEN_950 = "bg-green-950";

        /** Tailwind class: {@code bg-inherit} */
        public static final String INHERIT = "bg-inherit";

        /** Tailwind class: {@code bg-zinc-500} */
        public static final String ZINC_500 = "bg-zinc-500";

        /** Tailwind class: {@code bg-orange-950} */
        public static final String ORANGE_950 = "bg-orange-950";

        /** Tailwind class: {@code bg-red-950} */
        public static final String RED_950 = "bg-red-950";

        /** Tailwind class: {@code bg-slate-950} */
        public static final String SLATE_950 = "bg-slate-950";

        /** Tailwind class: {@code bg-transparent} */
        public static final String TRANSPARENT = "bg-transparent";

        /** Tailwind class: {@code bg-white} */
        public static final String WHITE = "bg-white";

        /** Tailwind class: {@code bg-zinc-950} */
        public static final String ZINC_950 = "bg-zinc-950";

        private Background() {}
    }

    // ========== TEXT ==========

    /**
     * Text utilities
     */
    public static final class Text {

        /** Tailwind class: {@code text-amber-50} */
        public static final String AMBER_50 = "text-amber-50";

        /** Tailwind class: {@code text-blue-50} */
        public static final String BLUE_50 = "text-blue-50";

        /** Tailwind class: {@code text-cyan-50} */
        public static final String CYAN_50 = "text-cyan-50";

        /** Tailwind class: {@code text-emerald-50} */
        public static final String EMERALD_50 = "text-emerald-50";

        /** Tailwind class: {@code text-fuchsia-50} */
        public static final String FUCHSIA_50 = "text-fuchsia-50";

        /** Tailwind class: {@code text-gray-50} */
        public static final String GRAY_50 = "text-gray-50";

        /** Tailwind class: {@code text-green-50} */
        public static final String GREEN_50 = "text-green-50";

        /** Tailwind class: {@code text-indigo-50} */
        public static final String INDIGO_50 = "text-indigo-50";

        /** Tailwind class: {@code text-orange-50} */
        public static final String ORANGE_50 = "text-orange-50";

        /** Tailwind class: {@code text-pink-50} */
        public static final String PINK_50 = "text-pink-50";

        /** Tailwind class: {@code text-purple-50} */
        public static final String PURPLE_50 = "text-purple-50";

        /** Tailwind class: {@code text-gray-100} */
        public static final String GRAY_100 = "text-gray-100";

        /** Tailwind class: {@code text-gray-200} */
        public static final String GRAY_200 = "text-gray-200";

        /** Tailwind class: {@code text-gray-300} */
        public static final String GRAY_300 = "text-gray-300";

        /** Tailwind class: {@code text-gray-400} */
        public static final String GRAY_400 = "text-gray-400";

        /** Tailwind class: {@code text-amber-500} */
        public static final String AMBER_500 = "text-amber-500";

        /** Tailwind class: {@code text-blue-500} */
        public static final String BLUE_500 = "text-blue-500";

        /** Tailwind class: {@code text-cyan-500} */
        public static final String CYAN_500 = "text-cyan-500";

        /** Tailwind class: {@code text-fuchsia-500} */
        public static final String FUCHSIA_500 = "text-fuchsia-500";

        /** Tailwind class: {@code text-green-500} */
        public static final String GREEN_500 = "text-green-500";

        /** Tailwind class: {@code text-amber-950} */
        public static final String AMBER_950 = "text-amber-950";

        /** Tailwind class: {@code text-black} */
        public static final String BLACK = "text-black";

        /** Tailwind class: {@code text-lime-50} */
        public static final String LIME_50 = "text-lime-50";

        /** Tailwind class: {@code text-neutral-50} */
        public static final String NEUTRAL_50 = "text-neutral-50";

        /** Tailwind class: {@code text-blue-100} */
        public static final String BLUE_100 = "text-blue-100";

        /** Tailwind class: {@code text-emerald-500} */
        public static final String EMERALD_500 = "text-emerald-500";

        /** Tailwind class: {@code text-gray-600} */
        public static final String GRAY_600 = "text-gray-600";

        /** Tailwind class: {@code text-gray-700} */
        public static final String GRAY_700 = "text-gray-700";

        /** Tailwind class: {@code text-gray-800} */
        public static final String GRAY_800 = "text-gray-800";

        /** Tailwind class: {@code text-blue-950} */
        public static final String BLUE_950 = "text-blue-950";

        /** Tailwind class: {@code text-current} */
        public static final String CURRENT = "text-current";

        /** Tailwind class: {@code text-gray-500} */
        public static final String GRAY_500 = "text-gray-500";

        /** Tailwind class: {@code text-indigo-500} */
        public static final String INDIGO_500 = "text-indigo-500";

        /** Tailwind class: {@code text-lime-500} */
        public static final String LIME_500 = "text-lime-500";

        /** Tailwind class: {@code text-neutral-500} */
        public static final String NEUTRAL_500 = "text-neutral-500";

        /** Tailwind class: {@code text-orange-500} */
        public static final String ORANGE_500 = "text-orange-500";

        /** Tailwind class: {@code text-pink-500} */
        public static final String PINK_500 = "text-pink-500";

        /** Tailwind class: {@code text-gray-900} */
        public static final String GRAY_900 = "text-gray-900";

        /** Tailwind class: {@code text-cyan-950} */
        public static final String CYAN_950 = "text-cyan-950";

        /** Tailwind class: {@code text-emerald-950} */
        public static final String EMERALD_950 = "text-emerald-950";

        /** Tailwind class: {@code text-fuchsia-950} */
        public static final String FUCHSIA_950 = "text-fuchsia-950";

        /** Tailwind class: {@code text-gray-950} */
        public static final String GRAY_950 = "text-gray-950";

        /** Tailwind class: {@code text-green-950} */
        public static final String GREEN_950 = "text-green-950";

        /** Tailwind class: {@code text-indigo-950} */
        public static final String INDIGO_950 = "text-indigo-950";

        /** Tailwind class: {@code text-inherit} */
        public static final String INHERIT = "text-inherit";

        /** Tailwind class: {@code text-red-50} */
        public static final String RED_50 = "text-red-50";

        /** Tailwind class: {@code text-rose-50} */
        public static final String ROSE_50 = "text-rose-50";

        /** Tailwind class: {@code text-sky-50} */
        public static final String SKY_50 = "text-sky-50";

        /** Tailwind class: {@code text-slate-50} */
        public static final String SLATE_50 = "text-slate-50";

        /** Tailwind class: {@code text-stone-50} */
        public static final String STONE_50 = "text-stone-50";

        /** Tailwind class: {@code text-teal-50} */
        public static final String TEAL_50 = "text-teal-50";

        /** Tailwind class: {@code text-violet-50} */
        public static final String VIOLET_50 = "text-violet-50";

        /** Tailwind class: {@code text-yellow-50} */
        public static final String YELLOW_50 = "text-yellow-50";

        /** Tailwind class: {@code text-zinc-50} */
        public static final String ZINC_50 = "text-zinc-50";

        /** Tailwind class: {@code text-red-100} */
        public static final String RED_100 = "text-red-100";

        /** Tailwind class: {@code text-slate-100} */
        public static final String SLATE_100 = "text-slate-100";

        /** Tailwind class: {@code text-zinc-100} */
        public static final String ZINC_100 = "text-zinc-100";

        /** Tailwind class: {@code text-red-200} */
        public static final String RED_200 = "text-red-200";

        /** Tailwind class: {@code text-slate-200} */
        public static final String SLATE_200 = "text-slate-200";

        /** Tailwind class: {@code text-red-300} */
        public static final String RED_300 = "text-red-300";

        /** Tailwind class: {@code text-slate-300} */
        public static final String SLATE_300 = "text-slate-300";

        /** Tailwind class: {@code text-red-400} */
        public static final String RED_400 = "text-red-400";

        /** Tailwind class: {@code text-slate-400} */
        public static final String SLATE_400 = "text-slate-400";

        /** Tailwind class: {@code text-purple-500} */
        public static final String PURPLE_500 = "text-purple-500";

        /** Tailwind class: {@code text-red-500} */
        public static final String RED_500 = "text-red-500";

        /** Tailwind class: {@code text-rose-500} */
        public static final String ROSE_500 = "text-rose-500";

        /** Tailwind class: {@code text-sky-500} */
        public static final String SKY_500 = "text-sky-500";

        /** Tailwind class: {@code text-slate-500} */
        public static final String SLATE_500 = "text-slate-500";

        /** Tailwind class: {@code text-stone-500} */
        public static final String STONE_500 = "text-stone-500";

        /** Tailwind class: {@code text-teal-500} */
        public static final String TEAL_500 = "text-teal-500";

        /** Tailwind class: {@code text-violet-500} */
        public static final String VIOLET_500 = "text-violet-500";

        /** Tailwind class: {@code text-yellow-500} */
        public static final String YELLOW_500 = "text-yellow-500";

        /** Tailwind class: {@code text-zinc-500} */
        public static final String ZINC_500 = "text-zinc-500";

        /** Tailwind class: {@code text-red-600} */
        public static final String RED_600 = "text-red-600";

        /** Tailwind class: {@code text-slate-600} */
        public static final String SLATE_600 = "text-slate-600";

        /** Tailwind class: {@code text-red-700} */
        public static final String RED_700 = "text-red-700";

        /** Tailwind class: {@code text-slate-700} */
        public static final String SLATE_700 = "text-slate-700";

        /** Tailwind class: {@code text-red-800} */
        public static final String RED_800 = "text-red-800";

        /** Tailwind class: {@code text-slate-800} */
        public static final String SLATE_800 = "text-slate-800";

        /** Tailwind class: {@code text-red-900} */
        public static final String RED_900 = "text-red-900";

        /** Tailwind class: {@code text-slate-900} */
        public static final String SLATE_900 = "text-slate-900";

        /** Tailwind class: {@code text-lime-950} */
        public static final String LIME_950 = "text-lime-950";

        /** Tailwind class: {@code text-neutral-950} */
        public static final String NEUTRAL_950 = "text-neutral-950";

        /** Tailwind class: {@code text-orange-950} */
        public static final String ORANGE_950 = "text-orange-950";

        /** Tailwind class: {@code text-pink-950} */
        public static final String PINK_950 = "text-pink-950";

        /** Tailwind class: {@code text-purple-950} */
        public static final String PURPLE_950 = "text-purple-950";

        /** Tailwind class: {@code text-red-950} */
        public static final String RED_950 = "text-red-950";

        /** Tailwind class: {@code text-rose-950} */
        public static final String ROSE_950 = "text-rose-950";

        /** Tailwind class: {@code text-sky-950} */
        public static final String SKY_950 = "text-sky-950";

        /** Tailwind class: {@code text-slate-950} */
        public static final String SLATE_950 = "text-slate-950";

        /** Tailwind class: {@code text-stone-950} */
        public static final String STONE_950 = "text-stone-950";

        /** Tailwind class: {@code text-teal-950} */
        public static final String TEAL_950 = "text-teal-950";

        /** Tailwind class: {@code text-transparent} */
        public static final String TRANSPARENT = "text-transparent";

        /** Tailwind class: {@code text-violet-950} */
        public static final String VIOLET_950 = "text-violet-950";

        /** Tailwind class: {@code text-white} */
        public static final String WHITE = "text-white";

        /** Tailwind class: {@code text-yellow-950} */
        public static final String YELLOW_950 = "text-yellow-950";

        /** Tailwind class: {@code text-zinc-950} */
        public static final String ZINC_950 = "text-zinc-950";

        private Text() {}
    }

    // ========== BORDER ==========

    /**
     * Border utilities
     */
    public static final class Border {

        /** Tailwind class: {@code border-black} */
        public static final String BLACK = "border-black";

        /** Tailwind class: {@code border} */
        public static final String BORDER = "border";

        /** Tailwind class: {@code border-0} */
        public static final String BORDER_0 = "border-0";

        /** Tailwind class: {@code border-b-0} */
        public static final String BORDER_B_0 = "border-b-0";

        /** Tailwind class: {@code border-e-0} */
        public static final String BORDER_E_0 = "border-e-0";

        /** Tailwind class: {@code border-l-0} */
        public static final String BORDER_L_0 = "border-l-0";

        /** Tailwind class: {@code border-r-0} */
        public static final String BORDER_R_0 = "border-r-0";

        /** Tailwind class: {@code border-s-0} */
        public static final String BORDER_S_0 = "border-s-0";

        /** Tailwind class: {@code border-t-0} */
        public static final String BORDER_T_0 = "border-t-0";

        /** Tailwind class: {@code border-x-0} */
        public static final String BORDER_X_0 = "border-x-0";

        /** Tailwind class: {@code border-y-0} */
        public static final String BORDER_Y_0 = "border-y-0";

        /** Tailwind class: {@code border-2} */
        public static final String BORDER_2 = "border-2";

        /** Tailwind class: {@code border-t-2} */
        public static final String BORDER_T_2 = "border-t-2";

        /** Tailwind class: {@code border-x-2} */
        public static final String BORDER_X_2 = "border-x-2";

        /** Tailwind class: {@code border-y-2} */
        public static final String BORDER_Y_2 = "border-y-2";

        /** Tailwind class: {@code border-4} */
        public static final String BORDER_4 = "border-4";

        /** Tailwind class: {@code rounded} */
        public static final String ROUNDED = "rounded";

        /** Tailwind class: {@code rounded-2xl} */
        public static final String ROUNDED_2XL = "rounded-2xl";

        /** Tailwind class: {@code rounded-3xl} */
        public static final String ROUNDED_3XL = "rounded-3xl";

        /** Tailwind class: {@code border-8} */
        public static final String BORDER_8 = "border-8";

        /** Tailwind class: {@code border-blue-50} */
        public static final String BLUE_50 = "border-blue-50";

        /** Tailwind class: {@code border-gray-50} */
        public static final String GRAY_50 = "border-gray-50";

        /** Tailwind class: {@code border-red-50} */
        public static final String RED_50 = "border-red-50";

        /** Tailwind class: {@code border-slate-50} */
        public static final String SLATE_50 = "border-slate-50";

        /** Tailwind class: {@code border-gray-100} */
        public static final String GRAY_100 = "border-gray-100";

        /** Tailwind class: {@code border-blue-500} */
        public static final String BLUE_500 = "border-blue-500";

        /** Tailwind class: {@code border-red-500} */
        public static final String RED_500 = "border-red-500";

        /** Tailwind class: {@code border-blue-950} */
        public static final String BLUE_950 = "border-blue-950";

        /** Tailwind class: {@code border-current} */
        public static final String CURRENT = "border-current";

        /** Tailwind class: {@code border-dashed} */
        public static final String DASHED = "border-dashed";

        /** Tailwind class: {@code border-dotted} */
        public static final String DOTTED = "border-dotted";

        /** Tailwind class: {@code border-double} */
        public static final String DOUBLE = "border-double";

        /** Tailwind class: {@code border-gray-500} */
        public static final String GRAY_500 = "border-gray-500";

        /** Tailwind class: {@code border-gray-950} */
        public static final String GRAY_950 = "border-gray-950";

        /** Tailwind class: {@code border-hidden} */
        public static final String HIDDEN = "border-hidden";

        /** Tailwind class: {@code border-inherit} */
        public static final String INHERIT = "border-inherit";

        /** Tailwind class: {@code border-none} */
        public static final String NONE = "border-none";

        /** Tailwind class: {@code border-red-950} */
        public static final String RED_950 = "border-red-950";

        /** Tailwind class: {@code rounded-b-none} */
        public static final String ROUNDED_B_NONE = "rounded-b-none";

        /** Tailwind class: {@code rounded-bl-none} */
        public static final String ROUNDED_BL_NONE = "rounded-bl-none";

        /** Tailwind class: {@code rounded-br-none} */
        public static final String ROUNDED_BR_NONE = "rounded-br-none";

        /** Tailwind class: {@code rounded-ee-none} */
        public static final String ROUNDED_EE_NONE = "rounded-ee-none";

        /** Tailwind class: {@code rounded-es-none} */
        public static final String ROUNDED_ES_NONE = "rounded-es-none";

        /** Tailwind class: {@code rounded-full} */
        public static final String ROUNDED_FULL = "rounded-full";

        /** Tailwind class: {@code rounded-l-none} */
        public static final String ROUNDED_L_NONE = "rounded-l-none";

        /** Tailwind class: {@code rounded-lg} */
        public static final String ROUNDED_LG = "rounded-lg";

        /** Tailwind class: {@code rounded-md} */
        public static final String ROUNDED_MD = "rounded-md";

        /** Tailwind class: {@code rounded-none} */
        public static final String ROUNDED_NONE = "rounded-none";

        /** Tailwind class: {@code rounded-r-none} */
        public static final String ROUNDED_R_NONE = "rounded-r-none";

        /** Tailwind class: {@code rounded-se-none} */
        public static final String ROUNDED_SE_NONE = "rounded-se-none";

        /** Tailwind class: {@code rounded-sm} */
        public static final String ROUNDED_SM = "rounded-sm";

        /** Tailwind class: {@code rounded-ss-none} */
        public static final String ROUNDED_SS_NONE = "rounded-ss-none";

        /** Tailwind class: {@code rounded-t} */
        public static final String ROUNDED_T = "rounded-t";

        /** Tailwind class: {@code rounded-t-none} */
        public static final String ROUNDED_T_NONE = "rounded-t-none";

        /** Tailwind class: {@code rounded-t-sm} */
        public static final String ROUNDED_T_SM = "rounded-t-sm";

        /** Tailwind class: {@code rounded-tl-none} */
        public static final String ROUNDED_TL_NONE = "rounded-tl-none";

        /** Tailwind class: {@code rounded-tr-none} */
        public static final String ROUNDED_TR_NONE = "rounded-tr-none";

        /** Tailwind class: {@code rounded-xl} */
        public static final String ROUNDED_XL = "rounded-xl";

        /** Tailwind class: {@code border-slate-500} */
        public static final String SLATE_500 = "border-slate-500";

        /** Tailwind class: {@code border-slate-950} */
        public static final String SLATE_950 = "border-slate-950";

        /** Tailwind class: {@code border-solid} */
        public static final String SOLID = "border-solid";

        /** Tailwind class: {@code border-transparent} */
        public static final String TRANSPARENT = "border-transparent";

        /** Tailwind class: {@code border-white} */
        public static final String WHITE = "border-white";

        private Border() {}
    }

    // ========== FLEX ==========

    /**
     * Flex utilities
     */
    public static final class Flex {

        /** Tailwind class: {@code basis-0} */
        public static final String BASIS_0 = "basis-0";

        /** Tailwind class: {@code basis-1} */
        public static final String BASIS_1 = "basis-1";

        /** Tailwind class: {@code basis-auto} */
        public static final String BASIS_AUTO = "basis-auto";

        /** Tailwind class: {@code basis-full} */
        public static final String BASIS_FULL = "basis-full";

        /** Tailwind class: {@code flex-col} */
        public static final String COL = "flex-col";

        /** Tailwind class: {@code flex-col-reverse} */
        public static final String COL_REVERSE = "flex-col-reverse";

        /** Tailwind class: {@code flex-grow-0} */
        public static final String FLEX_GROW_0 = "flex-grow-0";

        /** Tailwind class: {@code flex-1} */
        public static final String FLEX_1 = "flex-1";

        /** Tailwind class: {@code basis-2} */
        public static final String BASIS_2 = "basis-2";

        /** Tailwind class: {@code basis-4} */
        public static final String BASIS_4 = "basis-4";

        /** Tailwind class: {@code basis-8} */
        public static final String BASIS_8 = "basis-8";

        /** Tailwind class: {@code flex-auto} */
        public static final String FLEX_AUTO = "flex-auto";

        /** Tailwind class: {@code flex-grow} */
        public static final String FLEX_GROW = "flex-grow";

        /** Tailwind class: {@code flex-initial} */
        public static final String FLEX_INITIAL = "flex-initial";

        /** Tailwind class: {@code flex-none} */
        public static final String FLEX_NONE = "flex-none";

        /** Tailwind class: {@code flex-shrink} */
        public static final String FLEX_SHRINK = "flex-shrink";

        /** Tailwind class: {@code flex-shrink-0} */
        public static final String FLEX_SHRINK_0 = "flex-shrink-0";

        /** Tailwind class: {@code flex-nowrap} */
        public static final String NOWRAP = "flex-nowrap";

        /** Tailwind class: {@code flex-row} */
        public static final String ROW = "flex-row";

        /** Tailwind class: {@code flex-row-reverse} */
        public static final String ROW_REVERSE = "flex-row-reverse";

        /** Tailwind class: {@code flex-wrap} */
        public static final String WRAP = "flex-wrap";

        /** Tailwind class: {@code flex-wrap-reverse} */
        public static final String WRAP_REVERSE = "flex-wrap-reverse";

        /**
         * AlignContent utilities
         */
        public static final class AlignContent {

            /** Tailwind class: {@code content-around} */
            public static final String AROUND = "content-around";

            /** Tailwind class: {@code content-baseline} */
            public static final String BASELINE = "content-baseline";

            /** Tailwind class: {@code content-between} */
            public static final String BETWEEN = "content-between";

            /** Tailwind class: {@code content-center} */
            public static final String CENTER = "content-center";

            /** Tailwind class: {@code content-end} */
            public static final String END = "content-end";

            /** Tailwind class: {@code content-evenly} */
            public static final String EVENLY = "content-evenly";

            /** Tailwind class: {@code content-none} */
            public static final String NONE = "content-none";

            /** Tailwind class: {@code content-start} */
            public static final String START = "content-start";

            /** Tailwind class: {@code content-stretch} */
            public static final String STRETCH = "content-stretch";

            private AlignContent() {}
        }

        /**
         * AlignItems utilities
         */
        public static final class AlignItems {

            /** Tailwind class: {@code items-baseline} */
            public static final String BASELINE = "items-baseline";

            /** Tailwind class: {@code items-center} */
            public static final String CENTER = "items-center";

            /** Tailwind class: {@code items-end} */
            public static final String END = "items-end";

            /** Tailwind class: {@code items-start} */
            public static final String START = "items-start";

            /** Tailwind class: {@code items-stretch} */
            public static final String STRETCH = "items-stretch";

            private AlignItems() {}
        }

        /**
         * AlignSelf utilities
         */
        public static final class AlignSelf {

            /** Tailwind class: {@code self-auto} */
            public static final String AUTO = "self-auto";

            /** Tailwind class: {@code self-baseline} */
            public static final String BASELINE = "self-baseline";

            /** Tailwind class: {@code self-center} */
            public static final String CENTER = "self-center";

            /** Tailwind class: {@code self-end} */
            public static final String END = "self-end";

            /** Tailwind class: {@code self-start} */
            public static final String START = "self-start";

            /** Tailwind class: {@code self-stretch} */
            public static final String STRETCH = "self-stretch";

            private AlignSelf() {}
        }

        /**
         * JustifyContent utilities
         */
        public static final class JustifyContent {

            /** Tailwind class: {@code justify-around} */
            public static final String AROUND = "justify-around";

            /** Tailwind class: {@code justify-between} */
            public static final String BETWEEN = "justify-between";

            /** Tailwind class: {@code justify-center} */
            public static final String CENTER = "justify-center";

            /** Tailwind class: {@code justify-end} */
            public static final String END = "justify-end";

            /** Tailwind class: {@code justify-evenly} */
            public static final String EVENLY = "justify-evenly";

            /** Tailwind class: {@code justify-start} */
            public static final String START = "justify-start";

            /** Tailwind class: {@code justify-stretch} */
            public static final String STRETCH = "justify-stretch";

            private JustifyContent() {}
        }

        private Flex() {}
    }

    // ========== GRID ==========

    /**
     * Grid utilities
     */
    public static final class Grid {

        /** Tailwind class: {@code auto-cols-auto} */
        public static final String AUTO_COLS_AUTO = "auto-cols-auto";

        /** Tailwind class: {@code auto-cols-fr} */
        public static final String AUTO_COLS_FR = "auto-cols-fr";

        /** Tailwind class: {@code auto-cols-max} */
        public static final String AUTO_COLS_MAX = "auto-cols-max";

        /** Tailwind class: {@code auto-cols-min} */
        public static final String AUTO_COLS_MIN = "auto-cols-min";

        /** Tailwind class: {@code auto-rows-auto} */
        public static final String AUTO_ROWS_AUTO = "auto-rows-auto";

        /** Tailwind class: {@code auto-rows-fr} */
        public static final String AUTO_ROWS_FR = "auto-rows-fr";

        /** Tailwind class: {@code auto-rows-max} */
        public static final String AUTO_ROWS_MAX = "auto-rows-max";

        /** Tailwind class: {@code auto-rows-min} */
        public static final String AUTO_ROWS_MIN = "auto-rows-min";

        /** Tailwind class: {@code col-auto} */
        public static final String COL_AUTO = "col-auto";

        /** Tailwind class: {@code col-end-1} */
        public static final String COL_END_1 = "col-end-1";

        /** Tailwind class: {@code col-end-auto} */
        public static final String COL_END_AUTO = "col-end-auto";

        /** Tailwind class: {@code col-span-1} */
        public static final String COL_SPAN_1 = "col-span-1";

        /** Tailwind class: {@code col-start-1} */
        public static final String COL_START_1 = "col-start-1";

        /** Tailwind class: {@code grid-cols-1} */
        public static final String COLS_1 = "grid-cols-1";

        /** Tailwind class: {@code row-end-1} */
        public static final String ROW_END_1 = "row-end-1";

        /** Tailwind class: {@code row-span-1} */
        public static final String ROW_SPAN_1 = "row-span-1";

        /** Tailwind class: {@code row-start-1} */
        public static final String ROW_START_1 = "row-start-1";

        /** Tailwind class: {@code grid-rows-1} */
        public static final String ROWS_1 = "grid-rows-1";

        /** Tailwind class: {@code col-span-2} */
        public static final String COL_SPAN_2 = "col-span-2";

        /** Tailwind class: {@code col-start-2} */
        public static final String COL_START_2 = "col-start-2";

        /** Tailwind class: {@code grid-cols-2} */
        public static final String COLS_2 = "grid-cols-2";

        /** Tailwind class: {@code row-span-2} */
        public static final String ROW_SPAN_2 = "row-span-2";

        /** Tailwind class: {@code grid-rows-2} */
        public static final String ROWS_2 = "grid-rows-2";

        /** Tailwind class: {@code col-span-3} */
        public static final String COL_SPAN_3 = "col-span-3";

        /** Tailwind class: {@code grid-cols-3} */
        public static final String COLS_3 = "grid-cols-3";

        /** Tailwind class: {@code row-span-3} */
        public static final String ROW_SPAN_3 = "row-span-3";

        /** Tailwind class: {@code grid-rows-3} */
        public static final String ROWS_3 = "grid-rows-3";

        /** Tailwind class: {@code col-span-4} */
        public static final String COL_SPAN_4 = "col-span-4";

        /** Tailwind class: {@code grid-cols-4} */
        public static final String COLS_4 = "grid-cols-4";

        /** Tailwind class: {@code grid-rows-4} */
        public static final String ROWS_4 = "grid-rows-4";

        /** Tailwind class: {@code col-span-5} */
        public static final String COL_SPAN_5 = "col-span-5";

        /** Tailwind class: {@code grid-cols-5} */
        public static final String COLS_5 = "grid-cols-5";

        /** Tailwind class: {@code grid-rows-5} */
        public static final String ROWS_5 = "grid-rows-5";

        /** Tailwind class: {@code col-span-6} */
        public static final String COL_SPAN_6 = "col-span-6";

        /** Tailwind class: {@code grid-cols-6} */
        public static final String COLS_6 = "grid-cols-6";

        /** Tailwind class: {@code grid-rows-6} */
        public static final String ROWS_6 = "grid-rows-6";

        /** Tailwind class: {@code col-span-7} */
        public static final String COL_SPAN_7 = "col-span-7";

        /** Tailwind class: {@code grid-cols-7} */
        public static final String COLS_7 = "grid-cols-7";

        /** Tailwind class: {@code grid-rows-7} */
        public static final String ROWS_7 = "grid-rows-7";

        /** Tailwind class: {@code col-span-8} */
        public static final String COL_SPAN_8 = "col-span-8";

        /** Tailwind class: {@code grid-cols-8} */
        public static final String COLS_8 = "grid-cols-8";

        /** Tailwind class: {@code grid-rows-8} */
        public static final String ROWS_8 = "grid-rows-8";

        /** Tailwind class: {@code col-span-9} */
        public static final String COL_SPAN_9 = "col-span-9";

        /** Tailwind class: {@code grid-cols-9} */
        public static final String COLS_9 = "grid-cols-9";

        /** Tailwind class: {@code grid-rows-9} */
        public static final String ROWS_9 = "grid-rows-9";

        /** Tailwind class: {@code col-span-10} */
        public static final String COL_SPAN_10 = "col-span-10";

        /** Tailwind class: {@code col-span-12} */
        public static final String COL_SPAN_12 = "col-span-12";

        /** Tailwind class: {@code col-span-full} */
        public static final String COL_SPAN_FULL = "col-span-full";

        /** Tailwind class: {@code col-start-auto} */
        public static final String COL_START_AUTO = "col-start-auto";

        /** Tailwind class: {@code grid-cols-10} */
        public static final String COLS_10 = "grid-cols-10";

        /** Tailwind class: {@code grid-rows-10} */
        public static final String ROWS_10 = "grid-rows-10";

        /** Tailwind class: {@code col-span-11} */
        public static final String COL_SPAN_11 = "col-span-11";

        /** Tailwind class: {@code grid-cols-11} */
        public static final String COLS_11 = "grid-cols-11";

        /** Tailwind class: {@code grid-cols-12} */
        public static final String COLS_12 = "grid-cols-12";

        /** Tailwind class: {@code grid-cols-none} */
        public static final String COLS_NONE = "grid-cols-none";

        /** Tailwind class: {@code grid-cols-subgrid} */
        public static final String COLS_SUBGRID = "grid-cols-subgrid";

        /** Tailwind class: {@code grid-flow-col} */
        public static final String FLOW_COL = "grid-flow-col";

        /** Tailwind class: {@code grid-flow-col-dense} */
        public static final String FLOW_COL_DENSE = "grid-flow-col-dense";

        /** Tailwind class: {@code grid-flow-dense} */
        public static final String FLOW_DENSE = "grid-flow-dense";

        /** Tailwind class: {@code grid-flow-row} */
        public static final String FLOW_ROW = "grid-flow-row";

        /** Tailwind class: {@code grid-flow-row-dense} */
        public static final String FLOW_ROW_DENSE = "grid-flow-row-dense";

        /** Tailwind class: {@code row-auto} */
        public static final String ROW_AUTO = "row-auto";

        /** Tailwind class: {@code row-span-full} */
        public static final String ROW_SPAN_FULL = "row-span-full";

        /** Tailwind class: {@code grid-rows-11} */
        public static final String ROWS_11 = "grid-rows-11";

        /** Tailwind class: {@code grid-rows-12} */
        public static final String ROWS_12 = "grid-rows-12";

        /** Tailwind class: {@code grid-rows-none} */
        public static final String ROWS_NONE = "grid-rows-none";

        /** Tailwind class: {@code grid-rows-subgrid} */
        public static final String ROWS_SUBGRID = "grid-rows-subgrid";

        private Grid() {}
    }

    // ========== TYPOGRAPHY ==========

    /**
     * Typography utilities
     */
    public static final class Typography {

        /**
         * FontFamily utilities
         */
        public static final class FontFamily {

            /** Tailwind class: {@code font-mono} */
            public static final String MONO = "font-mono";

            /** Tailwind class: {@code font-sans} */
            public static final String SANS = "font-sans";

            /** Tailwind class: {@code font-serif} */
            public static final String SERIF = "font-serif";

            private FontFamily() {}
        }

        /**
         * FontSize utilities
         */
        public static final class FontSize {

            /** Tailwind class: {@code text-base} */
            public static final String BASE = "text-base";

            /** Tailwind class: {@code text-lg} */
            public static final String LG = "text-lg";

            /** Tailwind class: {@code text-sm} */
            public static final String SM = "text-sm";

            /** Tailwind class: {@code text-xl} */
            public static final String XL = "text-xl";

            /** Tailwind class: {@code text-xs} */
            public static final String XS = "text-xs";

            /** Tailwind class: {@code text-2xl} */
            public static final String XXLARGE = "text-2xl";

            /** Tailwind class: {@code text-3xl} */
            public static final String XXXLARGE = "text-3xl";

            /** Tailwind class: {@code text-4xl} */
            public static final String XXXXLARGE = "text-4xl";

            /** Tailwind class: {@code text-5xl} */
            public static final String XXXXXLARGE = "text-5xl";

            /** Tailwind class: {@code text-6xl} */
            public static final String XXXXXXLARGE = "text-6xl";

            /** Tailwind class: {@code text-7xl} */
            public static final String XXXXXXXLARGE = "text-7xl";

            /** Tailwind class: {@code text-8xl} */
            public static final String XXXXXXXXLARGE = "text-8xl";

            /** Tailwind class: {@code text-9xl} */
            public static final String XXXXXXXXXLARGE = "text-9xl";

            private FontSize() {}
        }

        /**
         * FontStyle utilities
         */
        public static final class FontStyle {

            /** Tailwind class: {@code italic} */
            public static final String ITALIC = "italic";

            /** Tailwind class: {@code not-italic} */
            public static final String NOT_ITALIC = "not-italic";

            private FontStyle() {}
        }

        /**
         * FontWeight utilities
         */
        public static final class FontWeight {

            /** Tailwind class: {@code font-black} */
            public static final String BLACK = "font-black";

            /** Tailwind class: {@code font-bold} */
            public static final String BOLD = "font-bold";

            /** Tailwind class: {@code font-extrabold} */
            public static final String EXTRABOLD = "font-extrabold";

            /** Tailwind class: {@code font-extralight} */
            public static final String EXTRALIGHT = "font-extralight";

            /** Tailwind class: {@code font-light} */
            public static final String LIGHT = "font-light";

            /** Tailwind class: {@code font-medium} */
            public static final String MEDIUM = "font-medium";

            /** Tailwind class: {@code font-normal} */
            public static final String NORMAL = "font-normal";

            /** Tailwind class: {@code font-semibold} */
            public static final String SEMIBOLD = "font-semibold";

            /** Tailwind class: {@code font-thin} */
            public static final String THIN = "font-thin";

            private FontWeight() {}
        }

        /**
         * TextAlign utilities
         */
        public static final class TextAlign {

            /** Tailwind class: {@code text-center} */
            public static final String CENTER = "text-center";

            /** Tailwind class: {@code text-end} */
            public static final String END = "text-end";

            /** Tailwind class: {@code text-justify} */
            public static final String JUSTIFY = "text-justify";

            /** Tailwind class: {@code text-left} */
            public static final String LEFT = "text-left";

            /** Tailwind class: {@code text-right} */
            public static final String RIGHT = "text-right";

            /** Tailwind class: {@code text-start} */
            public static final String START = "text-start";

            private TextAlign() {}
        }

        /**
         * TextDecoration utilities
         */
        public static final class TextDecoration {

            /** Tailwind class: {@code decoration-0} */
            public static final String DECORATION_0 = "decoration-0";

            /** Tailwind class: {@code decoration-1} */
            public static final String DECORATION_1 = "decoration-1";

            /** Tailwind class: {@code decoration-2} */
            public static final String DECORATION_2 = "decoration-2";

            /** Tailwind class: {@code decoration-4} */
            public static final String DECORATION_4 = "decoration-4";

            /** Tailwind class: {@code decoration-8} */
            public static final String DECORATION_8 = "decoration-8";

            /** Tailwind class: {@code decoration-auto} */
            public static final String DECORATION_AUTO = "decoration-auto";

            /** Tailwind class: {@code decoration-blue-500} */
            public static final String DECORATION_BLUE_500 = "decoration-blue-500";

            /** Tailwind class: {@code decoration-dashed} */
            public static final String DECORATION_DASHED = "decoration-dashed";

            /** Tailwind class: {@code decoration-dotted} */
            public static final String DECORATION_DOTTED = "decoration-dotted";

            /** Tailwind class: {@code decoration-double} */
            public static final String DECORATION_DOUBLE = "decoration-double";

            /** Tailwind class: {@code decoration-from-font} */
            public static final String DECORATION_FROM_FONT = "decoration-from-font";

            /** Tailwind class: {@code decoration-gray-500} */
            public static final String DECORATION_GRAY_500 = "decoration-gray-500";

            /** Tailwind class: {@code decoration-red-500} */
            public static final String DECORATION_RED_500 = "decoration-red-500";

            /** Tailwind class: {@code decoration-slate-500} */
            public static final String DECORATION_SLATE_500 = "decoration-slate-500";

            /** Tailwind class: {@code decoration-solid} */
            public static final String DECORATION_SOLID = "decoration-solid";

            /** Tailwind class: {@code decoration-wavy} */
            public static final String DECORATION_WAVY = "decoration-wavy";

            /** Tailwind class: {@code line-through} */
            public static final String LINE_THROUGH = "line-through";

            /** Tailwind class: {@code no-underline} */
            public static final String NO_UNDERLINE = "no-underline";

            /** Tailwind class: {@code overline} */
            public static final String OVERLINE = "overline";

            /** Tailwind class: {@code underline} */
            public static final String UNDERLINE = "underline";

            private TextDecoration() {}
        }

        /**
         * TextTransform utilities
         */
        public static final class TextTransform {

            /** Tailwind class: {@code capitalize} */
            public static final String CAPITALIZE = "capitalize";

            /** Tailwind class: {@code lowercase} */
            public static final String LOWERCASE = "lowercase";

            /** Tailwind class: {@code normal-case} */
            public static final String NORMAL_CASE = "normal-case";

            /** Tailwind class: {@code uppercase} */
            public static final String UPPERCASE = "uppercase";

            private TextTransform() {}
        }

        private Typography() {}
    }

    // ========== EFFECTS ==========

    /**
     * Effects utilities
     */
    public static final class Effects {

        /**
         * Opacity utilities
         */
        public static final class Opacity {

            /** Tailwind class: {@code opacity-0} */
            public static final String OPACITY_0 = "opacity-0";

            /** Tailwind class: {@code opacity-5} */
            public static final String OPACITY_5 = "opacity-5";

            /** Tailwind class: {@code opacity-10} */
            public static final String OPACITY_10 = "opacity-10";

            /** Tailwind class: {@code opacity-15} */
            public static final String OPACITY_15 = "opacity-15";

            /** Tailwind class: {@code opacity-20} */
            public static final String OPACITY_20 = "opacity-20";

            /** Tailwind class: {@code opacity-25} */
            public static final String OPACITY_25 = "opacity-25";

            /** Tailwind class: {@code opacity-30} */
            public static final String OPACITY_30 = "opacity-30";

            /** Tailwind class: {@code opacity-40} */
            public static final String OPACITY_40 = "opacity-40";

            /** Tailwind class: {@code opacity-50} */
            public static final String OPACITY_50 = "opacity-50";

            /** Tailwind class: {@code opacity-60} */
            public static final String OPACITY_60 = "opacity-60";

            /** Tailwind class: {@code opacity-70} */
            public static final String OPACITY_70 = "opacity-70";

            /** Tailwind class: {@code opacity-75} */
            public static final String OPACITY_75 = "opacity-75";

            /** Tailwind class: {@code opacity-80} */
            public static final String OPACITY_80 = "opacity-80";

            /** Tailwind class: {@code opacity-90} */
            public static final String OPACITY_90 = "opacity-90";

            /** Tailwind class: {@code opacity-95} */
            public static final String OPACITY_95 = "opacity-95";

            /** Tailwind class: {@code opacity-100} */
            public static final String OPACITY_100 = "opacity-100";

            private Opacity() {}
        }

        /**
         * Shadow utilities
         */
        public static final class Shadow {

            /** Tailwind class: {@code shadow} */
            public static final String DEFAULT = "shadow";

            /** Tailwind class: {@code shadow-2xl} */
            public static final String N2XL = "shadow-2xl";

            /** Tailwind class: {@code shadow-blue-500} */
            public static final String BLUE_500 = "shadow-blue-500";

            /** Tailwind class: {@code shadow-gray-500} */
            public static final String GRAY_500 = "shadow-gray-500";

            /** Tailwind class: {@code shadow-inner} */
            public static final String INNER = "shadow-inner";

            /** Tailwind class: {@code shadow-lg} */
            public static final String LG = "shadow-lg";

            /** Tailwind class: {@code shadow-md} */
            public static final String MD = "shadow-md";

            /** Tailwind class: {@code shadow-none} */
            public static final String NONE = "shadow-none";

            /** Tailwind class: {@code shadow-red-500} */
            public static final String RED_500 = "shadow-red-500";

            /** Tailwind class: {@code shadow-slate-500} */
            public static final String SLATE_500 = "shadow-slate-500";

            /** Tailwind class: {@code shadow-sm} */
            public static final String SM = "shadow-sm";

            /** Tailwind class: {@code shadow-xl} */
            public static final String XL = "shadow-xl";

            private Shadow() {}
        }

        private Effects() {}
    }

    // ========== POSITION ==========

    /**
     * Position utilities
     */
    public static final class Position {

        /** Tailwind class: {@code absolute} */
        public static final String ABSOLUTE = "absolute";

        /** Tailwind class: {@code z-auto} */
        public static final String AUTO = "z-auto";

        /** Tailwind class: {@code bottom-0} */
        public static final String BOTTOM_0 = "bottom-0";

        /** Tailwind class: {@code fixed} */
        public static final String FIXED = "fixed";

        /** Tailwind class: {@code inset-0} */
        public static final String INSET_0 = "inset-0";

        /** Tailwind class: {@code inset-0.5} */
        public static final String INSET_0_5 = "inset-0.5";

        /** Tailwind class: {@code inset-x-0} */
        public static final String INSET_X_0 = "inset-x-0";

        /** Tailwind class: {@code inset-y-0} */
        public static final String INSET_Y_0 = "inset-y-0";

        /** Tailwind class: {@code left-0} */
        public static final String LEFT_0 = "left-0";

        /** Tailwind class: {@code right-0} */
        public static final String RIGHT_0 = "right-0";

        /** Tailwind class: {@code top-0} */
        public static final String TOP_0 = "top-0";

        /** Tailwind class: {@code top-0.5} */
        public static final String TOP_0_5 = "top-0.5";

        /** Tailwind class: {@code z-0} */
        public static final String Z_0 = "z-0";

        /** Tailwind class: {@code inset-1} */
        public static final String INSET_1 = "inset-1";

        /** Tailwind class: {@code inset-1.5} */
        public static final String INSET_1_5 = "inset-1.5";

        /** Tailwind class: {@code top-1} */
        public static final String TOP_1 = "top-1";

        /** Tailwind class: {@code inset-2} */
        public static final String INSET_2 = "inset-2";

        /** Tailwind class: {@code inset-2.5} */
        public static final String INSET_2_5 = "inset-2.5";

        /** Tailwind class: {@code top-2} */
        public static final String TOP_2 = "top-2";

        /** Tailwind class: {@code inset-3} */
        public static final String INSET_3 = "inset-3";

        /** Tailwind class: {@code inset-3.5} */
        public static final String INSET_3_5 = "inset-3.5";

        /** Tailwind class: {@code inset-4} */
        public static final String INSET_4 = "inset-4";

        /** Tailwind class: {@code left-4} */
        public static final String LEFT_4 = "left-4";

        /** Tailwind class: {@code top-4} */
        public static final String TOP_4 = "top-4";

        /** Tailwind class: {@code inset-5} */
        public static final String INSET_5 = "inset-5";

        /** Tailwind class: {@code inset-6} */
        public static final String INSET_6 = "inset-6";

        /** Tailwind class: {@code inset-7} */
        public static final String INSET_7 = "inset-7";

        /** Tailwind class: {@code inset-8} */
        public static final String INSET_8 = "inset-8";

        /** Tailwind class: {@code top-8} */
        public static final String TOP_8 = "top-8";

        /** Tailwind class: {@code inset-9} */
        public static final String INSET_9 = "inset-9";

        /** Tailwind class: {@code inset-10} */
        public static final String INSET_10 = "inset-10";

        /** Tailwind class: {@code z-10} */
        public static final String Z_10 = "z-10";

        /** Tailwind class: {@code inset-11} */
        public static final String INSET_11 = "inset-11";

        /** Tailwind class: {@code inset-12} */
        public static final String INSET_12 = "inset-12";

        /** Tailwind class: {@code inset-14} */
        public static final String INSET_14 = "inset-14";

        /** Tailwind class: {@code inset-16} */
        public static final String INSET_16 = "inset-16";

        /** Tailwind class: {@code top-16} */
        public static final String TOP_16 = "top-16";

        /** Tailwind class: {@code inset-20} */
        public static final String INSET_20 = "inset-20";

        /** Tailwind class: {@code z-20} */
        public static final String Z_20 = "z-20";

        /** Tailwind class: {@code inset-24} */
        public static final String INSET_24 = "inset-24";

        /** Tailwind class: {@code inset-28} */
        public static final String INSET_28 = "inset-28";

        /** Tailwind class: {@code z-30} */
        public static final String Z_30 = "z-30";

        /** Tailwind class: {@code inset-32} */
        public static final String INSET_32 = "inset-32";

        /** Tailwind class: {@code inset-36} */
        public static final String INSET_36 = "inset-36";

        /** Tailwind class: {@code inset-40} */
        public static final String INSET_40 = "inset-40";

        /** Tailwind class: {@code z-40} */
        public static final String Z_40 = "z-40";

        /** Tailwind class: {@code inset-44} */
        public static final String INSET_44 = "inset-44";

        /** Tailwind class: {@code inset-48} */
        public static final String INSET_48 = "inset-48";

        /** Tailwind class: {@code z-50} */
        public static final String Z_50 = "z-50";

        /** Tailwind class: {@code inset-52} */
        public static final String INSET_52 = "inset-52";

        /** Tailwind class: {@code inset-56} */
        public static final String INSET_56 = "inset-56";

        /** Tailwind class: {@code inset-60} */
        public static final String INSET_60 = "inset-60";

        /** Tailwind class: {@code inset-64} */
        public static final String INSET_64 = "inset-64";

        /** Tailwind class: {@code inset-72} */
        public static final String INSET_72 = "inset-72";

        /** Tailwind class: {@code inset-80} */
        public static final String INSET_80 = "inset-80";

        /** Tailwind class: {@code inset-96} */
        public static final String INSET_96 = "inset-96";

        /** Tailwind class: {@code inset-px} */
        public static final String INSET_PX = "inset-px";

        /** Tailwind class: {@code relative} */
        public static final String RELATIVE = "relative";

        /** Tailwind class: {@code static} */
        public static final String STATIC = "static";

        /** Tailwind class: {@code sticky} */
        public static final String STICKY = "sticky";

        /** Tailwind class: {@code top-auto} */
        public static final String TOP_AUTO = "top-auto";

        /** Tailwind class: {@code top-px} */
        public static final String TOP_PX = "top-px";

        private Position() {}
    }

    // ========== OVERFLOW ==========

    /**
     * Overflow utilities
     */
    public static final class Overflow {

        /** Tailwind class: {@code overflow-auto} */
        public static final String OVERFLOW_AUTO = "overflow-auto";

        /** Tailwind class: {@code overflow-clip} */
        public static final String OVERFLOW_CLIP = "overflow-clip";

        /** Tailwind class: {@code overflow-hidden} */
        public static final String OVERFLOW_HIDDEN = "overflow-hidden";

        /** Tailwind class: {@code overflow-scroll} */
        public static final String OVERFLOW_SCROLL = "overflow-scroll";

        /** Tailwind class: {@code overflow-visible} */
        public static final String OVERFLOW_VISIBLE = "overflow-visible";

        /** Tailwind class: {@code overflow-x-auto} */
        public static final String OVERFLOW_X_AUTO = "overflow-x-auto";

        /** Tailwind class: {@code overflow-x-clip} */
        public static final String OVERFLOW_X_CLIP = "overflow-x-clip";

        /** Tailwind class: {@code overflow-x-hidden} */
        public static final String OVERFLOW_X_HIDDEN = "overflow-x-hidden";

        /** Tailwind class: {@code overflow-x-scroll} */
        public static final String OVERFLOW_X_SCROLL = "overflow-x-scroll";

        /** Tailwind class: {@code overflow-x-visible} */
        public static final String OVERFLOW_X_VISIBLE = "overflow-x-visible";

        /** Tailwind class: {@code overflow-y-auto} */
        public static final String OVERFLOW_Y_AUTO = "overflow-y-auto";

        /** Tailwind class: {@code overflow-y-clip} */
        public static final String OVERFLOW_Y_CLIP = "overflow-y-clip";

        /** Tailwind class: {@code overflow-y-hidden} */
        public static final String OVERFLOW_Y_HIDDEN = "overflow-y-hidden";

        /** Tailwind class: {@code overflow-y-scroll} */
        public static final String OVERFLOW_Y_SCROLL = "overflow-y-scroll";

        /** Tailwind class: {@code overflow-y-visible} */
        public static final String OVERFLOW_Y_VISIBLE = "overflow-y-visible";

        private Overflow() {}
    }

    // ========== TRANSITIONS ==========

    /**
     * Transitions utilities
     */
    public static final class Transitions {

        /** Tailwind class: {@code animate-bounce} */
        public static final String ANIMATE_BOUNCE = "animate-bounce";

        /** Tailwind class: {@code animate-none} */
        public static final String ANIMATE_NONE = "animate-none";

        /** Tailwind class: {@code animate-ping} */
        public static final String ANIMATE_PING = "animate-ping";

        /** Tailwind class: {@code animate-pulse} */
        public static final String ANIMATE_PULSE = "animate-pulse";

        /** Tailwind class: {@code animate-spin} */
        public static final String ANIMATE_SPIN = "animate-spin";

        /** Tailwind class: {@code delay-0} */
        public static final String DELAY_0 = "delay-0";

        /** Tailwind class: {@code duration-0} */
        public static final String DURATION_0 = "duration-0";

        /** Tailwind class: {@code delay-75} */
        public static final String DELAY_75 = "delay-75";

        /** Tailwind class: {@code duration-75} */
        public static final String DURATION_75 = "duration-75";

        /** Tailwind class: {@code delay-100} */
        public static final String DELAY_100 = "delay-100";

        /** Tailwind class: {@code duration-100} */
        public static final String DURATION_100 = "duration-100";

        /** Tailwind class: {@code delay-150} */
        public static final String DELAY_150 = "delay-150";

        /** Tailwind class: {@code duration-150} */
        public static final String DURATION_150 = "duration-150";

        /** Tailwind class: {@code delay-200} */
        public static final String DELAY_200 = "delay-200";

        /** Tailwind class: {@code duration-200} */
        public static final String DURATION_200 = "duration-200";

        /** Tailwind class: {@code delay-300} */
        public static final String DELAY_300 = "delay-300";

        /** Tailwind class: {@code duration-300} */
        public static final String DURATION_300 = "duration-300";

        /** Tailwind class: {@code delay-500} */
        public static final String DELAY_500 = "delay-500";

        /** Tailwind class: {@code duration-500} */
        public static final String DURATION_500 = "duration-500";

        /** Tailwind class: {@code delay-700} */
        public static final String DELAY_700 = "delay-700";

        /** Tailwind class: {@code duration-700} */
        public static final String DURATION_700 = "duration-700";

        /** Tailwind class: {@code delay-1000} */
        public static final String DELAY_1000 = "delay-1000";

        /** Tailwind class: {@code duration-1000} */
        public static final String DURATION_1000 = "duration-1000";

        /** Tailwind class: {@code ease-in} */
        public static final String EASE_IN = "ease-in";

        /** Tailwind class: {@code ease-in-out} */
        public static final String EASE_IN_OUT = "ease-in-out";

        /** Tailwind class: {@code ease-linear} */
        public static final String EASE_LINEAR = "ease-linear";

        /** Tailwind class: {@code ease-out} */
        public static final String EASE_OUT = "ease-out";

        /** Tailwind class: {@code transition} */
        public static final String TRANSITION = "transition";

        /** Tailwind class: {@code transition-all} */
        public static final String TRANSITION_ALL = "transition-all";

        /** Tailwind class: {@code transition-colors} */
        public static final String TRANSITION_COLORS = "transition-colors";

        /** Tailwind class: {@code transition-none} */
        public static final String TRANSITION_NONE = "transition-none";

        /** Tailwind class: {@code transition-opacity} */
        public static final String TRANSITION_OPACITY = "transition-opacity";

        /** Tailwind class: {@code transition-shadow} */
        public static final String TRANSITION_SHADOW = "transition-shadow";

        /** Tailwind class: {@code transition-transform} */
        public static final String TRANSITION_TRANSFORM = "transition-transform";

        private Transitions() {}
    }

    // ========== TRANSFORMS ==========

    /**
     * Transforms utilities
     */
    public static final class Transforms {

        /** Tailwind class: {@code rotate-0} */
        public static final String ROTATE_0 = "rotate-0";

        /** Tailwind class: {@code scale-0} */
        public static final String SCALE_0 = "scale-0";

        /** Tailwind class: {@code scale-x-0} */
        public static final String SCALE_X_0 = "scale-x-0";

        /** Tailwind class: {@code scale-y-0} */
        public static final String SCALE_Y_0 = "scale-y-0";

        /** Tailwind class: {@code skew-x-0} */
        public static final String SKEW_X_0 = "skew-x-0";

        /** Tailwind class: {@code skew-y-0} */
        public static final String SKEW_Y_0 = "skew-y-0";

        /** Tailwind class: {@code translate-x-0} */
        public static final String TRANSLATE_X_0 = "translate-x-0";

        /** Tailwind class: {@code translate-y-0} */
        public static final String TRANSLATE_Y_0 = "translate-y-0";

        /** Tailwind class: {@code -rotate-1} */
        public static final String NEG_ROTATE_1 = "-rotate-1";

        /** Tailwind class: {@code -translate-x-1} */
        public static final String NEG_TRANSLATE_X_1 = "-translate-x-1";

        /** Tailwind class: {@code -translate-y-1} */
        public static final String NEG_TRANSLATE_Y_1 = "-translate-y-1";

        /** Tailwind class: {@code rotate-1} */
        public static final String ROTATE_1 = "rotate-1";

        /** Tailwind class: {@code skew-x-1} */
        public static final String SKEW_X_1 = "skew-x-1";

        /** Tailwind class: {@code skew-y-1} */
        public static final String SKEW_Y_1 = "skew-y-1";

        /** Tailwind class: {@code translate-x-1} */
        public static final String TRANSLATE_X_1 = "translate-x-1";

        /** Tailwind class: {@code translate-y-1} */
        public static final String TRANSLATE_Y_1 = "translate-y-1";

        /** Tailwind class: {@code rotate-2} */
        public static final String ROTATE_2 = "rotate-2";

        /** Tailwind class: {@code skew-x-2} */
        public static final String SKEW_X_2 = "skew-x-2";

        /** Tailwind class: {@code translate-x-2} */
        public static final String TRANSLATE_X_2 = "translate-x-2";

        /** Tailwind class: {@code translate-y-2} */
        public static final String TRANSLATE_Y_2 = "translate-y-2";

        /** Tailwind class: {@code rotate-3} */
        public static final String ROTATE_3 = "rotate-3";

        /** Tailwind class: {@code skew-x-3} */
        public static final String SKEW_X_3 = "skew-x-3";

        /** Tailwind class: {@code rotate-6} */
        public static final String ROTATE_6 = "rotate-6";

        /** Tailwind class: {@code skew-x-6} */
        public static final String SKEW_X_6 = "skew-x-6";

        /** Tailwind class: {@code rotate-12} */
        public static final String ROTATE_12 = "rotate-12";

        /** Tailwind class: {@code skew-x-12} */
        public static final String SKEW_X_12 = "skew-x-12";

        /** Tailwind class: {@code -rotate-45} */
        public static final String NEG_ROTATE_45 = "-rotate-45";

        /** Tailwind class: {@code rotate-45} */
        public static final String ROTATE_45 = "rotate-45";

        /** Tailwind class: {@code scale-50} */
        public static final String SCALE_50 = "scale-50";

        /** Tailwind class: {@code scale-x-50} */
        public static final String SCALE_X_50 = "scale-x-50";

        /** Tailwind class: {@code scale-y-50} */
        public static final String SCALE_Y_50 = "scale-y-50";

        /** Tailwind class: {@code scale-75} */
        public static final String SCALE_75 = "scale-75";

        /** Tailwind class: {@code -rotate-90} */
        public static final String NEG_ROTATE_90 = "-rotate-90";

        /** Tailwind class: {@code rotate-90} */
        public static final String ROTATE_90 = "rotate-90";

        /** Tailwind class: {@code scale-90} */
        public static final String SCALE_90 = "scale-90";

        /** Tailwind class: {@code scale-95} */
        public static final String SCALE_95 = "scale-95";

        /** Tailwind class: {@code scale-100} */
        public static final String SCALE_100 = "scale-100";

        /** Tailwind class: {@code scale-x-100} */
        public static final String SCALE_X_100 = "scale-x-100";

        /** Tailwind class: {@code scale-y-100} */
        public static final String SCALE_Y_100 = "scale-y-100";

        /** Tailwind class: {@code scale-105} */
        public static final String SCALE_105 = "scale-105";

        /** Tailwind class: {@code scale-110} */
        public static final String SCALE_110 = "scale-110";

        /** Tailwind class: {@code scale-125} */
        public static final String SCALE_125 = "scale-125";

        /** Tailwind class: {@code scale-150} */
        public static final String SCALE_150 = "scale-150";

        /** Tailwind class: {@code -rotate-180} */
        public static final String NEG_ROTATE_180 = "-rotate-180";

        /** Tailwind class: {@code rotate-180} */
        public static final String ROTATE_180 = "rotate-180";

        private Transforms() {}
    }

    // ========== OTHER ==========

    /**
     * Other utilities
     */
    public static final class Other {

        /** Tailwind class: {@code accent-auto} */
        public static final String ACCENT_AUTO = "accent-auto";

        /** Tailwind class: {@code accent-black} */
        public static final String ACCENT_BLACK = "accent-black";

        /** Tailwind class: {@code accent-current} */
        public static final String ACCENT_CURRENT = "accent-current";

        /** Tailwind class: {@code accent-inherit} */
        public static final String ACCENT_INHERIT = "accent-inherit";

        /** Tailwind class: {@code accent-transparent} */
        public static final String ACCENT_TRANSPARENT = "accent-transparent";

        /** Tailwind class: {@code accent-white} */
        public static final String ACCENT_WHITE = "accent-white";

        /** Tailwind class: {@code align-baseline} */
        public static final String ALIGN_BASELINE = "align-baseline";

        /** Tailwind class: {@code align-bottom} */
        public static final String ALIGN_BOTTOM = "align-bottom";

        /** Tailwind class: {@code align-middle} */
        public static final String ALIGN_MIDDLE = "align-middle";

        /** Tailwind class: {@code align-sub} */
        public static final String ALIGN_SUB = "align-sub";

        /** Tailwind class: {@code align-super} */
        public static final String ALIGN_SUPER = "align-super";

        /** Tailwind class: {@code align-text-bottom} */
        public static final String ALIGN_TEXT_BOTTOM = "align-text-bottom";

        /** Tailwind class: {@code align-text-top} */
        public static final String ALIGN_TEXT_TOP = "align-text-top";

        /** Tailwind class: {@code align-top} */
        public static final String ALIGN_TOP = "align-top";

        /** Tailwind class: {@code appearance-auto} */
        public static final String APPEARANCE_AUTO = "appearance-auto";

        /** Tailwind class: {@code appearance-none} */
        public static final String APPEARANCE_NONE = "appearance-none";

        /** Tailwind class: {@code aspect-auto} */
        public static final String ASPECT_AUTO = "aspect-auto";

        /** Tailwind class: {@code aspect-square} */
        public static final String ASPECT_SQUARE = "aspect-square";

        /** Tailwind class: {@code aspect-video} */
        public static final String ASPECT_VIDEO = "aspect-video";

        /** Tailwind class: {@code backdrop-blur} */
        public static final String BACKDROP_BLUR = "backdrop-blur";

        /** Tailwind class: {@code backdrop-blur-none} */
        public static final String BACKDROP_BLUR_NONE = "backdrop-blur-none";

        /** Tailwind class: {@code backdrop-blur-sm} */
        public static final String BACKDROP_BLUR_SM = "backdrop-blur-sm";

        /** Tailwind class: {@code bg-auto} */
        public static final String BG_AUTO = "bg-auto";

        /** Tailwind class: {@code bg-blend-darken} */
        public static final String BG_BLEND_DARKEN = "bg-blend-darken";

        /** Tailwind class: {@code border-spacing-x-0} */
        public static final String BORDER_SPACING_X_0 = "border-spacing-x-0";

        /** Tailwind class: {@code border-spacing-y-0} */
        public static final String BORDER_SPACING_Y_0 = "border-spacing-y-0";

        /** Tailwind class: {@code box-border} */
        public static final String BOX_BORDER = "box-border";

        /** Tailwind class: {@code box-content} */
        public static final String BOX_CONTENT = "box-content";

        /** Tailwind class: {@code box-decoration-clone} */
        public static final String BOX_DECORATION_CLONE = "box-decoration-clone";

        /** Tailwind class: {@code box-decoration-slice} */
        public static final String BOX_DECORATION_SLICE = "box-decoration-slice";

        /** Tailwind class: {@code break-after-all} */
        public static final String BREAK_AFTER_ALL = "break-after-all";

        /** Tailwind class: {@code break-after-auto} */
        public static final String BREAK_AFTER_AUTO = "break-after-auto";

        /** Tailwind class: {@code break-after-avoid} */
        public static final String BREAK_AFTER_AVOID = "break-after-avoid";

        /** Tailwind class: {@code break-after-avoid-page} */
        public static final String BREAK_AFTER_AVOID_PAGE = "break-after-avoid-page";

        /** Tailwind class: {@code break-after-column} */
        public static final String BREAK_AFTER_COLUMN = "break-after-column";

        /** Tailwind class: {@code break-after-left} */
        public static final String BREAK_AFTER_LEFT = "break-after-left";

        /** Tailwind class: {@code break-after-page} */
        public static final String BREAK_AFTER_PAGE = "break-after-page";

        /** Tailwind class: {@code break-after-right} */
        public static final String BREAK_AFTER_RIGHT = "break-after-right";

        /** Tailwind class: {@code break-all} */
        public static final String BREAK_ALL = "break-all";

        /** Tailwind class: {@code break-before-all} */
        public static final String BREAK_BEFORE_ALL = "break-before-all";

        /** Tailwind class: {@code break-before-auto} */
        public static final String BREAK_BEFORE_AUTO = "break-before-auto";

        /** Tailwind class: {@code break-before-avoid} */
        public static final String BREAK_BEFORE_AVOID = "break-before-avoid";

        /** Tailwind class: {@code break-before-avoid-page} */
        public static final String BREAK_BEFORE_AVOID_PAGE = "break-before-avoid-page";

        /** Tailwind class: {@code break-before-column} */
        public static final String BREAK_BEFORE_COLUMN = "break-before-column";

        /** Tailwind class: {@code break-before-left} */
        public static final String BREAK_BEFORE_LEFT = "break-before-left";

        /** Tailwind class: {@code break-before-page} */
        public static final String BREAK_BEFORE_PAGE = "break-before-page";

        /** Tailwind class: {@code break-before-right} */
        public static final String BREAK_BEFORE_RIGHT = "break-before-right";

        /** Tailwind class: {@code break-inside-auto} */
        public static final String BREAK_INSIDE_AUTO = "break-inside-auto";

        /** Tailwind class: {@code break-inside-avoid} */
        public static final String BREAK_INSIDE_AVOID = "break-inside-avoid";

        /** Tailwind class: {@code break-inside-avoid-column} */
        public static final String BREAK_INSIDE_AVOID_COLUMN = "break-inside-avoid-column";

        /** Tailwind class: {@code break-inside-avoid-page} */
        public static final String BREAK_INSIDE_AVOID_PAGE = "break-inside-avoid-page";

        /** Tailwind class: {@code break-keep} */
        public static final String BREAK_KEEP = "break-keep";

        /** Tailwind class: {@code break-normal} */
        public static final String BREAK_NORMAL = "break-normal";

        /** Tailwind class: {@code break-words} */
        public static final String BREAK_WORDS = "break-words";

        /** Tailwind class: {@code brightness-0} */
        public static final String BRIGHTNESS_0 = "brightness-0";

        /** Tailwind class: {@code -inset-0} */
        public static final String NEG_INSET_0 = "-inset-0";

        /** Tailwind class: {@code -inset-1} */
        public static final String NEG_INSET_1 = "-inset-1";

        /** Tailwind class: {@code -left-1} */
        public static final String NEG_LEFT_1 = "-left-1";

        /** Tailwind class: {@code -right-1} */
        public static final String NEG_RIGHT_1 = "-right-1";

        /** Tailwind class: {@code -top-1} */
        public static final String NEG_TOP_1 = "-top-1";

        /** Tailwind class: {@code -inset-2} */
        public static final String NEG_INSET_2 = "-inset-2";

        /** Tailwind class: {@code columns-5xl} */
        public static final String COLUMNS_5XL = "columns-5xl";

        /** Tailwind class: {@code brightness-50} */
        public static final String BRIGHTNESS_50 = "brightness-50";

        /** Tailwind class: {@code brightness-75} */
        public static final String BRIGHTNESS_75 = "brightness-75";

        /** Tailwind class: {@code brightness-90} */
        public static final String BRIGHTNESS_90 = "brightness-90";

        /** Tailwind class: {@code brightness-95} */
        public static final String BRIGHTNESS_95 = "brightness-95";

        /** Tailwind class: {@code brightness-100} */
        public static final String BRIGHTNESS_100 = "brightness-100";

        /** Tailwind class: {@code brightness-105} */
        public static final String BRIGHTNESS_105 = "brightness-105";

        /** Tailwind class: {@code brightness-110} */
        public static final String BRIGHTNESS_110 = "brightness-110";

        /** Tailwind class: {@code brightness-125} */
        public static final String BRIGHTNESS_125 = "brightness-125";

        /** Tailwind class: {@code brightness-150} */
        public static final String BRIGHTNESS_150 = "brightness-150";

        /** Tailwind class: {@code accent-blue-500} */
        public static final String ACCENT_BLUE_500 = "accent-blue-500";

        /** Tailwind class: {@code accent-red-500} */
        public static final String ACCENT_RED_500 = "accent-red-500";

        /** Tailwind class: {@code accent-slate-500} */
        public static final String ACCENT_SLATE_500 = "accent-slate-500";

        /** Tailwind class: {@code bg-blend-lighten} */
        public static final String BG_BLEND_LIGHTEN = "bg-blend-lighten";

        /** Tailwind class: {@code bg-blend-multiply} */
        public static final String BG_BLEND_MULTIPLY = "bg-blend-multiply";

        /** Tailwind class: {@code bg-blend-normal} */
        public static final String BG_BLEND_NORMAL = "bg-blend-normal";

        /** Tailwind class: {@code bg-blend-overlay} */
        public static final String BG_BLEND_OVERLAY = "bg-blend-overlay";

        /** Tailwind class: {@code bg-blend-screen} */
        public static final String BG_BLEND_SCREEN = "bg-blend-screen";

        /** Tailwind class: {@code bg-bottom} */
        public static final String BG_BOTTOM = "bg-bottom";

        /** Tailwind class: {@code bg-center} */
        public static final String BG_CENTER = "bg-center";

        /** Tailwind class: {@code bg-clip-border} */
        public static final String BG_CLIP_BORDER = "bg-clip-border";

        /** Tailwind class: {@code bg-clip-content} */
        public static final String BG_CLIP_CONTENT = "bg-clip-content";

        /** Tailwind class: {@code bg-clip-padding} */
        public static final String BG_CLIP_PADDING = "bg-clip-padding";

        /** Tailwind class: {@code bg-clip-text} */
        public static final String BG_CLIP_TEXT = "bg-clip-text";

        /** Tailwind class: {@code bg-contain} */
        public static final String BG_CONTAIN = "bg-contain";

        /** Tailwind class: {@code bg-cover} */
        public static final String BG_COVER = "bg-cover";

        /** Tailwind class: {@code bg-fixed} */
        public static final String BG_FIXED = "bg-fixed";

        /** Tailwind class: {@code bg-left} */
        public static final String BG_LEFT = "bg-left";

        /** Tailwind class: {@code bg-left-bottom} */
        public static final String BG_LEFT_BOTTOM = "bg-left-bottom";

        /** Tailwind class: {@code bg-left-top} */
        public static final String BG_LEFT_TOP = "bg-left-top";

        /** Tailwind class: {@code bg-local} */
        public static final String BG_LOCAL = "bg-local";

        /** Tailwind class: {@code bg-no-repeat} */
        public static final String BG_NO_REPEAT = "bg-no-repeat";

        /** Tailwind class: {@code bg-origin-border} */
        public static final String BG_ORIGIN_BORDER = "bg-origin-border";

        /** Tailwind class: {@code bg-origin-content} */
        public static final String BG_ORIGIN_CONTENT = "bg-origin-content";

        /** Tailwind class: {@code bg-origin-padding} */
        public static final String BG_ORIGIN_PADDING = "bg-origin-padding";

        /** Tailwind class: {@code bg-repeat} */
        public static final String BG_REPEAT = "bg-repeat";

        /** Tailwind class: {@code bg-repeat-round} */
        public static final String BG_REPEAT_ROUND = "bg-repeat-round";

        /** Tailwind class: {@code bg-repeat-space} */
        public static final String BG_REPEAT_SPACE = "bg-repeat-space";

        /** Tailwind class: {@code bg-repeat-x} */
        public static final String BG_REPEAT_X = "bg-repeat-x";

        /** Tailwind class: {@code bg-repeat-y} */
        public static final String BG_REPEAT_Y = "bg-repeat-y";

        /** Tailwind class: {@code bg-right} */
        public static final String BG_RIGHT = "bg-right";

        /** Tailwind class: {@code bg-right-bottom} */
        public static final String BG_RIGHT_BOTTOM = "bg-right-bottom";

        /** Tailwind class: {@code bg-right-top} */
        public static final String BG_RIGHT_TOP = "bg-right-top";

        /** Tailwind class: {@code bg-scroll} */
        public static final String BG_SCROLL = "bg-scroll";

        /** Tailwind class: {@code bg-top} */
        public static final String BG_TOP = "bg-top";

        /** Tailwind class: {@code blur} */
        public static final String BLUR = "blur";

        /** Tailwind class: {@code blur-2xl} */
        public static final String BLUR_2XL = "blur-2xl";

        /** Tailwind class: {@code blur-3xl} */
        public static final String BLUR_3XL = "blur-3xl";

        /** Tailwind class: {@code blur-lg} */
        public static final String BLUR_LG = "blur-lg";

        /** Tailwind class: {@code blur-md} */
        public static final String BLUR_MD = "blur-md";

        /** Tailwind class: {@code blur-none} */
        public static final String BLUR_NONE = "blur-none";

        /** Tailwind class: {@code blur-sm} */
        public static final String BLUR_SM = "blur-sm";

        /** Tailwind class: {@code blur-xl} */
        public static final String BLUR_XL = "blur-xl";

        /** Tailwind class: {@code border-collapse} */
        public static final String BORDER_COLLAPSE = "border-collapse";

        /** Tailwind class: {@code border-separate} */
        public static final String BORDER_SEPARATE = "border-separate";

        /** Tailwind class: {@code border-spacing-0} */
        public static final String BORDER_SPACING_0 = "border-spacing-0";

        /** Tailwind class: {@code border-spacing-1} */
        public static final String BORDER_SPACING_1 = "border-spacing-1";

        /** Tailwind class: {@code border-spacing-2} */
        public static final String BORDER_SPACING_2 = "border-spacing-2";

        /** Tailwind class: {@code caption-bottom} */
        public static final String CAPTION_BOTTOM = "caption-bottom";

        /** Tailwind class: {@code caption-top} */
        public static final String CAPTION_TOP = "caption-top";

        /** Tailwind class: {@code caret-black} */
        public static final String CARET_BLACK = "caret-black";

        /** Tailwind class: {@code caret-blue-500} */
        public static final String CARET_BLUE_500 = "caret-blue-500";

        /** Tailwind class: {@code caret-current} */
        public static final String CARET_CURRENT = "caret-current";

        /** Tailwind class: {@code caret-inherit} */
        public static final String CARET_INHERIT = "caret-inherit";

        /** Tailwind class: {@code caret-red-500} */
        public static final String CARET_RED_500 = "caret-red-500";

        /** Tailwind class: {@code caret-slate-500} */
        public static final String CARET_SLATE_500 = "caret-slate-500";

        /** Tailwind class: {@code caret-transparent} */
        public static final String CARET_TRANSPARENT = "caret-transparent";

        /** Tailwind class: {@code caret-white} */
        public static final String CARET_WHITE = "caret-white";

        /** Tailwind class: {@code clear-both} */
        public static final String CLEAR_BOTH = "clear-both";

        /** Tailwind class: {@code clear-end} */
        public static final String CLEAR_END = "clear-end";

        /** Tailwind class: {@code clear-left} */
        public static final String CLEAR_LEFT = "clear-left";

        /** Tailwind class: {@code clear-none} */
        public static final String CLEAR_NONE = "clear-none";

        /** Tailwind class: {@code clear-right} */
        public static final String CLEAR_RIGHT = "clear-right";

        /** Tailwind class: {@code clear-start} */
        public static final String CLEAR_START = "clear-start";

        /** Tailwind class: {@code collapse} */
        public static final String COLLAPSE = "collapse";

        /** Tailwind class: {@code columns-1} */
        public static final String COLUMNS_1 = "columns-1";

        /** Tailwind class: {@code columns-2} */
        public static final String COLUMNS_2 = "columns-2";

        /** Tailwind class: {@code columns-2xl} */
        public static final String COLUMNS_2XL = "columns-2xl";

        /** Tailwind class: {@code columns-2xs} */
        public static final String COLUMNS_2XS = "columns-2xs";

        /** Tailwind class: {@code columns-3} */
        public static final String COLUMNS_3 = "columns-3";

        /** Tailwind class: {@code columns-3xl} */
        public static final String COLUMNS_3XL = "columns-3xl";

        /** Tailwind class: {@code columns-3xs} */
        public static final String COLUMNS_3XS = "columns-3xs";

        /** Tailwind class: {@code columns-4} */
        public static final String COLUMNS_4 = "columns-4";

        /** Tailwind class: {@code columns-4xl} */
        public static final String COLUMNS_4XL = "columns-4xl";

        /** Tailwind class: {@code columns-5} */
        public static final String COLUMNS_5 = "columns-5";

        /** Tailwind class: {@code columns-6} */
        public static final String COLUMNS_6 = "columns-6";

        /** Tailwind class: {@code columns-6xl} */
        public static final String COLUMNS_6XL = "columns-6xl";

        /** Tailwind class: {@code columns-7} */
        public static final String COLUMNS_7 = "columns-7";

        /** Tailwind class: {@code columns-7xl} */
        public static final String COLUMNS_7XL = "columns-7xl";

        /** Tailwind class: {@code columns-8} */
        public static final String COLUMNS_8 = "columns-8";

        /** Tailwind class: {@code columns-9} */
        public static final String COLUMNS_9 = "columns-9";

        /** Tailwind class: {@code columns-10} */
        public static final String COLUMNS_10 = "columns-10";

        /** Tailwind class: {@code columns-11} */
        public static final String COLUMNS_11 = "columns-11";

        /** Tailwind class: {@code columns-12} */
        public static final String COLUMNS_12 = "columns-12";

        /** Tailwind class: {@code columns-auto} */
        public static final String COLUMNS_AUTO = "columns-auto";

        /** Tailwind class: {@code columns-lg} */
        public static final String COLUMNS_LG = "columns-lg";

        /** Tailwind class: {@code columns-md} */
        public static final String COLUMNS_MD = "columns-md";

        /** Tailwind class: {@code columns-sm} */
        public static final String COLUMNS_SM = "columns-sm";

        /** Tailwind class: {@code columns-xl} */
        public static final String COLUMNS_XL = "columns-xl";

        /** Tailwind class: {@code columns-xs} */
        public static final String COLUMNS_XS = "columns-xs";

        /** Tailwind class: {@code container} */
        public static final String CONTAINER = "container";

        /** Tailwind class: {@code contrast-0} */
        public static final String CONTRAST_0 = "contrast-0";

        /** Tailwind class: {@code divide-x-0} */
        public static final String DIVIDE_X_0 = "divide-x-0";

        /** Tailwind class: {@code divide-x-2} */
        public static final String DIVIDE_X_2 = "divide-x-2";

        /** Tailwind class: {@code contrast-50} */
        public static final String CONTRAST_50 = "contrast-50";

        /** Tailwind class: {@code contrast-75} */
        public static final String CONTRAST_75 = "contrast-75";

        /** Tailwind class: {@code contrast-100} */
        public static final String CONTRAST_100 = "contrast-100";

        /** Tailwind class: {@code contrast-125} */
        public static final String CONTRAST_125 = "contrast-125";

        /** Tailwind class: {@code contrast-150} */
        public static final String CONTRAST_150 = "contrast-150";

        /** Tailwind class: {@code brightness-200} */
        public static final String BRIGHTNESS_200 = "brightness-200";

        /** Tailwind class: {@code contrast-200} */
        public static final String CONTRAST_200 = "contrast-200";

        /** Tailwind class: {@code cursor-alias} */
        public static final String CURSOR_ALIAS = "cursor-alias";

        /** Tailwind class: {@code cursor-all-scroll} */
        public static final String CURSOR_ALL_SCROLL = "cursor-all-scroll";

        /** Tailwind class: {@code cursor-auto} */
        public static final String CURSOR_AUTO = "cursor-auto";

        /** Tailwind class: {@code cursor-cell} */
        public static final String CURSOR_CELL = "cursor-cell";

        /** Tailwind class: {@code cursor-col-resize} */
        public static final String CURSOR_COL_RESIZE = "cursor-col-resize";

        /** Tailwind class: {@code cursor-context-menu} */
        public static final String CURSOR_CONTEXT_MENU = "cursor-context-menu";

        /** Tailwind class: {@code cursor-copy} */
        public static final String CURSOR_COPY = "cursor-copy";

        /** Tailwind class: {@code cursor-crosshair} */
        public static final String CURSOR_CROSSHAIR = "cursor-crosshair";

        /** Tailwind class: {@code cursor-default} */
        public static final String CURSOR_DEFAULT = "cursor-default";

        /** Tailwind class: {@code cursor-e-resize} */
        public static final String CURSOR_E_RESIZE = "cursor-e-resize";

        /** Tailwind class: {@code cursor-ew-resize} */
        public static final String CURSOR_EW_RESIZE = "cursor-ew-resize";

        /** Tailwind class: {@code cursor-grab} */
        public static final String CURSOR_GRAB = "cursor-grab";

        /** Tailwind class: {@code cursor-grabbing} */
        public static final String CURSOR_GRABBING = "cursor-grabbing";

        /** Tailwind class: {@code cursor-help} */
        public static final String CURSOR_HELP = "cursor-help";

        /** Tailwind class: {@code cursor-move} */
        public static final String CURSOR_MOVE = "cursor-move";

        /** Tailwind class: {@code cursor-n-resize} */
        public static final String CURSOR_N_RESIZE = "cursor-n-resize";

        /** Tailwind class: {@code cursor-ne-resize} */
        public static final String CURSOR_NE_RESIZE = "cursor-ne-resize";

        /** Tailwind class: {@code cursor-nesw-resize} */
        public static final String CURSOR_NESW_RESIZE = "cursor-nesw-resize";

        /** Tailwind class: {@code cursor-no-drop} */
        public static final String CURSOR_NO_DROP = "cursor-no-drop";

        /** Tailwind class: {@code cursor-none} */
        public static final String CURSOR_NONE = "cursor-none";

        /** Tailwind class: {@code cursor-not-allowed} */
        public static final String CURSOR_NOT_ALLOWED = "cursor-not-allowed";

        /** Tailwind class: {@code cursor-ns-resize} */
        public static final String CURSOR_NS_RESIZE = "cursor-ns-resize";

        /** Tailwind class: {@code cursor-nw-resize} */
        public static final String CURSOR_NW_RESIZE = "cursor-nw-resize";

        /** Tailwind class: {@code cursor-nwse-resize} */
        public static final String CURSOR_NWSE_RESIZE = "cursor-nwse-resize";

        /** Tailwind class: {@code cursor-pointer} */
        public static final String CURSOR_POINTER = "cursor-pointer";

        /** Tailwind class: {@code cursor-progress} */
        public static final String CURSOR_PROGRESS = "cursor-progress";

        /** Tailwind class: {@code cursor-row-resize} */
        public static final String CURSOR_ROW_RESIZE = "cursor-row-resize";

        /** Tailwind class: {@code cursor-s-resize} */
        public static final String CURSOR_S_RESIZE = "cursor-s-resize";

        /** Tailwind class: {@code cursor-se-resize} */
        public static final String CURSOR_SE_RESIZE = "cursor-se-resize";

        /** Tailwind class: {@code cursor-sw-resize} */
        public static final String CURSOR_SW_RESIZE = "cursor-sw-resize";

        /** Tailwind class: {@code cursor-text} */
        public static final String CURSOR_TEXT = "cursor-text";

        /** Tailwind class: {@code cursor-vertical-text} */
        public static final String CURSOR_VERTICAL_TEXT = "cursor-vertical-text";

        /** Tailwind class: {@code cursor-w-resize} */
        public static final String CURSOR_W_RESIZE = "cursor-w-resize";

        /** Tailwind class: {@code cursor-wait} */
        public static final String CURSOR_WAIT = "cursor-wait";

        /** Tailwind class: {@code cursor-zoom-in} */
        public static final String CURSOR_ZOOM_IN = "cursor-zoom-in";

        /** Tailwind class: {@code cursor-zoom-out} */
        public static final String CURSOR_ZOOM_OUT = "cursor-zoom-out";

        /** Tailwind class: {@code diagonal-fractions} */
        public static final String DIAGONAL_FRACTIONS = "diagonal-fractions";

        /** Tailwind class: {@code divide-blue-500} */
        public static final String DIVIDE_BLUE_500 = "divide-blue-500";

        /** Tailwind class: {@code divide-dashed} */
        public static final String DIVIDE_DASHED = "divide-dashed";

        /** Tailwind class: {@code divide-dotted} */
        public static final String DIVIDE_DOTTED = "divide-dotted";

        /** Tailwind class: {@code divide-double} */
        public static final String DIVIDE_DOUBLE = "divide-double";

        /** Tailwind class: {@code divide-gray-500} */
        public static final String DIVIDE_GRAY_500 = "divide-gray-500";

        /** Tailwind class: {@code divide-none} */
        public static final String DIVIDE_NONE = "divide-none";

        /** Tailwind class: {@code divide-red-500} */
        public static final String DIVIDE_RED_500 = "divide-red-500";

        /** Tailwind class: {@code divide-solid} */
        public static final String DIVIDE_SOLID = "divide-solid";

        /** Tailwind class: {@code divide-x-reverse} */
        public static final String DIVIDE_X_REVERSE = "divide-x-reverse";

        /** Tailwind class: {@code divide-y-0} */
        public static final String DIVIDE_Y_0 = "divide-y-0";

        /** Tailwind class: {@code divide-y-2} */
        public static final String DIVIDE_Y_2 = "divide-y-2";

        /** Tailwind class: {@code divide-y-reverse} */
        public static final String DIVIDE_Y_REVERSE = "divide-y-reverse";

        /** Tailwind class: {@code drop-shadow} */
        public static final String DROP_SHADOW = "drop-shadow";

        /** Tailwind class: {@code drop-shadow-2xl} */
        public static final String DROP_SHADOW_2XL = "drop-shadow-2xl";

        /** Tailwind class: {@code drop-shadow-lg} */
        public static final String DROP_SHADOW_LG = "drop-shadow-lg";

        /** Tailwind class: {@code drop-shadow-md} */
        public static final String DROP_SHADOW_MD = "drop-shadow-md";

        /** Tailwind class: {@code drop-shadow-none} */
        public static final String DROP_SHADOW_NONE = "drop-shadow-none";

        /** Tailwind class: {@code drop-shadow-sm} */
        public static final String DROP_SHADOW_SM = "drop-shadow-sm";

        /** Tailwind class: {@code drop-shadow-xl} */
        public static final String DROP_SHADOW_XL = "drop-shadow-xl";

        /** Tailwind class: {@code fill-black} */
        public static final String FILL_BLACK = "fill-black";

        /** Tailwind class: {@code hue-rotate-30} */
        public static final String HUE_ROTATE_30 = "hue-rotate-30";

        /** Tailwind class: {@code hue-rotate-60} */
        public static final String HUE_ROTATE_60 = "hue-rotate-60";

        /** Tailwind class: {@code fill-blue-500} */
        public static final String FILL_BLUE_500 = "fill-blue-500";

        /** Tailwind class: {@code fill-current} */
        public static final String FILL_CURRENT = "fill-current";

        /** Tailwind class: {@code fill-inherit} */
        public static final String FILL_INHERIT = "fill-inherit";

        /** Tailwind class: {@code fill-none} */
        public static final String FILL_NONE = "fill-none";

        /** Tailwind class: {@code fill-red-500} */
        public static final String FILL_RED_500 = "fill-red-500";

        /** Tailwind class: {@code fill-slate-500} */
        public static final String FILL_SLATE_500 = "fill-slate-500";

        /** Tailwind class: {@code fill-transparent} */
        public static final String FILL_TRANSPARENT = "fill-transparent";

        /** Tailwind class: {@code fill-white} */
        public static final String FILL_WHITE = "fill-white";

        /** Tailwind class: {@code float-end} */
        public static final String FLOAT_END = "float-end";

        /** Tailwind class: {@code float-left} */
        public static final String FLOAT_LEFT = "float-left";

        /** Tailwind class: {@code float-none} */
        public static final String FLOAT_NONE = "float-none";

        /** Tailwind class: {@code float-right} */
        public static final String FLOAT_RIGHT = "float-right";

        /** Tailwind class: {@code float-start} */
        public static final String FLOAT_START = "float-start";

        /** Tailwind class: {@code forced-color-adjust-auto} */
        public static final String FORCED_COLOR_ADJUST_AUTO = "forced-color-adjust-auto";

        /** Tailwind class: {@code forced-color-adjust-none} */
        public static final String FORCED_COLOR_ADJUST_NONE = "forced-color-adjust-none";

        /** Tailwind class: {@code grayscale} */
        public static final String GRAYSCALE = "grayscale";

        /** Tailwind class: {@code grayscale-0} */
        public static final String GRAYSCALE_0 = "grayscale-0";

        /** Tailwind class: {@code hue-rotate-0} */
        public static final String HUE_ROTATE_0 = "hue-rotate-0";

        /** Tailwind class: {@code hue-rotate-15} */
        public static final String HUE_ROTATE_15 = "hue-rotate-15";

        /** Tailwind class: {@code hue-rotate-90} */
        public static final String HUE_ROTATE_90 = "hue-rotate-90";

        /** Tailwind class: {@code hyphens-auto} */
        public static final String HYPHENS_AUTO = "hyphens-auto";

        /** Tailwind class: {@code hyphens-manual} */
        public static final String HYPHENS_MANUAL = "hyphens-manual";

        /** Tailwind class: {@code hyphens-none} */
        public static final String HYPHENS_NONE = "hyphens-none";

        /** Tailwind class: {@code indent-0} */
        public static final String INDENT_0 = "indent-0";

        /** Tailwind class: {@code indent-1} */
        public static final String INDENT_1 = "indent-1";

        /** Tailwind class: {@code indent-2} */
        public static final String INDENT_2 = "indent-2";

        /** Tailwind class: {@code leading-3} */
        public static final String LEADING_3 = "leading-3";

        /** Tailwind class: {@code indent-4} */
        public static final String INDENT_4 = "indent-4";

        /** Tailwind class: {@code leading-7} */
        public static final String LEADING_7 = "leading-7";

        /** Tailwind class: {@code indent-8} */
        public static final String INDENT_8 = "indent-8";

        /** Tailwind class: {@code invert} */
        public static final String INVERT = "invert";

        /** Tailwind class: {@code invert-0} */
        public static final String INVERT_0 = "invert-0";

        /** Tailwind class: {@code invisible} */
        public static final String INVISIBLE = "invisible";

        /** Tailwind class: {@code isolate} */
        public static final String ISOLATE = "isolate";

        /** Tailwind class: {@code isolation-auto} */
        public static final String ISOLATION_AUTO = "isolation-auto";

        /** Tailwind class: {@code justify-items-center} */
        public static final String JUSTIFY_ITEMS_CENTER = "justify-items-center";

        /** Tailwind class: {@code justify-items-end} */
        public static final String JUSTIFY_ITEMS_END = "justify-items-end";

        /** Tailwind class: {@code justify-items-start} */
        public static final String JUSTIFY_ITEMS_START = "justify-items-start";

        /** Tailwind class: {@code justify-items-stretch} */
        public static final String JUSTIFY_ITEMS_STRETCH = "justify-items-stretch";

        /** Tailwind class: {@code justify-self-auto} */
        public static final String JUSTIFY_SELF_AUTO = "justify-self-auto";

        /** Tailwind class: {@code justify-self-center} */
        public static final String JUSTIFY_SELF_CENTER = "justify-self-center";

        /** Tailwind class: {@code justify-self-end} */
        public static final String JUSTIFY_SELF_END = "justify-self-end";

        /** Tailwind class: {@code justify-self-start} */
        public static final String JUSTIFY_SELF_START = "justify-self-start";

        /** Tailwind class: {@code justify-self-stretch} */
        public static final String JUSTIFY_SELF_STRETCH = "justify-self-stretch";

        /** Tailwind class: {@code -bottom-1} */
        public static final String NEG_BOTTOM_1 = "-bottom-1";

        /** Tailwind class: {@code leading-4} */
        public static final String LEADING_4 = "leading-4";

        /** Tailwind class: {@code leading-5} */
        public static final String LEADING_5 = "leading-5";

        /** Tailwind class: {@code leading-6} */
        public static final String LEADING_6 = "leading-6";

        /** Tailwind class: {@code leading-8} */
        public static final String LEADING_8 = "leading-8";

        /** Tailwind class: {@code leading-9} */
        public static final String LEADING_9 = "leading-9";

        /** Tailwind class: {@code leading-10} */
        public static final String LEADING_10 = "leading-10";

        /** Tailwind class: {@code hue-rotate-180} */
        public static final String HUE_ROTATE_180 = "hue-rotate-180";

        /** Tailwind class: {@code leading-loose} */
        public static final String LEADING_LOOSE = "leading-loose";

        /** Tailwind class: {@code leading-none} */
        public static final String LEADING_NONE = "leading-none";

        /** Tailwind class: {@code leading-normal} */
        public static final String LEADING_NORMAL = "leading-normal";

        /** Tailwind class: {@code leading-relaxed} */
        public static final String LEADING_RELAXED = "leading-relaxed";

        /** Tailwind class: {@code leading-snug} */
        public static final String LEADING_SNUG = "leading-snug";

        /** Tailwind class: {@code leading-tight} */
        public static final String LEADING_TIGHT = "leading-tight";

        /** Tailwind class: {@code lining-nums} */
        public static final String LINING_NUMS = "lining-nums";

        /** Tailwind class: {@code list-decimal} */
        public static final String LIST_DECIMAL = "list-decimal";

        /** Tailwind class: {@code list-disc} */
        public static final String LIST_DISC = "list-disc";

        /** Tailwind class: {@code list-inside} */
        public static final String LIST_INSIDE = "list-inside";

        /** Tailwind class: {@code list-none} */
        public static final String LIST_NONE = "list-none";

        /** Tailwind class: {@code list-outside} */
        public static final String LIST_OUTSIDE = "list-outside";

        /** Tailwind class: {@code mix-blend-color} */
        public static final String MIX_BLEND_COLOR = "mix-blend-color";

        /** Tailwind class: {@code mix-blend-color-burn} */
        public static final String MIX_BLEND_COLOR_BURN = "mix-blend-color-burn";

        /** Tailwind class: {@code mix-blend-color-dodge} */
        public static final String MIX_BLEND_COLOR_DODGE = "mix-blend-color-dodge";

        /** Tailwind class: {@code mix-blend-darken} */
        public static final String MIX_BLEND_DARKEN = "mix-blend-darken";

        /** Tailwind class: {@code mix-blend-difference} */
        public static final String MIX_BLEND_DIFFERENCE = "mix-blend-difference";

        /** Tailwind class: {@code mix-blend-exclusion} */
        public static final String MIX_BLEND_EXCLUSION = "mix-blend-exclusion";

        /** Tailwind class: {@code mix-blend-hard-light} */
        public static final String MIX_BLEND_HARD_LIGHT = "mix-blend-hard-light";

        /** Tailwind class: {@code mix-blend-hue} */
        public static final String MIX_BLEND_HUE = "mix-blend-hue";

        /** Tailwind class: {@code mix-blend-lighten} */
        public static final String MIX_BLEND_LIGHTEN = "mix-blend-lighten";

        /** Tailwind class: {@code mix-blend-luminosity} */
        public static final String MIX_BLEND_LUMINOSITY = "mix-blend-luminosity";

        /** Tailwind class: {@code mix-blend-multiply} */
        public static final String MIX_BLEND_MULTIPLY = "mix-blend-multiply";

        /** Tailwind class: {@code mix-blend-normal} */
        public static final String MIX_BLEND_NORMAL = "mix-blend-normal";

        /** Tailwind class: {@code mix-blend-overlay} */
        public static final String MIX_BLEND_OVERLAY = "mix-blend-overlay";

        /** Tailwind class: {@code mix-blend-plus-darker} */
        public static final String MIX_BLEND_PLUS_DARKER = "mix-blend-plus-darker";

        /** Tailwind class: {@code mix-blend-plus-lighter} */
        public static final String MIX_BLEND_PLUS_LIGHTER = "mix-blend-plus-lighter";

        /** Tailwind class: {@code mix-blend-saturation} */
        public static final String MIX_BLEND_SATURATION = "mix-blend-saturation";

        /** Tailwind class: {@code mix-blend-screen} */
        public static final String MIX_BLEND_SCREEN = "mix-blend-screen";

        /** Tailwind class: {@code mix-blend-soft-light} */
        public static final String MIX_BLEND_SOFT_LIGHT = "mix-blend-soft-light";

        /** Tailwind class: {@code normal-nums} */
        public static final String NORMAL_NUMS = "normal-nums";

        /** Tailwind class: {@code not-sr-only} */
        public static final String NOT_SR_ONLY = "not-sr-only";

        /** Tailwind class: {@code object-bottom} */
        public static final String OBJECT_BOTTOM = "object-bottom";

        /** Tailwind class: {@code object-center} */
        public static final String OBJECT_CENTER = "object-center";

        /** Tailwind class: {@code object-contain} */
        public static final String OBJECT_CONTAIN = "object-contain";

        /** Tailwind class: {@code object-cover} */
        public static final String OBJECT_COVER = "object-cover";

        /** Tailwind class: {@code object-fill} */
        public static final String OBJECT_FILL = "object-fill";

        /** Tailwind class: {@code object-left} */
        public static final String OBJECT_LEFT = "object-left";

        /** Tailwind class: {@code object-left-bottom} */
        public static final String OBJECT_LEFT_BOTTOM = "object-left-bottom";

        /** Tailwind class: {@code object-left-top} */
        public static final String OBJECT_LEFT_TOP = "object-left-top";

        /** Tailwind class: {@code object-none} */
        public static final String OBJECT_NONE = "object-none";

        /** Tailwind class: {@code object-right} */
        public static final String OBJECT_RIGHT = "object-right";

        /** Tailwind class: {@code object-right-bottom} */
        public static final String OBJECT_RIGHT_BOTTOM = "object-right-bottom";

        /** Tailwind class: {@code object-right-top} */
        public static final String OBJECT_RIGHT_TOP = "object-right-top";

        /** Tailwind class: {@code object-scale-down} */
        public static final String OBJECT_SCALE_DOWN = "object-scale-down";

        /** Tailwind class: {@code object-top} */
        public static final String OBJECT_TOP = "object-top";

        /** Tailwind class: {@code oldstyle-nums} */
        public static final String OLDSTYLE_NUMS = "oldstyle-nums";

        /** Tailwind class: {@code order-1} */
        public static final String ORDER_1 = "order-1";

        /** Tailwind class: {@code order-2} */
        public static final String ORDER_2 = "order-2";

        /** Tailwind class: {@code order-3} */
        public static final String ORDER_3 = "order-3";

        /** Tailwind class: {@code order-4} */
        public static final String ORDER_4 = "order-4";

        /** Tailwind class: {@code order-5} */
        public static final String ORDER_5 = "order-5";

        /** Tailwind class: {@code order-6} */
        public static final String ORDER_6 = "order-6";

        /** Tailwind class: {@code order-7} */
        public static final String ORDER_7 = "order-7";

        /** Tailwind class: {@code order-8} */
        public static final String ORDER_8 = "order-8";

        /** Tailwind class: {@code order-9} */
        public static final String ORDER_9 = "order-9";

        /** Tailwind class: {@code order-10} */
        public static final String ORDER_10 = "order-10";

        /** Tailwind class: {@code order-11} */
        public static final String ORDER_11 = "order-11";

        /** Tailwind class: {@code order-first} */
        public static final String ORDER_FIRST = "order-first";

        /** Tailwind class: {@code order-last} */
        public static final String ORDER_LAST = "order-last";

        /** Tailwind class: {@code order-none} */
        public static final String ORDER_NONE = "order-none";

        /** Tailwind class: {@code ordinal} */
        public static final String ORDINAL = "ordinal";

        /** Tailwind class: {@code origin-bottom} */
        public static final String ORIGIN_BOTTOM = "origin-bottom";

        /** Tailwind class: {@code origin-bottom-left} */
        public static final String ORIGIN_BOTTOM_LEFT = "origin-bottom-left";

        /** Tailwind class: {@code origin-bottom-right} */
        public static final String ORIGIN_BOTTOM_RIGHT = "origin-bottom-right";

        /** Tailwind class: {@code origin-center} */
        public static final String ORIGIN_CENTER = "origin-center";

        /** Tailwind class: {@code origin-left} */
        public static final String ORIGIN_LEFT = "origin-left";

        /** Tailwind class: {@code origin-right} */
        public static final String ORIGIN_RIGHT = "origin-right";

        /** Tailwind class: {@code origin-top} */
        public static final String ORIGIN_TOP = "origin-top";

        /** Tailwind class: {@code origin-top-left} */
        public static final String ORIGIN_TOP_LEFT = "origin-top-left";

        /** Tailwind class: {@code origin-top-right} */
        public static final String ORIGIN_TOP_RIGHT = "origin-top-right";

        /** Tailwind class: {@code outline} */
        public static final String OUTLINE = "outline";

        /** Tailwind class: {@code outline-0} */
        public static final String OUTLINE_0 = "outline-0";

        /** Tailwind class: {@code place-content-around} */
        public static final String PLACE_CONTENT_AROUND = "place-content-around";

        /** Tailwind class: {@code place-content-baseline} */
        public static final String PLACE_CONTENT_BASELINE = "place-content-baseline";

        /** Tailwind class: {@code place-content-between} */
        public static final String PLACE_CONTENT_BETWEEN = "place-content-between";

        /** Tailwind class: {@code place-content-center} */
        public static final String PLACE_CONTENT_CENTER = "place-content-center";

        /** Tailwind class: {@code place-content-end} */
        public static final String PLACE_CONTENT_END = "place-content-end";

        /** Tailwind class: {@code place-content-evenly} */
        public static final String PLACE_CONTENT_EVENLY = "place-content-evenly";

        /** Tailwind class: {@code place-content-start} */
        public static final String PLACE_CONTENT_START = "place-content-start";

        /** Tailwind class: {@code place-content-stretch} */
        public static final String PLACE_CONTENT_STRETCH = "place-content-stretch";

        /** Tailwind class: {@code place-items-baseline} */
        public static final String PLACE_ITEMS_BASELINE = "place-items-baseline";

        /** Tailwind class: {@code place-items-center} */
        public static final String PLACE_ITEMS_CENTER = "place-items-center";

        /** Tailwind class: {@code place-items-end} */
        public static final String PLACE_ITEMS_END = "place-items-end";

        /** Tailwind class: {@code place-items-start} */
        public static final String PLACE_ITEMS_START = "place-items-start";

        /** Tailwind class: {@code place-items-stretch} */
        public static final String PLACE_ITEMS_STRETCH = "place-items-stretch";

        /** Tailwind class: {@code place-self-auto} */
        public static final String PLACE_SELF_AUTO = "place-self-auto";

        /** Tailwind class: {@code place-self-center} */
        public static final String PLACE_SELF_CENTER = "place-self-center";

        /** Tailwind class: {@code place-self-end} */
        public static final String PLACE_SELF_END = "place-self-end";

        /** Tailwind class: {@code place-self-start} */
        public static final String PLACE_SELF_START = "place-self-start";

        /** Tailwind class: {@code place-self-stretch} */
        public static final String PLACE_SELF_STRETCH = "place-self-stretch";

        /** Tailwind class: {@code saturate-0} */
        public static final String SATURATE_0 = "saturate-0";

        /** Tailwind class: {@code scroll-m-0} */
        public static final String SCROLL_M_0 = "scroll-m-0";

        /** Tailwind class: {@code scroll-mb-0} */
        public static final String SCROLL_MB_0 = "scroll-mb-0";

        /** Tailwind class: {@code scroll-ml-0} */
        public static final String SCROLL_ML_0 = "scroll-ml-0";

        /** Tailwind class: {@code scroll-mr-0} */
        public static final String SCROLL_MR_0 = "scroll-mr-0";

        /** Tailwind class: {@code scroll-mt-0} */
        public static final String SCROLL_MT_0 = "scroll-mt-0";

        /** Tailwind class: {@code scroll-mx-0} */
        public static final String SCROLL_MX_0 = "scroll-mx-0";

        /** Tailwind class: {@code scroll-my-0} */
        public static final String SCROLL_MY_0 = "scroll-my-0";

        /** Tailwind class: {@code scroll-p-0} */
        public static final String SCROLL_P_0 = "scroll-p-0";

        /** Tailwind class: {@code scroll-pb-0} */
        public static final String SCROLL_PB_0 = "scroll-pb-0";

        /** Tailwind class: {@code scroll-pl-0} */
        public static final String SCROLL_PL_0 = "scroll-pl-0";

        /** Tailwind class: {@code scroll-pr-0} */
        public static final String SCROLL_PR_0 = "scroll-pr-0";

        /** Tailwind class: {@code scroll-pt-0} */
        public static final String SCROLL_PT_0 = "scroll-pt-0";

        /** Tailwind class: {@code scroll-px-0} */
        public static final String SCROLL_PX_0 = "scroll-px-0";

        /** Tailwind class: {@code scroll-py-0} */
        public static final String SCROLL_PY_0 = "scroll-py-0";

        /** Tailwind class: {@code sepia-0} */
        public static final String SEPIA_0 = "sepia-0";

        /** Tailwind class: {@code outline-1} */
        public static final String OUTLINE_1 = "outline-1";

        /** Tailwind class: {@code scroll-m-1} */
        public static final String SCROLL_M_1 = "scroll-m-1";

        /** Tailwind class: {@code scroll-p-1} */
        public static final String SCROLL_P_1 = "scroll-p-1";

        /** Tailwind class: {@code outline-2} */
        public static final String OUTLINE_2 = "outline-2";

        /** Tailwind class: {@code scroll-m-2} */
        public static final String SCROLL_M_2 = "scroll-m-2";

        /** Tailwind class: {@code scroll-p-2} */
        public static final String SCROLL_P_2 = "scroll-p-2";

        /** Tailwind class: {@code outline-4} */
        public static final String OUTLINE_4 = "outline-4";

        /** Tailwind class: {@code outline-8} */
        public static final String OUTLINE_8 = "outline-8";

        /** Tailwind class: {@code outline-black} */
        public static final String OUTLINE_BLACK = "outline-black";

        /** Tailwind class: {@code saturate-50} */
        public static final String SATURATE_50 = "saturate-50";

        /** Tailwind class: {@code saturate-100} */
        public static final String SATURATE_100 = "saturate-100";

        /** Tailwind class: {@code saturate-150} */
        public static final String SATURATE_150 = "saturate-150";

        /** Tailwind class: {@code saturate-200} */
        public static final String SATURATE_200 = "saturate-200";

        /** Tailwind class: {@code outline-blue-500} */
        public static final String OUTLINE_BLUE_500 = "outline-blue-500";

        /** Tailwind class: {@code outline-dashed} */
        public static final String OUTLINE_DASHED = "outline-dashed";

        /** Tailwind class: {@code outline-dotted} */
        public static final String OUTLINE_DOTTED = "outline-dotted";

        /** Tailwind class: {@code outline-double} */
        public static final String OUTLINE_DOUBLE = "outline-double";

        /** Tailwind class: {@code outline-gray-500} */
        public static final String OUTLINE_GRAY_500 = "outline-gray-500";

        /** Tailwind class: {@code outline-none} */
        public static final String OUTLINE_NONE = "outline-none";

        /** Tailwind class: {@code outline-offset-0} */
        public static final String OUTLINE_OFFSET_0 = "outline-offset-0";

        /** Tailwind class: {@code outline-offset-1} */
        public static final String OUTLINE_OFFSET_1 = "outline-offset-1";

        /** Tailwind class: {@code outline-offset-2} */
        public static final String OUTLINE_OFFSET_2 = "outline-offset-2";

        /** Tailwind class: {@code outline-offset-4} */
        public static final String OUTLINE_OFFSET_4 = "outline-offset-4";

        /** Tailwind class: {@code outline-offset-8} */
        public static final String OUTLINE_OFFSET_8 = "outline-offset-8";

        /** Tailwind class: {@code outline-red-500} */
        public static final String OUTLINE_RED_500 = "outline-red-500";

        /** Tailwind class: {@code outline-slate-500} */
        public static final String OUTLINE_SLATE_500 = "outline-slate-500";

        /** Tailwind class: {@code outline-white} */
        public static final String OUTLINE_WHITE = "outline-white";

        /** Tailwind class: {@code overscroll-auto} */
        public static final String OVERSCROLL_AUTO = "overscroll-auto";

        /** Tailwind class: {@code overscroll-contain} */
        public static final String OVERSCROLL_CONTAIN = "overscroll-contain";

        /** Tailwind class: {@code overscroll-none} */
        public static final String OVERSCROLL_NONE = "overscroll-none";

        /** Tailwind class: {@code overscroll-x-auto} */
        public static final String OVERSCROLL_X_AUTO = "overscroll-x-auto";

        /** Tailwind class: {@code overscroll-x-contain} */
        public static final String OVERSCROLL_X_CONTAIN = "overscroll-x-contain";

        /** Tailwind class: {@code overscroll-x-none} */
        public static final String OVERSCROLL_X_NONE = "overscroll-x-none";

        /** Tailwind class: {@code overscroll-y-auto} */
        public static final String OVERSCROLL_Y_AUTO = "overscroll-y-auto";

        /** Tailwind class: {@code overscroll-y-contain} */
        public static final String OVERSCROLL_Y_CONTAIN = "overscroll-y-contain";

        /** Tailwind class: {@code overscroll-y-none} */
        public static final String OVERSCROLL_Y_NONE = "overscroll-y-none";

        /** Tailwind class: {@code pointer-events-auto} */
        public static final String POINTER_EVENTS_AUTO = "pointer-events-auto";

        /** Tailwind class: {@code pointer-events-none} */
        public static final String POINTER_EVENTS_NONE = "pointer-events-none";

        /** Tailwind class: {@code proportional-nums} */
        public static final String PROPORTIONAL_NUMS = "proportional-nums";

        /** Tailwind class: {@code resize} */
        public static final String RESIZE = "resize";

        /** Tailwind class: {@code resize-none} */
        public static final String RESIZE_NONE = "resize-none";

        /** Tailwind class: {@code resize-x} */
        public static final String RESIZE_X = "resize-x";

        /** Tailwind class: {@code resize-y} */
        public static final String RESIZE_Y = "resize-y";

        /** Tailwind class: {@code ring} */
        public static final String RING = "ring";

        /** Tailwind class: {@code ring-0} */
        public static final String RING_0 = "ring-0";

        /** Tailwind class: {@code ring-1} */
        public static final String RING_1 = "ring-1";

        /** Tailwind class: {@code ring-2} */
        public static final String RING_2 = "ring-2";

        /** Tailwind class: {@code ring-4} */
        public static final String RING_4 = "ring-4";

        /** Tailwind class: {@code ring-8} */
        public static final String RING_8 = "ring-8";

        /** Tailwind class: {@code ring-blue-500} */
        public static final String RING_BLUE_500 = "ring-blue-500";

        /** Tailwind class: {@code ring-gray-500} */
        public static final String RING_GRAY_500 = "ring-gray-500";

        /** Tailwind class: {@code ring-inset} */
        public static final String RING_INSET = "ring-inset";

        /** Tailwind class: {@code ring-offset-0} */
        public static final String RING_OFFSET_0 = "ring-offset-0";

        /** Tailwind class: {@code ring-offset-1} */
        public static final String RING_OFFSET_1 = "ring-offset-1";

        /** Tailwind class: {@code ring-offset-2} */
        public static final String RING_OFFSET_2 = "ring-offset-2";

        /** Tailwind class: {@code ring-offset-4} */
        public static final String RING_OFFSET_4 = "ring-offset-4";

        /** Tailwind class: {@code ring-offset-8} */
        public static final String RING_OFFSET_8 = "ring-offset-8";

        /** Tailwind class: {@code order-12} */
        public static final String ORDER_12 = "order-12";

        /** Tailwind class: {@code ring-offset-black} */
        public static final String RING_OFFSET_BLACK = "ring-offset-black";

        /** Tailwind class: {@code ring-offset-gray-500} */
        public static final String RING_OFFSET_GRAY_500 = "ring-offset-gray-500";

        /** Tailwind class: {@code ring-offset-white} */
        public static final String RING_OFFSET_WHITE = "ring-offset-white";

        /** Tailwind class: {@code ring-red-500} */
        public static final String RING_RED_500 = "ring-red-500";

        /** Tailwind class: {@code ring-slate-500} */
        public static final String RING_SLATE_500 = "ring-slate-500";

        /** Tailwind class: {@code scroll-auto} */
        public static final String SCROLL_AUTO = "scroll-auto";

        /** Tailwind class: {@code scroll-smooth} */
        public static final String SCROLL_SMOOTH = "scroll-smooth";

        /** Tailwind class: {@code select-all} */
        public static final String SELECT_ALL = "select-all";

        /** Tailwind class: {@code select-auto} */
        public static final String SELECT_AUTO = "select-auto";

        /** Tailwind class: {@code select-none} */
        public static final String SELECT_NONE = "select-none";

        /** Tailwind class: {@code select-text} */
        public static final String SELECT_TEXT = "select-text";

        /** Tailwind class: {@code sepia} */
        public static final String SEPIA = "sepia";

        /** Tailwind class: {@code slashed-zero} */
        public static final String SLASHED_ZERO = "slashed-zero";

        /** Tailwind class: {@code snap-align-none} */
        public static final String SNAP_ALIGN_NONE = "snap-align-none";

        /** Tailwind class: {@code snap-always} */
        public static final String SNAP_ALWAYS = "snap-always";

        /** Tailwind class: {@code snap-both} */
        public static final String SNAP_BOTH = "snap-both";

        /** Tailwind class: {@code snap-center} */
        public static final String SNAP_CENTER = "snap-center";

        /** Tailwind class: {@code snap-end} */
        public static final String SNAP_END = "snap-end";

        /** Tailwind class: {@code snap-mandatory} */
        public static final String SNAP_MANDATORY = "snap-mandatory";

        /** Tailwind class: {@code snap-none} */
        public static final String SNAP_NONE = "snap-none";

        /** Tailwind class: {@code snap-normal} */
        public static final String SNAP_NORMAL = "snap-normal";

        /** Tailwind class: {@code snap-proximity} */
        public static final String SNAP_PROXIMITY = "snap-proximity";

        /** Tailwind class: {@code snap-start} */
        public static final String SNAP_START = "snap-start";

        /** Tailwind class: {@code snap-x} */
        public static final String SNAP_X = "snap-x";

        /** Tailwind class: {@code snap-y} */
        public static final String SNAP_Y = "snap-y";

        /** Tailwind class: {@code sr-only} */
        public static final String SR_ONLY = "sr-only";

        /** Tailwind class: {@code stacked-fractions} */
        public static final String STACKED_FRACTIONS = "stacked-fractions";

        /** Tailwind class: {@code stroke-0} */
        public static final String STROKE_0 = "stroke-0";

        /** Tailwind class: {@code stroke-1} */
        public static final String STROKE_1 = "stroke-1";

        /** Tailwind class: {@code stroke-2} */
        public static final String STROKE_2 = "stroke-2";

        /** Tailwind class: {@code stroke-black} */
        public static final String STROKE_BLACK = "stroke-black";

        /** Tailwind class: {@code stroke-blue-500} */
        public static final String STROKE_BLUE_500 = "stroke-blue-500";

        /** Tailwind class: {@code stroke-current} */
        public static final String STROKE_CURRENT = "stroke-current";

        /** Tailwind class: {@code stroke-inherit} */
        public static final String STROKE_INHERIT = "stroke-inherit";

        /** Tailwind class: {@code stroke-none} */
        public static final String STROKE_NONE = "stroke-none";

        /** Tailwind class: {@code stroke-red-500} */
        public static final String STROKE_RED_500 = "stroke-red-500";

        /** Tailwind class: {@code stroke-slate-500} */
        public static final String STROKE_SLATE_500 = "stroke-slate-500";

        /** Tailwind class: {@code stroke-transparent} */
        public static final String STROKE_TRANSPARENT = "stroke-transparent";

        /** Tailwind class: {@code stroke-white} */
        public static final String STROKE_WHITE = "stroke-white";

        /** Tailwind class: {@code table-auto} */
        public static final String TABLE_AUTO = "table-auto";

        /** Tailwind class: {@code table-fixed} */
        public static final String TABLE_FIXED = "table-fixed";

        /** Tailwind class: {@code tabular-nums} */
        public static final String TABULAR_NUMS = "tabular-nums";

        /** Tailwind class: {@code text-balance} */
        public static final String TEXT_BALANCE = "text-balance";

        /** Tailwind class: {@code text-clip} */
        public static final String TEXT_CLIP = "text-clip";

        /** Tailwind class: {@code text-ellipsis} */
        public static final String TEXT_ELLIPSIS = "text-ellipsis";

        /** Tailwind class: {@code text-nowrap} */
        public static final String TEXT_NOWRAP = "text-nowrap";

        /** Tailwind class: {@code text-pretty} */
        public static final String TEXT_PRETTY = "text-pretty";

        /** Tailwind class: {@code text-wrap} */
        public static final String TEXT_WRAP = "text-wrap";

        /** Tailwind class: {@code touch-auto} */
        public static final String TOUCH_AUTO = "touch-auto";

        /** Tailwind class: {@code touch-manipulation} */
        public static final String TOUCH_MANIPULATION = "touch-manipulation";

        /** Tailwind class: {@code touch-none} */
        public static final String TOUCH_NONE = "touch-none";

        /** Tailwind class: {@code touch-pan-down} */
        public static final String TOUCH_PAN_DOWN = "touch-pan-down";

        /** Tailwind class: {@code touch-pan-left} */
        public static final String TOUCH_PAN_LEFT = "touch-pan-left";

        /** Tailwind class: {@code touch-pan-right} */
        public static final String TOUCH_PAN_RIGHT = "touch-pan-right";

        /** Tailwind class: {@code touch-pan-up} */
        public static final String TOUCH_PAN_UP = "touch-pan-up";

        /** Tailwind class: {@code touch-pan-x} */
        public static final String TOUCH_PAN_X = "touch-pan-x";

        /** Tailwind class: {@code touch-pan-y} */
        public static final String TOUCH_PAN_Y = "touch-pan-y";

        /** Tailwind class: {@code touch-pinch-zoom} */
        public static final String TOUCH_PINCH_ZOOM = "touch-pinch-zoom";

        /** Tailwind class: {@code transform} */
        public static final String TRANSFORM = "transform";

        /** Tailwind class: {@code truncate} */
        public static final String TRUNCATE = "truncate";

        /** Tailwind class: {@code underline-offset-0} */
        public static final String UNDERLINE_OFFSET_0 = "underline-offset-0";

        /** Tailwind class: {@code underline-offset-1} */
        public static final String UNDERLINE_OFFSET_1 = "underline-offset-1";

        /** Tailwind class: {@code underline-offset-2} */
        public static final String UNDERLINE_OFFSET_2 = "underline-offset-2";

        /** Tailwind class: {@code underline-offset-4} */
        public static final String UNDERLINE_OFFSET_4 = "underline-offset-4";

        /** Tailwind class: {@code underline-offset-8} */
        public static final String UNDERLINE_OFFSET_8 = "underline-offset-8";

        /** Tailwind class: {@code underline-offset-auto} */
        public static final String UNDERLINE_OFFSET_AUTO = "underline-offset-auto";

        /** Tailwind class: {@code visible} */
        public static final String VISIBLE = "visible";

        /** Tailwind class: {@code whitespace-break-spaces} */
        public static final String WHITESPACE_BREAK_SPACES = "whitespace-break-spaces";

        /** Tailwind class: {@code whitespace-normal} */
        public static final String WHITESPACE_NORMAL = "whitespace-normal";

        /** Tailwind class: {@code whitespace-nowrap} */
        public static final String WHITESPACE_NOWRAP = "whitespace-nowrap";

        /** Tailwind class: {@code whitespace-pre} */
        public static final String WHITESPACE_PRE = "whitespace-pre";

        /** Tailwind class: {@code whitespace-pre-line} */
        public static final String WHITESPACE_PRE_LINE = "whitespace-pre-line";

        /** Tailwind class: {@code whitespace-pre-wrap} */
        public static final String WHITESPACE_PRE_WRAP = "whitespace-pre-wrap";

        /** Tailwind class: {@code will-change-auto} */
        public static final String WILL_CHANGE_AUTO = "will-change-auto";

        /** Tailwind class: {@code will-change-contents} */
        public static final String WILL_CHANGE_CONTENTS = "will-change-contents";

        /** Tailwind class: {@code will-change-scroll} */
        public static final String WILL_CHANGE_SCROLL = "will-change-scroll";

        /** Tailwind class: {@code will-change-transform} */
        public static final String WILL_CHANGE_TRANSFORM = "will-change-transform";

        private Other() {}
    }

    // ========== RESPONSIVE MODIFIERS ==========

    /**
     * Responsive modifier utilities for different breakpoints.
     * <p>
     * <pre>{@code
     * // Apply flex on medium screens and up
     * div.addClassName(TW.Responsive.md(TW.FLEX));
     * // Result: "md:flex"
     * }</pre>
     */
    public static final class Responsive {

        /** Sm breakpoint (640px) - prefix: {@code sm:} */
        public static String sm(String utility) {
            return "sm:" + utility;
        }

        /** Md breakpoint (768px) - prefix: {@code md:} */
        public static String md(String utility) {
            return "md:" + utility;
        }

        /** Lg breakpoint (1024px) - prefix: {@code lg:} */
        public static String lg(String utility) {
            return "lg:" + utility;
        }

        /** Xl breakpoint (1280px) - prefix: {@code xl:} */
        public static String xl(String utility) {
            return "xl:" + utility;
        }

        /** 2xl breakpoint (1536px) - prefix: {@code 2xl:} */
        public static String xxl(String utility) {
            return "2xl:" + utility;
        }

        private Responsive() {}
    }

    // ========== STATE VARIANTS ==========

    /**
     * State variant utilities (hover, focus, active, etc.)
     * <p>
     * <pre>{@code
     * // Apply blue background on hover
     * button.addClassName(TW.State.hover(TW.BG_BLUE_600));
     * // Result: "hover:bg-blue-600"
     * }</pre>
     */
    public static final class State {

        /** Hover state - prefix: {@code hover:} */
        public static String hover(String utility) {
            return "hover:" + utility;
        }

        /** Focus state - prefix: {@code focus:} */
        public static String focus(String utility) {
            return "focus:" + utility;
        }

        /** Active state - prefix: {@code active:} */
        public static String active(String utility) {
            return "active:" + utility;
        }

        /** Dark mode - prefix: {@code dark:} */
        public static String dark(String utility) {
            return "dark:" + utility;
        }

        /** Disabled state - prefix: {@code disabled:} */
        public static String disabled(String utility) {
            return "disabled:" + utility;
        }

        private State() {}
    }

    private TW() {
        // Prevent instantiation
    }
}