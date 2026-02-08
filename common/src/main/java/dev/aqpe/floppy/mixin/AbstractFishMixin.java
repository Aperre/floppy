package dev.aqpe.floppy.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.world.entity.animal.AbstractFish.class)
public abstract class AbstractFishMixin{

    @Inject(at = @At("TAIL"), method = "aiStep")
    public void moveTowardsWater(CallbackInfo ci) {
        AbstractFish self = (AbstractFish) (Object) this;
        if (self.isInWater()) return;
        BlockPos pos = self.blockPosition();
        BlockPos nearestWater = null;
        double nearestDist = Double.MAX_VALUE;
        int radius = 5;
        for (int x = -radius; x <= radius; x++) {
            for (int y = -2; y <= 2; y++) {
                for (int z = -radius; z <= radius; z++){
                    BlockPos blockPos = pos.offset(x,y,z);

                    if (self.level().getBlockState(blockPos).is(Blocks.WATER)) {
                        double dist = blockPos.distSqr(pos);
                        if (dist < nearestDist) {
                            nearestDist = dist;
                            nearestWater = blockPos;
                        }
                    }
                }
            }
        }
        if (nearestWater == null) return;

        Vec3 dir = Vec3.atCenterOf(nearestWater)
                .subtract(self.position())
                .normalize()
                .multiply(1,0,1)
                .scale(0.005);

        self.setDeltaMovement(self.getDeltaMovement().add(dir));
    }
}
