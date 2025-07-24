package dsa_practice_problems_500;

/**
 * Find the duplicate element in a limited range array <br>
 * Given a limited range array of size n containing elements between 1 and n-1
 * with one element repeating, find the duplicate number in it without using any
 * extra space.
 */
public class FindTheDuplicateElementInALimitedRangeArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		solve1(arr);
	}

	public static void solve1(int[] arr) {
		boolean seen[] = new boolean[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			int el = arr[i];

			if (seen[el]) {
				System.out.println(el);
				return;
			}

			seen[el] = true;
		}
	}

}
