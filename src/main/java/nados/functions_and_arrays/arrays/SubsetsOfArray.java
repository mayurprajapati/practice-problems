package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/subsets-of-array?zen=true
 * 
 * @author mario
 *
 */
public class SubsetsOfArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s.nextLine());
			}

			int max = (int) Math.pow(2, n);
			for (int i = 0; i < max; i++) {
				int temp = i;
				String str = "";
				for (int j = arr.length - 1; j >= 0; j--) {
					int rem = temp % 2;
					temp /= 2;
					if (rem == 1) {
						str = arr[j] + "\t" + str;
					} else {
						str = "-\t" + str;
					}
				}
				System.out.println(str);
			}
		}
	}
}
