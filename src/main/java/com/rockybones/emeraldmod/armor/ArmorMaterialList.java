package com.rockybones.emeraldmod.armor;

import com.rockybones.emeraldmod.EmeraldMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial {

    EMERALD(35, new int[]{3, 6, 8, 3}, 30, "item.armor.equip_generic",Items.EMERALD, "emerald", 2.5F, 0.1F);

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private int durability, enchantability;
    private int[] defense;
    Item repairIngredient;
    String name, equipSound;
    float toughness, knockbackResistance;

    private ArmorMaterialList(int durability, int[] defense, int enchantability, String equipSound, Item repairIngredient, String name, float toughness, float knockbackResistance)
    {
        this.durability = durability;
        this.defense = defense;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairIngredient = repairIngredient;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.defense[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return new SoundEvent(new ResourceLocation(equipSound));
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient);
    }

    @Override
    public String getName() {
        return EmeraldMod.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
