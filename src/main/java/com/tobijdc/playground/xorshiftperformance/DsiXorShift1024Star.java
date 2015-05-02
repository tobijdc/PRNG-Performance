package com.tobijdc.playground.xorshiftperformance;

import it.unimi.dsi.util.XorShift1024StarRandom;
import java.util.Random;

/**
 *
 * @author tobijdc
 */
public class DsiXorShift1024Star implements IRandomGenerator {

    private static final String NAME = "DSI Utils Xorshift1024*";
    private final Random random;

    public DsiXorShift1024Star() {
        random = new XorShift1024StarRandom();
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
