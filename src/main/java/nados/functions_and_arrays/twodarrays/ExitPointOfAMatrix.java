package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/exit-point-of-a-matrix?zen=true
 * 
 * @author mario
 *
 */
public class ExitPointOfAMatrix {
	private static final int EAST = 0;
	private static final int SOUTH = 1;
	private static final int WEST = 2;
	private static final int NORTH = 3;

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

			for (int[] ar : arr) {
				for (int a : ar) {
					System.out.print(a + " ");
				}
				System.out.println();
			}

			int i = 0, j = 0;
			int dir = EAST;
			while (true) {
				dir = (dir + arr[i][j]) % 4;

				if (dir == EAST) {
					++j;
				} else if (dir == SOUTH) {
					++i;
				} else if (dir == WEST) {
					--j;
				} else if (dir == NORTH) {
					--i;
				}

				if (i < 0) {
					i++;
					break;
				}
				if (i >= row) {
					i--;
					break;
				}
				if (j < 0) {
					j++;
					break;
				}
				if (j >= column) {
					j--;
					break;
				}
			}

			System.out.println(i);
			System.out.println(j);
		}
	}

}
