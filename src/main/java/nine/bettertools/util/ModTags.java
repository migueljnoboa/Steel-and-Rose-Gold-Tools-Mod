package nine.bettertools.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import nine.bettertools.NinesBetterTools;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_ROSE_GOLD_TOOL = createTag("needs_rose_gold_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");

        public static final TagKey<Block> INCORRECT_FOR_ROSE_GOLD_TOOL = createTag("incorrect_for_rose_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");


        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(NinesBetterTools.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ROSE_GOLD_MATERIAL = createTag("rose_gold_material");
        public static final TagKey<Item> STEEL_MATERIAL = createTag("steel_material");

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(NinesBetterTools.MOD_ID, name));
        }
    }

}
