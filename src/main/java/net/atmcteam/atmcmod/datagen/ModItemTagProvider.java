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
                .add(ModItems.PURE_AMETHYST_SWORD)
                .add(ModItems.PURE_AMETHYST_SABER)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.EMERALD_SABER)
                .add(ModItems.WITHERITE_SWORD)
                .add(ModItems.YAMATO)
                .add(ModItems.YAMATO_MAIN)
                .add(ModItems.PURE_AMETHYST_NETHERITE_SABER)
                .add(ModItems.IRON_SABER)
                .add(ModItems.DIAMOND_SABER)
                .add(ModItems.NETHERITE_SABER);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_PICKAXE)
                .add(ModItems.EMERALD_PICKAXE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_AXE)
                .add(ModItems.EMERALD_AXE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.PURE_AMETHYST_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL)
                .add(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.PURE_AMETHYST_HOE)
                .add(ModItems.EMERALD_HOE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.EMERALD_HELMET)
                .add(ModItems.EMERALD_CHESTPLATE)
                .add(ModItems.EMERALD_LEGGINGS)
                .add(ModItems.EMERALD_BOOTS)
                .add(ModItems.PURE_AMETHYST_NETHERITE_HELMET)
                .add(ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE)
                .add(ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS)
                .add(ModItems.PURE_AMETHYST_NETHERITE_BOOTS);
    }
}
