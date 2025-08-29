package nine.bettertools.item;

import net.minecraft.item.ToolMaterial;
import nine.bettertools.util.ModTags;

public class ModToolMaterials {

    // Ctrl + Click on ToolMaterial to know values of each argument:
    // Incorrect For Tag
    // Durability
    // Speed
    // Attack Damage Bonus
    // Enchantment Value
    // Repair Items Tag

    public static final ToolMaterial ROSE_GOLD_TOOL_MATERIAL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_ROSE_GOLD_TOOL,
            225,
            13.0F,
            2.0F,
            22,
            ModTags.Items.ROSE_GOLD_MATERIAL
    );

    public static final ToolMaterial STEEL_TOOL_MATERIAL = new ToolMaterial(
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL,
            700,
            7.0F,
            2.0F,
            14,
            ModTags.Items.STEEL_MATERIAL
    );

}
