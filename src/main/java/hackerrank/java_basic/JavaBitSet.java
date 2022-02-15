package hackerrank.java_basic;

import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bitSetSize = in.nextInt();
        int opsSize = in.nextInt();

        ArrayList<BitSet> arr = new ArrayList<>();
        arr.add(new BitSet(bitSetSize));
        arr.add(new BitSet(bitSetSize));

        while (opsSize-- > 0) {
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String[] data = in.nextLine().split(" ");
            String op = data[0];
            int arg1 = Integer.parseInt(data[1]);
            int arg2 = Integer.parseInt(data[2]);

            switch (op) {
                case "AND": {
                    arr.get(arg1 - 1).and(arr.get(arg2 - 1));
                    break;
                }
                case "SET": {
                    arr.get(arg1 - 1).set(arg2);
                    break;
                }
                case "FLIP": {
                    arr.get(arg1 - 1).flip(arg2);
                    break;
                }
                case "OR": {
                    arr.get(arg1 - 1).or(arr.get(arg2 - 1));
                    break;
                }
                case "XOR": {
                    arr.get(arg1 - 1).xor(arr.get(arg2 - 1));
                    break;
                }
            }
            System.out.println(arr.get(0).stream().count() + " " + arr.get(1).stream().count());
        }
    }
}