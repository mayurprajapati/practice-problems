package hackerrank.interview_preparation_kit;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if (s.equalsIgnoreCase("a")) return n;
        long times = n / s.length();
        int countOfA = 0;
        for (String str : s.split("")) {
            if (str.equalsIgnoreCase("a")) ++countOfA;
        }
        long total = times * countOfA;
        for (String str : s.substring(0, (int) (n % s.length())).split("")) {
            if (str.equalsIgnoreCase("a")) ++total;
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}