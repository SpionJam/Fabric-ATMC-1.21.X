package net.atmcteam.atmcmod;

import net.atmcteam.atmcmod.datagen.ModBlockTagProvider;
import net.atmcteam.atmcmod.datagen.ModItemTagProvider;
import net.atmcteam.atmcmod.datagen.ModModelProvider;
import net.atmcteam.atmcmod.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ATMCModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        // Adding a provider example:
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        // pack.addProvider(AdvancementsProvider::new);
    }

}
