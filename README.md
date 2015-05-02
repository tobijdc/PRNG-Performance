# PRNG-Performance

A small experiment to compare the performance of diffrent Java PRNG implementations.
Here are the results on my machine:

Doubles:
=================================================
100000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1 ms
DSI Utils XorShift128+: 1 ms
DSI Utils Xorshift1024*: 2 ms
Java8 SplitableRandom: 1 ms
java.util.Random: 7 ms
-------------------------------------------------
1000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 17 ms
DSI Utils XorShift128+: 17 ms
DSI Utils Xorshift1024*: 21 ms
Java8 SplitableRandom: 18 ms
java.util.Random: 67 ms
-------------------------------------------------
10000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 169 ms
DSI Utils XorShift128+: 172 ms
DSI Utils Xorshift1024*: 209 ms
Java8 SplitableRandom: 169 ms
java.util.Random: 660 ms
-------------------------------------------------
100000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1686 ms
DSI Utils XorShift128+: 1711 ms
DSI Utils Xorshift1024*: 2067 ms
Java8 SplitableRandom: 1648 ms
java.util.Random: 6662 ms
-------------------------------------------------

Long:
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
DSI Utils SplitMix64: 16 ms
DSI Utils XorShift128+: 17 ms
DSI Utils Xorshift1024*: 20 ms
Java8 SplitableRandom: 15 ms
java.util.Random: 65 ms
-------------------------------------------------
10000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 154 ms
DSI Utils XorShift128+: 157 ms
DSI Utils Xorshift1024*: 193 ms
Java8 SplitableRandom: 159 ms
java.util.Random: 666 ms
-------------------------------------------------
100000000 Generated Numbers
-------------------------------------------------
DSI Utils SplitMix64: 1571 ms
DSI Utils XorShift128+: 1595 ms
DSI Utils Xorshift1024*: 1960 ms
Java8 SplitableRandom: 1594 ms
java.util.Random: 6573 ms
-------------------------------------------------

Integer:
=================================================
100000 Repeats;
-------------------------------------------------
DSI Utils SplitMix64: 1 ms
DSI Utils XorShift128+: 1 ms
DSI Utils Xorshift1024*: 1 ms
Java8 SplitableRandom: 1 ms
java.util.Random: 3 ms
-------------------------------------------------
1000000 Repeats;
-------------------------------------------------
DSI Utils SplitMix64: 15 ms
DSI Utils XorShift128+: 16 ms
DSI Utils Xorshift1024*: 19 ms
Java8 SplitableRandom: 15 ms
java.util.Random: 32 ms
-------------------------------------------------
10000000 Repeats;
-------------------------------------------------
DSI Utils SplitMix64: 153 ms
DSI Utils XorShift128+: 162 ms
DSI Utils Xorshift1024*: 187 ms
Java8 SplitableRandom: 152 ms
java.util.Random: 327 ms
-------------------------------------------------
100000000 Repeats;
-------------------------------------------------
DSI Utils SplitMix64: 1518 ms
DSI Utils XorShift128+: 1625 ms
DSI Utils Xorshift1024*: 1887 ms
Java8 SplitableRandom: 1527 ms
java.util.Random: 3272 ms
-------------------------------------------------