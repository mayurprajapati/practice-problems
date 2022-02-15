package hackerrank.java_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JavaArraylist {

    public static void main(String[] args) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String str = s.nextLine();
            list.add(Arrays.stream(str.split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        }
        n = s.nextInt();
        while (n-- > 0) {
            s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String[] str = s.nextLine().split(" ");
            int a = Integer.parseInt(str[0]) - 1;
            int b = Integer.parseInt(str[1]);
            try {
                Integer nnl = list.get(a).get(b);
                System.out.println(nnl);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        s.close();
    }
}