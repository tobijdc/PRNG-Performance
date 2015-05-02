package com.tobijdc.playground.xorshiftperformance;

/**
 * Interface for Random number generator.
 * <p>
 * @author tobijdc
 */
public interface IRandomGenerator {

    long generateLong();

    double generateDouble();

    int generateInt();
    
    String getName();

}
