package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/sum-of-two-arrays?zen=true
 * 
 * @author mario
 *
 */
public class SumOfTwoArrays {
	// @formatter:off
	/**
	 input
	 5
1
9
5
4
6
4
1
7
1
9
	 */
	// @formatter:on

	public static void main(String[] args) throws Exception {
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

			int[] sumArr = new int[Math.max(n1, n2)];
			int i = arr1.length - 1;
			int j = arr2.length - 1;
			int k = sumArr.length - 1;

			int carry = 0;
			while (k >= 0) {
				int el1 = 0;
				int el2 = 0;

				if (i >= 0)
					el1 = arr1[i];
				if (j >= 0)
					el2 = arr2[j];

				int sum = carry + el1 + el2;

				if (sum > 9) {
					carry = sum / 10;
					sum = sum % 10;
				} else
					carry = 0;

				sumArr[k] = sum;

				k--;
				j--;
				i--;
			}

			for (k = 0; k < sumArr.length; k++)
				System.out.println(sumArr[k]);
		}
	}

}
