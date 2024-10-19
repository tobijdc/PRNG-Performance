package com.tobijdc.playground.prngperformance.generators;

import java.util.random.RandomGenerator;

/**
 *
 * @author tobijdc
 */
public class RG17Xoroshiro128PlusPlus extends RandomGeneratorRG {

    public RG17Xoroshiro128PlusPlus() {
        super("JDK RG Xoroshiro128PlusPlus", RandomGenerator.of("Xoroshiro128PlusPlus"));
    }

}
