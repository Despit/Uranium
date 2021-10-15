package pers.azulene.uranium.test;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;

@Mod(Utils.MOD_id)
public class Test {
        public Test(){
            ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        }
    }
