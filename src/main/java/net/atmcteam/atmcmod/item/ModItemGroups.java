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
                        entries.add(ModItems.AMETHYST_HELMET);
                        entries.add(ModItems.AMETHYST_CHESTPLATE);
                        entries.add(ModItems.AMETHYST_LEGGINGS);
                        entries.add(ModItems.AMETHYST_BOOTS);
                        entries.add(ModItems.PURE_AMETHYST_SHARD);
                        entries.add(ModItems.PURE_AMETHYST_SWORD);
                        entries.add(ModItems.PURE_AMETHYST_PICKAXE);
                        entries.add(ModItems.PURE_AMETHYST_AXE);
                        entries.add(ModItems.PURE_AMETHYST_SHOVEL);
                        entries.add(ModItems.PURE_AMETHYST_HOE);
                        entries.add(ModItems.PURE_AMETHYST_SABER);
                        entries.add(ModItems.EMERALD_SWORD);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_SABER);
                        entries.add(ModItems.EMERALD_HELMET);
                        entries.add(ModItems.EMERALD_CHESTPLATE);
                        entries.add(ModItems.EMERALD_LEGGINGS);
                        entries.add(ModItems.EMERALD_BOOTS);
                        entries.add(ModItems.WITHERITE_SWORD);
                        entries.add(ModItems.YAMATO);
                        entries.add(ModItems.YAMATO_MAIN);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SWORD);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_PICKAXE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_AXE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SHOVEL);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_HOE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_SABER);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_HELMET);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_CHESTPLATE);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_LEGGINGS);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_BOOTS);
                        entries.add(ModItems.PURE_AMETHYST_NETHERITE_INGOT);
                        entries.add(ModItems.SULFUR_DUST);
                        entries.add(ModItems.PITCH_COAL);
                        entries.add(ModItems.PURE_AMETHYST_APPLE);
                        entries.add(ModItems.IRON_SABER);
                        entries.add(ModItems.DIAMOND_SABER);
                        entries.add(ModItems.NETHERITE_SABER);
                    }).build());

    public static final ItemGroup ATMC_MOD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ATMCMod.MOD_ID, "atmc_mod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PURE_AMETHYST_ORE))
                    .displayName(Text.translatable("itemgroup.atmcmod.atmc_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PURE_AMETHYST_ORE);
                        entries.add(ModBlocks.SULFUR_ORE);
                        entries.add(ModBlocks.PITCH_COAL_ORE);
                        entries.add(ModBlocks.PURE_AMETHYST_BLOCK);
                        entries.add(ModBlocks.BUDDING_PURE_AMETHYST);
                        entries.add(ModBlocks.SMOOTH_PURE_AMETHYST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        ATMCMod.LOGGER.info("Registering Item Groups for " + ATMCMod.MOD_ID);
    }
}
