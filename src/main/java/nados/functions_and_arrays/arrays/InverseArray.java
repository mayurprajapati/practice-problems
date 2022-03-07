package nados.functions_and_arrays.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://nados.io/question/inverse-of-an-array?zen=true
 * 
 * @author mario
 *
 */
public class InverseArray {

	public static void display(int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int val : a) {
			sb.append(val + "\n");
		}
		System.out.println(sb);
	}

	public static int[] inverse(int[] a) {
		int[] res = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			res[a[i]] = i;
		}

		return res;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] inv = inverse(a);
		display(inv);
	}

}
