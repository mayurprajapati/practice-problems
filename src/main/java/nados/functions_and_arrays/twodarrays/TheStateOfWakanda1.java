package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/the-state-of-wakanda-1?zen=true
 * 
 * @author mario
 *
 */
public class TheStateOfWakanda1 {

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

			for (int j = 0; j < column; j++) {
				if (j % 2 == 0) {
					for (int i = 0; i < row; i++) {
						System.out.println(arr[i][j]);
					}
				} else {
					for (int i = row - 1; i >= 0; i--) {
						System.out.println(arr[i][j]);
					}
				}
			}
		}
	}

}
