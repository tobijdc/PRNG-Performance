package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.JdkUtilRandom;
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
public class BenchmarkJdkUtilRandom {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new JdkUtilRandom();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdkUtilRandomLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdkUtilRandomDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void jdkUtilRandomInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
