package hackerrank.java_basic;

import java.util.Scanner;

public class JavaOutputFormatting {

    /**
     * ================================
     * java           100
     * cpp            065
     * python         050
     * ================================
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            String x = sc.nextInt() + "";
            if (x.length() < 2) x = "00" + x;
            else if (x.length() < 3) x = "0" + x;
            for (int j = 0; j < 15; j++) {
                if (j < s1.length()) {
                    System.out.print(s1.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(x);
        }
        System.out.println("================================");

    }
}



