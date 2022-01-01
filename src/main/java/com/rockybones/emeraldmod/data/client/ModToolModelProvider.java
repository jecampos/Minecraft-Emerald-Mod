package com.rockybones.emeraldmod.data.client;

import com.rockybones.emeraldmod.EmeraldMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModToolModelProvider extends ItemModelProvider {

    public ModToolModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, EmeraldMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("emerald_axe", modLoc("item/emerald_axe"));
        withExistingParent("emerald_hoe", modLoc("item/emerald_hoe"));
        withExistingParent("emerald_pickaxe", modLoc("item/emerald_pickaxe"));
        withExistingParent("emerald_shovel", modLoc("item/emerald_shovel"));
        withExistingParent("emerald_sword", modLoc("item/emerald_sword"));

        withExistingParent("emerald_helmet", modLoc("item/emerald_helmet"));



        ModelFile toolGenerated = getExistingFile(mcLoc("item/handheld"));
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(toolGenerated, "emerald_axe");
        builder(toolGenerated, "emerald_hoe");
        builder(toolGenerated, "emerald_pickaxe");
        builder(toolGenerated, "emerald_shovel");
        builder(toolGenerated, "emerald_sword");

        builder(itemGenerated, "emerald_helmet");
        builder(itemGenerated, "emerald_chestplate");
        builder(itemGenerated, "emerald_leggings");
        builder(itemGenerated, "emerald_boots");


    }

    private ItemModelBuilder builder(ModelFile toolGenerated, String name) {
        return getBuilder(name).parent(toolGenerated).texture("layer0", "item/" + name);
    }


}
