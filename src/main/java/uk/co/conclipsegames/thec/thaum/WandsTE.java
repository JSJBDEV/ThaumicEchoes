package uk.co.conclipsegames.thec.thaum;

import uk.co.conclipsegames.thec.thaum.wands.WandCapIchorium;
import uk.co.conclipsegames.thec.thaum.wands.WandRodIchorium;

import com.pengu.lostthaumaturgy.api.wand.WandCap;
import com.pengu.lostthaumaturgy.api.wand.WandRegistry;
import com.pengu.lostthaumaturgy.api.wand.WandRod;

/**
 * Created by James on 12/08/2017.
 */
public class WandsTE {

    public static final WandCap
        CAP_ICHORIUM = new WandCapIchorium();


    public static final WandRod
        ROD_ICHOR = new WandRodIchorium();

    public static void init()
    {
    }
    static
    {
        WandRegistry.registerCap(CAP_ICHORIUM);
        WandRegistry.registerRod(ROD_ICHOR);
        WandRegistry.registerCreativeSubitem(ROD_ICHOR,CAP_ICHORIUM);
    }
}
