package hackerrank.java_basic;

import java.util.*;


// Write your code here. DO NOT use an access modifier in your class declaration.

import java.util.*;

class JavaStack {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    char pop = stack.pop();
                    if ((pop == '(' && c != ')') || (pop == '{' && c != '}') || (pop == '[' && c != ']')) {
                        return false;
                    }
                }
            }
        } catch (EmptyStackException e) {
            return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isValid(input));
        }
    }
}



