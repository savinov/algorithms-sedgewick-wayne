package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise24 {

    public static void main(String[] args) {
        var p = 105;
        var q = 24;
        StdOut.printf("gcd(%d, %d) = %d\n\n", p, q, gcd(p, q));

        p = Integer.parseInt(args[0]);
        q = Integer.parseInt(args[1]);
        StdOut.printf("gcd(%d, %d) = %d\n\n", p, q, gcd(p, q));

        p = 1111111;
        q = 1234567;
        StdOut.printf("gcd(%d, %d) = %d\n", p, q, gcd(p, q));
    }

    public static int gcd(int p, int q) {
        return gcd(p, q, 0);
    }

    public static int gcd(int p, int q, int depth) {
        StdOut.print("depth = " + depth + ": " + "-".repeat(depth));
        StdOut.println("> p = " + p + ", q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r, depth + 1);
    }
}
