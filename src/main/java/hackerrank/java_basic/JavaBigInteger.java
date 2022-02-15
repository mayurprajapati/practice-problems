package hackerrank.java_basic;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String one = s.next(), two = s.next();
        s.close();

        try {
            int pone = Integer.parseInt(one);
            int ptwo = Integer.parseInt(two);

            int sum = pone + ptwo;
            int mul = pone * ptwo;
            System.out.println(sum);
            System.out.println(mul);
        } catch (NumberFormatException ignored) {
            BigInteger pone = new BigInteger(one);
            BigInteger ptwo = new BigInteger(two);

            System.out.println(pone.add(ptwo));
            System.out.println(pone.multiply(ptwo));
        }
    }
}