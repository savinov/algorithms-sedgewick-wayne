package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdOut;

public class Exercise16 {

    public static void main(String[] args) {
        // exR1(6) =  exR1(3) + 6 + exR1(4) + 6 = "3113" + 6 + "114224" + 6 = "311361142246"
        // exR1(4) = exR1(1) + 4 + exR1(2) + 4 = "11" + 4 + "22" + 4 = "114224"
        // exR1(3) = exR1(0) + 3 + exR1(1) + 3 = "" + 3 + "11" + 3 + "" = "3113"
        // exR1(2) = exR1(-1) + 2 + exR1(0) + 2 = "" + 2 + "" + 2 = "22"
        // exR1(1) = exR1(-2) + 1 + exR1(-1) + 1 = "" + 1 + "" + 1 = "11"
        // exR1(0) = exR1(-1) = exR1(-2) = ""

        StdOut.println("exR1(6) = " + exR1(6)); // exR1(6) = 311361142246
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
