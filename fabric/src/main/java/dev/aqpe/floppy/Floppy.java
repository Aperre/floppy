package dev.aqpe.floppy;

import com.mojang.logging.LogUtils;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;

public class Floppy implements ModInitializer {
	public static final String MOD_ID = "floppy";
    public static final Logger LOGGER = LogUtils.getLogger();

	@Override
	public void onInitialize() {
        LOGGER.info("Floppy is enabled. Your fish will survive. :)");
	}
}