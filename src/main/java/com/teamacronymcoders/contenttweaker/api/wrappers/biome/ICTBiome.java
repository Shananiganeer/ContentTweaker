package com.teamacronymcoders.contenttweaker.api.wrappers.biome;

import crafttweaker.api.world.IBiome;

public interface ICTBiome extends IBiome {
    float getTemperature();

    float getRainfall();

    boolean canRain();

    boolean canSnow();

    float getHeightVariance();
}
