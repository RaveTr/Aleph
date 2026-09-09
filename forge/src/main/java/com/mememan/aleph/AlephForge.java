package com.mememan.aleph;

import net.minecraftforge.fml.common.Mod;

@Mod(AlephConstants.MOD_ID)
public class AlephForge {
    
    public AlephForge() {
        Aleph.initialize();
    }
}