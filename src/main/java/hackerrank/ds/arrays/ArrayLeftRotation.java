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

public class ArrayLeftRotation {

	/**
	 * Question:
	 * https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
	 * 
	 * @param d
	 * @param arr
	 * @return
	 */
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		int n = arr.size();

		if (d > n)
			d = n % d;

		// new array's starting index
		int i = n - d;
		if (i == 0)
			return arr;

		ArrayList<Integer> newArray = new ArrayList<Integer>(arr);
		for (int j = 0; j < arr.size(); j++) {
			if (i >= n)
				i = 0;
			newArray.set(i++, arr.get(j));
		}

		return newArray;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int d = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> result = rotateLeft(d, arr);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}

}
