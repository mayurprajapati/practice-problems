package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/saddle-price?zen=true
 * 
 * @author mario
 *
 */
public class SaddlePrice {

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

			int saddleRow = -1;
			int saddleCol = -1;

			for (int i = 0; i < rows; i++) {
				int min = arr[i][0];
				int col = 0;
				for (int j = 0; j < columns; j++) {
					if (min > arr[i][j]) {
						min = arr[i][j];
						col = j;
					}
				}

				int max = arr[i][col];
				boolean found = true;
				for (int k = 0; k < columns; k++) {
					if (max < arr[k][col]) {
						found = false;
						break;
					}
				}

				if (found) {
					saddleRow = i;
					saddleCol = col;
					break;
				}
			}

			if (saddleRow >= 0) {
				System.out.println(arr[saddleRow][saddleCol]);
			} else {
				System.out.println("Invalid input");
			}
		}
	}

}
