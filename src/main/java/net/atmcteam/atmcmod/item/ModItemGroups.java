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
                        entries.add(ModItems.PURE_AMETHYST_SHARD);
                    }).build());

    public static final ItemGroup ATMC_MOD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ATMCMod.MOD_ID, "atmc_mod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PURE_AMETHYST_ORE))
                    .displayName(Text.translatable("itemgroup.atmcmod.atmc_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PURE_AMETHYST_ORE);
                        entries.add(ModBlocks.SULFUR_ORE);
                    }).build());

    public static void registerItemGroups() {
        ATMCMod.LOGGER.info("Registering Item Groups for " + ATMCMod.MOD_ID);
    }
}
