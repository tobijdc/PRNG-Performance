# PRNG-Performance

A small experiment to compare the performance of diffrent Java PRNG implementations.
Here are the results on my machine:

```
Doubles:
=================================================
100000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1 ms
DSI Utils XorShift128+: 1 ms
DSI Utils Xorshift1024*: 2 ms
Java8 SplitableRandom: 1 ms
java.util.Random: 6 ms
-------------------------------------------------
1000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 17 ms
DSI Utils XorShift128+: 17 ms
DSI Utils Xorshift1024*: 21 ms
Java8 SplitableRandom: 18 ms
java.util.Random: 66 ms
-------------------------------------------------
10000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 188 ms
DSI Utils XorShift128+: 176 ms
DSI Utils Xorshift1024*: 216 ms
Java8 SplitableRandom: 168 ms
java.util.Random: 656 ms
-------------------------------------------------
100000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1695 ms
DSI Utils XorShift128+: 1703 ms
DSI Utils Xorshift1024*: 2138 ms
Java8 SplitableRandom: 1700 ms
java.util.Random: 6555 ms
-------------------------------------------------

Long:
=================================================
100000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1 ms
DSI Utils XorShift128+: 1 ms
DSI Utils Xorshift1024*: 1 ms
Java8 SplitableRandom: 1 ms
java.util.Random: 6 ms
-------------------------------------------------
1000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 16 ms
DSI Utils XorShift128+: 16 ms
DSI Utils Xorshift1024*: 19 ms
Java8 SplitableRandom: 15 ms
java.util.Random: 66 ms
-------------------------------------------------
10000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 160 ms
DSI Utils XorShift128+: 168 ms
DSI Utils Xorshift1024*: 187 ms
Java8 SplitableRandom: 161 ms
java.util.Random: 662 ms
-------------------------------------------------
100000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1619 ms
DSI Utils XorShift128+: 1571 ms
DSI Utils Xorshift1024*: 1888 ms
Java8 SplitableRandom: 1569 ms
java.util.Random: 6564 ms
-------------------------------------------------

Integer:
=================================================
100000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1 ms
DSI Utils XorShift128+: 1 ms
DSI Utils Xorshift1024*: 1 ms
Java8 SplitableRandom: 1 ms
java.util.Random: 3 ms
-------------------------------------------------
1000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 16 ms
DSI Utils XorShift128+: 16 ms
DSI Utils Xorshift1024*: 19 ms
Java8 SplitableRandom: 15 ms
java.util.Random: 32 ms
-------------------------------------------------
10000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 158 ms
DSI Utils XorShift128+: 158 ms
DSI Utils Xorshift1024*: 189 ms
Java8 SplitableRandom: 155 ms
java.util.Random: 328 ms
-------------------------------------------------
100000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1588 ms
DSI Utils XorShift128+: 1589 ms
DSI Utils Xorshift1024*: 1888 ms
Java8 SplitableRandom: 1550 ms
java.util.Random: 3275 ms
-------------------------------------------------
```