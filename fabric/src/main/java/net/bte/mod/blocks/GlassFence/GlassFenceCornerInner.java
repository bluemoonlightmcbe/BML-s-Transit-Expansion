package net.bte.mod.blocks.GlassFence;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockGlassFence;
import org.mtr.mod.block.IBlock;
import javax.annotation.Nonnull;
import java.util.List;

public class GlassFenceCornerInner extends BlockGlassFence {

    public static final BooleanProperty NOTFLIPPED = BooleanProperty.of("notflipped");

    @Nonnull
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        VoxelShape BaseTopPart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 3.0, 3.0, facing);
        VoxelShape LeftTopPart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 3.0, 3.0,  16.0, facing);
        VoxelShape RightTopPart = IBlock.getVoxelShapeByDirection(13.0, 0.0, 0.0, 16.0, 3.0,  16.0, facing);
        VoxelShape BaseLowerPart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 16.0, 16.0, 3.0, facing);
        VoxelShape LeftLowerPart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 3.0, 16.0,  16.0, facing);
        VoxelShape RightLowerPart = IBlock.getVoxelShapeByDirection(13.0, 0.0, 0.0, 16.0, 16.0,  16.0, facing);

        VoxelShape ResultLeft = IBlock.getStatePropertySafe(state, HALF) == DoubleBlockHalf.UPPER ? VoxelShapes.union(BaseTopPart, LeftTopPart) : VoxelShapes.union(BaseLowerPart, LeftLowerPart);
        VoxelShape ResultRight = IBlock.getStatePropertySafe(state, HALF) == DoubleBlockHalf.UPPER ? VoxelShapes.union(BaseTopPart, RightTopPart) : VoxelShapes.union(BaseLowerPart, RightLowerPart);
        return state.get(new Property<>(NOTFLIPPED.data)) ? ResultLeft : ResultRight;
    }

    @Nonnull
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);

        VoxelShape BasePart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 12.0, 8.0, 3.0, facing);

        VoxelShape LeftPart = IBlock.getVoxelShapeByDirection(0.0, 0.0, 0.0, 3.0, 8.0, 12.0, facing);
        VoxelShape RightPart = IBlock.getVoxelShapeByDirection(13.0, 0.0, 0.0, 16.0, 8.0, 16.0, facing);

        return VoxelShapes.union(this.getOutlineShape2(state, world, pos, context), VoxelShapes.union(BasePart, state.get(new Property<>(NOTFLIPPED.data)) ? LeftPart : RightPart));
    }


    //change the Flip state
    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> {
            boolean currentType = state.get(new Property<>(NOTFLIPPED.data));
            if (currentType == true) {
                currentType = false;
            } else {
                currentType = true;
            }

            world.setBlockState(pos, state.with(new Property<>(NOTFLIPPED.data), currentType));
            if (IBlock.getStatePropertySafe(state, HALF) == DoubleBlockHalf.UPPER) {
                world.setBlockState(pos.add(0, -1, 0), world.getBlockState(pos.add(0, -1, 0)).with(new Property<>(NOTFLIPPED.data), currentType));
            } else {
                world.setBlockState(pos.add(0, 1, 0), world.getBlockState(pos.add(0, 1, 0)).with(new Property<>(NOTFLIPPED.data), currentType));
            }
        });
    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(NOTFLIPPED);
    }
}
