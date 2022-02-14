package hackerearth.sdet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinLengthSubarray {

	/**
	 * Resources: <br>
	 * https://www.youtube.com/watch?v=GrV3MTR_Uk0&ab_channel=Pepcoding
	 * 
	 * Tests <br>
	 * 1<br>
	 * 7 5<br>
	 * 3 4 7 2 1 6 2 <br>
	 * 
	 * 1<br>
	 * 8 14<br>
	 * 7 4 1 2 2 9 8 9 <br>
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tests = s.nextInt();
		while (tests-- > 0) {
			int n = s.nextInt(), k = s.nextInt();
			s.nextLine();

			Integer[] arr = Arrays.asList(s.nextLine().split(" ")).stream().map(v -> {
				return Integer.parseInt(v);
			}).collect(Collectors.toList()).toArray(new Integer[n]);
			int sol = solution(n, k, arr);
			System.out.println(sol);
		}
	}

	private static int solution(int n, int k, Integer[] arr) {
		// store remainder on addition of each array element
		Map<Integer, Integer> remainders = new HashMap<Integer, Integer>();

		int sum = 0;
		int minArrLen = -1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			int rem = sum % k;
			// existing remainder found with same rem value
			if (remainders.containsKey(rem)) {
				int thatIndex = remainders.get(rem);
				int diff = i - thatIndex;
				// find the difference of indexes
				// replace if it's less, since want to find min sum
				if (diff < minArrLen || minArrLen == -1)
					minArrLen = diff;
			}
			// replace earlier remainder, since we want to find min sum
			remainders.put(rem, i);
		}
		return minArrLen;
	}
}
