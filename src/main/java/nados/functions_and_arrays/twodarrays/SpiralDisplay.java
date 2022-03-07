package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/spiral-display?zen=true
 * 
 * @author mario
 *
 */
public class SpiralDisplay {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int row = Integer.parseInt(s.nextLine());
			int column = Integer.parseInt(s.nextLine());

			int arr[][] = new int[row][column];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = Integer.parseInt(s.nextLine());
				}
			}

			int minRowIndex = 0;
			int minColIndex = 0;
			int maxRowIndex = row - 1;
			int maxColIndex = column - 1;

			int c = 0, maxC = row * column;
			while (c < maxC) {
				// left
				for (int i = minRowIndex; i <= maxRowIndex && c < maxC; i++) {
					System.out.println(arr[i][minColIndex]);
					c++;
				}

				// bottom
				for (int i = minColIndex + 1; i <= maxColIndex && c < maxC; i++) {
					System.out.println(arr[maxRowIndex][i]);
					c++;
				}

				// right
				for (int i = maxRowIndex - 1; i >= minRowIndex && c < maxC; i--) {
					System.out.println(arr[i][maxColIndex]);
					c++;
				}

				// top
				for (int i = maxColIndex - 1; i >= minColIndex + 1 && c < maxC; i--) {
					System.out.println(arr[minColIndex][i]);
					c++;
				}

				minRowIndex++;
				minColIndex++;
				maxRowIndex--;
				maxColIndex--;
			}
		}
	}

}
