package benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

// Benchmark                              Mode  Cnt    Score    Error  Units
//        RandomBenchmark.testRandom             avgt   25  916.592 ± 84.072  ns/op
//        RandomBenchmark.testSplittableRandom   avgt   25   14.983 ±  0.737  ns/op
//        RandomBenchmark.testThreadLocalRandom  avgt   25   15.878 ±  4.315  ns/op

@OutputTimeUnit(TimeUnit.NANOSECONDS)
@BenchmarkMode(Mode.AverageTime)
@Threads(7)
public class RandomBenchmark {

  @Benchmark
  public double testRandom(RandomHolder randomHolder) {
    return randomHolder.random.nextDouble();
  }

  @Benchmark
  public double testThreadLocalRandom() {
    return ThreadLocalRandom.current().nextDouble();
  }

  @Benchmark
  public double testSplittableRandom(SplittableRandomHolder splittableRandomHolder) {
    return splittableRandomHolder.splittableRandom.nextDouble();
  }

  @State(Scope.Benchmark)
  public static class RandomHolder {
    // random instance is thread-safe
    private final Random random = new Random();
  }

  @State(Scope.Thread)
  public static class SplittableRandomHolder {
    private final SplittableRandom splittableRandom = new SplittableRandom();
  }
}
