package net.atmcteam.atmcmod.util;

import net.atmcteam.atmcmod.ATMCMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_AMETHYST_TOOL = createTag("needs_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_AMETHYST_TOOL = createTag("incorrect_for_amethyst_tool");
        public static final TagKey<Block> NEEDS_PURE_AMETHYST_TOOL = createTag("needs_pure_amethyst_tool");
        public static final TagKey<Block> INCORRECT_FOR_PURE_AMETHYST_TOOL = createTag("incorrect_for_pure_amethyst_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = createTag("needs_emerald_tool");
        public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = createTag("incorrect_for_emerald_tool");
        public static final TagKey<Block> NEEDS_WITHERITE_TOOL = createTag("needs_witherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_WITHERITE_TOOL = createTag("incorrect_for_witherite_tool");
        public static final TagKey<Block> NEEDS_JUSTIFIER_TOOL = createTag("needs_justifier_tool");
        public static final TagKey<Block> INCORRECT_FOR_JUSTIFIER_TOOL = createTag("incorrect_for_justifier_tool");
        public static final TagKey<Block> NEEDS_PURE_AMETHYST_NETHERITE_TOOL = createTag("needs_pure_amethyst_netherite_tool");
        public static final TagKey<Block> INCORRECT_FOR_PURE_AMETHYST_NETHERITE_TOOL = createTag("incorrect_for_pure_amethyst_netherite_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(ATMCMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(ATMCMod.MOD_ID, name));
        }
    }
}
