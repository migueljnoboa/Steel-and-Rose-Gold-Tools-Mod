package nine.bettertools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {



    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);

    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add("item.nines-better-tools.rose_gold_ingot","Rose Gold Ingot");
        translationBuilder.add("item.nines-better-tools.steel_ingot","Steel Ingot");

        translationBuilder.add("item.nines-better-tools.rose_gold_sword","Rose Gold Sword");
        translationBuilder.add("item.nines-better-tools.rose_gold_pickaxe","Rose Gold Pickaxe");
        translationBuilder.add("item.nines-better-tools.rose_gold_axe","Rose Gold Axe");
        translationBuilder.add("item.nines-better-tools.rose_gold_shovel","Rose Gold Shovel");
        translationBuilder.add("item.nines-better-tools.rose_gold_hoe","Rose Gold Hoe");

        translationBuilder.add("item.nines-better-tools.steel_sword","Steel Sword");
        translationBuilder.add("item.nines-better-tools.steel_pickaxe","Steel Pickaxe");
        translationBuilder.add("item.nines-better-tools.steel_axe","Steel Axe");
        translationBuilder.add("item.nines-better-tools.steel_shovel","Steel Shovel");
        translationBuilder.add("item.nines-better-tools.steel_hoe","Steel Hoe");


        translationBuilder.add("item.nines-better-tools.rose_gold_block","Rose Gold Block");
        translationBuilder.add("item.nines-better-tools.steel_block","Steel Block");

        translationBuilder.add("item.nines-better-tools.rose_gold_nugget","Rose Gold Nugget");
        translationBuilder.add("item.nines-better-tools.steel_nugget","Steel Nugget");

        translationBuilder.add("item.nines-better-tools.rose_gold_cookie","Rose Gold Cookie");

        translationBuilder.add("itemGroup.nines_better_tools_reference","Nine's Better Tools");

    }
}
