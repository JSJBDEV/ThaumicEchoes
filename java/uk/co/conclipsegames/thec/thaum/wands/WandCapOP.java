package uk.co.conclipsegames.thec.thaum.wands;

import com.pengu.lostthaumaturgy.api.wand.WandCap;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 12/08/2017.
 */
public class WandCapOP extends WandCap {

    public WandCapOP()
    {
        super("op");
        capItem = new ItemStack(ModItems.capOp);
    }

    @Override
    public float getUseCost()
    {
        return -99999;
    }

    @Override
    public String getCapTexture()
    {
        return thec.modId + ":items/cap_op_mat";
    }

    @Override
    public int getCraftCost()
    {
        return 200;
    }
}
