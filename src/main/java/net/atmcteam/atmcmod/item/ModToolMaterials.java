package net.atmcteam.atmcmod.item;

import com.google.common.base.Suppliers;
import net.atmcteam.atmcmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    AMETHYST(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            1250, 7.0F, 2.5F, 19, () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    PURE_AMETHYST(ModTags.Blocks.INCORRECT_FOR_PURE_AMETHYST_TOOL,
            1750, 8.5F, 4.5F, 21, () -> Ingredient.ofItems(ModItems.PURE_AMETHYST_SHARD)),
    EMERALD(ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL,
            750, 6.5F, 2.5F, 16, () -> Ingredient.ofItems(Items.EMERALD)),
    WITHERITE(ModTags.Blocks.INCORRECT_FOR_WITHERITE_TOOL,
            3150, 10.0F, 12F, 22, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    JUSTIFIER(ModTags.Blocks.INCORRECT_FOR_JUSTIFIER_TOOL,
            21500, 10.0F, 15F, 24, () -> Ingredient.ofItems(Items.NETHERITE_SCRAP)),
    PURE_AMETHYST_NETHERITE(ModTags.Blocks.INCORRECT_FOR_PURE_AMETHYST_NETHERITE_TOOL,
                            2500, 11.0F, 9F, 22, () -> Ingredient.ofItems(ModItems.PURE_AMETHYST_NETHERITE_INGOT)),
    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
                            200, 5.0F, 1.5F, 9, () -> Ingredient.ofItems(Items.COPPER_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                             final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
