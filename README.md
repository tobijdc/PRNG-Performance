# About PRNG-Performance

A simple independent comparison of several **P**seudo **R**andom **N**umber **G**enerators in Java.
The newest Version of this Test is based on [JMH](http://openjdk.java.net/projects/code-tools/jmh/), a library for creating benchmarks on the JVM.

## How to Run

### Windows

`.\mvnw.cmd clean compile exec:java`

### Linux

`./mvnw clean compile exec:java`

## Algorithms

* [java.util.Random](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html)
* [SplittableRandom](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/SplittableRandom.html)
* Other Alorithms using [dsiutils](https://dsiutils.di.unimi.it/)
* In the 2024 results I now included some of the [JDK 17 java.util.random package](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/random/package-summary.html) algorithms.

## Results 2024

These are the results from my PC running Ryzen 5 5600G and OpenJDK 64-Bit Server VM Temurin-17.0.12+7.
Raw results in [results2.txt](results2.txt).

Original intention was to run on Java 21, oops :).

### Integer

| Algorithm           | Mode     | Cnt     | Runtime     | Error     | Units  |
|---------------------|----------|---------|-------------|-----------|--------|
| Jdk8SplitableRandom | sample   | 9613821 |     28,917  | ±  0,070  |  ns/op |
| JdkUtilRandom       | sample   | 8903706 |     33,501  | ±  0,168  |  ns/op |
| JdkXoroshiro128++   | sample   | 8852287 |     29,989  | ±  0,071  |  ns/op |
| JdkXoshiro256++     | sample   | 7260221 |     30,805  | ±  0,475  |  ns/op |
| SplitMix64          | sample   | 8921026 |     28,675  | ±  0,072  |  ns/op |
| XorShift1024Star    | sample   | 6944177 |     29,480  | ±  0,094  |  ns/op |
| XorShift128Plus     | sample   | 8962997 |     30,083  | ±  0,077  |  ns/op |
| Xoroshiro128Plus    | sample   | 8981128 |     29,826  | ±  0,075  |  ns/op |


## Results 2022

These are the results from my PC running Ryzen 5 5600G and OpenJDK 64-Bit Server VM Temurin-17.0.2+8.
Raw results in [results.txt](results.txt).

Biggest difference to Java 8 and Java 17, is that the difference in runtime has significantly shrunk.

### Integer

| Algorithm           | Mode     | Cnt     | Runtime     | Error     | Units  |
|---------------------|----------|---------|-------------|-----------|--------|
| Jdk8SplitableRandom | sample   | 8158648 |     29,828  | ±  0,116  |  ns/op |
| JdkUtilRandom       | sample   | 6793191 |     33,706  | ±  0,121  |  ns/op |
| SplitMix64          | sample   | 8852287 |     29,133  | ±  0,077  |  ns/op |
| XorShift1024Star    | sample   | 6938803 |     30,095  | ±  0,108  |  ns/op |
| XorShift128Plus     | sample   | 8148799 |     29,943  | ±  0,086  |  ns/op |
| Xoroshiro128Plus    | sample   | 8946210 |     29,880  | ±  0,086  |  ns/op |

### Longs

| Algorithm           | Mode     | Cnt     | Runtime     | Error     | Units  |
|---------------------|----------|---------|-------------|-----------|--------|
| Jdk8SplitableRandom | sample   | 9052540 |     29,250  | ±  0,091  |  ns/op |
| JdkUtilRandom       | sample   | 7850157 |     34,449  | ±  0,100  |  ns/op |
| SplitMix64          | sample   | 8942673 |     29,245  | ±  0,067  |  ns/op |
| XorShift1024Star    | sample   | 6894581 |     29,382  | ±  0,102  |  ns/op |
| XorShift128Plus     | sample   | 9167690 |     30,097  | ±  0,107  |  ns/op |
| Xoroshiro128Plus    | sample   | 5165297 |     29,087  | ±  0,120  |  ns/op |

### Doubles

| Algorithm           | Mode     | Cnt     | Runtime     | Error     | Units  |
|---------------------|----------|---------|-------------|-----------|--------|
| Jdk8SplitableRandom | sample   | 8222254 |     29,690  | ±  0,099  |  ns/op |
| JdkUtilRandom       | sample   | 7255299 |     35,129  | ±  0,103  |  ns/op |
| SplitMix64          | sample   | 8325463 |     28,796  | ±  0,075  |  ns/op |
| XorShift1024Star    | sample   | 6270452 |     29,560  | ±  0,100  |  ns/op |
| XorShift128Plus     | sample   | 8911743 |     29,951  | ±  0,068  |  ns/op |
| Xoroshiro128Plus    | sample   | 8424508 |     29,546  | ±  0,070  |  ns/op |

## Results 2016

These are the results from my Laptop running Corei7 3630QM and Java 1.8 Update 20 64Bit.

### Integers

|Algorithm | Mode |	Cnt	| Runtime |	Error ±	| Units	| Comparison |
|--------- | ----	| --- | ------- |	------- |	----- |	---------- |
| JdkUtilRandom         |	sample |	2781465 |	33,445 |	1,380 |	ns/op |	100%
| Jdk8SplitableRandom	  | sample |	2735057 |	21,972 |	0,213 |	ns/op |	66%
| SplitMix64            |	sample |	2782019 |	21,304 |	0,232 |	ns/op |	64%
| XorShift1024*         |	sample |	2475777 |	23,338 |	1,063 |	ns/op |	70%
| XorShift128+          |	sample |	2761341 |	20,153 |	0,303 |	ns/op |	60%
| Xoroshiro128+         |	sample |	2894680 |	19,389 |	0,244 |	ns/op |	58%

### Longs

|Algorithm | Mode |	Cnt	| Runtime |	Error ±	| Units	| Comparison |
|--------- | ----	| --- | ------- |	------- |	----- |	---------- |
| JdkUtilRandom         |	sample |	3563424 |	50,835 | 0,510 | ns/op | 100%
| Jdk8SplitableRandom	  | sample |	2725138	| 22,241 | 0,223 | ns/op | 44%
| SplitMix64            |	sample |	2782328	| 21,196 | 0,220 | ns/op | 42%
| XorShift1024*         |	sample |	2446486	| 22,938 | 0,239 | ns/op | 45%
| XorShift128+          |	sample |	2822360	| 20,716 | 0,907 | ns/op | 41%
| Xoroshiro128+         |	sample |	2966685	| 19,464 | 0,404 | ns/op | 38%

### Doubles

|Algorithm | Mode |	Cnt	| Runtime |	Error ±	| Units	| Comparison |
|--------- | ----	| --- | ------- |	------- |	----- |	---------- |
| JdkUtilRandom         |	sample |	3564646 |	50,045 |	0,275 |	ns/op |	100%
| Jdk8SplitableRandom	  | sample |	2468942 |	22,893 |	0,286 |	ns/op |	46%
| SplitMix64            |	sample |	2519166 |	22,937 |	0,232 |	ns/op |	46%
| XorShift1024*         |	sample |	2231386 |	24,464 |	1,038 |	ns/op |	49%
| XorShift128+          |	sample |	2680414 |	22,292 |	0,260 |	ns/op |	45%
| Xoroshiro128+         |	sample |	2802308 |	20,664 |	0,210 |	ns/op |	41%


## Contribution and License

This code is licensed under MIT.

Contributions are welcome.
