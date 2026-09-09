package com.mememan.aleph;

import net.fabricmc.api.ModInitializer;

public class AlephFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        Aleph.initialize();
    }
}
