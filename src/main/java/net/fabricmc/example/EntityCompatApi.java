package net.fabricmc.example;

import net.minecraft.network.chat.Component;

import java.util.UUID;

public interface EntityCompatApi {
    default void sendMessageCompat(Component component, UUID uuid) {
        throw new UnsupportedOperationException();
    }
}