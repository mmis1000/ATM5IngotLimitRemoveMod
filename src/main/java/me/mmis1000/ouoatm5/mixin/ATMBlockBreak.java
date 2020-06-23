package me.mmis1000.ouoatm5.mixin;

import com.thevortex.allthemodium.events.BlockBreak;
import net.minecraftforge.event.world.BlockEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BlockBreak.class, remap = false)
public class ATMBlockBreak {
    @Inject(method = "on(Lnet/minecraftforge/event/world/BlockEvent$BreakEvent;)V", at = @At("HEAD"), remap = false, cancellable = true)
    private static void onBlockBreak(BlockEvent.BreakEvent event, CallbackInfo ci) {
        ci.cancel();
    }
}
