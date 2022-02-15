package hackerrank.java_basic;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            MessageDigest md = MessageDigest.getInstance("MD5");
            BigInteger bi = new BigInteger(1, md.digest(in.nextLine().getBytes()));
            String hashtext = bi.toString(16);
            if (hashtext.length() % 2 != 0) hashtext = "0" + hashtext;
//            while (hashtext.length() < 32) {
//                hashtext = "0" + hashtext;
//            }
            System.out.println(hashtext);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}