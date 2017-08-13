package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.custom.research.Research;
import com.pengu.lostthaumaturgy.custom.research.ResearchRegistry;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Blocks.ModBlocks;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

import java.lang.reflect.Field;

/**
 * Created by James on 06/08/2017.
 */
public class ResearchesTE {

    public static final Research
        ichor = new Research(thec.modId+":ichor",90,Research.CATEGORY_ELDRITCH).setColor(0xf4b642).setIcon(new ItemStack(ModItems.ichor)),
        ichorium = new Research(thec.modId+":ichorium",90,Research.CATEGORY_ELDRITCH).setColor(0xf48042).setIcon(new ItemStack(ModItems.ichorium)),
        eladder = new Research(thec.modId+":eladder",30,Research.CATEGORY_BASICS).setColor(0x7c3b06).setIcon(new ItemStack(ModBlocks.blockELadder)),
        ichorcloth = new Research(thec.modId+":ichorcloth",90,Research.CATEGORY_ELDRITCH).setColor(0xf4a742).setIcon(new ItemStack(ModItems.ichorcloth)),
        blackhole = new Research(thec.modId+":blackhole",40,Research.CATEGORY_ELDRITCH).setColor(0x2f0b68).setIcon(new ItemStack(ModItems.bhc));

    public static void registerResearches()
    {
        for(Field f : ResearchesTE.class.getDeclaredFields())
            if(Research.class.isAssignableFrom(f.getType()))
                try
                {
                    Research r = (Research) f.get(null);
                    ResearchRegistry.registerResearch(r);
                } catch(Throwable er)
                {
                }

    }

}
