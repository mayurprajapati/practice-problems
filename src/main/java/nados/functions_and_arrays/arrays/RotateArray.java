package nados.functions_and_arrays.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://nados.io/question/rotate-an-array?zen=true
 * 
 * @author mario
 *
 */
public class RotateArray {

	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + " ");
		}
		System.out.println(sb);
	}

	public static void rotate(int[] a, int k) {
		int n = a.length;
		k = (k % n);
		if (k < 0)
			k = n + k;

		reverse(a, 0, n - k - 1);
		reverse(a, n - k, n - 1);
		reverse(a, 0, n - 1);
	}

	public static void reverse(int[] arr, int from, int to) {
		for (int i = from, j = to; i < j; i++, j--) {
			arr[i] = arr[i] + arr[j];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] - arr[j];
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());

		rotate(arr, k);
		display(arr);
	}

}
