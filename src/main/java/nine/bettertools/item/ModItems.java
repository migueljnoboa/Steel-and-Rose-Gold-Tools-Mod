package nine.bettertools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nine.bettertools.NinesBetterTools;
import nine.bettertools.util.ModTags;

import java.util.function.Function;

public class ModItems {

    public static final Item ROSE_GOLD_INGOT = register("rose_gold_ingot", Item::new, new Item.Settings());
    public static final Item STEEL_INGOT = register("steel_ingot", Item::new, new Item.Settings());

    public static final Item ROSE_GOLD_NUGGET = register("rose_gold_nugget", Item::new, new Item.Settings());
    public static final Item STEEL_NUGGET = register("steel_nugget", Item::new, new Item.Settings());

    public static final Item ROSE_GOLD_SWORD = register("rose_gold_sword", Item::new, new Item.Settings().sword(ModToolMaterials.ROSE_GOLD_TOOL_MATERIAL, 3.0F, -2.4F));
    public static final Item ROSE_GOLD_PICKAXE = register("rose_gold_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.ROSE_GOLD_TOOL_MATERIAL, 1.0F, -2.8F));
    public static final Item ROSE_GOLD_AXE = register("rose_gold_axe", settings -> new AxeItem(ModToolMaterials.ROSE_GOLD_TOOL_MATERIAL, 6.0F, -3.1F, settings), new Item.Settings());
    public static final Item ROSE_GOLD_SHOVEL = register("rose_gold_shovel", settings -> new ShovelItem(ModToolMaterials.ROSE_GOLD_TOOL_MATERIAL, 1.5F, -3.0F, settings), new Item.Settings());
    public static final Item ROSE_GOLD_HOE = register("rose_gold_hoe", settings -> new HoeItem(ModToolMaterials.ROSE_GOLD_TOOL_MATERIAL, -2.0F, -1.0F, settings), new Item.Settings());

    public static final Item STEEL_SWORD = register("steel_sword", Item::new, new Item.Settings().sword(ModToolMaterials.STEEL_TOOL_MATERIAL, 3.0F, -2.4F));
    public static final Item STEEL_PICKAXE = register("steel_pickaxe", Item::new, new Item.Settings().pickaxe(ModToolMaterials.STEEL_TOOL_MATERIAL, 1.0F, -2.8F));
    public static final Item STEEL_AXE = register("steel_axe", settings -> new AxeItem(ModToolMaterials.STEEL_TOOL_MATERIAL, 6.0F, -3.1F, settings), new Item.Settings());
    public static final Item STEEL_SHOVEL = register("steel_shovel", settings -> new ShovelItem(ModToolMaterials.STEEL_TOOL_MATERIAL, 1.5F, -3.0F, settings), new Item.Settings());
    public static final Item STEEL_HOE = register("steel_hoe", settings -> new HoeItem(ModToolMaterials.STEEL_TOOL_MATERIAL, -2.0F, -1.0F, settings), new Item.Settings());

    public static final Item ROSE_GOLD_COOKIE = register(
            "rose_gold_cookie",
            Item::new,
            new Item.Settings().food(ModFoodComponents.ROSE_GOLD_COOKIE_COMPONENT, ModFoodComponents.ROSE_GOLD_COOKIE_CONSUMABLE_COMPONENT)
    );

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(NinesBetterTools.MOD_ID, name));
        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        NinesBetterTools.LOGGER.info("Registering Mod Items for " + NinesBetterTools.MOD_ID);

        // Custom Item Group (add all items)
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.NINES_BETTER_TOOLS_ITEM_GROUP_KEY).register((itemGroup) -> {

            itemGroup.add(ModItems.ROSE_GOLD_INGOT);
            itemGroup.add(ModItems.ROSE_GOLD_NUGGET);

            itemGroup.add(ModItems.STEEL_INGOT);
            itemGroup.add(ModItems.STEEL_NUGGET);

            itemGroup.add(ModItems.ROSE_GOLD_PICKAXE);
            itemGroup.add(ModItems.ROSE_GOLD_AXE);
            itemGroup.add(ModItems.ROSE_GOLD_SHOVEL);
            itemGroup.add(ModItems.ROSE_GOLD_HOE);
            itemGroup.add(ModItems.ROSE_GOLD_SWORD);

            itemGroup.add(ModItems.STEEL_PICKAXE);
            itemGroup.add(ModItems.STEEL_AXE);
            itemGroup.add(ModItems.STEEL_SHOVEL);
            itemGroup.add(ModItems.STEEL_HOE);
            itemGroup.add(ModItems.STEEL_SWORD);

            itemGroup.add(ModItems.ROSE_GOLD_COOKIE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register((itemGroup) -> {
            itemGroup.add(ModItems.ROSE_GOLD_COOKIE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
            itemGroup.add(ModItems.ROSE_GOLD_INGOT);
            itemGroup.add(ModItems.STEEL_INGOT);

            itemGroup.add(ModItems.ROSE_GOLD_NUGGET);
            itemGroup.add(ModItems.STEEL_NUGGET);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> {
            itemGroup.add(ModItems.ROSE_GOLD_SWORD);
            itemGroup.add(ModItems.ROSE_GOLD_AXE);

            itemGroup.add(ModItems.STEEL_SWORD);
            itemGroup.add(ModItems.STEEL_AXE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
            itemGroup.add(ModItems.ROSE_GOLD_PICKAXE);
            itemGroup.add(ModItems.ROSE_GOLD_AXE);
            itemGroup.add(ModItems.ROSE_GOLD_SHOVEL);
            itemGroup.add(ModItems.ROSE_GOLD_HOE);

            itemGroup.add(ModItems.STEEL_PICKAXE);
            itemGroup.add(ModItems.STEEL_AXE);
            itemGroup.add(ModItems.STEEL_SHOVEL);
            itemGroup.add(ModItems.STEEL_HOE);
        });
    }

}
