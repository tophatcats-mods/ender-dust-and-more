package dev.tophatcat.kirismoddingtemplate.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        //fabricDataGenerator.addProvider(KirisLootProvider::new);
        //fabricDataGenerator.addProvider(KirisModelProvider::new);
    }
}
