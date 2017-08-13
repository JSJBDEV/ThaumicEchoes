package uk.co.conclipsegames.thec.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 12/08/2017.
 */
public class EtherealLadder extends Block {
    protected String name;

    public EtherealLadder(Material material, String name) {
        super(material);

        this.name = name;
        setHardness(1f);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel(ItemBlock itemBlock) {
        thec.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    @Override
    public boolean onBlockActivated(World p_onBlockActivated_1_, BlockPos block, IBlockState p_onBlockActivated_3_, EntityPlayer player, EnumHand p_onBlockActivated_5_, EnumFacing p_onBlockActivated_6_, float p_onBlockActivated_7_, float p_onBlockActivated_8_, float p_onBlockActivated_9_) {
        player.setPosition(block.getX()+0.5,block.getY()+1,block.getZ()+0.5);
        return super.onBlockActivated(p_onBlockActivated_1_, block, p_onBlockActivated_3_, player, p_onBlockActivated_5_, p_onBlockActivated_6_, p_onBlockActivated_7_, p_onBlockActivated_8_, p_onBlockActivated_9_);
    }

    @Override
    public EtherealLadder setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
