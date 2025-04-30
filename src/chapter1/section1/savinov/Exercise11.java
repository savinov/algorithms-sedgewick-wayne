package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * https://stackoverflow.com/questions/5909873/how-can-i-pretty-print-ascii-tables-with-python
 */
public class Exercise11 {

    public static void main(String[] args) {
        boolean[][] array = {
                {true, false, true},
                {false, true, false},
                {true, true, false},
                {true, true, true},
        };
        printArray(array);
        StdOut.println();
        printArray(createArray(14, 12));
    }

    private static void printArray(boolean[][] array) {
        StdOut.print("   ");
        for (int i = 0; i < array[0].length; i++) {
            StdOut.printf("| %2d", i + 1);
        }
        StdOut.println("|");
        StdOut.println("----".repeat(array[0].length + 1));
        for (int i = 0; i < array.length; i++) {
            StdOut.printf(" %2d", i + 1);
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    StdOut.printf("| * ");
                } else {
                    StdOut.printf("|   ");
                }
            }
            StdOut.println("|");
            StdOut.println("----".repeat(array[0].length + 1));
        }
    }

    private static boolean[][] createArray(int m, int n) {
        var array = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = StdRandom.bernoulli();
            }
        }
        return array;
    }
}
