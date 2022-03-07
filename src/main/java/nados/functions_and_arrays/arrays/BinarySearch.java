package nados.functions_and_arrays.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
	// @formatter:off
	/**
	 * 5
20
30
40
10
50
40
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	// @formatter:on
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int v = Integer.parseInt(br.readLine());

		int index = search(a, v);
		System.out.println(index);
	}

	private static int search(int[] arr, int v) {
		Arrays.sort(arr);

		int low = 0, high = arr.length - 1;
		while (!(low > high)) {
			int mid = (low + high) / 2;
			if (v < arr[mid]) {
				high = mid - 1;
			} else if (v > arr[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}
}
