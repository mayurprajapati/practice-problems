package dsa_practice_problems_500;

import java.util.Arrays;

public class SortBinaryArrayInLinearTime {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 1, 0, 1, 0, 0, 1 };
		solve(arr);
	}

//	@formatter:off
	/**
	 * Input: { 1, 0, 1, 0, 1, 0, 0, 1 }

		start = 0
		end = 1
		
		Iteration 1
		start = 0
		end = 1
		input: { 1, 0, 1, 0, 1, 0, 0, 1 }
		swapped values, ++start, ++end
		output: { 0, 1, 1, 0, 1, 0, 0, 1 }
		start = 1
		end = 2
		
		Iteration 2
		start = 1
		end = 2
		input: { 0, 1, 1, 0, 1, 0, 0, 1 }
		both values are same, end++
		output: { 0, 1, 1, 0, 1, 0, 0, 1 }
		start = 1
		end = 3
		
		Iteration 3
		start = 1
		end = 3
		input: { 0, 1, 1, 0, 1, 0, 0, 1 }
		swapped values, ++start, ++end
		output: { 0, 0, 1, 1, 1, 0, 0, 1 }
		start = 2
		end = 4
		
		Iteration 4
		start = 2
		end = 4
		input: { 0, 0, 1, 1, 1, 0, 0, 1 }
		both values are same, end++
		output: { 0, 0, 1, 1, 1, 0, 0, 1 }
		start = 2
		end = 5
		
		Iteration 5
		start = 2
		end = 5
		input: { 0, 0, 1, 1, 1, 0, 0, 1 }
		swapped values, ++start, ++end
		output: { 0, 0, 0, 1, 1, 1, 0, 1 }
		start = 3
		end = 6
		
		Iteration 6
		start = 3
		end = 6
		input: { 0, 0, 0, 1, 1, 1, 0, 1 }
		swapped values, ++start, ++end
		output: { 0, 0, 0, 0, 1, 1, 1, 1 }
		start = 4
		end = 7
		
		Iteration 7
		start = 4
		end = 7
		input: { 0, 0, 0, 0, 1, 1, 1, 1 }
		both values are same, end++
		output: { 0, 0, 0, 0, 1, 1, 1, 1 }
		start = 4
		end = 8
		
		while start < end && end <= length

	 * @param arr
	 */
//	@formatter:on
	public static void solve(int[] arr) {
		int start = 0;
		int end = 1;

		while (start < end && end < arr.length) {
			int el1 = arr[start];
			int el2 = arr[end];

			if (el1 == el2) {
				// both values are same, ++end
				++end;
			} else {
				arr[start] = el2;
				arr[end] = el1;
				// values are different, swap
				// ++start. ++end
				++start;
				++end;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
