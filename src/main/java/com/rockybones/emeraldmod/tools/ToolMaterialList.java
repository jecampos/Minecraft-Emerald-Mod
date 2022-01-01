package com.rockybones.emeraldmod.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {

    EMERALD(3.5F, 7.0F, 1796, 3, 30, Items.EMERALD),
    EMERALD2(3.0F, 7.0F, 1796, 3, 30, Items.EMERALD);


    private float attackDamageBonus, speed;
    private int uses, level, enchantmentValue;
    private Item repairIngredient;

    ToolMaterialList(float attackDamageBonus, float speed, int uses, int level, int enchantmentValue, Item repairIngredient) {
        this.attackDamageBonus = attackDamageBonus;
        this.speed = speed;
        this.uses = uses;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(this.repairIngredient);
    }
}
