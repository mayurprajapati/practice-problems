package hackerrank.java_basic;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> list = Arrays.stream(in.nextLine().split(" ")).map((value) -> Integer.parseInt(value)).collect(Collectors.toList());

        int ops = in.nextInt();
        while (ops-- > 0) {
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String type = in.nextLine();
            String[] data = in.nextLine().split(" ");
            int index = Integer.parseInt(data[0]);
            if (type.equals("Insert")) {
                int value = Integer.parseInt(data[1]);
                list.add(index, value);
            } else {
                list.remove(index);
            }
        }

        String str = "";
        for (int value :
                list) {
            str += value + " ";
        }
        System.out.println(str.substring(0, str.length() - 1));
    }
}