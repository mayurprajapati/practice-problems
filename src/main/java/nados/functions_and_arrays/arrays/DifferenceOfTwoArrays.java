package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/difference-of-two-arrays?zen=true
 * 
 * @author mario
 *
 */
public class DifferenceOfTwoArrays {
	// @formatter:off
	/**
	 input
	 1
9
3
1
1
1



1
9
4
1
0
0
1

	 */
	// @formatter:on

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n1 = Integer.parseInt(s.nextLine());
			int[] arr1 = new int[n1];
			for (int i = 0; i < n1; i++) {
				arr1[i] = Integer.parseInt(s.nextLine());
			}

			int n2 = Integer.parseInt(s.nextLine());
			int[] arr2 = new int[n2];
			for (int i = 0; i < n2; i++) {
				arr2[i] = Integer.parseInt(s.nextLine());
			}

			int[] subArr = new int[Math.max(n2, n1)];
			int i = arr1.length - 1;
			int j = arr2.length - 1;
			int k = subArr.length - 1;

			int carry = 0;
			while (k >= 0) {
				arr2[j] -= carry;

				int el1 = 0;
				if (i >= 0)
					el1 = arr1[i];

				if (arr2[j] < el1) {
					arr2[j] = arr2[j] + 10;
					carry = 1;
				} else
					carry = 0;

				subArr[k] = arr2[j] - el1;

				k--;
				j--;
				i--;
			}

			if (carry > 0)
				subArr[0] -= carry;

			for (i = 0; i < subArr.length; i++)
				if (subArr[i] > 0) {
					k = i;
					break;
				}

			for (; k < subArr.length; k++)
				System.out.println(subArr[k]);
		}
	}

}
