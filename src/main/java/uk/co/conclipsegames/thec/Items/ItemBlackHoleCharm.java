package uk.co.conclipsegames.thec.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.util.Helper;

import java.util.List;

/**
 * Created by James on 06/08/2017.
 */
public class ItemBlackHoleCharm extends Item {
    protected String name;
    private boolean isOn = false;

    public ItemBlackHoleCharm(String name) {
        this.name = name;
        setUnlocalizedName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_onItemRightClick_1_, EntityPlayer player, EnumHand hand) {

        if(player.isSneaking())
        {
            Helper.changeBoolTag(player.getHeldItem(hand),"isOn",true);
            player.sendMessage(new TextComponentString("The Black Hole Charm is now ON"));
            player.getHeldItem(hand).addEnchantment(Enchantments.PROTECTION,1);
            player.getHeldItem(hand).getTagCompound().setInteger("HideFlags",1);
        }
        else
        {

            Helper.changeBoolTag(player.getHeldItem(hand),"isOn",false);
            player.sendMessage(new TextComponentString("The Black Hole Charm is now OFF"));
            Helper.resetItem("thec:item_bhc",0,true,player,1);


        }
        return super.onItemRightClick(p_onItemRightClick_1_, player, hand);
    }

    @Override
    public void onUpdate(ItemStack item, World world, Entity player, int p_onUpdate_4_, boolean p_onUpdate_5_) {
        try
        {
            this.isOn = item.getTagCompound().getBoolean("isOn");
        }
        catch(NullPointerException e)
        {}
        if(this.isOn)
        {
            EntityPlayer thePlayer = world.getClosestPlayer(player.getPosition().getX(),player.getPosition().getY(),player.getPosition().getZ(),1f,false);
            try
            {
                if (Helper.consumeItem("minecraft:cobblestone",0,true,thePlayer,64) || Helper.consumeItem("minecraft:stone",0,true,thePlayer,64)) {

                    thePlayer.inventory.addItemStackToInventory(new ItemStack(ModItems.ultraDenseGem));
                }
            }catch(NullPointerException e){}


            BlockPos coords = player.getPosition();
            List<EntityItem> allentities = world.getEntitiesWithinAABB(EntityItem.class, new AxisAlignedBB(coords.getX() - 15, coords.getY() - 15, coords.getZ() - 15, coords.getX() + 15, coords.getY() + 15, coords.getZ() + 15));

            int i = 0;
            while(i != allentities.size())
            {
                allentities.get(i).setPosition(coords.getX(),coords.getY(),coords.getZ());
                i++;
            }
        }
    }
}