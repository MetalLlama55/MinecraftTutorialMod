package com.tutorialmod;

import com.tutorialmod.block.ModBlocks;
import com.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems(); //Needed so that items can be added on startup
		ModBlocks.registerModBlocks();
	}
}