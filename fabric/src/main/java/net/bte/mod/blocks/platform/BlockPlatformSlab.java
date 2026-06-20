package net.bte.mod.blocks.platform;

import java.util.List;
import javax.annotation.Nonnull;

import net.bte.mod.blocks.nbt.platform;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

public class BlockPlatformSlab extends org.mtr.mod.block.BlockPlatformSlab {
    public BlockPlatformSlab(BlockSettings blockSettings) {
        super(blockSettings);
    }
    public static final EnumProperty STYLE = EnumProperty.of("style", platform.STYLE.class);


    @Nonnull
    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () ->
                {

                    final BlockState initialState = world.getBlockState(pos);
                    if (initialState.getBlock().data instanceof org.mtr.mod.block.BlockPlatform) {
                        ChangeDoorType(world, pos, initialState, state.get(new Property<>(DOOR_TYPE.data)).toString());
                    }

                    int[][] directions = {
                            {1, 0},  // East
                            {-1, 0}, // West
                            {0, 1},  // South
                            {0, -1}  // North
                    };

                    for (int[] dir : directions) {
                        int dx = dir[0];
                        int dz = dir[1];
                        boolean air = false;

                        for (int i = 1; !air; i++) {
                            BlockPos checkPos = pos.add(dx * i, 0, dz * i);
                            final BlockState scanState = world.getBlockState(checkPos);

                            if (scanState.getBlock().data instanceof org.mtr.mod.block.BlockPlatform) {
                                ChangeDoorType(world, checkPos, scanState, state.get(new Property<>(DOOR_TYPE.data)).toString());
                            } else {
                                air = true;
                            }
                        }
                    }

                }
        );
    }

    private void ChangeDoorType(World world, BlockPos pos, BlockState state, String nbt) {

        if (nbt == "NONE") {
            world.setBlockState(pos, state.with(new Property<>(DOOR_TYPE.data), EnumDoorType.PSD), 2 | 16);
        } else if (nbt == "PSD") {
            world.setBlockState(pos, state.with(new Property<>(DOOR_TYPE.data), EnumDoorType.APG), 2 | 16);
        } else if (nbt == "APG") {
            world.setBlockState(pos, state.with(new Property<>(DOOR_TYPE.data), EnumDoorType.NONE), 2 | 16);
        }
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        //properties.add(STYLE);
    }
}
