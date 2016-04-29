# About PRNG-Performance

A simple independant comparison of several **P**seudo **R**andom **N**umber **G**enerators in Java.
The newest Version of this Test is based on [JMH](http://openjdk.java.net/projects/code-tools/jmh/), a library for creating benchmarks on the JVM.

## Algorithms

**TODO**: Describe and Link algortihms

## Results

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


## How to Run

### Netbeans

Either open the Project in Netbeans and click Run.

### Maven

**TODO:** Explain how to run with mvn from CLI.

## Contribution and License

This code is licensed under MIT.

Contributions are welcome, as I am not very experienced with Benchmarking using JMH.
