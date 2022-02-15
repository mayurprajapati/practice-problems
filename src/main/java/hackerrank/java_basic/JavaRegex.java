package hackerrank.java_basic;

import java.util.Scanner;

class MyRegex {
    public String pattern = "^(([0-1][0-9]{0,2})|([2][0-5]{0,2})|([0-9]{0,2}))\\.(([0-1][0-9]{0,2})|([2][0-5]{0,2})|([0-9]{0,2}))\\.(([0-1][0-9]{0,2})|([2][0-5]{0,2})|([0-9]{0,2}))\\.(([0-1][0-9]{0,2})|([2][0-5]{0,2})|([0-9]{0,2}))$";
}

class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here