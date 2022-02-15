package hackerrank.interview_preparation_kit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class MinParkingSpaces {
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        if (parkingStartEndTimes.length <= 1) return parkingStartEndTimes.length;
        for (int i = 0; i < parkingStartEndTimes.length; i++) {
            System.out.println(parkingStartEndTimes[i][0] + " -> " + parkingStartEndTimes[i][1]);
        }
        //  sorting with start time
        Arrays.sort(parkingStartEndTimes, Comparator.comparingInt(o -> o[0]));
        System.out.println("After sorting");
        for (int i = 0; i < parkingStartEndTimes.length; i++) {
            System.out.println(parkingStartEndTimes[i][0] + " -> " + parkingStartEndTimes[i][1]);
        }
        int max = 0, cur = 1, end = parkingStartEndTimes[0][1];
        for (int i = 0; i < parkingStartEndTimes.length - 1; i++) {
            System.out.println("I: "+i+" end: "+end+" cur: "+cur+" max: "+max);
            System.out.println(parkingStartEndTimes[i + 1][0] + " -> " +parkingStartEndTimes[i + 1][1]);
            if (end > parkingStartEndTimes[i + 1][0]) {
                cur++;
                max = Math.max(cur, max);
            } else {
                cur--;
            }
            end = Math.max(end, parkingStartEndTimes[i + 1][1]);
        }
        return max;
    }

    // DO NOT MODIFY ANYTHING BELOW THIS LINE!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}