package chapter1.section1.savinov.scratches;

/**
 * https://www.baeldung.com/java-bitwise-operators
 */
public class Exercise9 {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(12 << 2));
        System.out.println();

        System.out.println(Integer.toBinaryString(-12));
        System.out.println(Integer.toBinaryString(-12 << 2));
        System.out.println();

        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toBinaryString(12 >> 2));
        System.out.println(Integer.toBinaryString(12 >>> 2));
        System.out.println();

        System.out.println(Integer.toBinaryString(-12));
        System.out.println(Integer.toBinaryString(-12 >> 2));
        // negative -> positive
        // 11111111111111111111111111110100
        // 00111111111111111111111111111101
        System.out.println(Integer.toBinaryString(-12 >>> 2));
    }
}