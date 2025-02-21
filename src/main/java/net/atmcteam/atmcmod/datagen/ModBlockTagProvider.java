package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.block.ModBlocks;
import net.atmcteam.atmcmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PURE_AMETHYST_ORE)
                .add(ModBlocks.SULFUR_ORE)
                .add(ModBlocks.PITCH_COAL_ORE)
                .add(ModBlocks.PITCH_COAL_BLOCK)
                .add(ModBlocks.PURE_AMETHYST_BLOCK)
                .add(ModBlocks.PURE_AMETHYST_NETHERITE_BLOCK)
                .add(ModBlocks.BUDDING_PURE_AMETHYST)
                .add(ModBlocks.SMOOTH_PURE_AMETHYST_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SULFUR_ORE)
                .add(ModBlocks.PITCH_COAL_ORE)
                .add(ModBlocks.PITCH_COAL_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PURE_AMETHYST_ORE)
                .add(ModBlocks.PURE_AMETHYST_BLOCK)
                .add(ModBlocks.BUDDING_PURE_AMETHYST)
                .add(ModBlocks.SMOOTH_PURE_AMETHYST_BLOCK);
        //Alles was mit diamond kann auch mit pure amethyst abgebaut werden
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PURE_AMETHYST_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);
    }
}
