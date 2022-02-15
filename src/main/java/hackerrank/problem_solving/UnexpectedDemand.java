package hackerrank.problem_solving;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result1 {

    /*
     * Complete the 'filledOrders' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY order
     *  2. INTEGER k
     */

    public static int filledOrders(List<Integer> orders, int k) {
        int[] arr = orders.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int filled = 0;
        for (int order : arr) {
            if (order <= k) {
                k -= order;
                ++filled;
            }
        }
        return filled;
    }

}

public class UnexpectedDemand {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int orderCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> order = IntStream.range(0, orderCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result1.filledOrders(order, k);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}
