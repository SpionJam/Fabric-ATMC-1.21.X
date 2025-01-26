package net.atmcteam.atmcmod.block;

import net.atmcteam.atmcmod.ATMCMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AmethystBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PURE_AMETHYST_ORE = registerBlock("pure_amethyst_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block PURE_AMETHYST_BLOCK = registerBlock("pure_amethyst_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block BUDDING_PURE_AMETHYST = registerBlock("budding_pure_amethyst",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SMOOTH_PURE_AMETHYST_BLOCK = registerBlock("smooth_pure_amethyst_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block SULFUR_ORE = registerBlock("sulfur_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block PITCH_COAL_ORE = registerBlock("pitch_coal_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block END_GLOWSTONE = registerBlock("end_glowstone",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.3f)           // Blockstärke
                    .sounds(BlockSoundGroup.GLASS)
                    .luminance(blockState -> 15)));  // Luminanz als Funktion auf Basis des Blockzustands



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
