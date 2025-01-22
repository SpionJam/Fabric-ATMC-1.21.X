package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.PURE_AMETHYST_SWORD)
                .add(ModItems.EMERALD_SWORD)
                .add(ModItems.WITHERITE_SWORD)
                .add(ModItems.YAMATO)
                .add(ModItems.YAMATO_MAIN);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.PURE_AMETHYST_PICKAXE)
                .add(ModItems.EMERALD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.PURE_AMETHYST_AXE)
                .add(ModItems.EMERALD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.PURE_AMETHYST_SHOVEL)
                .add(ModItems.EMERALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.PURE_AMETHYST_HOE)
                .add(ModItems.EMERALD_HOE);
    }
}
