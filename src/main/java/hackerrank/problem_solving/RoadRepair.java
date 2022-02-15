package hackerrank.problem_solving;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getMinCost' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY crew_id
     *  2. INTEGER_ARRAY job_id
     */

    public static long getMinCost(List<Integer> crew_id, List<Integer> job_id) {
        // Write your code here
        int[] crewArr = crew_id.stream().mapToInt(i -> i).toArray();
        int[] jobArr = job_id.stream().mapToInt(i -> i).toArray();

        Arrays.sort(crewArr);
        Arrays.sort(jobArr);

        long total = 0;

        for (int i = 0; i < crewArr.length; i++) {
            int job = jobArr[i];
            int crew = crewArr[i];
            total += Math.max(crew, job) - Math.min(crew, job);
        }

        return total;
    }

}

public class RoadRepair {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int crew_idCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> crew_id = IntStream.range(0, crew_idCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int job_idCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> job_id = IntStream.range(0, job_idCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        long result = Result.getMinCost(crew_id, job_id);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}
