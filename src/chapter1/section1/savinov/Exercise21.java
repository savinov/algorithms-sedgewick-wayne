package chapter1.section1.savinov;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise21 {
    public static void main(String[] args) {
//        while (StdIn.hasNextLine()) {
//            var name = StdIn.readString();
//            var sum = StdIn.readInt();
//            var num = StdIn.readInt();
//            StdOut.printf("%s %5d %4d %8.3f\n", name, sum, num, (double) sum / num);
//        }

        var lines = StdIn.readAllLines();
        StdOut.println("      Name |  Sum | Num |    Avg");
        StdOut.println("----------------------------------");
        for (var line : lines) {
            var tokens = line.split("\\s+");
            var name = tokens[0];
            var sum = Integer.parseInt(tokens[1]);
            var num = Integer.parseInt(tokens[2]);
            StdOut.printf("%10s | %4d | %3d | %8.3f\n", name, sum, num, (double) sum / num);
        }
    }
}
