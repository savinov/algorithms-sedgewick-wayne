package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise22 {

    public static void main(String[] args) {
        final int[] array = createArray(50);
        StdOut.println("array: " + Arrays.toString(array));
        StdOut.println("rank(12, array): " + rank(12, array));
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        StdOut.print("-".repeat(depth));
        StdOut.printf(" depth = %2d, lo = %2d, hi = %2d\n", depth, lo, hi);

        // Index of key in a[], if present, is not smaller than lo
        // and not larger than hi.
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    private static int[] createArray(int n) {
        var array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}

