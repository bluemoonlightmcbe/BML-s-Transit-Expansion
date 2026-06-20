package net.bte.mod.blocks.GlassFence;

import org.mtr.mapping.holder.*;
import org.mtr.mod.block.BlockGlassFence;
import org.mtr.mod.block.IBlock;
import javax.annotation.Nonnull;

public class GlassFenceGateLeft extends BlockGlassFence {

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
