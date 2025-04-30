package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Exercise13 {

    public static void main(String[] args) {
        int[][] array = createArray(7, 10);
        printArray(array);
        printArray(transpose(array));
    }

    private static int[][] transpose(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                result[j][i] = array[i][j];
            }
        }
        return result;
    }

    private static int[][] createArray(int m, int n) {
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = StdRandom.uniform(100);
            }
        }
        return result;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                StdOut.printf("%2d ", array[i][j]);
            }
            StdOut.println();
        }
        StdOut.println();
    }
}
