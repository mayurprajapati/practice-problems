package nados.functions_and_arrays.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://nados.io/question/first-index-and-last-index?zen=true
 * 
 * @author mario
 *
 */
public class FirstIndexAndLastIndex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		firstAndLastIndex(arr, k);
	}

	private static void firstAndLastIndex(int[] arr, int k) {
		int index = binarySearch(arr, k);
		if (index == -1) {
			System.out.println(-1);
			System.out.println(-1);
			return;
		}

		int first = index;
		int last = index;

		for (int i = index; i >= 0; i--) {
			if (arr[i] != k) {
				first = i + 1;
				break;
			}
		}

		for (int i = index; i < arr.length; i++) {
			if (arr[i] != k) {
				last = i - 1;
				break;
			}
		}

		System.out.println(first);
		System.out.println(last);
	}

	private static int binarySearch(int[] arr, int el) {
		Arrays.sort(arr);

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (el < arr[mid]) {
				high = mid - 1;
			} else if (el > arr[mid]) {
				low = mid + 1;
			} else
				return mid;
		}

		return -1;
	}

}
