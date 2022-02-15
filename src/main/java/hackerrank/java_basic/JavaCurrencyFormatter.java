package hackerrank.java_basic;

import javax.swing.text.NumberFormatter;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        /*
         * US: $12,324.13
         * India: Rs.12,324.13
         * China: ￥12,324.13
         * France: 12 324,13 €
         */
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " + nf.format(payment));
        System.out.println("India: Rs." + nf.format(payment).replace("$", ""));
        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China: " + nf.format(payment));
        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + nf.format(payment));
    }
}