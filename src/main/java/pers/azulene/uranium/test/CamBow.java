package pers.azulene.uranium.test;

import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;

public class CamBow extends BowItem {
        public CamBow() {
            super(new Properties().tab(ModGroup.ITEM_GROUP));
        }
}
