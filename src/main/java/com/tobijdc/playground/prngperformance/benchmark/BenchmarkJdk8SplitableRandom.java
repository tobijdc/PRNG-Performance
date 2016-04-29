package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.Jdk8SplitableRandom;
import com.tobijdc.playground.prngperformance.generators.RandomGenerator;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

/**
 *
 * @author tobijdc
 */
@State(Scope.Thread)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class BenchmarkJdk8SplitableRandom {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new Jdk8SplitableRandom();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdk8SplitableRandomLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdk8SplitableRandomDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdk8SplitableRandomInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
