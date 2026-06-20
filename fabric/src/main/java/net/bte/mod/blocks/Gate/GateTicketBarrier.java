package net.bte.mod.blocks.Gate;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.block.PlatformHelper;

import javax.annotation.Nonnull;
import java.util.List;

public class GateTicketBarrier extends BlockTicketBarrier {
    public GateTicketBarrier(boolean isEntrance) {
        super(isEntrance);
    }
    public static final IntegerProperty TEXTURE = IntegerProperty.of("texture", 0, 10);
    public static final BooleanProperty NOTCOVER = BooleanProperty.of("notcover");

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        return IBlock.getVoxelShapeByDirection(12.01, 0, 0, 15.99, 16, 16, facing);
    }

    //Let the cover state of it can change by brush
    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> {
            boolean currentType = state.get(new Property<>(NOTCOVER.data));
            if (currentType == true) {
                currentType = false;
            } else {
                currentType = true;
            }

            world.setBlockState(pos, state.with(new Property<>(NOTCOVER.data), currentType));
        });
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(TEXTURE);
        properties.add(NOTCOVER);
    }
}
