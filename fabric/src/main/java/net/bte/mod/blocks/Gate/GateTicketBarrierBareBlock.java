package net.bte.mod.blocks.Gate;

import com.lx862.jcm.mod.block.ThalesTicketBarrierBareBlock;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.IBlock;

import java.util.List;

public class GateTicketBarrierBareBlock extends ThalesTicketBarrierBareBlock {
    public static final IntegerProperty TEXTURE = IntegerProperty.of("texture", 0, 10);

    public GateTicketBarrierBareBlock(BlockSettings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        boolean hasFence = IBlock.getStatePropertySafe(state, FENCE_TYPE) != 0;
        boolean flipped = IBlock.getStatePropertySafe(state, FLIPPED);
        VoxelShape mainBarrierShape = IBlock.getVoxelShapeByDirection((double)12.01F, (double)0.0F, (double)0.0F, (double)15.99F, (double)16.0F, (double)16.0F, IBlock.getStatePropertySafe(state, FACING));
        VoxelShape vx1;
        if (hasFence) {
            if (flipped) {
                vx1 = IBlock.getVoxelShapeByDirection((double)0.0F, (double)0.0F, (double)13.0F, (double)12.0F, (double)19.0F, (double)16.0F, IBlock.getStatePropertySafe(state, FACING));
            } else {
                vx1 = IBlock.getVoxelShapeByDirection((double)0.0F, (double)0.0F, (double)0.0F, (double)12.0F, (double)19.0F, (double)3.0F, IBlock.getStatePropertySafe(state, FACING));
            }
        } else {
            vx1 = VoxelShapes.empty();
        }

        return VoxelShapes.union(mainBarrierShape, vx1);

    }

    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(TEXTURE);
    }
}
