package uk.co.conclipsegames.thec.Items;

import net.minecraft.util.SoundEvent;

/**
 * Created by James on 23/08/2017.
 */
public class ItemRecord extends net.minecraft.item.ItemRecord {
    private String name;

    public ItemRecord(String name, SoundEvent soundname) {
        super(name,soundname);
        setUnlocalizedName(name);
        this.name = name;
    }
}
