package hackerrank.java_basic;

import java.util.*;

class Comparator {
    boolean compare(int int1, int int2) {
        return int1 == int2;
    }

    boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    boolean compare(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }
}

/*Write your code here. DO NOT use access modifiers (e.g.: 'public') in your class declarations.*/

class HowWillYouCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp = new Comparator();

        int testCases = Integer.parseInt(scan.nextLine());
        while (testCases-- > 0) {
            int condition = Integer.parseInt(scan.nextLine());
            switch (condition) {
                case 1:
                    String s1 = scan.nextLine().trim();
                    String s2 = scan.nextLine().trim();

                    System.out.println((comp.compare(s1, s2)) ? "Same" : "Different");
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();

                    System.out.println((comp.compare(num1, num2)) ? "Same" : "Different");
                    if (scan.hasNext()) { // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill hackerrank.arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for (int i = 0; i < array1.length; i++) {
                        array1[i] = scan.nextInt();
                    }
                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = scan.nextInt();
                    }

                    System.out.println(comp.compare(array1, array2) ? "Same" : "Different");
                    if (scan.hasNext()) { // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }// end switch
        }// end while
        scan.close();
    }
}