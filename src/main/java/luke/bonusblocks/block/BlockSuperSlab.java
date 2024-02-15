package luke.bonusblocks.block;

import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.entity.EntityLiving;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Direction;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.util.phys.AABB;
import net.minecraft.core.world.World;

public class BlockSuperSlab extends BlockSuper {

    public BlockSuperSlab(String key, int id) {
        super(key, id);
    }
    @Override
    public void onBlockPlaced(World world, int x, int y, int z, Side side, EntityLiving entity, double sideHeight) {
        Direction dir = entity.getVerticalPlacementDirection(side, sideHeight);
        if (dir == Direction.DOWN) {
            world.setBlockMetadataWithNotify(x, y, z, 0);
        }
        if (dir == Direction.UP) {
            world.setBlockMetadataWithNotify(x, y, z, 2);
        }
    }
    @Override
    public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
        ItemStack[] result = getModelBlock(world, x, y, z).getBreakResult(world, dropCause, x, y, z, world.getBlockMetadata(x, y, z), tileEntity);
        if (result != null) {
            for (ItemStack stack : result) {
                if (stack.itemID != getModelBlock(world, x, y, z).id) continue;
                stack.setMetadata(meta & 0xF0);
                stack.itemID = this.id;
                stack.stackSize = (meta & 3) == 1 && dropCause != EnumDropCause.PICK_BLOCK ? 2 : 1;
            }
        }
        return result;
    }
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
    }

    @Override
    public boolean renderAsNormalBlockOnCondition(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        return (meta & 3) == 1;
    }

    @Override
    public boolean canPlaceOnSurfaceOnCondition(World world, int x, int y, int z) {
        int meta = world.getBlockMetadata(x, y, z);
        return (meta & 3) != 0;
    }
    @Override
    public void setBlockBoundsBasedOnState(World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z) & 3;
        if (l == 0) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else if (l == 1) {
            this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else if (l == 2) {
            this.setBlockBounds(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public AABB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z) & 3;
        if (l == 0) {
            return AABB.getBoundingBoxFromPool(x, y, z, (float)x + 1.0f, (float)y + 0.5f, (float)z + 1.0f);
        }
        if (l == 1) {
            return AABB.getBoundingBoxFromPool(x, y, z, x + 1, (float)y + 1.0f, (float)z + 1.0f);
        }
        return AABB.getBoundingBoxFromPool(x, (float)y + 0.5f, z, (float)x + 1.0f, (float)y + 1.0f, (float)z + 1.0f);
    }
}
