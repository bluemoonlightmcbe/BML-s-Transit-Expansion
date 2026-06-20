package net.bte.mod;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.registry.*;
import org.mtr.mapping.tool.DummyClass;

public class Init {

	public static final String MOD_ID = "bte";
	public static final Logger LOGGER = LogManager.getLogger("BML's Transit Expansion");
	public static final Registry REGISTRY = new Registry();
	public static Identifier id(String id) {
		return new Identifier("bte", id);
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
