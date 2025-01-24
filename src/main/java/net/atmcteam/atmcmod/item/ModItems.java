package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
import net.atmcteam.atmcmod.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

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

    public static final Item AMETHYST_SABER = registerItem("amethyst_saber",
            new SwordItem(ModToolMaterials.AMETHYST, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AMETHYST, 2, -2.0f))));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(ModArmorMaterials.AMETHYST_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

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

    public static final Item PURE_AMETHYST_SABER = registerItem("pure_amethyst_saber",
            new SwordItem(ModToolMaterials.PURE_AMETHYST, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST, 2, -2.0f))));

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

    public static final Item EMERALD_SABER = registerItem("emerald_saber",
            new SwordItem(ModToolMaterials.EMERALD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.EMERALD, 2, -2.0f))));

    public static final Item EMERALD_HELMET = registerItem("emerald_helmet",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));

    public static final Item EMERALD_CHESTPLATE = registerItem("emerald_chestplate",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));

    public static final Item EMERALD_LEGGINGS = registerItem("emerald_leggings",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));

    public static final Item EMERALD_BOOTS = registerItem("emerald_boots",
            new ArmorItem(ModArmorMaterials.EMERALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    public static final Item WITHERITE_SWORD = registerItem("witherite_sword",
            new SwordItem(ModToolMaterials.WITHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WITHERITE, 3, -2.4f))));

    public static final Item YAMATO = registerItem("yamato",
            new SwordItem(ModToolMaterials.YAMATO, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.YAMATO, 1, -2.0f))));

    public static final Item YAMATO_MAIN = registerItem("yamato_main",
            new SwordItem(ModToolMaterials.YAMATO, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.YAMATO, 4, -2.0f))));

    //Pure_Amethyst_Netherite
    public static final Item PURE_AMETHYST_NETHERITE_SWORD = registerItem("pure_amethyst_netherite_sword",
            new SwordItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, 3, -2.4f))));

    public static final Item PURE_AMETHYST_NETHERITE_PICKAXE = registerItem("pure_amethyst_netherite_pickaxe",
            new PickaxeItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, 1, -2.8f))));

    public static final Item PURE_AMETHYST_NETHERITE_AXE = registerItem("pure_amethyst_netherite_axe",
            new AxeItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, 5, -3.0f))));

    public static final Item PURE_AMETHYST_NETHERITE_SHOVEL = registerItem("pure_amethyst_netherite_shovel",
            new ShovelItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, 1.5f, -3.0f))));

    public static final Item PURE_AMETHYST_NETHERITE_HOE = registerItem("pure_amethyst_netherite_hoe",
            new HoeItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, -1, -1.0f))));

    public static final Item PURE_AMETHYST_NETHERITE_SABER = registerItem("pure_amethyst_netherite_saber",
            new SwordItem(ModToolMaterials.PURE_AMETHYST_NETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURE_AMETHYST_NETHERITE, 2, -2.0f))));

    public static final Item PURE_AMETHYST_NETHERITE_HELMET = registerItem("pure_amethyst_netherite_helmet",
            new ModArmorItem(ModArmorMaterials.PURE_AMETHYST_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(37))));

    public static final Item PURE_AMETHYST_NETHERITE_CHESTPLATE = registerItem("pure_amethyst_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.PURE_AMETHYST_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(37))));

    public static final Item PURE_AMETHYST_NETHERITE_LEGGINGS = registerItem("pure_amethyst_netherite_leggings",
            new ArmorItem(ModArmorMaterials.PURE_AMETHYST_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(37))));

    public static final Item PURE_AMETHYST_NETHERITE_BOOTS = registerItem("pure_amethyst_netherite_boots",
            new ArmorItem(ModArmorMaterials.PURE_AMETHYST_NETHERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(37))));

    public static final Item PURE_AMETHYST_NETHERITE_INGOT = registerItem("pure_amethyst_netherite_ingot", new Item(new Item.Settings()));

    public static final Item SULFUR_DUST = registerItem("sulfur_dust", new Item(new Item.Settings()));
    public static final Item PITCH_COAL = registerItem("pitch_coal", new Item(new Item.Settings()));
    public static final Item PURE_AMETHYST_APPLE = registerItem("pure_amethyst_apple", new Item(new Item.Settings().food(ModFoodComponents.PURE_AMETHYST_APPLE)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            if (Screen.hasShiftDown()) {
                tooltip.add(Text.translatable("tooltip.atmcmod.pure_amethyst_apple.tooltip.shift_down.l1"));
                tooltip.add(Text.translatable("tooltip.atmcmod.pure_amethyst_apple.tooltip.shift_down.l2"));
                tooltip.add(Text.translatable("tooltip.atmcmod.pure_amethyst_apple.tooltip.shift_down.l3"));
                tooltip.add(Text.translatable("tooltip.atmcmod.pure_amethyst_apple.tooltip.shift_down.l4"));
            } else {
                tooltip.add(Text.translatable("tooltip.atmcmod.pure_amethyst_apple.tooltip"));
            }
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item IRON_SABER = registerItem("iron_saber",
            new SwordItem(ToolMaterials.IRON, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 2, -2.0f))));

    public static final Item DIAMOND_SABER = registerItem("diamond_saber",
            new SwordItem(ToolMaterials.DIAMOND, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -2.0f))));

    public static final Item NETHERITE_SABER = registerItem("netherite_saber",
            new SwordItem(ToolMaterials.NETHERITE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 2, -2.0f))));


    //Helper-Method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ATMCMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ATMCMod.LOGGER.info("Registering Mod Items for " + ATMCMod.MOD_ID);

        };

    }

