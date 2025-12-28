package net.bte.mod.blocks.platform;

import com.lx862.jcm.mod.block.entity.PIDSBlockEntity;
import com.lx862.jcm.mod.network.gui.ClientHelper;
import com.lx862.jcm.mod.network.gui.PIDSGUIPacket;
import com.lx862.jcm.mod.registry.Networking;
import net.bte.mod.blocks.nbt.platform;
import net.bte.mod.packet.PacketOpenPlatformSettingScreen;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.Init;
import org.mtr.mod.block.BlockTrainSensorBase;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;
import org.mtr.mod.generated.lang.TranslationProvider;
import org.mtr.mod.packet.PacketOpenBlockEntityScreen;
import org.mtr.mod.packet.PacketOpenTicketMachineScreen;


import javax.annotation.Nonnull;
import java.util.List;

import static org.mtr.mod.block.IBlock.HALF;

public class BlockPlatform extends org.mtr.mod.block.BlockPlatform {
    private final boolean isIndented;


    public BlockPlatform(BlockSettings blockSettings, boolean isIndented) {
        super(blockSettings, isIndented);
        this.isIndented = isIndented;
    }





/*
    @Nonnull
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()) {
            Init.REGISTRY.sendPacketToClient(ServerPlayerEntity.cast(player), new PacketOpenPlatformSettingScreen(TicketSystem.getBalance(world, player)));
        }

        return ActionResult.SUCCESS;
    }

    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> {
                Init.REGISTRY.sendPacketToClient(ServerPlayerEntity.cast(player), new PacketOpenPlatformSettingScreen(TicketSystem.getBalance(world, player)));

        });
    }
    */

    public static final EnumProperty STYLE = EnumProperty.of("style", platform.STYLE.class);


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(STYLE);
    }
}

