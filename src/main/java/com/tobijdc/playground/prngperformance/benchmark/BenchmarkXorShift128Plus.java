package com.tobijdc.playground.prngperformance.benchmark;

import com.tobijdc.playground.prngperformance.generators.DsiXorShift128Plus;
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
public class BenchmarkXorShift128Plus {

    private RandomGenerator random;

    @Setup(Level.Trial)
    public void doSetup() {
        random = new DsiXorShift128Plus();
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift128PlusLong(Blackhole blackhole) {
        blackhole.consume(random.generateLong());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift128PlusDouble(Blackhole blackhole) {
        blackhole.consume(random.generateDouble());
    }

    @Benchmark
    @BenchmarkMode(Mode.SampleTime)
    public void xorShift128PlusInt(Blackhole blackhole) {
        blackhole.consume(random.generateInt());
    }

}
