package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Amethyst
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 3, -2.4f))));

    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new PickaxeItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 1, -2.8f))));

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new AxeItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 5, -3.0f))));

    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 1.5f, -3.0f))));

    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new HoeItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AMETHYST, -1, -1.0f))));

    public static final Item PURE_AMETHYST_SHARD = registerItem("pure_amethyst_shard", new Item(new Item.Settings()));

    //Pure_Amethyst
    public static final Item PURE_AMETHYST_SWORD = registerItem("pure_amethyst_sword",
            new SwordItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, 3, -2.4f))));

    public static final Item PURE_AMETHYST_PICKAXE = registerItem("pure_amethyst_pickaxe",
            new PickaxeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, 1, -2.8f))));

    public static final Item PURE_AMETHYST_AXE = registerItem("pure_amethyst_axe",
            new AxeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, 5, -3.0f))));

    public static final Item PURE_AMETHYST_SHOVEL = registerItem("pure_amethyst_shovel",
            new ShovelItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, 1.5f, -3.0f))));

    public static final Item PURE_AMETHYST_HOE = registerItem("pure_amethyst_hoe",
            new HoeItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, -1, -1.0f))));

    //Emerald
    public static final Item EMERALD_SWORD = registerItem("emerald_sword",
            new SwordItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD, 3, -2.4f))));

    public static final Item EMERALD_PICKAXE = registerItem("emerald_pickaxe",
            new PickaxeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1, -2.8f))));

    public static final Item EMERALD_AXE = registerItem("emerald_axe",
            new AxeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.EMERALD, 5, -3.0f))));

    public static final Item EMERALD_SHOVEL = registerItem("emerald_shovel",
            new ShovelItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.EMERALD, 1.5f, -3.0f))));

    public static final Item EMERALD_HOE = registerItem("emerald_hoe",
            new HoeItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.EMERALD, -1, -1.0f))));

    //Helper-Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ATMCMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ATMCMod.LOGGER.info("Registering Mod Items for " + ATMCMod.MOD_ID);

        };
    }

