package dsa_practice_problems_500;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.techiedelight.com/find-pair-with-given-sum-array/
 */
public class FindAPairWithTheGivenSumInAnArray {
	public static void main(String[] args) {
		int nums[] = new int[] { 8, 7, 2, 5, 3, 1 };
		int target = 10;
//		solveBruteForce(nums, target);
//		solveHashmapLogic(nums, target);
		findPair(nums, target);
	}

	public static void solveBruteForce(int[] input, int sum) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == sum) {
					System.out.println(input[i] + " " + input[j]);
					return;
				}
			}
		}

		System.out.println("Not found");
	}

	public static void findPair(int[] nums, int target) {
		// create an empty HashMap
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < nums.length; i++) {
			// check if pair (nums[i], target-nums[i]) exists

			// if the difference is seen before, print the pair
			if (map.containsKey(target - nums[i])) {
				System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
				return;
			}

			// store index of the current element in the map
			map.put(nums[i], i);
		}

		// we reach here if the pair is not found
		System.out.println("Pair not found");
	}

	/**
	 * This was developed after brute force and I built this logic
	 * 
	 * @param input
	 * @param sum
	 */
	public static void solveHashmapLogic(int[] input, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			map.computeIfAbsent(input[i], (val) -> 0);
			map.put(input[i], map.get(input[i]) + 1);
		}

		for (int i = 0; i < input.length; i++) {
			int val = input[i];
			int left = sum - val;

			Integer valFromMap = map.get(left);
			if (valFromMap == null) {
				continue;
			}

			if (val == left && valFromMap == 1) {
				continue;
			}

			System.out.println(val + " " + left);
			break;
		}
	}
}
