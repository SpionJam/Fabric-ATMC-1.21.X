package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.block.ModBlocks;
import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD)
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE)
                .pattern(" AA")
                .pattern(" SA")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL)
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE)
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .input('A', Items.AMETHYST_SHARD)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET)
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE)
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS)
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS)
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .input('A', Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.END_GLOWSTONE_DUST, 8)
                .pattern("GGG")
                .pattern("GEG")
                .pattern("GGG")
                .input('G', Items.GLOWSTONE_DUST)
                .input('E', ModItems.END_ESSENCE)
                .criterion(hasItem(ModItems.END_ESSENCE), conditionsFromItem(ModItems.END_ESSENCE))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.END_GLOWSTONE)
                .pattern("EE")
                .pattern("EE")
                .input('E', ModItems.END_GLOWSTONE_DUST)
                .criterion(hasItem(ModItems.END_GLOWSTONE_DUST), conditionsFromItem(ModItems.END_GLOWSTONE_DUST))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SWORD)
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_SABER)
                .pattern("  C")
                .pattern(" C ")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_DAGGER)
                .pattern(" C")
                .pattern(" S")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BATTLEAXE)
                .pattern("CCC")
                .pattern("CSC")
                .pattern(" S ")
                .input('C', Items.COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_HELMET)
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE)
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS)
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .input('C', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_SWORD)
                .pattern(" O ")
                .pattern(" O ")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OXIDIZED_COPPER_PICKAXE)
                .pattern("OOO")
                .pattern(" S ")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OXIDIZED_COPPER_AXE)
                .pattern(" OO")
                .pattern(" SO")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OXIDIZED_COPPER_SHOVEL)
                .pattern(" O ")
                .pattern(" S ")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.OXIDIZED_COPPER_HOE)
                .pattern(" OO")
                .pattern(" S ")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_SABER)
                .pattern("  O")
                .pattern(" O ")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_DAGGER)
                .pattern(" O")
                .pattern(" S")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_BATTLEAXE)
                .pattern("OOO")
                .pattern("OSO")
                .pattern(" S ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_HELMET)
                .pattern("OOO")
                .pattern("O O")
                .pattern("   ")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_CHESTPLATE)
                .pattern("O O")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_LEGGINGS)
                .pattern("OOO")
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.OXIDIZED_COPPER_BOOTS)
                .pattern("   ")
                .pattern("O O")
                .pattern("O O")
                .input('O', ModItems.OXIDIZED_COPPER_INGOT)
                .criterion(hasItem(ModItems.OXIDIZED_COPPER_INGOT), conditionsFromItem(ModItems.OXIDIZED_COPPER_INGOT))
                .offerTo(recipeExporter);
    }


}
