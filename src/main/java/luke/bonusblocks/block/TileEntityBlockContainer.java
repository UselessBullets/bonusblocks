package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.entity.TileEntity;

public class TileEntityBlockContainer extends TileEntity {
    public TileEntityBlockContainer(int block){
        this.modelBlock = block;
    }
    public int modelBlock;
    public Block getModelBlock(){
        return Block.blocksList[modelBlock];
    }
}
