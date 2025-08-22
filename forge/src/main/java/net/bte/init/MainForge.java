package net.bte.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.bte.mod.Init;
import net.bte.mod.InitClient;

@Mod(Init.MOD_ID)
public class MainForge {

	public MainForge() {
		Init.init();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> InitClient::init);
	}
}
