package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/2d-arrays-demo?zen=true
 * 
 * @author mario
 *
 */
public class TwodArraysDemo {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int row1 = Integer.parseInt(s.nextLine());
			int column1 = Integer.parseInt(s.nextLine());

			int arr1[][] = new int[row1][column1];
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column1; j++) {
					arr1[i][j] = Integer.parseInt(s.nextLine());
				}
			}

			int row2 = Integer.parseInt(s.nextLine());
			int column2 = Integer.parseInt(s.nextLine());

			int arr2[][] = new int[row2][column2];
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < column2; j++) {
					arr2[i][j] = Integer.parseInt(s.nextLine());
				}
			}

			if (column1 != row2) {
				System.out.println("Invalid input");
				return;
			}

			int arr3[][] = new int[row1][column2];
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < column2; j++) {
					int sum = 0;
					for (int k = 0; k < column1; k++) {
						sum += arr1[i][k] * arr2[k][j];
					}
					arr3[i][j] = sum;
				}
			}

			for (int[] arr : arr3) {
				for (int a : arr) {
					System.out.print(a + " ");
				}
				System.out.println();
			}

		}
	}

}
