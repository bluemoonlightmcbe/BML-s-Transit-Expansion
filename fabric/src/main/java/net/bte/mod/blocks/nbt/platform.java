package net.bte.mod.blocks.nbt;

import com.lx862.jcm.mod.block.entity.SubsidyMachineBlockEntity;
import com.lx862.jcm.mod.network.gui.SubsidyMachineGUIPacket;
import com.lx862.jcm.mod.registry.Networking;
import com.lx862.jcm.mod.util.TextCategory;
import com.lx862.jcm.mod.util.TextUtil;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import org.mtr.mapping.holder.*;
import org.mtr.mod.block.IBlock;

import javax.annotation.Nonnull;
import java.util.UUID;

public class platform {
    private static final Object2LongOpenHashMap<UUID> cooldownMap = new Object2LongOpenHashMap();


        public static enum STYLE implements StringIdentifiable {
            MTR("mtr"),
            TIANJIN("tianjin"),
            TIANJIN_11("tianjin_line_11"),
            RCC("rcc"),
            CUSTOM_1("custom_1"),
            CUSTOM_2("custom_2");

            private final String name;

            private STYLE(String nameIn) {
                this.name = nameIn;
            }

            @Nonnull
            public String asString2() {
                return this.name;
            }
        }
}
