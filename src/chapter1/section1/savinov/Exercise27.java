package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise27 {

    public static int count;

    // https://en.wikipedia.org/wiki/Binomial_distribution
    // https://en.wikipedia.org/wiki/Binomial_coefficient
    public static void main(String[] args) {
        // k <= N, calls <= 2 ^ (N + 1) + 2 ^ (N + 1) = 2 ^ (N + 2)
        // N = 5: calls <= 2 ^ 7 = 128
        // N = 100: calls <= 2 ^ 102
        var N = 5;
        var k = 3;
        var p = 0.25;
        StdOut.printf("binomial(%d, %d, %.2f) = %.3f\n", N, k, p, binomial(N, k, p, 0));
        StdOut.println("count = " + count);
    }

    public static double binomial(int N, int k, double p, int depth) {
        count++;
        StdOut.printf("depth = %d: N = %d, k = %d\n", depth, N, k);
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p, depth + 1) + p * binomial(N - 1, k - 1, p, depth + 1);
    }
}
