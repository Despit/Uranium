package pers.azulene.uranium.test;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class UraniumGroup extends ItemGroup {
    public UraniumGroup(){
        super("UraniumGroup");
    }

    @Override
    public ItemStack makeIcon(){
        return new ItemStack(ItemRegistry.ItemCamBow.get());
    }
}
