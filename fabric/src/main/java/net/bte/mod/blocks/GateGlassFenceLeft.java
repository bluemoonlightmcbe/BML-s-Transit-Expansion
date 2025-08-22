package net.bte.mod.blocks;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockGlassFence;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;

import javax.annotation.Nonnull;
import java.util.List;

public class GateGlassFenceLeft extends BlockGlassFence {

    @Nonnull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        return IBlock.getStatePropertySafe(state, HALF) == DoubleBlockHalf.UPPER ? IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 12.0, 3.0, 3.0, facing) : IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 12.0, 16.0, 3.0, facing);
    }

    @Nonnull
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        return VoxelShapes.union(this.getOutlineShape2(state, world, pos, context), IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 12.0, 8.0, 3.0, facing));
    }

}
