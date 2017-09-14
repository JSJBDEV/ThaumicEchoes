package uk.co.conclipsegames.thec.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

/**
 * Created by James on 23/08/2017.
 */
public class ItemDeathTag extends Item {
    protected String name;
    private Boolean tagOn = false;

    public ItemDeathTag(String name) {
        this.name = name;
        setUnlocalizedName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if(playerIn.isSneaking())
        {
            tagOn = true;
            playerIn.sendMessage(new TextComponentString("Shadow Tag is now ON"));
        }
        else
        {
            tagOn = false;
            playerIn.sendMessage(new TextComponentString("Shadow Tag is now OFF"));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        if(tagOn)
        {
            EntityPlayer player = worldIn.getClosestPlayer(entityIn.posX,entityIn.posY,entityIn.posZ,1f,false);
            player.bedLocation = player.getPosition();
            super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
        }
    }
}
