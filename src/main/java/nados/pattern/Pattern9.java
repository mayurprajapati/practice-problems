package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-9?zen=true
 * 
 * @author mario
 *
 */
public class Pattern9 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}

			System.out.println();
		}
	}
}
