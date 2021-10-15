package pers.azulene.uranium.test;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,Utils.MOD_id);
        public static final RegistryObject<Item> ItemCamBow = ITEMS.register("cambow", CamBow::new);
}
