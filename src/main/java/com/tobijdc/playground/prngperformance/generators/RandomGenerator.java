package com.tobijdc.playground.prngperformance.generators;

/**
 * Interface for Random number generator.
 * <p>
 * @author tobijdc
 */
public interface RandomGenerator {

    long generateLong();

    double generateDouble();

    int generateInt();
    
    String getName();

}
