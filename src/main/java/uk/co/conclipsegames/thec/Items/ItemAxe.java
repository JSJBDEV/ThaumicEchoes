package uk.co.conclipsegames.thec.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 06/08/2017.
 */
public class ItemAxe extends net.minecraft.item.ItemPickaxe {
    private String name;

    public ItemAxe(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        this.name = name;
    }
}