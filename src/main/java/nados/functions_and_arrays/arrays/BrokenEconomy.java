package nados.functions_and_arrays.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://nados.io/question/broken-economy?zen=true
 * 
 * @author mario
 *
 */
public class BrokenEconomy {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		ceilAndFloor(arr, k);
	}

	private static void ceilAndFloor(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (k < arr[mid]) {
				high = mid - 1;
			} else if (k > arr[mid]) {
				low = mid + 1;
			} else {
				System.out.println(arr[mid]);
				return;
			}
		}

		if (high >= 0 && low < arr.length)
			System.out.println(arr[low] + "\n" + arr[high]);
	}

}
