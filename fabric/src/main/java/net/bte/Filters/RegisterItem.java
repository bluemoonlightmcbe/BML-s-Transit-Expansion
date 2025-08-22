package net.bte.Filters;

import net.bte.mod.Blocks;
import net.bte.mod.CreativeModeTabs;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.TextHelper;
import ziyue.filters.Filter;


public class RegisterItem {
    public interface Filters {

        Filter MOD_PLATFORM_BLOCK = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.block"), () -> new ItemStack(new ItemConvertible(Blocks.PLATFORM_YELLOW_CONCRETE.get().data)));
        Filter MOD_PLATFORM_INDENTED = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.indented"), () -> new ItemStack(new ItemConvertible(Blocks.PLATFORM_YELLOW_CONCRETE_INDENTED.get().data)));
        Filter MOD_PLATFORM_SLAB = FilterBuilder.registerFilter(CreativeModeTabs.MOD_PLATFORM, TextHelper.translatable("itemGroup.bte.platform.slab"), () -> new ItemStack(new ItemConvertible(Blocks.PLATFORM_YELLOW_CONCRETE_SLAB.get().data)));
        //Filter MOD_PLATFORM2_INDENTED = FilterBuilder.registerFilter(ModItemGroupsWithFilters.MOD_PLATFORM2, Text.translatable("ItemGroup.MOD_PLATFORM2_INDENTED"), () -> new ItemStack(Items.DIAMOND));

        //Filter TIANJIN_MISCELLANEOUS = FilterBuilder.registerFilter(CreativeModeTabs.TIANJIN_METRO, TextHelper.translatable("filter.tjmetro.tianjin_miscellaneous"), () -> new ItemStack(new ItemConvertible(ItemList.WRENCH.get().data)));
        static void init() {
            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_YELLOW_CONCRETE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_YELLOW_CONCRETE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_YELLOW_CONCRETE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_IRON_BLOCK.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_IRON_BLOCK_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_IRON_BLOCK_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_BAMBOO_PLANKS.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_BAMBOO_PLANKS_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_BAMBOO_PLANKS_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_CALCITE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_CALCITE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_CALCITE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_POLISHED_BLACKSTONE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_POLISHED_BLACKSTONE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_POLISHED_BLACKSTONE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_SMOOTH_BASALT.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_SMOOTH_BASALT_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_SMOOTH_BASALT_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_BONE.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_BONE_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_BONE_SLAB.get().data.asItem());

            MOD_PLATFORM_BLOCK.addItems(Blocks.PLATFORM_SEA_LANTERN.get().data.asItem());
            MOD_PLATFORM_INDENTED.addItems(Blocks.PLATFORM_SEA_LANTERN_INDENTED.get().data.asItem());
            MOD_PLATFORM_SLAB.addItems(Blocks.PLATFORM_SEA_LANTERN_SLAB.get().data.asItem());

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


            //MOD_PLATFORM2_INDENTED.addItems(ModBlocks.PLATFORM_YELLOW_CONCRETE_INDENTED.asItem());


        }
    }
}
