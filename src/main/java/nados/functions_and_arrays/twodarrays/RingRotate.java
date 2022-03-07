package nados.functions_and_arrays.twodarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://nados.io/question/ring-rotate?zen=true
 * 
 * @author mario
 *
 */
public class RingRotate {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int rows = Integer.parseInt(s.nextLine());
			int columns = Integer.parseInt(s.nextLine());

			int arr[][] = new int[rows][columns];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					arr[i][j] = Integer.parseInt(s.nextLine());
				}
			}
			int rp = Integer.parseInt(s.nextLine());
			int r = Integer.parseInt(s.nextLine());

			ringRotate(arr, rp, r);
			display(arr);
		}
	}

	private static void ringRotate(int[][] arr, int rp, int r) {
		int[] oned = onedArr(arr, rp);
		r = r % oned.length;
		if (r == 0)
			return;
		if (r > 0)
			// convert to anti-clockwise
			r = oned.length - r;
		else
			// convert to clockwise
			r = Math.abs(r);
		reverse(oned, 0, oned.length - r - 1);
		reverse(oned, oned.length - r, oned.length - 1);
		reverse(oned, 0, oned.length - 1);
		populateOned(arr, oned, rp, r);
	}

	private static void populateOned(int[][] arr, int[] oned, int rp, int r) {
		int fr = rp - 1;
		int lr = arr.length - fr - 1;
		int fc = rp - 1;
		int lc = arr[0].length - fc - 1;
		int index = 0;

		// top
		for (int i = fc; i <= lc; i++) {
			arr[fc][i] = oned[index++];
		}
		// right
		if (lr != fr)
			for (int i = fr + 1; i <= lr - 1; i++) {
				arr[i][lc] = oned[index++];
			}
		// bottom
		if (lr != fr)
			for (int i = lc; i >= fc; i--) {
				arr[lr][i] = oned[index++];
			}

		// left
		if (lr != fr)
			for (int i = lr - 1; i >= fr + 1; i--) {
				arr[i][fc] = oned[index++];
			}
	}

	private static void reverse(int[] oned, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int temp = oned[i];
			oned[i] = oned[j];
			oned[j] = temp;
		}
	}

	private static int[] onedArr(int[][] arr, int rp) {
		int fr = rp - 1;
		int lr = arr.length - fr - 1;
		int fc = rp - 1;
		int lc = arr[0].length - fc - 1;
		int len = -1;
		if (lr == fr)
			len = arr[0].length - ((rp - 1) * 2);
		else
			len = ((lc - fc + 1) * 2) + ((lr - fr + 1 - 2) * 2);
		int[] oned = new int[len];
		int index = 0;

		// top
		for (int i = fc; i <= lc; i++) {
			oned[index++] = arr[fc][i];
		}
		// right
		if (lr != fr)
			for (int i = fr + 1; i <= lr - 1; i++) {
				oned[index++] = arr[i][lc];
			}
		// bottom
		if (lr != fr)
			for (int i = lc; i >= fc; i--) {
				oned[index++] = arr[lr][i];
			}

		// left
		if (lr != fr)
			for (int i = lr - 1; i >= fr + 1; i--) {
				oned[index++] = arr[i][fc];
			}

		return oned;
	}

	public static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
