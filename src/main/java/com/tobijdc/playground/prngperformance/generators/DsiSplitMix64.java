package com.tobijdc.playground.prngperformance.generators;

import it.unimi.dsi.util.SplitMix64Random;
import java.util.Random;

/**
 *
 * @author tobijdc
 */
public class DsiSplitMix64 implements RandomGenerator {

    private static final String NAME = "DSI Utils SplitMix64";
    private final Random random;

    public DsiSplitMix64() {
        random = new SplitMix64Random();
    }

    @Override
    public long generateLong() {
        return random.nextLong();
    }

    @Override
    public double generateDouble() {
        return random.nextDouble();
    }

    @Override
    public int generateInt() {
        return random.nextInt();
    }

    @Override
    public String getName() {
        return NAME;
    }

}
