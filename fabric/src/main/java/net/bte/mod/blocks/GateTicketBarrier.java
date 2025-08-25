package net.bte.mod.blocks;

import com.lx862.jcm.mod.data.BlockProperties;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.tool.HolderBase;
import org.mtr.mod.block.BlockTicketBarrier;
import org.mtr.mod.block.IBlock;
import org.mtr.mod.data.TicketSystem;

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
        return IBlock.getVoxelShapeByDirection(12, 0, 0, 16, 16, 16, facing);
    }



    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(TEXTURE);
        properties.add(NOTCOVER);
    }
}
