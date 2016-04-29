package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.DsiXoroshiro128Plus;
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
public class BenchmarkXoroshiro128Plus {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new DsiXoroshiro128Plus();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xoroshiro128PlusInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
