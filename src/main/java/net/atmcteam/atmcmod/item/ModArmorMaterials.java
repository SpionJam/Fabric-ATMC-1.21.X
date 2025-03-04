package net.atmcteam.atmcmod.item;

import net.atmcteam.atmcmod.ATMCMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    //Amethyst
    public static final RegistryEntry<ArmorMaterial> AMETHYST_ARMOR_MATERIAL = registerArmorMaterial("amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.AMETHYST_SHARD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "amethyst"))), 0,0));

    //Pure Amethyst
    public static final RegistryEntry<ArmorMaterial> PURE_AMETHYST_ARMOR_MATERIAL = registerArmorMaterial("pure_amethyst",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 12);
            }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.PURE_AMETHYST_GEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "pure_amethyst"))), 0,0));

    //Emerald
    public static final RegistryEntry<ArmorMaterial> EMERALD_ARMOR_MATERIAL = registerArmorMaterial("emerald",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(Items.EMERALD),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "emerald"))), 0,0));

    //Pure Amethyst Netherite
    public static final RegistryEntry<ArmorMaterial> PURE_AMETHYST_NETHERITE_ARMOR_MATERIAL = registerArmorMaterial("pure_amethyst_netherite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.CHESTPLATE, 9);
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.BODY, 12);
            }), 23, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.PURE_AMETHYST_NETHERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "pure_amethyst_netherite"))), 3.0F,0.1F));

    //Copper
    public static final RegistryEntry<ArmorMaterial> COPPER_ARMOR_MATERIAL = registerArmorMaterial("copper",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 4);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 8);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.COPPER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "copper"))), 2.0F,0.05F));

    //Oxidized Copper
    public static final RegistryEntry<ArmorMaterial> OXIDIZED_COPPER_ARMOR_MATERIAL = registerArmorMaterial("oxidized_copper",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.CHESTPLATE, 4);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 8);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.COPPER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "oxidized_copper"))), 2.0F,0.05F));

    //Quartz
    public static final RegistryEntry<ArmorMaterial> QUARTZ_ARMOR_MATERIAL = registerArmorMaterial("quartz",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2);
                map.put(ArmorItem.Type.LEGGINGS, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 7);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 10);
            }), 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, () -> Ingredient.ofItems(Items.QUARTZ),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "quartz"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> END_ESSENCE_ARMOR_MATERIAL = registerArmorMaterial("end_essence",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.END_ESSENCE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "end_essence"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> FOREST_ESSENCE_ARMOR_MATERIAL = registerArmorMaterial("forest_essence",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.FOREST_ESSENCE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "forest_essence"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> OCEAN_ESSENCE_ARMOR_MATERIAL = registerArmorMaterial("ocean_essence",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.OCEAN_ESSENCE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "ocean_essence"))), 0,0));

    public static final RegistryEntry<ArmorMaterial> NETHER_ESSENCE_ARMOR_MATERIAL = registerArmorMaterial("nether_essence",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.NETHER_ESSENCE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ATMCMod.MOD_ID, "nether_essence"))), 0,0));

    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ATMCMod.MOD_ID, name), material.get());
    }
}
