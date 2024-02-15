package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockTileEntity;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.entity.player.EntityPlayer;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.block.ItemBlock;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockSuper extends BlockTileEntity {
    public BlockSuper(String key, int id) {
        super(key, id, Material.stone);
    }
    @Override
    public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
        ItemStack heldItem = player.getHeldItem();
        if (heldItem != null && heldItem.getItem() instanceof ItemBlock){
            Block block = ((ItemBlock)heldItem.getItem()).getBlock();
            if (block instanceof BlockSuper) return false;
            TileEntity entity = world.getBlockTileEntity(x, y, z);
            if (entity instanceof TileEntityBlockContainer){
                ((TileEntityBlockContainer)entity).modelBlock = block.id;
                player.addChatMessage("Block set to " + block.getKey());
                world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z));
                return true;
            }
        }
        return false;
    }
    @Override
    public int getRenderBlockPass() {
        return 1;
    }
    @Override
    protected TileEntity getNewBlockEntity() {
        return new TileEntityBlockContainer(Block.dirt.id);
    }
    public Block getModelBlock(WorldSource blockAccess, int x, int y, int z){
        TileEntity entity = blockAccess.getBlockTileEntity(x, y, z);
        if (entity instanceof TileEntityBlockContainer){
            return Block.blocksList[((TileEntityBlockContainer)blockAccess.getBlockTileEntity(x, y, z)).modelBlock];
        }
        return Block.dirt;
    }

    @Override
    public float getBlockBrightness(WorldSource blockAccess, int x, int y, int z) {
        return getModelBlock(blockAccess, x, y, z).getBlockBrightness(blockAccess, x, y, z);
    }
    @Override
    public int getBlockTexture(WorldSource blockAccess, int x, int y, int z, Side side) {
        return getModelBlock(blockAccess, x, y, z).getBlockTexture(blockAccess, x, y, z, side);
    }

    @Override
    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        return getModelBlock(world, x, y, z).getSelectedBoundingBoxFromPool(world, x, y, z);
    }
    @Override
    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public boolean isSolidRender() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
}
