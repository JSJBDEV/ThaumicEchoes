package uk.co.conclipsegames.thec.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.thec;
import uk.co.conclipsegames.thec.util.Helper;

/**
 * Created by James on 16/08/2017.
 */
public class ItemXPCharm extends Item {
    protected String name;
    int xp;

    public ItemXPCharm(String name) {
        this.name = name;
        setUnlocalizedName(name);
    }
    
    @Override
    public ActionResult<ItemStack> onItemRightClick(World p_onItemRightClick_1_, EntityPlayer player, EnumHand hand) {
        if(player.isSneaking()) {

            if (xp > 0)
            {
                Helper.changeTag(player.getHeldItem(hand), "storedXP", xp-1);
                player.addExperienceLevel(1);
            }

        }
        else
        {
            if(player.experienceLevel >= 1)
            {
                Helper.changeTag(player.getHeldItem(hand),"storedXP",xp+1);
                player.removeExperienceLevel(1);
            }
        }
        return super.onItemRightClick(p_onItemRightClick_1_, player, hand);
    }
    @Override
    public void onUpdate(ItemStack item, World p_onUpdate_2_, Entity p_onUpdate_3_, int p_onUpdate_4_, boolean p_onUpdate_5_) {
        try
        {
            xp = item.getTagCompound().getInteger("storedXP");
        }
        catch(NullPointerException e)
        {}
        super.onUpdate(item, p_onUpdate_2_, p_onUpdate_3_, p_onUpdate_4_, p_onUpdate_5_);
    }
}
