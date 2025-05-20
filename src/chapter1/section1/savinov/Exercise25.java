package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise25 {

    public static void main(String[] args) {
        // https://math.stackexchange.com/a/1274529
        // https://brestprog.by/topics/gcd/
        // gcd(a, b) = gcd(b, r1) = gcd(r1, r2) = ... = gcd(rn−1, rn) = gcd(rn, 0)
        // a > b > r1 > r2 > ... > rn-1 > rn
        // gcd(x, 0) = x
        gcd(105, 24);
        gcd(24, 9);
        gcd(9, 6);
        gcd(6, 3);
        gcd(3, 0);
    }

    public static int gcd(int p, int q) {
        var result = gcd(p, q, 0);
        StdOut.printf("gcd(%d, %d) = %d\n", p, q, result);
        return result;
    }

    public static int gcd(int p, int q, int depth) {
//        StdOut.print("depth = " + depth + ": " + "-".repeat(depth));
//        StdOut.println("> p = " + p + ", q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r, depth + 1);
    }
}
