package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
import net.atmcteam.atmcmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ATMC_MOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ATMCMod.MOD_ID, "atmc_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PURE_AMETHYST_SHARD))
                    .displayName(Text.translatable("itemgroup.atmcmod.atmc_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AMETHYST_SWORD);
                        entries.add(ModItems.AMETHYST_PICKAXE);
                        entries.add(ModItems.AMETHYST_AXE);
                        entries.add(ModItems.AMETHYST_SHOVEL);
                        entries.add(ModItems.AMETHYST_HOE);
                        entries.add(ModItems.AMETHYST_SABER);
                        entries.add(ModItems.AMETHYST_DAGGER);
                        entries.add(ModItems.AMETHYST_BATTLEAXE);
                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);
                        entries.add(ModItems.PURE_AMETHYST_SHARD);
                        entries.add(ModItems.PURE_AMETHYST_GEM);
                        entries.add(ModItems.PURE_AMETHYST_SWORD);
                        entries.add(ModItems.PURE_AMETHYST_PICKAXE);
                        entries.add(ModItems.PURE_AMETHYST_AXE);
                        entries.add(ModItems.PURE_AMETHYST_SHOVEL);
                        entries.add(ModItems.PURE_AMETHYST_HOE);
                        entries.add(ModItems.PURE_AMETHYST_SABER);
                        entries.add(ModItems.PURE_AMETHYST_DAGGER);
                        entries.add(ModItems.PURE_AMETHYST_BATTLEAXE);
                        entries.add(ModItems.PURE_AMETHYST_HELMET);
                        entries.add(ModItems.PURE_AMETHYST_CHESTPLATE);
                        entries.add(ModItems.PURE_AMETHYST_LEGGINGS);
                        entries.add(ModItems.PURE_AMETHYST_BOOTS);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_SABER);
                        entries.add(ModItems.EMERALD_DAGGER);
                        entries.add(ModItems.EMERALD_BATTLEAXE);
                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SWORD);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_AXE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_HOE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SABER);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_DAGGER);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_BATTLEAXE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_HELMET);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_BOOTS);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_INGOT);
                        entries.add(ModItems.SULFUR_DUST);
                        entries.add(ModItems.PITCH_COAL);
                        entries.add(ModItems.PURE_AMETHYST_APPLE);
                        entries.add(ModItems.PURE_AMETHYST_CARROT);
                        entries.add(ModItems.IRON_SABER);
                        entries.add(ModItems.IRON_DAGGER);
                        entries.add(ModItems.IRON_BATTLEAXE);
                        entries.add(ModItems.DIAMOND_SABER);
                        entries.add(ModItems.DIAMOND_DAGGER);
                        entries.add(ModItems.DIAMOND_BATTLEAXE);
                        entries.add(ModItems.NETHERITE_SABER);
                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.NETHERITE_BATTLEAXE);
                        entries.add(ModItems.END_ESSENCE);
                        entries.add(ModItems.END_ESSENCE_INGOT);
                        entries.add(ModItems.FOREST_ESSENCE);
                        entries.add(ModItems.FOREST_ESSENCE_INGOT);
                        entries.add(ModItems.OCEAN_ESSENCE);
                        entries.add(ModItems.OCEAN_ESSENCE_INGOT);
                        entries.add(ModItems.NETHER_ESSENCE);
                        entries.add(ModItems.NETHER_ESSENCE_INGOT);
                        entries.add(ModItems.END_GLOWSTONE_DUST);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_SABER);
                        entries.add(ModItems.COPPER_DAGGER);
                        entries.add(ModItems.COPPER_BATTLEAXE);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(ModItems.OXIDIZED_COPPER_INGOT);
                        entries.add(ModItems.OXIDIZED_COPPER_SWORD);
                        entries.add(ModItems.OXIDIZED_COPPER_PICKAXE);
                        entries.add(ModItems.OXIDIZED_COPPER_AXE);
                        entries.add(ModItems.OXIDIZED_COPPER_SHOVEL);
                        entries.add(ModItems.OXIDIZED_COPPER_HOE);
                        entries.add(ModItems.OXIDIZED_COPPER_SABER);
                        entries.add(ModItems.OXIDIZED_COPPER_DAGGER);
                        entries.add(ModItems.OXIDIZED_COPPER_BATTLEAXE);
                        entries.add(ModItems.OXIDIZED_COPPER_HELMET);
                        entries.add(ModItems.OXIDIZED_COPPER_CHESTPLATE);
                        entries.add(ModItems.OXIDIZED_COPPER_LEGGINGS);
                        entries.add(ModItems.OXIDIZED_COPPER_BOOTS);
                        entries.add(ModItems.QUARTZ_SWORD);
                        entries.add(ModItems.QUARTZ_PICKAXE);
                        entries.add(ModItems.QUARTZ_AXE);
                        entries.add(ModItems.QUARTZ_SHOVEL);
                        entries.add(ModItems.QUARTZ_HOE);
                        entries.add(ModItems.QUARTZ_SABER);
                        entries.add(ModItems.QUARTZ_DAGGER);
                        entries.add(ModItems.QUARTZ_BATTLEAXE);
                        entries.add(ModItems.QUARTZ_HELMET);
                        entries.add(ModItems.QUARTZ_CHESTPLATE);
                        entries.add(ModItems.QUARTZ_LEGGINGS);
                        entries.add(ModItems.QUARTZ_BOOTS);
                    }).build());

    public static final ItemGroup ATMC_MOD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ATMCMod.MOD_ID, "atmc_mod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PURE_AMETHYST_ORE))
                    .displayName(Text.translatable("itemgroup.atmcmod.atmc_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PURE_AMETHYST_ORE);
                        entries.add(ModBlocks.SULFUR_ORE);
                        entries.add(ModBlocks.PITCH_COAL_ORE);
                        entries.add(ModBlocks.PITCH_COAL_BLOCK);
                        entries.add(ModBlocks.PURE_AMETHYST_BLOCK);
                        entries.add(ModBlocks.BUDDING_PURE_AMETHYST);
                        entries.add(ModBlocks.SMOOTH_PURE_AMETHYST_BLOCK);
                        entries.add(ModBlocks.END_GLOWSTONE);
                    }).build());

    public static final ItemGroup ATMC_BOSS_WEAPONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ATMCMod.MOD_ID, "atmc_boss_weapons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CRIMSON_COMMAND_SWORD))
                    .displayName(Text.translatable("itemgroup.atmcmod.amtc_boss_weapons"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WITHERITE_SWORD);
                        entries.add(ModItems.JUSTIFIER);
                        entries.add(ModItems.JUSTIFIER_MAIN);
                        entries.add(ModItems.MARCEL_MAIN);
                        entries.add(ModItems.VOIDENING_DEATH_SCYTHE);
                        entries.add(ModItems.WITHERITE_DOUBLE_SWORD);
                        entries.add(ModItems.DARK_STEEL_CLAYMORE);
                        entries.add(ModItems.CRIMSON_COMMAND_SWORD);
                    }).build());

    public static void registerItemGroups() {
        ATMCMod.LOGGER.info("Registering Item Groups for " + ATMCMod.MOD_ID);
    }
}
