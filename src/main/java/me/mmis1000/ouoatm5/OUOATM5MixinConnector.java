package me.mmis1000.ouoatm5;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class OUOATM5MixinConnector implements IMixinConnector {
        @Override
        public void connect() {
                Mixins.addConfiguration(
                        "mixins.ouoatm5.json"
                );
        }
}
