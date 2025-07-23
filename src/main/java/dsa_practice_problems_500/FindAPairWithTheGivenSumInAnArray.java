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
		// we could use hash set
		Map<Integer, Integer> memory = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int left = target - num;

			if (memory.containsKey(left)) {
				System.out.println(num + " " + left);
				return;
			}

			memory.put(num, i);
		}

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
