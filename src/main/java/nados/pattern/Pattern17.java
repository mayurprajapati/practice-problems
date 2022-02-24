package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-17?zen=true
 * 
 * @author mario
 *
 */
public class Pattern17 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int stars = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				if (i == (n / 2) + 1)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}

			for (int j = 1; j <= stars; j++) {
				System.out.print("*\t");
			}
			System.out.println();

			if (i <= n / 2)
				++stars;
			else
				--stars;
		}
	}
}
