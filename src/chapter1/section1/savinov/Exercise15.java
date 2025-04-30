package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Single loop solutions in:
 * O(n) = n
 * {@link chapter1.section1.Exercise15}
 * O(n) = n
 * ArrayIndexOutOfBoundsException throws if array contain values grater than M
 * {@link chapter1.section1.gdhucoder.Ex_1_1_15}
 */
public class Exercise15 {

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 1, 2, 4, 0, 4, 3, 7, 7, 9, 4};
        StdOut.println("array: " + Arrays.toString(array));
        StdOut.println("array.length = " + array.length);
        StdOut.println("M = 5: histogram = " + Arrays.toString(histogram(array, 5)));
        StdOut.println("M = 10: histogram = " + Arrays.toString(histogram(array, 10)));
        StdOut.println("M = 15: histogram = " + Arrays.toString(histogram(array, 15)));
        StdOut.println("M = 10: sum = " + sum(histogram(array, 10)));
        StdOut.println("M = 15: sum = " + sum(histogram(array, 15)));

        StdOut.println("M = 5: histogram_v2 = " + Arrays.toString(histogram_v2(array, 5)));
        StdOut.println("M = 10: histogram_v2 = " + Arrays.toString(histogram_v2(array, 10)));
        StdOut.println("M = 15: histogram_v2 = " + Arrays.toString(histogram_v2(array, 15)));
        StdOut.println("M = 10: sum_v2 = " + sum(histogram(array, 10)));
        StdOut.println("M = 15: sum_v2 = " + sum(histogram(array, 15)));
    }

    // O(n) = n * M
    private static int[] histogram(int[] array, int M) {
        var histogram = new int[M];
        for (int i = 0; i < M; i++) {
            for (int value : array) {
                if (value == i) {
                    histogram[i]++;
                }
            }
        }
        return histogram;
    }

    // O(n) = n
    private static int[] histogram_v2(int[] array, int M) {
        var histogram = new int[M];
        for (int value : array) {
            if (value < M) {
                histogram[value]++;
            }
        }
        return histogram;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
