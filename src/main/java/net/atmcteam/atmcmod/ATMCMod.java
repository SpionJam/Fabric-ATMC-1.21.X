package net.atmcteam.atmcmod;

import net.atmcteam.atmcmod.block.ModBlocks;
import net.atmcteam.atmcmod.item.ModItemGroups;
import net.atmcteam.atmcmod.item.ModItems;
import net.atmcteam.atmcmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATMCMod implements ModInitializer {
	public static final String MOD_ID = "atmcmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Registriere Item-Gruppen
		ModItemGroups.registerItemGroups();

		// Registriere Items und Blöcke
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Generiere Welten
		ModWorldGeneration.generateModWorldGen();

		// Brennwert von Pitch Coal festlegen
		FuelRegistry.INSTANCE.add(ModItems.PITCH_COAL, 2400); // ca. 120 Sekunden Brenndauer

	}

}
