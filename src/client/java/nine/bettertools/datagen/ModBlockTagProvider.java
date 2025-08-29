package nine.bettertools.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import nine.bettertools.block.ModBlocks;
import nine.bettertools.item.ModItems;
import nine.bettertools.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ROSE_GOLD_BLOCK)
                .add(ModBlocks.STEEL_BLOCK);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ROSE_GOLD_BLOCK)
                .add(ModBlocks.STEEL_BLOCK);

        // This section will not auto generated. It needs to remove "NEEDS_ROSE_GOLD_TOOL"
        //valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_ROSE_GOLD_TOOL)
        //        .forceAddTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        // This section will not auto generated. It needs to remove "NEEDS_STEEL_TOOL"
        //valueLookupBuilder(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL)
        //        .forceAddTag(BlockTags.INCORRECT_FOR_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_ROSE_GOLD_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);

        valueLookupBuilder(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .forceAddTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
