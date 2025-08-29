package nine.bettertools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import nine.bettertools.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.ROSE_GOLD_SWORD)
                .add(ModItems.STEEL_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.ROSE_GOLD_PICKAXE)
                .add(ModItems.STEEL_PICKAXE);
        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.ROSE_GOLD_AXE)
                .add(ModItems.STEEL_AXE);
        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.ROSE_GOLD_SHOVEL)
                .add(ModItems.STEEL_SHOVEL);
        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.ROSE_GOLD_HOE)
                .add(ModItems.STEEL_HOE);
    }
}
