package uk.co.conclipsegames.thec.thaum.wands;

import com.pengu.lostthaumaturgy.api.wand.WandRod;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 13/08/2017.
 */
public class WandRodOP extends WandRod {
    public WandRodOP()
    {
        super("op");
        rodItem = new ItemStack(ModItems.WandRodOp);
    }

    @Override
    public float getBaseCost()
    {
        return 5;
    }

    @Override
    public float getRodCapacity()
    {
        return 99999;
    }

    @Override
    public String getRodTexture()
    {
        return thec.modId + ":items/rod_op_mat";
    }

    @Override
    public int getCraftCost()
    {
        return 200;
    }
}
