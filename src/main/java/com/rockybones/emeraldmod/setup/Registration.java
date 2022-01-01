package com.rockybones.emeraldmod.setup;

import com.rockybones.emeraldmod.EmeraldMod;
import com.rockybones.emeraldmod.armor.ModArmor;
import com.rockybones.emeraldmod.tools.ModTools;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registration {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldMod.MOD_ID);
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldMod.MOD_ID);

    public static void register() {
        TOOLS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ARMOR.register(FMLJavaModLoadingContext.get().getModEventBus());


        ModTools.register();
        ModArmor.register();
    }
}
