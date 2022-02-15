package hackerrank.java_basic;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("[ !,?._'@]")));
        list.removeIf((String str) -> str.trim().isEmpty());
        System.out.println(list.size());
        for (String s1 : list) {
            System.out.println(s1);
        }
        scan.close();
    }
}

