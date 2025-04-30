package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise9 {

    public static void main(String[] args) {
        StdOut.println("9:\n" + intAsBinaryString(9));
        StdOut.println("32:\n" + intAsBinaryString(32));
        StdOut.println("127:\n" + intAsBinaryString(127));
        StdOut.println("Integer.MAX_VALUE:\n" + intAsBinaryString(Integer.MAX_VALUE));
        StdOut.println("-1:\n" + intAsBinaryString(-1));
        StdOut.println("-32:\n" + intAsBinaryString(-32));
        StdOut.println("-127:\n" + intAsBinaryString(-127));
        StdOut.println("Integer.MIN_VALUE::\n" + intAsBinaryString(Integer.MIN_VALUE));
    }

    private static String intAsBinaryString(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            if (((1 << i) & n) == 0) {
                result.insert(0, 0);
            } else {
                result.insert(0, 1);
            }
        }
        return result.toString();
    }
}
