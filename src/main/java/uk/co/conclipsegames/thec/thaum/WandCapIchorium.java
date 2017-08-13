package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.api.wand.WandCap;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 12/08/2017.
 */
public class WandCapIchorium extends WandCap {

    public WandCapIchorium()
    {
        super("ichorium");
        capItem = new ItemStack(ModItems.capIchor);
    }

    @Override
    public float getUseCost()
    {
        return -20;
    }

    @Override
    public String getCapTexture()
    {
        return thec.modId + ":items/ichor_cap";
    }

    @Override
    public int getCraftCost()
    {
        return 40;
    }
}
