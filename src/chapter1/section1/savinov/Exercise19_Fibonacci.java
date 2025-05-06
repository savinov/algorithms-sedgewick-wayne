package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

import java.time.Duration;
import java.util.Arrays;

import static java.time.LocalTime.now;

public class Exercise19_Fibonacci {

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long arrayF(int N, long[] array) {
        if (N == 0) {
            return array[0] = 0;
        }
        if (N == 1) {
            return array[1] = 1;
        }

//        if (array[N - 1] == 0) {
//            array[N - 1] = arrayF(N - 1, array);
//        }
//        if (array[N - 2] == 0) {
//            array[N - 2] = arrayF(N - 2, array);
//        }
//        return array[N] = array[N - 1] + array[N - 2];

        if (array[N] > 0) {
            return array[N];
        }
        return array[N] = arrayF(N - 1, array) + arrayF(N - 2, array);
    }

//    public static void main(String[] args)
//    {
//        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
//    }

    public static void main(String[] args) {
//        durationF();
        durationArrayF();
    }

    private static void durationF() {
        for (int N = 0; N < 90; N++) {
            var start = now();
            StdOut.println(N + " " + F(N));
            StdOut.println("duration: " + Duration.between(start, now()));
        }
    }

    /**
     * N = 100 is too big:
     * {@link chapter1.section1.Exercise19}
     * https://github.com/gdhucoder/Algorithms4/blob/master/Ch_1_1/Ex_1_1_19.md
     * https://github.com/gdhucoder/Algorithms4/blob/master/Ch_1_1/Ex_1_1_19.java
     */
    private static void durationArrayF() {
//        final var N = 100;
        final var N = 90;
        for (int n = 0; n <= N; n++) {
            var array = new long[n + 1];
            var start = now();
            StdOut.println(n + " " + arrayF(n, array));
            StdOut.println("duration: " + Duration.between(start, now()));
            StdOut.println("array: " + Arrays.toString(array));
        }

        // N = 90, duration filled array: PT0.000025804S
        // N = 90, duration empty array: PT0.002588442S
//        var array = new long[N + 1];
//        var start = now();
//        StdOut.println(N + " " + arrayF(N, array));
//        StdOut.println("duration: " + Duration.between(start, now()));
//        StdOut.println("array: " + Arrays.toString(array));
    }
}
