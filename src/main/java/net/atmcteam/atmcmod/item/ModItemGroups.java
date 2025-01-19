package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
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
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AMETHYST_SWORD))
                    .displayName(Text.translatable("itemgroup.atmcmod.atmc_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AMETHYST_SWORD);
                    }).build());

    public static void registerItemGroups() {
        ATMCMod.LOGGER.info("Registering Item Groups for " + ATMCMod.MOD_ID);
    }
}
