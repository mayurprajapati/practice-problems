package hackerrank.java_basic;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i < s.length() - k + 1; i++) {
            String str = s.substring(i, i + k);
            if (str.compareTo(smallest) < 0) smallest = str;
            if (str.compareTo(largest) > 0) largest = str;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}