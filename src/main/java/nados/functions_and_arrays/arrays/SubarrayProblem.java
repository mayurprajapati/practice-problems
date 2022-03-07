package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/subarray-problem?zen=true
 * 
 * @author mario
 *
 */
public class SubarrayProblem {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s.nextLine());
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = i; j < arr.length; j++) {
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k] + "\t");
					}
					System.out.println();
				}
			}
		}
	}

}
