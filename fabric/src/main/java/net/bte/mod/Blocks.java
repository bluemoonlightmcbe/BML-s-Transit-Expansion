package net.bte.mod;

import net.bte.mod.blocks.Gate.*;
import net.bte.mod.blocks.GlassFence.GlassFenceCornerInner;
import net.bte.mod.blocks.GlassFence.GlassFenceCornerOuter;
import net.bte.mod.blocks.GlassFence.GlassFenceGateLeft;
import net.bte.mod.blocks.GlassFence.GlassFenceGateRight;
import net.bte.mod.blocks.platform.BlockPlatform;
import net.bte.mod.blocks.platform.BlockPlatformSlab;
import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockRegistryObject;

import static org.mtr.mod.Blocks.createDefaultBlockSettings;

public final class Blocks {

	static {
		PLATFORM_QUARTZ_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_quartz_block"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_QUARTZ_BLOCK_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_quartz_block_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_QUARTZ_BLOCK_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_quartz_block_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_SMOOTH_QUARTZ = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_quartz"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SMOOTH_QUARTZ_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_quartz_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SMOOTH_QUARTZ_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_quartz_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_YELLOW_QUARTZ_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_quartz_block"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_quartz_block_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_quartz_block_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_YELLOW_SMOOTH_QUARTZ = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_smooth_quartz"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_SMOOTH_QUARTZ_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_smooth_quartz_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_SMOOTH_QUARTZ_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_smooth_quartz_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_quartz_block"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_quartz_block_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_quartz_block_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_smooth_quartz"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_smooth_quartz_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_smooth_quartz_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_quartz_block"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_quartz_block_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_quartz_block_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_smooth_quartz"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_smooth_quartz_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_green_smooth_quartz_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_IRON_BLOCK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_iron_block"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_IRON_BLOCK_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_iron_block_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_IRON_BLOCK_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_iron_block_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_BAMBOO_PLANKS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bamboo_planks"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BAMBOO_PLANKS_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bamboo_planks_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BAMBOO_PLANKS_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bamboo_planks_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_CALCITE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_calcite"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_CALCITE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_calcite_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_CALCITE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_calcite_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_POLISHED_BLACKSTONE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_polished_blackstone"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_POLISHED_BLACKSTONE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_polished_blackstone_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_POLISHED_BLACKSTONE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_polished_blackstone_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_SMOOTH_BASALT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_basalt"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SMOOTH_BASALT_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_basalt_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SMOOTH_BASALT_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_smooth_basalt_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_BONE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bone"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BONE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bone_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BONE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_bone_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_SEA_LANTERN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_sea_lantern"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(true, (blockState) -> {
			return 15;
		}), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SEA_LANTERN_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_sea_lantern_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(true, (blockState) -> {
			return 15;
		}), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_SEA_LANTERN_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_sea_lantern_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(true, (blockState) -> {
			return 15;
		}))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_WHITE_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_white_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_WHITE_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_white_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_WHITE_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_white_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_GRAY_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_gray_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GRAY_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_gray_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_GRAY_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_gray_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_GRAY_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_gray_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_GRAY_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_gray_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_GRAY_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_gray_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_BLACK_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_black_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BLACK_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_black_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BLACK_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_black_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_BROWN_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_brown_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BROWN_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_brown_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BROWN_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_brown_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_RED_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_red_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_RED_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_red_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_RED_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_red_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_ORANGE_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_orange_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_ORANGE_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_orange_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_ORANGE_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_orange_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_YELLOW_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_YELLOW_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_yellow_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIME_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_lime_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIME_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_lime_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIME_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_lime_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_GREEN_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_green_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_GREEN_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_green_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_GREEN_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_green_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_CYAN_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_cyan_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_CYAN_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_cyan_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_CYAN_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_cyan_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_LIGHT_BLUE_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_LIGHT_BLUE_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_light_blue_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_BLUE_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_blue_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BLUE_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_blue_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_BLUE_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_blue_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_PURPLE_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_purple_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_PURPLE_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_purple_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_PURPLE_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_purple_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_MAGENTA_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_magenta_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_MAGENTA_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_magenta_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_MAGENTA_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_magenta_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_PINK_CONCRETE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_pink_concrete"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_PINK_CONCRETE_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_pink_concrete_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_PINK_CONCRETE_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_pink_concrete_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

		PLATFORM_RCC = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_rcc"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), false)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_RCC_INDENTED = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_rcc_indented"), () -> new Block(new BlockPlatform(createDefaultBlockSettings(false), true)), CreativeModeTabs.MOD_PLATFORM);
		PLATFORM_RCC_SLAB = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "platform_rcc_slab"), () -> new Block(new BlockPlatformSlab(createDefaultBlockSettings(false))), CreativeModeTabs.MOD_PLATFORM);

        GATE_HK_C3025 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025"), () -> new Block(new GateTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
        GATE_HK_C3025_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025_exit"), () -> new Block(new GateTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
        GATE_HK_C3025_COVER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025_cover"), () -> new Block(new GateTicketBarrierBareBlock(createDefaultBlockSettings(true, (blockState) -> {
            return 5;
        }).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);

		GATE_HK_C5781 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781"), () -> new Block(new GateTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
        GATE_HK_C5781_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781_exit"), () -> new Block(new GateTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
        GATE_HK_C5781_COVER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781_cover"), () -> new Block(new GateTicketBarrierBareBlock(createDefaultBlockSettings(true, (blockState) -> {
            return 5;
        }).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);

		GATE_HK_C1163 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c1163"), () -> new Block(new GateTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C1163_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c1163_exit"), () -> new Block(new GateTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C1163_COVER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c1163_cover"), () -> new Block(new GateTicketBarrierBareBlock(createDefaultBlockSettings(true, (blockState) -> {
			return 5;
		}).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);
		GATE_HK_C762 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c762"), () -> new Block(new GateTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C762_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c762_exit"), () -> new Block(new GateTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C762_COVER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c762_cover"), () -> new Block(new GateTicketBarrierBareBlock(createDefaultBlockSettings(true, (blockState) -> {
			return 5;
		}).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);

        GATE_HK_C3025_WIDE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025_wide"), () -> new Block(new GateWideTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C3025_WIDE_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025_wide_exit"), () -> new Block(new GateWideTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C3025_WIDE_FAKE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c3025_wide_fake"), () -> new Block(new GateWideFake(createDefaultBlockSettings(true, (blockState) -> {
			return 5;
		}).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);

		GATE_HK_C5781_WIDE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781_wide"), () -> new Block(new GateWideTicketBarrier(true)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C5781_WIDE_EXIT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781_wide_exit"), () -> new Block(new GateWideTicketBarrier(false)), CreativeModeTabs.MOD_GATE);
		GATE_HK_C5781_WIDE_FAKE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_hk_c5781_wide_fake"), () -> new Block(new GateWideFake(createDefaultBlockSettings(true, (blockState) -> {
			return 5;
		}).strength(4.0f).nonOpaque())), CreativeModeTabs.MOD_GATE);

		GATE_GLASS_FENCE_PLAIN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_glass_fence_plain"), () -> new Block(new GlassFenceGateLeft()), CreativeModeTabs.MOD_GATE);
		GATE_GLASS_FENCE_RIGHT_PLAIN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "gate_glass_fence_right_plain"), () -> new Block(new GlassFenceGateRight()), CreativeModeTabs.MOD_GATE);
		GLASS_FENCE_CORNER_INNER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "glass_fence_corner_inner"), () -> new Block(new GlassFenceCornerInner()), CreativeModeTabs.MOD_GATE);
		GLASS_FENCE_CORNER_OUTER = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "glass_fence_corner_outer"), () -> new Block(new GlassFenceCornerOuter()), CreativeModeTabs.MOD_GATE);



	}

	public static final BlockRegistryObject PLATFORM_WHITE_CONCRETE;
	public static final BlockRegistryObject PLATFORM_WHITE_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_WHITE_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_GRAY_CONCRETE;
	public static final BlockRegistryObject PLATFORM_LIGHT_GRAY_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_GRAY_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_GRAY_CONCRETE;
	public static final BlockRegistryObject PLATFORM_GRAY_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_GRAY_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_BLACK_CONCRETE;
	public static final BlockRegistryObject PLATFORM_BLACK_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_BLACK_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_BROWN_CONCRETE;
	public static final BlockRegistryObject PLATFORM_BROWN_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_BROWN_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_RED_CONCRETE;
	public static final BlockRegistryObject PLATFORM_RED_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_RED_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_ORANGE_CONCRETE;
	public static final BlockRegistryObject PLATFORM_ORANGE_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_ORANGE_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_YELLOW_CONCRETE;
	public static final BlockRegistryObject PLATFORM_YELLOW_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_YELLOW_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_LIME_CONCRETE;
	public static final BlockRegistryObject PLATFORM_LIME_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIME_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_GREEN_CONCRETE;
	public static final BlockRegistryObject PLATFORM_GREEN_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_GREEN_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_CYAN_CONCRETE;
	public static final BlockRegistryObject PLATFORM_CYAN_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_CYAN_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_CONCRETE;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_BLUE_CONCRETE;
	public static final BlockRegistryObject PLATFORM_BLUE_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_BLUE_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_PURPLE_CONCRETE;
	public static final BlockRegistryObject PLATFORM_PURPLE_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_PURPLE_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_MAGENTA_CONCRETE;
	public static final BlockRegistryObject PLATFORM_MAGENTA_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_MAGENTA_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_PINK_CONCRETE;
	public static final BlockRegistryObject PLATFORM_PINK_CONCRETE_INDENTED;
	public static final BlockRegistryObject PLATFORM_PINK_CONCRETE_SLAB;
	public static final BlockRegistryObject PLATFORM_QUARTZ_BLOCK;
	public static final BlockRegistryObject PLATFORM_QUARTZ_BLOCK_INDENTED;
	public static final BlockRegistryObject PLATFORM_QUARTZ_BLOCK_SLAB;
	public static final BlockRegistryObject PLATFORM_SMOOTH_QUARTZ;
	public static final BlockRegistryObject PLATFORM_SMOOTH_QUARTZ_INDENTED;
	public static final BlockRegistryObject PLATFORM_SMOOTH_QUARTZ_SLAB;
	public static final BlockRegistryObject PLATFORM_YELLOW_QUARTZ_BLOCK;
	public static final BlockRegistryObject PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED;
	public static final BlockRegistryObject PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB;
	public static final BlockRegistryObject PLATFORM_YELLOW_SMOOTH_QUARTZ;
	public static final BlockRegistryObject PLATFORM_YELLOW_SMOOTH_QUARTZ_INDENTED;
	public static final BlockRegistryObject PLATFORM_YELLOW_SMOOTH_QUARTZ_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_QUARTZ_BLOCK_SLAB;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_INDENTED;
	public static final BlockRegistryObject PLATFORM_LIGHT_GREEN_SMOOTH_QUARTZ_SLAB;
	public static final BlockRegistryObject PLATFORM_IRON_BLOCK;
	public static final BlockRegistryObject PLATFORM_IRON_BLOCK_INDENTED;
	public static final BlockRegistryObject PLATFORM_IRON_BLOCK_SLAB;
	public static final BlockRegistryObject PLATFORM_BAMBOO_PLANKS;
	public static final BlockRegistryObject PLATFORM_BAMBOO_PLANKS_INDENTED;
	public static final BlockRegistryObject PLATFORM_BAMBOO_PLANKS_SLAB;
	public static final BlockRegistryObject PLATFORM_CALCITE;
	public static final BlockRegistryObject PLATFORM_CALCITE_INDENTED;
	public static final BlockRegistryObject PLATFORM_CALCITE_SLAB;
	public static final BlockRegistryObject PLATFORM_POLISHED_BLACKSTONE;
	public static final BlockRegistryObject PLATFORM_POLISHED_BLACKSTONE_INDENTED;
	public static final BlockRegistryObject PLATFORM_POLISHED_BLACKSTONE_SLAB;
	public static final BlockRegistryObject PLATFORM_SMOOTH_BASALT;
	public static final BlockRegistryObject PLATFORM_SMOOTH_BASALT_INDENTED;
	public static final BlockRegistryObject PLATFORM_SMOOTH_BASALT_SLAB;
	public static final BlockRegistryObject PLATFORM_BONE;
	public static final BlockRegistryObject PLATFORM_BONE_INDENTED;
	public static final BlockRegistryObject PLATFORM_BONE_SLAB;
	public static final BlockRegistryObject PLATFORM_SEA_LANTERN;
	public static final BlockRegistryObject PLATFORM_SEA_LANTERN_INDENTED;
	public static final BlockRegistryObject PLATFORM_SEA_LANTERN_SLAB;
	public static final BlockRegistryObject PLATFORM_RCC;
	public static final BlockRegistryObject PLATFORM_RCC_INDENTED;
	public static final BlockRegistryObject PLATFORM_RCC_SLAB;

    public static final BlockRegistryObject GATE_HK_C3025;
    public static final BlockRegistryObject GATE_HK_C3025_EXIT;
    public static final BlockRegistryObject GATE_HK_C3025_COVER;
    public static final BlockRegistryObject GATE_HK_C5781;
	public static final BlockRegistryObject GATE_HK_C5781_EXIT;
    public static final BlockRegistryObject GATE_HK_C5781_COVER;
	public static final BlockRegistryObject GATE_HK_C1163;
	public static final BlockRegistryObject GATE_HK_C1163_EXIT;
	public static final BlockRegistryObject GATE_HK_C1163_COVER;
	public static final BlockRegistryObject GATE_HK_C762;
	public static final BlockRegistryObject GATE_HK_C762_EXIT;
	public static final BlockRegistryObject GATE_HK_C762_COVER;
	public static final BlockRegistryObject GATE_HK_C3025_WIDE;
	public static final BlockRegistryObject GATE_HK_C3025_WIDE_EXIT;
	public static final BlockRegistryObject GATE_HK_C3025_WIDE_FAKE;
	public static final BlockRegistryObject GATE_HK_C5781_WIDE;
	public static final BlockRegistryObject GATE_HK_C5781_WIDE_EXIT;
	public static final BlockRegistryObject GATE_HK_C5781_WIDE_FAKE;

	public static final BlockRegistryObject GATE_GLASS_FENCE_PLAIN;
	public static final BlockRegistryObject GATE_GLASS_FENCE_RIGHT_PLAIN;
	public static final BlockRegistryObject GLASS_FENCE_CORNER_INNER;
	public static final BlockRegistryObject GLASS_FENCE_CORNER_OUTER;


	public static void init() {
		Init.LOGGER.info("Registering BML's Transit Expansion blocks");
	}
}