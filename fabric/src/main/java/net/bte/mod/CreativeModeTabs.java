package net.bte.mod;

import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.holder.ItemConvertible;
import org.mtr.mapping.holder.ItemStack;
import org.mtr.mapping.registry.CreativeModeTabHolder;

public final class CreativeModeTabs {

	static {
		MOD_PLATFORM = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "platform"), () -> new ItemStack(new ItemConvertible(Blocks.PLATFORM_LIGHT_BLUE_QUARTZ_BLOCK.get().data)));
		MOD_GATE = Init.REGISTRY.createCreativeModeTabHolder(new Identifier(Init.MOD_ID, "gate"), () -> new ItemStack(new ItemConvertible(Blocks.GATE_HK_C3025.get().data)));
	}

	public static final CreativeModeTabHolder MOD_PLATFORM;
	public static final CreativeModeTabHolder MOD_GATE;

	public static void init() {
		Init.LOGGER.info("Registering BML's Transit Expansion creative mode tabs");
	}
}
