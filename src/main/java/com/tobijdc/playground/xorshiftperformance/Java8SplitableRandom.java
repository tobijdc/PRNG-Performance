package com.tobijdc.playground.xorshiftperformance;

import java.util.SplittableRandom;

/**
 *
 * @author tobijdc
 */
public class Java8SplitableRandom implements IRandomGenerator {

    private static final String NAME = "Java8 SplitableRandom";
    private final SplittableRandom random;

    public Java8SplitableRandom() {
        random = new SplittableRandom();
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
