package hackerrank.java_basic;

//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone + "");
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            String num = map.get(s);
            if(num != null) System.out.println(s + "=" + num);
            else System.out.println("Not found");
        }
    }
}



