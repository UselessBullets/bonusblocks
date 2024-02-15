package luke.bonusblocks.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;
import net.minecraft.core.world.WorldSource;

public class BlockSuperFence extends BlockSuper{
    public BlockSuperFence(String key, int id) {
        super(key, id);
    }
    @Override
    public boolean canPlaceOnSurface() {
        return true;
    }
    @Override
    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        boolean connectXPos = this.canConnectTo(world, x + 1, y, z);
        boolean connectXNeg = this.canConnectTo(world, x - 1, y, z);
        boolean connectZPos = this.canConnectTo(world, x, y, z + 1);
        boolean connectZNeg = this.canConnectTo(world, x, y, z - 1);
        return AABB.getBoundingBoxFromPool((float)x + (connectXNeg ? 0.0f : 0.375f), y, (float)z + (connectZNeg ? 0.0f : 0.375f), (float)(x + 1) - (connectXPos ? 0.0f : 0.375f), (float)y + 1.5f, (float)(z + 1) - (connectZPos ? 0.0f : 0.375f));
    }

    @Override
    public AABB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        return this.getCollisionBoundingBoxFromPool(world, x, y, z).expand(0.0, -0.25, 0.0).offset(0.0, -0.25, 0.0);
    }

    @Override
    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        AABB aabb = this.getCollisionBoundingBoxFromPool(world, x, y, z);
        this.minX = aabb.minX - (double)x;
        this.minY = aabb.minY - (double)y;
        this.minZ = aabb.minZ - (double)z;
        this.maxX = aabb.maxX - (double)x;
        this.maxY = aabb.maxY - (double)y - 0.5;
        this.maxZ = aabb.maxZ - (double)z;
    }

    public boolean canConnectTo(WorldSource iblockaccess, int x, int y, int z) {
        int l = iblockaccess.getBlockId(x, y, z);
        return Block.hasTag(l, BlockTags.FENCES_CONNECT);
    }
}
