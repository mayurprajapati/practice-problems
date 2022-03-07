package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/the-state-of-wakanda-2?zen=true
 * 
 * @author mario
 *
 */
public class TheStateOfWakanda2 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int rows = Integer.parseInt(s.nextLine());
			int columns = rows;

			int arr[][] = new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					arr[i][j] = Integer.parseInt(s.nextLine());
				}
			}

			int row = rows - 1;
			int column = 0;

			while (row >= 0 && column < columns) {
				for (int i = 0, j = column; i <= row; i++, j++) {
					System.out.println(arr[i][j]);
				}

				row--;
				column++;
			}
		}
	}

}
