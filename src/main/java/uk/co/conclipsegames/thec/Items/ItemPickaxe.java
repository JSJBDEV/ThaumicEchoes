package uk.co.conclipsegames.thec.Items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.thec;
import uk.co.conclipsegames.thec.util.Helper;

/**
 * Created by James on 06/08/2017.
 */
public class ItemPickaxe extends net.minecraft.item.ItemPickaxe implements ItemModelProvider {
    private String name;
    private int aoe = 1;

    public ItemPickaxe(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel(Item item) {
        thec.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemPickaxe setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_onItemRightClick_1_, EntityPlayer player, EnumHand hand) {
        ItemStack item = player.getHeldItem(hand);
        if(player.isSneaking())
            {
                if(aoe >= 1)
                {
                    Helper.changeTag(item,"aoe",aoe-1);
                    player.sendMessage(new TextComponentString("AOE level changed to "+String.valueOf(aoe)));
                }
            }
        else
            {
                if(aoe <= 10)
                {
                    Helper.changeTag(item,"aoe",aoe+1);
                    player.sendMessage(new TextComponentString("AOE level changed to "+String.valueOf(aoe)));
                }
            }

        return super.onItemRightClick(p_onItemRightClick_1_, player, hand);
    }

    @Override
    public void onUpdate(ItemStack item, World p_onUpdate_2_, Entity p_onUpdate_3_, int p_onUpdate_4_, boolean p_onUpdate_5_) {
        try
        {
            aoe = item.getTagCompound().getInteger("aoe");
        }
        catch(NullPointerException e)
        {}
        super.onUpdate(item, p_onUpdate_2_, p_onUpdate_3_, p_onUpdate_4_, p_onUpdate_5_);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, IBlockState blockstate, BlockPos block, EntityLivingBase player) {
        if(player.isSneaking())
        {


            EntityPlayer thePlayer = world.getClosestPlayer(player.getPosition().getX(),player.getPosition().getY(),player.getPosition().getZ(),1f,false);
            int x = -aoe;
            int y = -aoe;
            int z = -aoe;
            while(z != aoe)
            {
                while(y != aoe)
                {
                    while(x != aoe)
                    {
                        if(world.getBlockState(new BlockPos(block.getX() +x, block.getY() +y, block.getZ() +z)).getBlock()== Blocks.STONE)
                        {
                            world.destroyBlock(new BlockPos(block.getX() +x, block.getY() +y, block.getZ() +z), false);
                            thePlayer.inventory.addItemStackToInventory(new ItemStack(Blocks.COBBLESTONE));
                        }
                        x++;

                    }
                    x= -aoe;
                    y++;
                }
                y= -aoe;
                z++;


            }
        }
        return super.onBlockDestroyed(item, world, blockstate, block, player);
    }
}
