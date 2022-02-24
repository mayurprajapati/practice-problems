package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-16?zen=true
 * 
 * @author mario
 *
 */
public class Pattern16 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		// -1 for making it odd, and -2 for initial occupied place
		int spaces = n + n - 1 - 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "\t");
			}

			for (int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}

			for (int j = i == n ? i - 1 : i; j >= 1; j--) {
				System.out.print(j + "\t");
			}

			System.out.println();

			spaces -= 2;
		}
	}
}
