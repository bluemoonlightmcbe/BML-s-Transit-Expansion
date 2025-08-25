package net.bte.mod.blocks;


import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;

import java.util.List;

public class GateWideTicketBarrier extends BlockTicketBarrier {
    public GateWideTicketBarrier(boolean isEntrance) {
        super(isEntrance);
    }
    public static final IntegerProperty TEXTURE = IntegerProperty.of("texture", 0, 10);

    @Override
    public VoxelShape getOutlineShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        return IBlock.getVoxelShapeByDirection(12, 0, -8, 16, 16, 24, facing);
    }
    @Override
    public VoxelShape getCollisionShape2(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction facing = IBlock.getStatePropertySafe(state, FACING);
        TicketSystem.EnumTicketBarrierOpen open = IBlock.getStatePropertySafe(state, new Property<>(OPEN.data));
        VoxelShape base = IBlock.getVoxelShapeByDirection(15.0, 0.0, -8.0, 16.0, 24.0, 24.0, facing);
        return open != TicketSystem.EnumTicketBarrierOpen.OPEN && open != TicketSystem.EnumTicketBarrierOpen.OPEN_CONCESSIONARY ? VoxelShapes.union(IBlock.getVoxelShapeByDirection(0.0, 0.0, 7.0, 16.0, 24.0, 9.0, facing), base) : base;
    }


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(TEXTURE);
    }
}
