package net.bte.mod;

import org.mtr.mapping.holder.Item;
import org.mtr.mapping.holder.ItemSettings;
import org.mtr.mapping.registry.ItemRegistryObject;

public class Items {

	//public static final ItemRegistryObject PLATFORM_BRUSH;

	static {
		//PLATFORM_BRUSH = Init.REGISTRY.registerItem(new org.mtr.mapping.holder.Identifier(Init.MOD_ID, "platform_brush"), itemSettings -> new Item(itemSettings), CreativeModeTabs.MOD_PLATFORM);
	}

	public static void init() {
		org.mtr.mod.Init.LOGGER.info("Registering BML's Transit Expansion items");
	}
}


