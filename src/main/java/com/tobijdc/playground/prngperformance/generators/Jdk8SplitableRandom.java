package com.tobijdc.playground.prngperformance.generators;

import java.util.SplittableRandom;

/**
 *
 * @author tobijdc
 */
public class Jdk8SplitableRandom implements RandomGenerator {

    private static final String NAME = "Java8 SplitableRandom";
    private final SplittableRandom random;

    public Jdk8SplitableRandom() {
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
