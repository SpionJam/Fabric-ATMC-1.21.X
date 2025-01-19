package net.atmcteam.atmcmod.block;

import net.atmcteam.atmcmod.ATMCMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Helper-Method
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ATMCMod.MOD_ID, name), block);
    }

    //Helper-Method
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ATMCMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ATMCMod.LOGGER.info("Registering Mod Blocks for " + ATMCMod.MOD_ID);
    }
}
