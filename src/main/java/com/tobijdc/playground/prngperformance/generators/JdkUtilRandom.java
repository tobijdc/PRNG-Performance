package com.tobijdc.playground.prngperformance.generators;

import java.util.Random;

/**
 *
 * @author tobijdc
 */
public class JdkUtilRandom implements RandomGenerator {

    private static final String NAME = "Java8 SplitableRandom";
    private final Random random;

    public JdkUtilRandom() {
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
