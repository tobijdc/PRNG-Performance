package com.tobijdc.playground.xorshiftperformance;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tobijdc
 */
public class RandomPerformance {

    private static final int WARM_UP_REPEATS = 100000;
    private static final int REPEATS = 5;
    private static final int[] NUM_GENERATIONS = {100000, 1000000, 10000000,
        100000000};

    private final List<IRandomGenerator> generators;

    public RandomPerformance(final List<IRandomGenerator> generators) {
        this.generators = generators;
    }

    public void performTest() {
        warmUp();
        System.out.println(System.lineSeparator() + "Doubles:");
        System.out.println("=================================================");
        for (int generatedNumbers : NUM_GENERATIONS) {
            System.out.println(generatedNumbers + " Generated Numbers");
            System.out.println("-------------------------------------------------");
            for (IRandomGenerator generator : generators) {
                long time = System.currentTimeMillis();
                generateRandomDoubles(generator, generatedNumbers);
                time = System.currentTimeMillis() - time;
                System.out.println(generator.getName() + ": " + time / REPEATS + " ms");
            }
            System.out.println("-------------------------------------------------");
        }

        System.out.println(System.lineSeparator() + "Long:");
        System.out.println("=================================================");
        for (int generatedNumbers : NUM_GENERATIONS) {
            System.out.println(generatedNumbers + " Generated Numbers");
            System.out.println("-------------------------------------------------");
            for (IRandomGenerator generator : generators) {
                long time = System.currentTimeMillis();
                generateRandomLong(generator, generatedNumbers);
                time = System.currentTimeMillis() - time;
                System.out.println(generator.getName() + ": " + time / REPEATS + " ms");
            }
            System.out.println("-------------------------------------------------");
        }

        System.out.println(System.lineSeparator() + "Integer:");
        System.out.println("=================================================");
        for (int generatedNumbers : NUM_GENERATIONS) {
            System.out.println(generatedNumbers + " Repeats;");
            System.out.println("-------------------------------------------------");
            for (IRandomGenerator generator : generators) {
                long time = System.currentTimeMillis();
                generateRandomIntegers(generator, generatedNumbers);
                time = System.currentTimeMillis() - time;
                System.out.println(generator.getName() + ": " + time / REPEATS + " ms");
            }
            System.out.println("-------------------------------------------------");
        }
    }

    private void warmUp() {
        for (IRandomGenerator generator : generators) {
            generateRandomDoubles(generator, WARM_UP_REPEATS);
            generateRandomIntegers(generator, WARM_UP_REPEATS);
            generateRandomLong(generator, WARM_UP_REPEATS);
        }
    }

    private void generateRandomDoubles(final IRandomGenerator generator,
            final long repeats) {
        for (int j = 0; j < REPEATS; ++j) {
            for (int i = 0; i < repeats; ++i) {
                generator.generateDouble();
            }
        }
    }

    private void generateRandomIntegers(final IRandomGenerator generator,
            final long repeats) {
        for (int j = 0; j < REPEATS; ++j) {
            for (int i = 0; i < repeats; ++i) {
                generator.generateInt();
            }
        }
    }

    private void generateRandomLong(final IRandomGenerator generator,
            final long repeats) {
        for (int j = 0; j < REPEATS; ++j) {
            for (int i = 0; i < repeats; ++i) {
                generator.generateLong();
            }
        }
    }

    public static void main(final String... args) {

        List<IRandomGenerator> generators = new ArrayList<>();
        generators.add(new DsiSplitMix64());
        generators.add(new DsiXorShift128Plus());
        generators.add(new DsiXorShift1024Star());
        generators.add(new Java8SplitableRandom());
        generators.add(new UtilRandom());

        RandomPerformance randomPerformance = new RandomPerformance(generators);
        randomPerformance.performTest();
    }

}
