package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise20 {

    public static void main(String[] args) {
        StdOut.println("fact(3): " + fact(3)); // 6
        StdOut.println("fact(5): " + fact(5)); // 120
        StdOut.println("fact(6): " + fact(6)); // 720

        StdOut.println("lnFact(3): " + lnFact(3)); // 1.791759469228055
        StdOut.println("lnFact(5): " + lnFact(5)); // 4.787491742782046
        StdOut.println("lnFact(6): " + lnFact(6)); // 6.579251212010101

        StdOut.println("lnFact2(3): " + lnFact2(3)); // 1.791759469228055
        StdOut.println("lnFact2(5): " + lnFact2(5)); // 4.787491742782046
        StdOut.println("lnFact2(6): " + lnFact2(6)); // 6.579251212010101
    }

    private static double lnFact(int n) {
        var fact = fact(n);
        return Math.log(fact);
    }

    private static double lnFact2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n parameter must be positive");
        }
        if (n == 1) {
            return Math.log(n);
        }
        // ln(N!) = ln(N) + ln(N-1)
        return Math.log(n) + lnFact2(n - 1);
    }

    private static long fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n parameter cannot be negative");
        }
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
