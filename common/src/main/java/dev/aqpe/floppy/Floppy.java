package dev.aqpe.floppy;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Floppy.MODID)
public class Floppy {
    public static final String MODID = "floppy";
    public static final Logger LOGGER = LogUtils.getLogger();

    private void commonSetup(FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("Floppy is enabled. Your fish will survive. :)");
    }
}
