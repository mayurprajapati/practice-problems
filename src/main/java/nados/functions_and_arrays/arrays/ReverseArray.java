package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/reverse-an-array?zen=true
 * 
 * @author mario
 *
 */
public class ReverseArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s.nextLine());
			}

			for (int i = 0, j = n - 1; i < n / 2 && j >= 0; i++, j--) {
				arr[j] = arr[i] + arr[j];
				arr[i] = arr[j] - arr[i];
				arr[j] = arr[j] - arr[i];
			}

			for (int a : arr) {
				System.out.println(a);
			}
		}
	}

}
