package net.atmcteam.atmcmod.datagen;

import net.atmcteam.atmcmod.block.ModBlocks;
import net.atmcteam.atmcmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        // Loot-Tabelle für SULFUR_ORE
        addDrop(ModBlocks.SULFUR_ORE, createOreDropBonus(ModBlocks.SULFUR_ORE, ModItems.SULFUR_DUST));

        // Loot-Tabelle für PITCH_COAL_ORE
        addDrop(ModBlocks.PITCH_COAL_ORE, createOreDropBonus(ModBlocks.PITCH_COAL_ORE, ModItems.PITCH_COAL));

        addDrop(ModBlocks.PURE_AMETHYST_ORE, createOreDrop(ModBlocks.PURE_AMETHYST_ORE, ModItems.PURE_AMETHYST_GEM));
    }

    private LootTable.Builder createOreDropBonus(Block block, net.minecraft.item.Item dropItem) {
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1)) // Anzahl der Drops
                        .with(ItemEntry.builder(dropItem)) // Das gedroppte Item
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3))) // 1 bis 3 Items können droppen
                        .conditionally(SurvivesExplosionLootCondition.builder()) // Überlebt Explosionen
                        .bonusRolls(UniformLootNumberProvider.create(0, 3)) // 0 bis 3 Bonus-Drops
                );
    }

    private LootTable.Builder createOreDrop(Block block, net.minecraft.item.Item dropItem) {
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1)) // Anzahl der Drops
                        .with(ItemEntry.builder(dropItem)) // Das gedroppte Item
                        .conditionally(SurvivesExplosionLootCondition.builder()) // Überlebt Explosionen
                );
    }
}
