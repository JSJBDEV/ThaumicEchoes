package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.api.research.ResearchCategories;
import com.pengu.lostthaumaturgy.api.research.ResearchItem;
import com.pengu.lostthaumaturgy.api.research.ResearchPage;
import com.pengu.lostthaumaturgy.core.Info;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import uk.co.conclipsegames.thec.Blocks.ModBlocks;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 06/08/2017.
 */
public class ResearchesTE {

    public static void registerResearches()
    {
        ResearchCategories.registerCategory("techo", new ResourceLocation(thec.modId, "textures/items/ichor.png"), new ResourceLocation(Info.MOD_ID, "textures/gui/book/basics_back.png"));

        new ResearchItem("ichor", "techo", 0, 0, 0, new ResourceLocation(thec.modId, "textures/items/ichor.png")).setRound().setPages(new ResearchPage("research.thec:ichor.desc")).registerResearch();
        new ResearchItem("ichorium", "techo", 0, -1, 0, new ResourceLocation(thec.modId, "textures/items/ichorium.png")).setRound().setPages(new ResearchPage("research.thec:ichorium.desc")).registerResearch();
        new ResearchItem("eladder", "techo", 0, -5, 0, new ItemStack(ModBlocks.blockELadder)).setRound().setPages(new ResearchPage("research.thec:eladder.desc")).registerResearch();
        new ResearchItem("ichorcloth", "techo", 1, 0, 0, new ResourceLocation(thec.modId, "textures/items/ichor_cloth.png")).setRound().setPages(new ResearchPage("research.thec:ichorcloth.desc")).registerResearch();
        new ResearchItem("blackhole", "techo", -1, -5, 0, new ResourceLocation(thec.modId, "textures/items/item_bhc.png")).setRound().setPages(new ResearchPage("research.thec:blackhole.desc")).registerResearch();
        new ResearchItem("sceptre", "techo", -2, -5, 0, new ItemStack(ModItems.sceptreFreezing)).setRound().setPages(new ResearchPage("research.thec:sceptre.desc")).registerResearch();
        new ResearchItem("xpstore", "techo", -3, -5, 0, new ResourceLocation(thec.modId, "textures/items/xpcharm.png")).setRound().setPages(new ResearchPage("research.thec:xpstore.desc")).registerResearch();
        new ResearchItem("rebirth", "techo", 1, 2, 0, new ResourceLocation(thec.modId, "textures/items/death_tag.png")).setRound().setPages(new ResearchPage("research.thec:rebirth.desc")).registerResearch();

    }


}
