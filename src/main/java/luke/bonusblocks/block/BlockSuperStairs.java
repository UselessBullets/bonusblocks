package luke.bonusblocks.block;

import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

import java.util.ArrayList;

public class BlockSuperStairs extends BlockSuper {
    public BlockSuperStairs(String key, int id) {
        super(key, id);
    }
    @Override
    public boolean canPlaceOnSurfaceOnCondition(World world, int x, int y, int z) {
        return (world.getBlockMetadata(x, y, z) & 8) > 0;
    }
    public void getCollidingBoundingBoxes(World world, int x, int y, int z, AABB aabb, ArrayList aabbList) {
        float stepYOffset;
        int meta = world.getBlockMetadata(x, y, z);
        int hRotation = meta & 3;
        int vRotation = meta & 8;
        float f = stepYOffset = vRotation > 0 ? 0.5f : 0.0f;
        if (hRotation == 0) {
            this.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.0f, 0.5f, 0.5f + stepYOffset, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        } else if (hRotation == 1) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.5f, 0.0f + stepYOffset, 0.0f, 1.0f, 0.5f + stepYOffset, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        } else if (hRotation == 2) {
            this.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.0f, 1.0f, 0.5f + stepYOffset, 0.5f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        } else {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
            this.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.5f, 1.0f, 0.5f + stepYOffset, 1.0f);
            super.getCollidingBoundingBoxes(world, x, y, z, aabb, aabbList);
        }
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        ItemStack[] result = getModelBlock(world, x, y, z).getBreakResult(world, dropCause, x, y, z, 0, tileEntity);
        if (result != null) {
            for (ItemStack stack : result) {
                if (stack.itemID != getModelBlock(world, x, y, z).id) continue;
                stack.setMetadata(meta & 0xF0);
                stack.itemID = this.id;
            }
        }
        return result;
    }
    @Override
    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        Direction vRotation;
        System.out.println("Placed Side: " + side + " Height: " + sideHeight);
        int meta = world.getBlockMetadata(x, y, z) & 0xF0;
        Direction hRotation = entity.getHorizontalPlacementDirection(side).getOpposite();
        if (hRotation == Direction.NORTH) {
            meta |= 2;
        }
        if (hRotation == Direction.EAST) {
            meta |= 1;
        }
        if (hRotation == Direction.SOUTH) {
            meta |= 3;
        }
        if (hRotation == Direction.WEST) {
            meta |= 0;
        }
        if ((vRotation = entity.getVerticalPlacementDirection(side, sideHeight)) == Direction.DOWN) {
            meta |= 0;
        }
        if (vRotation == Direction.UP) {
            meta |= 8;
        }
        world.setBlockMetadataWithNotify(x, y, z, meta);
    }
}
