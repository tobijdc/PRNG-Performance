package com.tobijdc.playground.prngperformance.generators;

import it.unimi.dsi.util.XorRShR128PlusRandomGenerator;

/**
 *
 * @author tobijdc
 */
public class DsiXoroshiro128Plus implements RandomGenerator {

    private static final String NAME = "DSI Utils XorShift128+";
    private final XorRShR128PlusRandomGenerator random;

    public DsiXoroshiro128Plus() {
        random = new XorRShR128PlusRandomGenerator();
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
