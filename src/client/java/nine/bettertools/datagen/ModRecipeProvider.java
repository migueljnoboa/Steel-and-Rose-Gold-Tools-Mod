package nine.bettertools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import nine.bettertools.block.ModBlocks;
import nine.bettertools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                // ROSE_GOLD_INGOT
                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT)
                        .input(Items.GOLD_INGOT)
                        .input(Items.COPPER_INGOT)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);


                // STEEL_INGOT
                createShapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                        .input(Items.IRON_INGOT)
                        .input(Items.COAL, 4)
                        .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);


                // ROSE GOLD FAMILY RECIPES
                createShapeless(RecipeCategory.MISC, ModBlocks.ROSE_GOLD_BLOCK)
                        .input(ModItems.ROSE_GOLD_INGOT, 9)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("rose_gold_block_from_ingot")));

                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT, 9)
                        .input(ModBlocks.ROSE_GOLD_BLOCK)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("rose_gold_ingot_from_block")));

                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_INGOT)
                        .input(ModItems.ROSE_GOLD_NUGGET, 9)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("rose_gold_ingot_from_nugget")));

                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_NUGGET, 9)
                        .input(ModItems.ROSE_GOLD_INGOT)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("rose_gold_nugget_from_ingot")));


                // STEEL FAMILY RECIPES
                createShapeless(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK)
                        .input(ModItems.STEEL_INGOT, 9)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("steel_block_from_ingot")));

                createShapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT, 9)
                        .input(ModBlocks.STEEL_BLOCK)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("steel_ingot_from_block")));

                createShapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                        .input(ModItems.STEEL_NUGGET, 9)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("steel_ingot_from_nugget")));

                createShapeless(RecipeCategory.MISC, ModItems.STEEL_NUGGET, 9)
                        .input(ModItems.STEEL_INGOT)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter, String.valueOf(Identifier.of("steel_nugget_from_ingot")));


                // FLINT_AND_STEEL USING STEEL
                createShapeless(RecipeCategory.MISC, Items.FLINT_AND_STEEL)
                        .input(ModItems.STEEL_INGOT)
                        .input(Items.FLINT)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .criterion(hasItem(Items.FLINT), conditionsFromItem(Items.FLINT))
                        .offerTo(exporter, String.valueOf(Identifier.of("flint_and_steel_using_steel")));

                // ROSE GOLD TOOLS AND SWORD
                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_PICKAXE)
                        .pattern("rrr")
                        .pattern(" s ")
                        .pattern(" s ")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.ROSE_GOLD_INGOT) // 'r' rose gold
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_SHOVEL)
                        .pattern("r")
                        .pattern("s")
                        .pattern("s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.ROSE_GOLD_INGOT) // 'r' rose gold
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_AXE)
                        .pattern("rr")
                        .pattern("rs")
                        .pattern(" s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.ROSE_GOLD_INGOT) // 'r' rose gold
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.ROSE_GOLD_HOE)
                        .pattern("rr")
                        .pattern(" s")
                        .pattern(" s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.ROSE_GOLD_INGOT) // 'r' rose gold
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.ROSE_GOLD_SWORD)
                        .pattern("r")
                        .pattern("r")
                        .pattern("s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.ROSE_GOLD_INGOT) // 'r' rose gold
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);

                // STEEL TOOLS AND SWORD
                createShaped(RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE)
                        .pattern("rrr")
                        .pattern(" s ")
                        .pattern(" s ")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.STEEL_INGOT) // 'r' steel
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL)
                        .pattern("r")
                        .pattern("s")
                        .pattern("s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.STEEL_INGOT) // 'r' steel
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STEEL_AXE)
                        .pattern("rr")
                        .pattern("rs")
                        .pattern(" s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.STEEL_INGOT) // 'r' steel
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.STEEL_HOE)
                        .pattern("rr")
                        .pattern(" s")
                        .pattern(" s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.STEEL_INGOT) // 'r' steel
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.COMBAT, ModItems.STEEL_SWORD)
                        .pattern("r")
                        .pattern("r")
                        .pattern("s")
                        .input('s', Items.STICK) // 's' stick
                        .input('r', ModItems.STEEL_INGOT) // 'r' steel
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);

                // ROSE GOLD FOOD ITEMS
                createShapeless(RecipeCategory.MISC, ModItems.ROSE_GOLD_COOKIE)
                        .input(ModItems.ROSE_GOLD_NUGGET, 4)
                        .input(Items.COOKIE)
                        .criterion(hasItem(ModItems.ROSE_GOLD_INGOT), conditionsFromItem(ModItems.ROSE_GOLD_INGOT))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Nine's Better Tools Recipe Provider";
    }
}
