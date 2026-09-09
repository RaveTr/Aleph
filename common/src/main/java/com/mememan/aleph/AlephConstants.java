package com.mememan.aleph;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class AlephConstants {
	public static final String MOD_ID = "aleph";
	public static final String MOD_NAME = "Aleph API";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	public static ResourceLocation prefix(String path) {
		return new ResourceLocation(MOD_ID, path.toLowerCase(Locale.ROOT));
	}
}