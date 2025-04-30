package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise14 {

    public static void main(String[] args) {
        StdOut.println("lg_v1(67) = " + lg_v1(67));
        StdOut.println("lg_v1(256) = " + lg_v1(256));
        StdOut.println("lg_v1(1025) = " + lg_v1(1025));
        StdOut.println("lg_v1(2047) = " + lg_v1(2047));

        StdOut.println("lg_v2(67) = " + lg_v2(67));
        StdOut.println("lg_v2(256) = " + lg_v2(256));
        StdOut.println("lg_v2(1025) = " + lg_v2(1025));
        StdOut.println("lg_v2(2047) = " + lg_v2(2047));
    }
    private static int lg_v1(int N) {
        var n = 1;
        var log2n = 0;
        while (n <= N) {
            n *= 2;
            log2n++;
        }
        return log2n - 1;
    }

    private static int lg_v2(int N) {
        var log2n = 0;
        while (N >= 2) {
            N /= 2;
            log2n++;
        }
        return log2n;
    }
}
