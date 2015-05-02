package com.tobijdc.playground.xorshiftperformance;

import java.util.Random;

/**
 *
 *
 * @author tobijdc
 */
public class UtilRandom implements IRandomGenerator {
    
    private static final String NAME = "java.util.Random";
    private final Random random;

    public UtilRandom() {
        random = new Random();
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
