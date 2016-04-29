package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.DsiXorShift1024Star;
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
public class BenchmarkXorShift1024Star {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new DsiXorShift1024Star();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift1024StarLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift1024StarDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift1024StarInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
