package com.rockybones.emeraldmod.armor;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Iterator;

//code from https://stackoverflow.com/questions/61700666/a-method-that-activates-when-i-equip-armor
//and http://jabelarminecraft.blogspot.com/p/minecraft-forge-tips-on-modding-armor.html

public final class ItemArmorCheck {

    public ItemArmorCheck() {}

    @SubscribeEvent
    public void ArmorBoostsWhenEquipped(PlayerTickEvent event) {
        PlayerEntity playerEntity = event.player;

        if (playerEntity != null) {
            int emeraldItems = 0;
            Iterator<ItemStack> armor = playerEntity.getArmorSlots().iterator();

            while (armor.hasNext()) {

                Item currentItem = armor.next().getItem();

                if(currentItem.equals(ModArmor.EMERALD_HELMET.get().getItem()) ||
                        currentItem.equals(ModArmor.EMERALD_CHESTPLATE.get().getItem()) ||
                        currentItem.equals(ModArmor.EMERALD_LEGGINGS.get().getItem()) ||
                        currentItem.equals(ModArmor.EMERALD_BOOTS.get().getItem())) {
                    emeraldItems++;
                }
            }

            switch (emeraldItems) {
                case 1:
                    playerEntity.addEffect(new EffectInstance(Effects.LUCK, 200, 0, true, false));
                    break;

                case 2:
                    playerEntity.addEffect(new EffectInstance(Effects.LUCK, 200, 1,true, false));
                    break;

                case 3:
                    playerEntity.addEffect(new EffectInstance(Effects.LUCK, 200, 2,true, false));
                    break;

                case 4:
                    playerEntity.addEffect(new EffectInstance(Effects.LUCK, 200, 3,true, false));
                    playerEntity.addEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 200, 0,true, false));
                    break;
            }
        }
    }
}
