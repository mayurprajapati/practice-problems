package hackerrank.ds.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DynamicArray {

	/**
	 * Problem:
	 * https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true
	 * 
	 * @param args
	 * @throws IOException
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int q = Integer.parseInt(firstMultipleInput[1]);

		List<List<Integer>> queries = new ArrayList<>();

		IntStream.range(0, q).forEach(i -> {
			try {
				queries.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		List<Integer> result = dynamicArray(n, queries);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		int lastAnswer = 0;
		List<Integer> answers = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			// creating dynamic array here
			arr.add(new ArrayList<Integer>());
		}

		for (List<Integer> query : queries) {
			int type = query.get(0);
			int index = query.get(1);
			int val = query.get(2);

			ArrayList<Integer> seq = arr.get((index ^ lastAnswer) % n);

			if (type == 1) {
				seq.add(val);
			} else if (type == 2) {
				lastAnswer = seq.get(val % seq.size());
				answers.add(lastAnswer);
			}
		}

		return answers;
	}

}
