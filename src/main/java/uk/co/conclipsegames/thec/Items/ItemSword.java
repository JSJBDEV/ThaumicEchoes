package uk.co.conclipsegames.thec.Items;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;

import java.util.List;

/**
 * Created by James on 06/08/2017.
 */
public class ItemSword extends net.minecraft.item.ItemSword {
    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        this.name = name;
    }



    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        BlockPos coords = attacker.getPosition();
        List<EntityLiving> allentities = attacker.getEntityWorld().getEntitiesWithinAABB(EntityLiving.class, new AxisAlignedBB(coords.getX() - 10, coords.getY() - 10, coords.getZ() - 10, coords.getX() + 15, coords.getY() + 10, coords.getZ() + 10));

        int i = 0;
        while(i != allentities.size())
        {
            allentities.get(i).setHealth(allentities.get(i).getHealth()-10);
            attacker.heal(1);
            i++;
        }
        return super.hitEntity(stack, target, attacker);
    }
}
