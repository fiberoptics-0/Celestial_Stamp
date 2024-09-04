package org.fiberoptics.celestialstamp.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class StampedBlock extends Block {

    public StampedBlock() {
        super(BlockBehaviour.Properties.of().noCollission().noParticlesOnBreak().instabreak());
    }


}
