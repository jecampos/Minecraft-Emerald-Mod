package com.rockybones.emeraldmod.tools;

import com.rockybones.emeraldmod.setup.Registration;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class ModTools {
    public static final RegistryObject<AxeItem> EMERALD_AXE = Registration.TOOLS.register("emerald_axe", () ->
            new AxeItem(ToolMaterialList.EMERALD, 5, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = Registration.TOOLS.register("emerald_hoe", () ->
            new HoeItem(ToolMaterialList.EMERALD2, -3, 0.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICkAXE = Registration.TOOLS.register("emerald_pickaxe", () ->
            new PickaxeItem(ToolMaterialList.EMERALD, 1, -2.8F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = Registration.TOOLS.register("emerald_shovel", () ->
            new ShovelItem(ToolMaterialList.EMERALD2, 2, -3.0F, new Item.Properties().tab(ItemGroup.TAB_TOOLS).stacksTo(1)));

    public static final RegistryObject<SwordItem> EMERALD_SWORD = Registration.TOOLS.register("emerald_sword", () ->
            new SwordItem(ToolMaterialList.EMERALD, 3, -2.4F, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

            public static void register() {}

}
