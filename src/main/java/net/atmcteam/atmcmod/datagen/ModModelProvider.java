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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PITCH_COAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_AMETHYST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURE_AMETHYST_NETHERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BUDDING_PURE_AMETHYST);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SMOOTH_PURE_AMETHYST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_GLOWSTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AMETHYST_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.EMERALD_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.JUSTIFIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARCEL_MAIN, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WITHERITE_DOUBLE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_NETHERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SULFUR_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.PITCH_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURE_AMETHYST_CARROT, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.END_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_ESSENCE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOREST_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOREST_ESSENCE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCEAN_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OCEAN_ESSENCE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_ESSENCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHER_ESSENCE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_GLOWSTONE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OXIDIZED_COPPER_BATTLEAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_SABER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.QUARTZ_BATTLEAXE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AMETHYST_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.EMERALD_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PURE_AMETHYST_NETHERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COPPER_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OXIDIZED_COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OXIDIZED_COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OXIDIZED_COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OXIDIZED_COPPER_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUARTZ_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUARTZ_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUARTZ_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.QUARTZ_BOOTS));
    }
}
