package net.fabricmc.example.mixin;

import net.fabricmc.example.EntityCompatApi;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.UUID;

@Mixin(Entity.class)
public abstract class MixinEntity implements EntityCompatApi {
    @Shadow
    public abstract void sendMessage(Component component, UUID uUID);

    @Override
    public void sendMessageCompat(Component component, UUID uuid) {
        this.sendMessage(component, uuid);
    }
}
