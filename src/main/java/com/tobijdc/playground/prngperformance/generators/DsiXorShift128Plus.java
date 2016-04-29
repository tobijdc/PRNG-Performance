package com.tobijdc.playground.prngperformance.generators;

import it.unimi.dsi.util.XorShift128PlusRandom;
import java.util.Random;

/**
 *
 * @author tobijdc
 */
public class DsiXorShift128Plus implements RandomGenerator {

    private static final String NAME = "DSI Utils XorShift128+";
    private final Random random;

    public DsiXorShift128Plus() {
        random = new XorShift128PlusRandom();
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
