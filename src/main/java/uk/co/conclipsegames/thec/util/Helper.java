package uk.co.conclipsegames.thec.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 08/08/2017.
 */
public class Helper {
    //from p3pp3rf1y's reliquary on github https://github.com/P3pp3rF1y/Reliquary/blob/1.11.2/src/main/java/xreliquary/util/InventoryHelper.java modified "slightly"

    public static boolean consumeItem(String itemName, int meta, boolean ignoreMeta, EntityPlayer player, int removeCount) {
        for(int slot = 0; slot < player.inventory.mainInventory.size(); slot++) {
            if(player.inventory.mainInventory.get(slot).isEmpty()) {
                continue;
            }

            ItemStack slotStack = player.inventory.mainInventory.get(slot);
            //noinspection ConstantConditions
            if(slotStack.getItem().getRegistryName().toString().equals(itemName) && (ignoreMeta || slotStack.getMetadata() == meta)) {
                int stackSize = slotStack.getCount();
                if(stackSize > removeCount-1) {
                    slotStack.shrink(removeCount);
                    if (slotStack.getCount() <= 0) {
                        player.inventory.mainInventory.set(slot, ItemStack.EMPTY);
                    }
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean debug = false;
    public static void log(Level logLevel, Object object) { FMLLog.log(thec.modId, logLevel, String.valueOf(object)); }

    public static void error(Object object) { log(Level.ERROR, object); }

    public static void info(Object object) { log(Level.INFO, object); }

    public static void warn(Object object) { log(Level.WARN, object); }

    public static void debug(Object object) { if (debug) { log(Level.DEBUG, object); } }

    public static void resetItem(String itemName, int meta, boolean ignoreMeta, EntityPlayer player, int removeCount)
    {
        consumeItem(itemName,meta,ignoreMeta,player,removeCount);
        player.inventory.addItemStackToInventory(new ItemStack(ModItems.bhc));
    }
    
    public static void changeTag(ItemStack stack, String tagName, int value)
    {
        NBTTagCompound nbt;
        if (stack.hasTagCompound())
        {
            nbt = stack.getTagCompound();
        }
        else
        {
            nbt = new NBTTagCompound();
        }

        if (nbt.hasKey(tagName))
        {
            nbt.setInteger(tagName, value);
        }
        else
        {
            if(value == 0)
            {
            nbt.setInteger(tagName,1);
            }
            else
                {
                    nbt.setInteger(tagName,value);
                }
        }

        stack.setTagCompound(nbt);
    }
    
    public static void changeDoubleTag(ItemStack stack, String tagName, double value)
    {
        NBTTagCompound nbt = stack.hasTagCompound() ? stack.getTagCompound() : new NBTTagCompound();
        nbt.setDouble(tagName,value);
        stack.setTagCompound(nbt);
    }
    
    public static void changeBoolTag(ItemStack stack, String tagName, Boolean value)
    {
        NBTTagCompound nbt;
        if (stack.hasTagCompound())
        {
            nbt = stack.getTagCompound();
        }
        else
        {
            nbt = new NBTTagCompound();
        }

        if (nbt.hasKey(tagName))
        {
            nbt.setBoolean(tagName, value);
        }
        else
        {
            nbt.setBoolean(tagName,false);
        }

        stack.setTagCompound(nbt);
    }
}