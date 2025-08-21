package nine.bettertools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nine.bettertools.NinesBetterTools;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> NINES_BETTER_TOOLS_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(NinesBetterTools.MOD_ID, "item_group"));
    public static final ItemGroup NINES_BETTER_TOOLS_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.ROSE_GOLD_INGOT))
            .displayName(Text.translatable("itemGroup.nines_better_tools_reference"))
            .build();


    public static void initialize() {

        NinesBetterTools.LOGGER.info("Registering Mod Item Groups for " + NinesBetterTools.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, NINES_BETTER_TOOLS_ITEM_GROUP_KEY, NINES_BETTER_TOOLS_ITEM_GROUP);
    }

}
