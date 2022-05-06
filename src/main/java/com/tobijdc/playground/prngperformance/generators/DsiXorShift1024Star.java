package com.tobijdc.playground.prngperformance.generators;

import it.unimi.dsi.util.XorShift1024StarPhiRandom;
import java.util.Random;

/**
 *
 * @author tobijdc
 */
public class DsiXorShift1024Star implements RandomGenerator {

    private static final String NAME = "DSI Utils Xorshift1024*Phi";
    private final Random random;

    public DsiXorShift1024Star() {
        random = new XorShift1024StarPhiRandom();
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
