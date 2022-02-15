package hackerrank.java_basic;

import java.util.*;


class Student {
    public void same() {
    }
}

class Rockstar {
}

class Hacker {
}


public class JavaInstanceofKeyword {

    static String count(ArrayList<Object> mylist) {
        int a = 0, b = 0, c = 0;
        for (Object element : mylist) {
            if (element instanceof Student)
                ++a;
            if (element instanceof Rockstar)
                ++b;
            if (element instanceof Hacker)
                ++c;
        }
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) mylist.add(new Student());
            if (s.equals("Rockstar")) mylist.add(new Rockstar());
            if (s.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}