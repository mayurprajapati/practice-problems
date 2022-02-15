package hackerrank.java_basic;

public class BitPuzzle {
    public static void main(String[] args) {
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(mask);
        System.out.println(value);
        System.out.println(value & mask);

        Float f = new Float("3.0");
        int i = f.intValue();
        int b = f.byteValue();
        double d = f.doubleValue();
        long l = 10;
        System.out.println(i + b + l);
    }
}
