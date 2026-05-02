package net.bte.mod;


import com.lx862.jcm.mod.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.BlockEntityExtension;
import org.mtr.mapping.registry.*;
import org.mtr.mapping.tool.DummyClass;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Init {

	public static final String MOD_ID = "bte";
	public static final Logger LOGGER = LogManager.getLogger("BML's Transit Expansion");
	public static final Registry REGISTRY = new Registry();
	public static Identifier id(String id) {
		return new Identifier("bte", id);
	}
	public static <T extends BlockEntityExtension> BlockEntityTypeRegistryObject<T> registerBlockEntity(String id, BiFunction<BlockPos, BlockState, T> constructor, BlockRegistryObject associatedBlock) {
		Registry var10000 = REGISTRY;
		Identifier var10001 = id(id);
		Supplier[] var10003 = new Supplier[1];
		Objects.requireNonNull(associatedBlock);
		var10003[0] = associatedBlock::get;
		return var10000.registerBlockEntityType(var10001, constructor, var10003);
	}
	public static ItemRegistryObject registerItem(String id, Function<ItemSettings, Item> callback, CreativeModeTabHolder itemGroup) {
		return REGISTRY.registerItem(id(id), callback, new CreativeModeTabHolder[]{itemGroup});
	}

	public static BlockRegistryObject registerBlock(String id, Supplier<Block> supplier) {
		return REGISTRY.registerBlock(id(id), supplier);
	}

	public static void init() {
		Blocks.init();
		Items.init();
		CreativeModeTabs.init();
		SoundEvents.init();
		DummyClass.enableLogging();
		BlockEntities.init();

		// Finish registration
		REGISTRY.init();
	}

}
