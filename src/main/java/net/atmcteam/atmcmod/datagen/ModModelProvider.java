package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.block.ModBlocks;
import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_AMETHYST_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SULFUR_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PITCH_COAL_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMETHYST_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YAMATO, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YAMATO_MAIN, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SULFUR_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PITCH_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SABER, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_BOOTS));
    }
}
