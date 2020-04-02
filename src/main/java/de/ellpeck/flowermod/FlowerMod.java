package de.ellpeck.flowermod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FlowerMod.ID)
public class FlowerMod {

    public static final String ID = "flowermod";
    public static final Logger LOGGER = LogManager.getLogger("Flower Mod");

    public FlowerMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(FMLCommonSetupEvent event) {
        LOGGER.info("Flower Mod loading...");
    }
}
