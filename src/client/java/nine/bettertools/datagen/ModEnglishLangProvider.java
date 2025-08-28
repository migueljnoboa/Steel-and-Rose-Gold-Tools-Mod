package nine.bettertools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import nine.bettertools.block.ModBlocks;
import nine.bettertools.item.ModItemGroups;
import nine.bettertools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {



    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);

    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItems.ROSE_GOLD_INGOT,"Rose Gold Ingot");
        translationBuilder.add(ModItems.STEEL_INGOT,"Steel Ingot");

        translationBuilder.add(ModItems.ROSE_GOLD_SWORD,"Rose Gold Sword");
        translationBuilder.add(ModItems.ROSE_GOLD_PICKAXE,"Rose Gold Pickaxe");
        translationBuilder.add(ModItems.ROSE_GOLD_AXE,"Rose Gold Axe");
        translationBuilder.add(ModItems.ROSE_GOLD_SHOVEL,"Rose Gold Shovel");
        translationBuilder.add(ModItems.ROSE_GOLD_HOE,"Rose Gold Hoe");

        translationBuilder.add(ModItems.STEEL_SWORD,"Steel Sword");
        translationBuilder.add(ModItems.STEEL_PICKAXE,"Steel Pickaxe");
        translationBuilder.add(ModItems.STEEL_AXE,"Steel Axe");
        translationBuilder.add(ModItems.STEEL_SHOVEL,"Steel Shovel");
        translationBuilder.add(ModItems.STEEL_HOE,"Steel Hoe");


        translationBuilder.add(ModBlocks.ROSE_GOLD_BLOCK.asItem(), "Rose Gold Block");
        translationBuilder.add(ModBlocks.STEEL_BLOCK.asItem(),"Steel Block");

        translationBuilder.add(ModItems.ROSE_GOLD_NUGGET, "Rose Gold Nugget");
        translationBuilder.add(ModItems.STEEL_NUGGET,"Steel Nugget");

        translationBuilder.add(ModItems.ROSE_GOLD_COOKIE,"Rose Gold Cookie");

        translationBuilder.add(ModItemGroups.NINES_BETTER_TOOLS_ITEM_GROUP_KEY,"Nine's Better Tools");

    }
}
