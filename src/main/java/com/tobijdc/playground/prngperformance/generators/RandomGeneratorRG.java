package com.tobijdc.playground.prngperformance.generators;

/**
 * Abstract Class for easier RandomGenerator implementation.
 * <p>
 * @author tobijdc
 */
public class RandomGeneratorRG implements RandomGenerator {

    protected String name;
    protected final java.util.random.RandomGenerator random;

    public RandomGeneratorRG(String name, java.util.random.RandomGenerator rg) {
        this.name = name;
        random = rg;
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
        return name;
    }

}
