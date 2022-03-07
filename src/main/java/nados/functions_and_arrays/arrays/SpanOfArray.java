package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/span-of-array?zen=true
 * 
 * @author mario
 *
 */
public class SpanOfArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(s.nextLine());

			int max = arr[0];
			int min = arr[0];

			for (int i = 0; i < n; i++) {
				max = Math.max(arr[i], max);
				min = Math.min(arr[i], min);
			}

			System.out.println(max - min);
		}
	}

}
