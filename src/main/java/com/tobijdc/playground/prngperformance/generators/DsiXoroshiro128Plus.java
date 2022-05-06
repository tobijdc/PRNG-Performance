package com.tobijdc.playground.prngperformance.generators;

import it.unimi.dsi.util.XoRoShiRo128PlusRandomGenerator;

/**
 *
 * @author tobijdc
 */
public class DsiXoroshiro128Plus implements RandomGenerator {

    private static final String NAME = "DSI Utils XoRoShiro128+";
    private final XoRoShiRo128PlusRandomGenerator random;

    public DsiXoroshiro128Plus() {
        random = new XoRoShiRo128PlusRandomGenerator();
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
