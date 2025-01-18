package net.atmcteam.atmcmod;

import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATMCMod implements ModInitializer {
	public static final String MOD_ID = "atmcmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}