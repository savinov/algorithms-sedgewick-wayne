package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise26 {

    public static void main(String[] args) {
        sortThreeNum(1, 12, 105);
        sortThreeNum(1, 105, 12);
        sortThreeNum(12, 1, 105);
        sortThreeNum(12, 105, 1);
        sortThreeNum(105, 1, 12);
        sortThreeNum(105, 12, 1);
    }

    static void sortThreeNum(int a, int b, int c) {
        var t = 0;
        StdOut.printf("a = %d, b = %d, c = %d\n", a, b, c);
        if (a > b) { t = a; a = b; b = t; }
        if (a > c) { t = a; a = c; c = t; }
        if (b > c) { t = b; b = c; c = t; }
        StdOut.printf("a = %d, b = %d, c = %d\n\n", a, b, c);
    }
}
