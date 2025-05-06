package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise18 {

    public static void main(String[] args) {
        // mystery(2, 25) = mystery(4, 12) + 2 = 48 + 2 = 50
        // mystery(4, 12) = mystery(8, 6) = 48
        // mystery(8, 6) = mystery(16, 3) = 48
        // mystery(16, 3) = mystery(32, 1) + 16 = 32 + 16 = 48
        // mystery(32, 1) = mystery(64, 0) + 32 = 0 + 32 = 32
        // mystery(64, 0) = 0
        StdOut.println("mystery(2, 25): " + mystery(2, 25));
        StdOut.println("2 * 25: " + (2 * 25));

        // mystery(3, 11) = mystery(6, 5) + 3 = = 30 + 3 = 33
        // mystery(6, 5) = mystery(12, 2) + 6 = 24 + 6 = 30
        // mystery(12, 2) = mystery(24, 1) = 24
        // mystery(24, 1) = mystery(48, 0) + 24 = 0 + 24 = 24
        // mystery(48, 0) = 0
        StdOut.println("mystery(3, 11): " + mystery(3, 11));
        StdOut.println("3 * 11: " + (3 * 11));

        StdOut.println("mystery(12, 4): " + mystery(12, 4));
        StdOut.println("12 * 4: " + (12 * 4));

        StdOut.println();
        // mystery2(2, 6) = mystery(4, 3) = 64
        // mystery2(4, 3) = mystery2(16, 1) * 4 = 16 * 4 = 64
        // mystery2(16, 1) = mystery2(256, 0) * 16 = 1 * 16 = 16
        // mystery2(256, 0) = 1
        StdOut.println("mystery2(2, 6): " + mystery2(2, 6));
        StdOut.println("2 ^ 6: " + (int) (Math.pow(2, 6)));
        StdOut.println("mystery2(5, 4): " + mystery2(5, 4));
        StdOut.println("5 ^ 4: " + (int) (Math.pow(5, 4)));
    }

    public static int mystery(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0)
            return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }
}
