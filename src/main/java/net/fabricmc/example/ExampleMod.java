package net.fabricmc.example;

import com.mojang.math.Matrix4f;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.level.BaseCommandBlock;
import net.minecraft.world.level.BaseSpawner;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Level level = null;
		level.getDimensionLocation();
		BaseCommandBlock baseCommandBlock = null;
		baseCommandBlock.getDimensionLocation();
		Matrix4f matrix4f = null;
		matrix4f.getDimensionLocation();
		LOGGER.info("Hello Fabric world!");
	}
}
