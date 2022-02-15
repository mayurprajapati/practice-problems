package hackerrank.java_basic;

import java.io.*;
import java.math.MathContext;
import java.util.*;
import java.util.stream.Collectors;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> arr = new ArrayList<>(n);
        s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] str = s.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(str[i]));
        }

        int step = 1;
        List<Integer> sum = new ArrayList<>();
        while (n-- > 0) {
            for (int i = 0; i < arr.size(); i++) {
                if (i + step <= arr.size()) {
                    int sm = arr.subList(i, i + step).stream().mapToInt(val -> val).sum();
                    if (sm < 0)
                        sum.add(sm);
                }
            }
            ++step;
        }

        System.out.println(sum.size());
    }
}

// 2, -3, 9, 0, -9, -1, 4, -7, -5, -2, 6, 8