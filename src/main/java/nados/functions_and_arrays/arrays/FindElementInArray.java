package nados.functions_and_arrays.arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/find-element-in-an-array?zen=true
 * 
 * @author mario
 *
 */
public class FindElementInArray {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int[] arr = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(s.nextLine());

			int elementToFind = Integer.parseInt(s.nextLine());

			int index = -1;
			for (int i = 0; i < n; i++) {
				if (arr[i] == elementToFind) {
					index = i;
					break;
				}
			}

			System.out.println(index);
		}
	}

}
