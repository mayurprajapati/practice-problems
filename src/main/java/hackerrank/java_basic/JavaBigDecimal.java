package hackerrank.java_basic;

import java.math.BigDecimal;
import java.util.*;
import java.util.Comparator;

class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, (o1, o2) -> {
            if (o1 == null) return 1;
            return new BigDecimal(o2).compareTo(new BigDecimal(o1));
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}