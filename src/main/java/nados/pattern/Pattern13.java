package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-13?zen=true
 * 
 * @author mario
 *
 */
public class Pattern13 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		for (int i = 0; i < n; i++) {
			int icj = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(icj + "\t");
				int icjp1 = (icj * (i - j)) / (j + 1);
				icj = icjp1;
			}
			System.out.println();
		}
	}
}
