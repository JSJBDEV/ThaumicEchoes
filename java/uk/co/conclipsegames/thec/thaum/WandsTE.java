package uk.co.conclipsegames.thec.thaum;

import uk.co.conclipsegames.thec.thaum.wands.WandCapIchorium;
import uk.co.conclipsegames.thec.thaum.wands.WandCapOP;
import uk.co.conclipsegames.thec.thaum.wands.WandRodIchorium;

import com.pengu.lostthaumaturgy.api.wand.WandCap;
import com.pengu.lostthaumaturgy.api.wand.WandRegistry;
import com.pengu.lostthaumaturgy.api.wand.WandRod;
import uk.co.conclipsegames.thec.thaum.wands.WandRodOP;

/**
 * Created by James on 12/08/2017.
 */
public class WandsTE {

    public static final WandCap
        CAP_ICHORIUM = new WandCapIchorium(),
        CAP_OP = new WandCapOP();


    public static final WandRod
        ROD_ICHOR = new WandRodIchorium(),
        ROD_OP = new WandRodOP();

    public static void init()
    {
        try
        {
            Thread.sleep(500L);
        } catch(Throwable err)
        {
        }
    }
    static
    {
        WandRegistry.registerCap(CAP_ICHORIUM);
        WandRegistry.registerCap(CAP_OP);
        WandRegistry.registerRod(ROD_ICHOR);
        WandRegistry.registerRod(ROD_OP);
        WandRegistry.registerCreativeSubitem(ROD_ICHOR,CAP_ICHORIUM);
        WandRegistry.registerCreativeSubitem(ROD_OP,CAP_OP);

    }
}
