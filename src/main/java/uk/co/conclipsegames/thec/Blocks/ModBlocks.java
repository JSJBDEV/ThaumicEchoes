package uk.co.conclipsegames.thec.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 12/08/2017.
 */
public class ModBlocks {
    public static EtherealLadder blockELadder;

    public static void init() {

        blockELadder = register(new EtherealLadder(Material.WOOD,"eladder").setCreativeTab(thec.creativeTab));


    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        if (block instanceof BlockBase) {
            ((BlockBase)block).registerItemModel(itemBlock);
        }
        if (block instanceof EtherealLadder) {
            ((EtherealLadder)block).registerItemModel(itemBlock);
        }


        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

}
