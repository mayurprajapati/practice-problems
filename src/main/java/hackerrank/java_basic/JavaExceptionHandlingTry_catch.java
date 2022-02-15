package hackerrank.java_basic;

import java.io.*;
import java.util.*;

public class JavaExceptionHandlingTry_catch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int one = s.nextInt();
            int two = s.nextInt();
            System.out.println(one / two);
        } catch (InputMismatchException ime) {
            System.out.println(ime.toString().replace(": " + ime.getMessage(), ""));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}