package hackerrank.java_basic;


import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        java.util.HashMap<Character, Integer> firstMap = new java.util.HashMap<>();
        java.util.HashMap<Character, Integer> secondMap = new java.util.HashMap<>();

        if (a.equalsIgnoreCase(b)) return true;
        for (int i = 0; i < a.length(); i++) {
            char first = Character.toLowerCase(a.charAt(i));
            char second = Character.toLowerCase(b.charAt(i));
            if (!firstMap.containsKey(first)) {
                firstMap.put(first, 1);
            } else {
                int val = firstMap.get(first);
                firstMap.put(first, ++val);
            }
            if (!secondMap.containsKey(second)) {
                secondMap.put(second, 1);
            } else {
                int val = secondMap.get(second);
                secondMap.put(second, ++val);
            }
        }
        for (char key : firstMap.keySet()) {
            Integer aCount = firstMap.get(key);
            Integer bCount = secondMap.get(key);

            if (!aCount.equals(bCount)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}