package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.AMETHYST_SABER)
                .add(ModItems.AMETHYST_DAGGER)
                .add(ModItems.AMETHYST_BATTLEAXE)
                .add(ModItems.PURE_AMETHYST_SWORD)
                .add(ModItems.PURE_AMETHYST_SABER)
                .add(ModItems.PURE_AMETHYST_DAGGER)
                .add(ModItems.PURE_AMETHYST_BATTLEAXE)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.EMERALD_SABER)
                .add(ModItems.EMERALD_DAGGER)
                .add(ModItems.EMERALD_BATTLEAXE)
                .add(ModItems.WITHERITE_SWORD)
                .add(ModItems.JUSTIFIER)
                .add(ModItems.JUSTIFIER_MAIN)
                .add(ModItems.PURE_AMETHYST_NETHERITE_SWORD)
                .add(ModItems.PURE_AMETHYST_NETHERITE_SABER)
                .add(ModItems.PURE_AMETHYST_NETHERITE_DAGGER)
                .add(ModItems.PURE_AMETHYST_NETHERITE_BATTLEAXE)
                .add(ModItems.IRON_SABER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.IRON_BATTLEAXE)
                .add(ModItems.DIAMOND_SABER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.DIAMOND_BATTLEAXE)
                .add(ModItems.NETHERITE_SABER)
                .add(ModItems.NETHERITE_DAGGER)
                .add(ModItems.NETHERITE_BATTLEAXE)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.COPPER_SABER)
                .add(ModItems.COPPER_DAGGER)
                .add(ModItems.OXIDIZED_COPPER_BATTLEAXE)
                .add(ModItems.OXIDIZED_COPPER_SWORD)
                .add(ModItems.OXIDIZED_COPPER_SABER)
                .add(ModItems.OXIDIZED_COPPER_DAGGER)
                .add(ModItems.OXIDIZED_COPPER_BATTLEAXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_PICKAXE)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.OXIDIZED_COPPER_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_AXE)
                .add(ModItems.EMERALD_AXE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_AXE)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.OXIDIZED_COPPER_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.PURE_AMETHYST_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL)
                .add(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.OXIDIZED_COPPER_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.PURE_AMETHYST_HOE)
                .add(ModItems.EMERALD_HOE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_HOE)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.OXIDIZED_COPPER_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.PURE_AMETHYST_NETHERITE_HELMET)
                .add(ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS)
                .add(ModItems.PURE_AMETHYST_NETHERITE_BOOTS)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.OXIDIZED_COPPER_HELMET)
                .add(ModItems.OXIDIZED_COPPER_CHESTPLATE)
                .add(ModItems.OXIDIZED_COPPER_LEGGINGS)
                .add(ModItems.OXIDIZED_COPPER_BOOTS);
    }
}
