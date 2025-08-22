package net.bte.mod;

import net.bte.Filters.RegisterItem;
import org.mtr.mapping.holder.RenderLayer;
import org.mtr.mapping.registry.RegistryClient;


public class InitClient {

	public static final RegistryClient REGISTRY_CLIENT = new RegistryClient(Init.REGISTRY);

	public static void init() {

		RegisterItem.Filters.init();

		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_IRON_BLOCK);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_CONCRETE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_CONCRETE_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_CONCRETE_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_QUARTZ_BLOCK);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_QUARTZ_BLOCK_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_QUARTZ_BLOCK_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_QUARTZ);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_QUARTZ_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_QUARTZ_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_QUARTZ_BLOCK_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_YELLOW_SMOOTH_QUARTZ_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_LIGHT_BLUE_SMOOTH_QUARTZ_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_IRON_BLOCK);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_IRON_BLOCK_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_IRON_BLOCK_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BAMBOO_PLANKS);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BAMBOO_PLANKS_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BAMBOO_PLANKS_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_CALCITE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_CALCITE_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_CALCITE_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_POLISHED_BLACKSTONE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_POLISHED_BLACKSTONE_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_POLISHED_BLACKSTONE_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_BASALT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_BASALT_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SMOOTH_BASALT_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BONE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BONE_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_BONE_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SEA_LANTERN);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SEA_LANTERN_INDENTED);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getCutout(), Blocks.PLATFORM_SEA_LANTERN_SLAB);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_HK_C3025);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_HK_C3025_EXIT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_HK_C3025_COVER);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_HK_C3025_WIDE);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_HK_C3025_WIDE_EXIT);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_GLASS_FENCE_PLAIN);
		REGISTRY_CLIENT.registerBlockRenderType(RenderLayer.getTranslucent(), Blocks.GATE_GLASS_FENCE_RIGHT_PLAIN);
		//RegistryClient.registerBlockEntityRenderer(BlockEntityTypes.STATION_NAME_SIGN_1, RenderStationNameSign::new);

		REGISTRY_CLIENT.init();
	}
}
