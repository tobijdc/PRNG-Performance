package com.tobijdc.playground.prngperformance.generators;

import java.util.random.RandomGenerator;

/**
 *
 * @author tobijdc
 */
public class RG17Xoshiro256PlusPlus extends RandomGeneratorRG {

    public RG17Xoshiro256PlusPlus() {
        super("JDK RG Xoshiro256PlusPlus", RandomGenerator.of("Xoshiro256PlusPlus"));
    }

}
