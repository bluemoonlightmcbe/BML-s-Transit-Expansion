package net.bte.Filters;

import net.bte.mod.Blocks;
import net.bte.mod.CreativeModeTabs;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.filters.Filter;


public class FilterRegister {
    public interface Filters {


        Filter MOD_PLATFORM_BLOCK = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.block"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK.get().data)));
        Filter MOD_PLATFORM_INDENTED = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.indented"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED.get().data)));
        Filter MOD_PLATFORM_SLAB = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.slab"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB.get().data)));
        //Filter MOD_PLATFORM_OTHER = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.other"), () -> new ItemStack(new ItemConvertible(Items.PLATFORM_BRUSH.get().data)));

        Filter MOD_GATE_ENTRANCE = FilterBuilder.registerFilter(CreativeModeTabs.MOD_GATE, TextHelper.translatable("itemGroup.bte.gate.entrance"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.GATE_HK_C3025.get().data)));
        Filter MOD_GATE_EXIT = FilterBuilder.registerFilter(CreativeModeTabs.MOD_GATE, TextHelper.translatable("itemGroup.bte.gate.exit"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.GATE_HK_C3025_EXIT.get().data)));
        Filter MOD_GATE_COVER = FilterBuilder.registerFilter(CreativeModeTabs.MOD_GATE, TextHelper.translatable("itemGroup.bte.gate.cover"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.GATE_HK_C3025_COVER.get().data)));
        Filter MOD_GATE_GLASS = FilterBuilder.registerFilter(CreativeModeTabs.MOD_GATE, TextHelper.translatable("itemGroup.bte.gate.glass"), () -> new ItemStack(new ItemConvertible(net.bte.mod.Blocks.GATE_GLASS_FENCE_PLAIN.get().data)));

        static void init() {
            //MOD_PLATFORM_OTHER.addItems(Items.PLATFORM_BRUSH.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_IRON_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_IRON_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_IRON_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_BAMBOO_PLANKS.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_BAMBOO_PLANKS_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_BAMBOO_PLANKS_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_CALCITE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_CALCITE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_CALCITE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_POLISHED_BLACKSTONE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_POLISHED_BLACKSTONE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_POLISHED_BLACKSTONE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_BASALT.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_BASALT_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_SMOOTH_BASALT_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_BONE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_BONE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_BONE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_SEA_LANTERN.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_SEA_LANTERN_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_SEA_LANTERN_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_WHITE_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_WHITE_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_WHITE_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GRAY_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GRAY_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_GRAY_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_GRAY_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_GRAY_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_GRAY_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_BLACK_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_BLACK_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_BLACK_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_BROWN_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_BROWN_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_BROWN_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_RED_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_RED_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_RED_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_ORANGE_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_ORANGE_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_ORANGE_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_YELLOW_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIME_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIME_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIME_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_GREEN_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_GREEN_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_GREEN_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_CYAN_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_CYAN_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_CYAN_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_LIGHT_BLUE_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_BLUE_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_BLUE_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_BLUE_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_PURPLE_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_PURPLE_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_PURPLE_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_MAGENTA_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_MAGENTA_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_MAGENTA_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_PINK_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_PINK_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_PINK_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(net.bte.mod.Blocks.PLATFORM_RCC.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(net.bte.mod.Blocks.PLATFORM_RCC_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(net.bte.mod.Blocks.PLATFORM_RCC_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(org.mtr.mod.Blocks.PLATFORM.get().asItem().data);
            MOD_PLATFORM_INDENTED.addItems(org.mtr.mod.Blocks.PLATFORM_INDENTED.get().asItem().data);
            MOD_PLATFORM_SLAB.addItems(org.mtr.mod.Blocks.PLATFORM_SLAB.get().asItem().data);

            MOD_PLATFORM_BLOCK.addItems(org.mtr.mod.Blocks.PLATFORM_NA_1.get().asItem().data);
            MOD_PLATFORM_INDENTED.addItems(org.mtr.mod.Blocks.PLATFORM_NA_1_INDENTED.get().asItem().data);
            MOD_PLATFORM_SLAB.addItems(org.mtr.mod.Blocks.PLATFORM_NA_1_SLAB.get().asItem().data);

            MOD_PLATFORM_BLOCK.addItems(org.mtr.mod.Blocks.PLATFORM_NA_2.get().asItem().data);
            MOD_PLATFORM_INDENTED.addItems(org.mtr.mod.Blocks.PLATFORM_NA_2_INDENTED.get().asItem().data);
            MOD_PLATFORM_SLAB.addItems(org.mtr.mod.Blocks.PLATFORM_NA_2_SLAB.get().asItem().data);

            MOD_PLATFORM_BLOCK.addItems(org.mtr.mod.Blocks.PLATFORM_UK_1.get().asItem().data);
            MOD_PLATFORM_INDENTED.addItems(org.mtr.mod.Blocks.PLATFORM_UK_1_INDENTED.get().asItem().data);
            MOD_PLATFORM_SLAB.addItems(org.mtr.mod.Blocks.PLATFORM_UK_1_SLAB.get().asItem().data);



            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C3025.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C3025_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C3025_COVER.get().asItem().data);

            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C5781.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C5781_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C5781_COVER.get().asItem().data);

            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C762.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C762_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C762_COVER.get().asItem().data);

            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C1163.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C1163_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C1163_COVER.get().asItem().data);

            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C3025_WIDE.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C3025_WIDE_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C3025_WIDE_FAKE.get().asItem().data);

            MOD_GATE_ENTRANCE.addItems(net.bte.mod.Blocks.GATE_HK_C5781_WIDE.get().asItem().data);
            MOD_GATE_EXIT.addItems(net.bte.mod.Blocks.GATE_HK_C5781_WIDE_EXIT.get().asItem().data);
            MOD_GATE_COVER.addItems(net.bte.mod.Blocks.GATE_HK_C5781_WIDE_FAKE.get().asItem().data);

            MOD_GATE_GLASS.addItems(net.bte.mod.Blocks.GATE_GLASS_FENCE_PLAIN.get().asItem().data);
            MOD_GATE_GLASS.addItems(Blocks.GATE_GLASS_FENCE_RIGHT_PLAIN.get().asItem().data);
            MOD_GATE_GLASS.addItems(Blocks.GLASS_FENCE_CORNER_INNER.get().asItem().data);
            MOD_GATE_GLASS.addItems(Blocks.GLASS_FENCE_CORNER_OUTER.get().asItem().data);
        }
    }
}
