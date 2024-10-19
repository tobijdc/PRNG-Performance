package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.RG17Xoroshiro128PlusPlus;
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
public class BenchmarkRGXoroshiro128PlusPlus {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new RG17Xoroshiro128PlusPlus();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusPlusLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusPlusDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusPlusInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
