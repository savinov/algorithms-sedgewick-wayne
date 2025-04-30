package chapter1.section1.savinov;

import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
            System.out.printf("i = %d: a[%d] = %d\n", i, i, a[i]);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < 10; i++) {
            System.out.printf("i = %d: a[%d] = %d: a[%d] = %d -> a[%d]\n", i, i, a[i], a[i], a[a[i]], i);
            a[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(a));
    }
}
