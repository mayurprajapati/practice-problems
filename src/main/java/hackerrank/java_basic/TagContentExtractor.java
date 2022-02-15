package hackerrank.java_basic;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Stack<String> stack = new Stack<>();
        while (testCases > 0) {
            String line = in.nextLine();
            String print = "";
            for (int i = 0; i < line.length(); i++) {
                try {
                    char c = line.charAt(i);
                    if (c == '<') {
                        int endCharIndex = line.indexOf('>', i) + 1;
                        String tagName = line.substring(i, endCharIndex);
//                        System.out.println(tagName);
                        if (line.charAt(i + 1) == '/' && tagName.matches("^[<][/].+[>]$")) {
                            if (stack.isEmpty()) break;
                            String openingTag = stack.pop();
                            int openingTagIndex = Integer.parseInt(openingTag.substring(openingTag.lastIndexOf('|') + 1));
                            openingTag = openingTag.split("\\|")[0];
                            String closingTag = line.substring(i, endCharIndex);
                            if (openingTag.equals(closingTag.replace("/", ""))) {
                                String finalString = line.substring(openingTagIndex + openingTag.length(), line.indexOf(closingTag));
                                if (!finalString.trim().isEmpty() && !finalString.contains("<"))
                                    print += finalString + "\n";
                            }
                        } else {
//                            System.out.println(i + " -> " + endCharIndex);
                            if (i < endCharIndex && tagName.matches("^[<].+[>]$"))
                                stack.push(line.substring(i, endCharIndex) + "|" + i);
                        }
                    }
                } catch (Exception ignored) {
                }
            }
            if (print.isEmpty()) System.out.println("None");
            else System.out.print(print);
            testCases--;
        }
    }
}



