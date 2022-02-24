package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-19?zen=true
 * 
 * @author mario
 *
 */
public class Pattern19 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				boolean isStar = false;

				if (i == 1 && (j <= n / 2 + 1 || j == n))
					isStar = true;
				else if (i <= n / 2 && (j == n / 2 + 1 || j == n))
					isStar = true;
				else if (i == n / 2 + 1)
					isStar = true;
				else if (i >= n / 2 + 1 && (j == 1 || j == n / 2 + 1))
					isStar = true;
				else if (i == n && j >= n / 2 + 1)
					isStar = true;
				if (isStar)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}
}
