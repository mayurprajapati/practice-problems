package dsa_practice_problems_500;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Check if a subarray with 0 sum exists or not
 * https://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
 */
public class CheckIfASubarrayWith0SumExistsOrNot {
	public static void main(String[] args) {
		int[] input = new int[] { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		solve(input);
	}

	public static void solve(int[] arr) {
		int prefixSum = 0;
//		map <prefixSum, sum occurrence index
		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			if (map.containsKey(prefixSum)) {
				for (int j : map.get(prefixSum)) {
					printArr(arr, j + 1, i);
				}
			}
			if (prefixSum == 0) {
				printArr(arr, 0, i);
			}

			// add prefixSum and occurrence index
			map.computeIfAbsent(prefixSum, (val) -> new ArrayList<>()).add(i);
		}
	}

	private static void printArr(int[] arr, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
