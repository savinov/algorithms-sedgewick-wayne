package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise25 {

    public static void main(String[] args) {
        // https://math.stackexchange.com/a/1274529
        // https://brestprog.by/topics/gcd/
        for (int p = 1; p < 100; p++) {
            for (int q = 1; q < p; q++) {
                StdOut.printf("p = %d, q = %d\n", p, q);
                StdOut.printf("gcd(p, q) = gcd(%d, %d) = %d\n", p, q, gcd(p, q));
                StdOut.printf("gcd(q, p %% q) = gcd(%d, %d) = %d\n\n", q, p % q, gcd(q, p % q));
            }
        }
    }

    public static int gcd(int p, int q) {
        return gcd(p, q, 0);
    }

    public static int gcd(int p, int q, int depth) {
//        StdOut.print("depth = " + depth + ": " + "-".repeat(depth));
//        StdOut.println("> p = " + p + ", q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r, depth + 1);
    }
}
