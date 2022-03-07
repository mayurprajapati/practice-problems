package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/bar-chart?zen=true
 * 
 * @author mario
 *
 */
public class BarChart {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			int max = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s.nextLine());
				max = Math.max(max, arr[i]);
			}

			for (int i = 0; i < max; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[j] >= max - i)
						System.out.print("*\t");
					else
						System.out.print("\t");
				}
				System.out.println();
			}
		}
	}

}
