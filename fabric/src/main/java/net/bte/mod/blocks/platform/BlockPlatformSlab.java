package net.bte.mod.blocks.platform;

import java.util.List;
import javax.annotation.Nonnull;

import net.bte.mod.blocks.nbt.platform;
import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.SlabBlockExtension;
import org.mtr.mapping.tool.HolderBase;

public class BlockPlatformSlab extends org.mtr.mod.block.BlockPlatformSlab {
    public BlockPlatformSlab(BlockSettings blockSettings) {
        super(blockSettings);
    }
    public static final EnumProperty STYLE = EnumProperty.of("style", platform.STYLE.class);


    @Override
    public void addBlockProperties(List<HolderBase<?>> properties) {
        super.addBlockProperties(properties);
        properties.add(STYLE);
    }
}
