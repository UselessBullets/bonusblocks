package luke.bonusblocks.mixin;

import luke.bonusblocks.block.BlockSuperFence;
import luke.bonusblocks.block.TileEntityBlockContainer;
import net.minecraft.client.render.RenderBlocks;
import net.minecraft.core.block.Block;
import net.minecraft.core.world.WorldSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = RenderBlocks.class, remap = false)
public abstract class RenderBlocksMixin {
    @Shadow private WorldSource blockAccess;

    @Shadow public abstract boolean renderStandardBlock(Block block, int x, int y, int z);

    @Inject(method = "renderBlockByRenderType(Lnet/minecraft/core/block/Block;IIII)Z", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/block/Block;setBlockBoundsBasedOnState(Lnet/minecraft/core/world/World;III)V", shift = At.Shift.AFTER), cancellable = true)
    private void addRenderTypes(Block block, int renderType, int x, int y, int z, CallbackInfoReturnable<Boolean> cir){
        if (renderType == 686){
            cir.setReturnValue(renderModelBlockStairs(block, x, y, z));
        }
        if (renderType == 687){
            cir.setReturnValue(renderStandardBlock(block, x, y, z));
        }
        if (renderType == 688){
            cir.setReturnValue(renderBlockModelFence((BlockSuperFence) block, x, y, z));
        }
    }
    @Unique
    public boolean renderModelBlockStairs(Block block, int i, int j, int k) {
        float stepYOffset;
        boolean flag = false;
        block = ((TileEntityBlockContainer)blockAccess.getBlockTileEntity(i, j, k)).getModelBlock();
        int meta = this.blockAccess.getBlockMetadata(i, j, k);
        int hRotation = meta & 3;
        int vRotation = meta & 8;
        float f = stepYOffset = vRotation > 0 ? 0.5f : 0.0f;
        if (hRotation == 0) {
            block.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.0f, 0.5f, 0.5f + stepYOffset, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            block.setBlockBounds(0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            flag = true;
        } else if (hRotation == 1) {
            block.setBlockBounds(0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            block.setBlockBounds(0.5f, 0.0f + stepYOffset, 0.0f, 1.0f, 0.5f + stepYOffset, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            flag = true;
        } else if (hRotation == 2) {
            block.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.0f, 1.0f, 0.5f + stepYOffset, 0.5f);
            this.renderStandardBlock(block, i, j, k);
            block.setBlockBounds(0.0f, 0.0f, 0.5f, 1.0f, 1.0f, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            flag = true;
        } else if (hRotation == 3) {
            block.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f);
            this.renderStandardBlock(block, i, j, k);
            block.setBlockBounds(0.0f, 0.0f + stepYOffset, 0.5f, 1.0f, 0.5f + stepYOffset, 1.0f);
            this.renderStandardBlock(block, i, j, k);
            flag = true;
        }
        block.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        return flag;
    }
    @Unique
    public boolean renderBlockModelFence(BlockSuperFence blockfence, int i, int j, int k) {
        float f7;
        boolean flag = false;
        float f = 0.375f;
        float f1 = 0.625f;
        blockfence.setBlockBounds(f, 0.0f, f, f1, 1.0f, f1);
        blockfence.setBlockBounds(f, 0.0f, f, f1, 1.0f, f1);
        this.renderStandardBlock(blockfence, i, j, k);
        flag = true;
        boolean flag1 = false;
        boolean flag2 = false;
        if (blockfence.canConnectTo(this.blockAccess, i - 1, j, k) || blockfence.canConnectTo(this.blockAccess, i + 1, j, k)) {
            flag1 = true;
        }
        if (blockfence.canConnectTo(this.blockAccess, i, j, k - 1) || blockfence.canConnectTo(this.blockAccess, i, j, k + 1)) {
            flag2 = true;
        }
        boolean flag3 = blockfence.canConnectTo(this.blockAccess, i - 1, j, k);
        boolean flag4 = blockfence.canConnectTo(this.blockAccess, i + 1, j, k);
        boolean flag5 = blockfence.canConnectTo(this.blockAccess, i, j, k - 1);
        boolean flag6 = blockfence.canConnectTo(this.blockAccess, i, j, k + 1);
        if (!flag1 && !flag2) {
            flag1 = true;
        }
        f = 0.4375f;
        f1 = 0.5625f;
        float f2 = 0.75f;
        float f3 = 0.9375f;
        float f4 = flag3 ? 0.0f : f;
        float f5 = flag4 ? 1.0f : f1;
        float f6 = flag5 ? 0.0f : f;
        float f8 = f7 = flag6 ? 1.0f : f1;
        if (flag1) {
            blockfence.setBlockBounds(f4, f2, f, f5, f3, f1);
            this.renderStandardBlock(blockfence, i, j, k);
            flag = true;
        }
        if (flag2) {
            blockfence.setBlockBounds(f, f2, f6, f1, f3, f7);
            this.renderStandardBlock(blockfence, i, j, k);
            flag = true;
        }
        f2 = 0.375f;
        f3 = 0.5625f;
        if (flag1) {
            blockfence.setBlockBounds(f4, f2, f, f5, f3, f1);
            this.renderStandardBlock(blockfence, i, j, k);
            flag = true;
        }
        if (flag2) {
            blockfence.setBlockBounds(f, f2, f6, f1, f3, f7);
            this.renderStandardBlock(blockfence, i, j, k);
            flag = true;
        }
        blockfence.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        return flag;
    }
}
