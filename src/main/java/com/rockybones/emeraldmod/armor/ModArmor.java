package com.rockybones.emeraldmod.armor;

import com.rockybones.emeraldmod.setup.Registration;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModArmor {
    public static final RegistryObject<ArmorItem> EMERALD_HELMET = Registration.ARMOR.register("emerald_helmet", () ->
            new ArmorItem(ArmorMaterialList.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = Registration.ARMOR.register("emerald_chestplate", () ->
            new ArmorItem(ArmorMaterialList.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = Registration.ARMOR.register("emerald_leggings", () ->
            new ArmorItem(ArmorMaterialList.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = Registration.ARMOR.register("emerald_boots", () ->
            new ArmorItem(ArmorMaterialList.EMERALD, EquipmentSlotType.FEET, new Item.Properties().tab(ItemGroup.TAB_COMBAT).stacksTo(1)));

    public static void register() {}
}
