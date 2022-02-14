package hackerrank.ds.arrays;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayManipulation {
	/**
	 * Question:
	 * https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true
	 * 
	 * Resources: <br>
	 * https://www.youtube.com/watch?v=JtJKn_c9lB4&ab_channel=alGOds
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, m).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		long result = arrayManipulation(n, queries);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static long arrayManipulation(int n, List<List<Integer>> queries) {
		// n + 1 because we are only updating interval endpoints
		long[] arr = new long[n + 1];

		for (List<Integer> query : queries) {
			int a = query.get(0);
			int b = query.get(1);
			int k = query.get(2);

			arr[a - 1] += k;
			arr[b] -= k;
		}

		long max = 0;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			// rebuilding array using interval endpoints
			sum += arr[i];
			max = Math.max(max, sum);
		}

		return max;
	}
}
