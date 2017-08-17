package uk.co.conclipsegames.thec.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.thec;
import uk.co.conclipsegames.thec.util.Helper;

import java.util.List;

/**
 * Created by James on 14/08/2017.
 */
public class ItemSceptre extends Item {
    protected String name;
    int SceptreType;

    public ItemSceptre(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setMaxDamage(200);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack item = player.getHeldItem(hand);
        item.damageItem(1,player);


        if(item.getItem()==ModItems.sceptreDislocation)
        {
            if(player.isSneaking())
            {
                Helper.changeTag(item,"px",player.getPosition().getX());
                Helper.changeTag(item,"py",player.getPosition().getY());
                Helper.changeTag(item,"pz",player.getPosition().getZ());
                player.sendMessage(new TextComponentString("Return location set to: "+String.valueOf(player.getPosition())));
            }
            else
            {
                try
                {
                    if(item.getTagCompound().getInteger("py")>= 2)
                    {
                        player.setPosition(item.getTagCompound().getInteger("px"), item.getTagCompound().getInteger("py"), item.getTagCompound().getInteger("pz"));
                    }
                }
                catch(NullPointerException e){}
            }
        }
        if(item.getItem()==ModItems.sceptreUprising)
        {
            Vec3d target = player.getLookVec().add(player.getPositionVector());

            player.motionX = (target.x - player.posX) * 3F;
            player.motionY = (target.y - player.posY) * 2F;
            player.motionZ = (target.z - player.posZ) * 3F;
            player.fallDistance = 0;

        }
        if(item.getItem()==ModItems.sceptreFreezing)
        {
            BlockPos coords = player.getPosition();
            List<EntityLiving> allentities = world.getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(coords.getX() - 10, coords.getY() - 10, coords.getZ() - 10, coords.getX() + 15, coords.getY() + 10, coords.getZ() + 10));

            int i = 0;
            while(i != allentities.size())
            {
                allentities.get(i).addPotionEffect(new PotionEffect(Potion.getPotionById(2),1000,200));

                player.removePotionEffect(Potion.getPotionById(2));

                i++;
            }
        }

        return super.onItemRightClick(world, player, hand);
    }
}




