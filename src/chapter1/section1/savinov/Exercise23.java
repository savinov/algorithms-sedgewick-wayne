package chapter1.section1.savinov;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Objects;

public class Exercise23 {

    // Array must be sorted.
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        // Key is in a[lo..hi] or not present.
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // java Exercise23 tinyW.txt + < tinyT.txt
    // java Exercise23 tinyW.txt - < tinyT.txt
    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        var toggle = args[1];
        Arrays.sort(whitelist);
        // Read key, print if not in whitelist.
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            var index = rank(key, whitelist);
            if (index < 0 && Objects.equals(toggle, "+") ||
                    index >= 0 && Objects.equals(toggle, "-")) {
                StdOut.println(key);
            }
        }
    }
}