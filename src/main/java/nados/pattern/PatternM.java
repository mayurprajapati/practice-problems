package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-m?zen=true
 * 
 * @author mario
 *
 */
public class PatternM {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n)
					System.out.print("*\t");
				else if (i <= n / 2 + 1 && (i == j || i + j == n + 1)) {
					System.out.print("*\t");
				} else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}
