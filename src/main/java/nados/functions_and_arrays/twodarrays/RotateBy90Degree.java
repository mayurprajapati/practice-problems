package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/rotate-by-90-degree?zen=true
 * 
 * @author mario
 *
 */
public class RotateBy90Degree {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int rows = Integer.parseInt(s.nextLine());

			int arr[][] = new int[rows][rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < rows; j++) {
					arr[i][j] = Integer.parseInt(s.nextLine());
				}
			}

			for (int i = 0; i < rows; i++) {
				for (int j = rows - 1, k = 0; j >= 0; j--, k++) {
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
		}
	}

}
