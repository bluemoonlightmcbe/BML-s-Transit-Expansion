package net.bte.mod.blocks.Gate;

import com.lx862.jcm.mod.block.base.DirectionalBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

import java.util.List;

public class GateWideFake extends DirectionalBlock {
    public static final IntegerProperty WITHCOVER = IntegerProperty.of("withcover", 0, 3);

    public GateWideFake(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {

        VoxelShape mainBarrierShape = IBlock.getVoxelShapeByDirection(12.01, 0, -8, 15.99, 16, 24, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape vx1 = VoxelShapes.empty();

        return VoxelShapes.union(mainBarrierShape, vx1);
    }

    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {

        VoxelShape mainBarrierShape = IBlock.getVoxelShapeByDirection(12.01, 0, -8, 15.99, 24, 24, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape GateBlockShape = IBlock.getVoxelShapeByDirection(0.01, 0, 7, 15.99, 24, 9, IBlock.getStatePropertySafe(state, FACING));

        return VoxelShapes.union(mainBarrierShape, GateBlockShape);
    }

    //Let the state of it can change by brush
    @Override
    public ActionResult onUse2(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return IBlock.checkHoldingBrush(world, player, () -> {
            int currentType = state.get(new Property<>(WITHCOVER.data));
            int nextType = 0;
            if (currentType == 3) {
                nextType = 0;
            } else {
                nextType = (currentType + 1);
            }

            world.setBlockState(pos, state.with(new Property<>(WITHCOVER.data), nextType));
        });
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(WITHCOVER);
    }
}
