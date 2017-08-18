package uk.co.conclipsegames.thec.thaum.wands;

import com.pengu.lostthaumaturgy.api.wand.WandRod;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 13/08/2017.
 */
public class WandRodIchorium extends WandRod {
    public WandRodIchorium()
    {
        super("ichorcloth");
        rodItem = new ItemStack(ModItems.rodIchor);
    }

    @Override
    public float getBaseCost()
    {
        return 70;
    }

    @Override
    public float getRodCapacity()
    {
        return 200;
    }

    @Override
    public String getRodTexture()
    {
        return thec.modId + ":items/rod_ichor_mat";
    }

    @Override
    public int getCraftCost()
    {
        return 50;
    }
}
