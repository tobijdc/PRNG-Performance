package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.DsiSplitMix64;
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
public class BenchmarkSplitMix64 {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new DsiSplitMix64();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void splitMix64Long(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void splitMix64Double(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void splitMix64Int(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
