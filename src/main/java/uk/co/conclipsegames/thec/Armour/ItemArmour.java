package uk.co.conclipsegames.thec.Armour;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import uk.co.conclipsegames.thec.Items.ItemModelProvider;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 15/08/2017.
 */
public class ItemArmour extends ItemArmor implements ItemModelProvider {
    private String name;
    EntityEquipmentSlot sslot;
    boolean[] wasWearing = new boolean[4];

    public ItemArmour(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
        this.sslot = slot;
    }

    @Override
    public void registerItemModel(Item item) {
        thec.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public void onArmorTick(World p_onArmorTick_1_, EntityPlayer player, ItemStack armour) {

        if(armour.getItem() == ModItems.ichorchest)
        {

                player.capabilities.allowFlying = true;
                wasWearing[0] = true;

        }
        else
        {
            if(wasWearing[0])
            {
                player.capabilities.allowFlying = false;
                wasWearing[0] = false;
            }
        }


        if(armour.getItem() == ModItems.ichorleggings)
        {

            player.capabilities.setPlayerWalkSpeed(1.5f);
            wasWearing[1] = true;


        }
        else
        {
            if(wasWearing[1])
            {
            player.capabilities.setPlayerWalkSpeed(1);
            wasWearing[1] = false;
            }
        }

        if(armour.getItem() == ModItems.ichorboots)
        {

            if(player.isAirBorne && player.isSneaking())
            {
                Vec3d target = player.getLookVec().add(player.getPositionVector());

                player.motionX = (target.xCoord - player.posX) * 3F;
                player.motionY = (target.yCoord - player.posY) * 2F;
                player.motionZ = (target.zCoord - player.posZ) * 3F;
                player.fallDistance = 0;
            }

        }
        else
        {
            if(wasWearing[2])
            {

                wasWearing[2] = false;
            }
        }

        if(armour.getItem() == ModItems.ichorhelmet)
        {

           player.addPotionEffect(new PotionEffect(Potion.getPotionById(16),500,3));
           player.addPotionEffect(new PotionEffect(Potion.getPotionById(23),500,3));

        }




        super.onArmorTick(p_onArmorTick_1_, player, armour);
    }

    @Override
    public void onUpdate(ItemStack p_onUpdate_1_, World p_onUpdate_2_, Entity entity, int p_onUpdate_4_, boolean p_onUpdate_5_) {
        EntityPlayer player = p_onUpdate_2_.getClosestPlayer(entity.getPosition().getX(),entity.getPosition().getY(),entity.getPosition().getZ(),1,false);
        if(wasWearing[0])
        {
            try
            {
            player.capabilities.allowFlying = false;
            wasWearing[0] = false;
            }
            catch(NullPointerException e)
            {

            }

        }
        super.onUpdate(p_onUpdate_1_, p_onUpdate_2_, entity, p_onUpdate_4_, p_onUpdate_5_);
    }

    @Override
    public ItemArmour setCreativeTab(CreativeTabs p_setCreativeTab_1_) {
        super.setCreativeTab(p_setCreativeTab_1_);
        return this;
    }
}
