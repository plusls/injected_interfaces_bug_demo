package net.fabricmc.example;

import net.minecraft.world.level.Level;

public interface LevelCompatApi {
    default Level getLevel() {
        throw new UnsupportedOperationException();
    }

}