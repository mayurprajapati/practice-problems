package hackerrank.java_basic;

import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (true) {
            String str = null;
            try {
                str = s.nextLine();
            } catch (Exception ignored) {
            }
            if (str == null || str.isEmpty()) break;
            System.out.println(++count + " " + str);
        }
    }
}