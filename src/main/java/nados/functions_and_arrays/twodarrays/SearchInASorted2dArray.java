package nados.functions_and_arrays.twodarrays;

import java.util.Scanner;

/**
 * https://nados.io/question/search-in-a-sorted-2d-array?zen=true
 * 
 * @author mario
 *
 */
public class SearchInASorted2dArray {

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
			int val = Integer.parseInt(s.nextLine());
			binarySearch2dApproach1(arr, val);
			binarySearch2dApproach2(arr, val);
		}
	}

	private static void binarySearch2dApproach2(int[][] arr, int val) {
		int r = 0;
		int c = arr[0].length - 1;
		int n = arr.length;

		while (r < n && c >= 0) {
			if (arr[r][c] == val) {
				System.out.println(r + "\n" + c);
				return;
			} else if (val < arr[r][c])
				c--;
			else if (val > arr[r][c])
				r++;
		}

		System.out.println("Not Found");
	}

	private static void binarySearch2dApproach1(int[][] arr, int val) {
		int lr = 0;
		int hr = arr.length - 1;
		int columns = arr[0].length - 1;

		while (lr <= hr) {
			int midr = (lr + hr) / 2;

			if (val < arr[midr][0])
				hr = midr - 1;
			else if (val > arr[midr][columns - 1])
				lr = midr + 1;
			else {
				int coli = binarySearch1d(arr[midr], val);
				if (coli >= 0)
					System.out.println(midr + "\n" + coli);
				else
					System.out.println("Not Found");
				break;
			}
		}
	}

	private static int binarySearch1d(int[] arr, int val) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (val < arr[mid]) {
				high = mid - 1;
			} else if (val > arr[mid]) {
				low = mid + 1;
			} else
				return mid;
		}
		return -1;
	}

}
