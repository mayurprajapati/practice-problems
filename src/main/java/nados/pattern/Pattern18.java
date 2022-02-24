package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-18?zen=true
 * 
 * @author mario
 *
 */
public class Pattern18 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int spaces = 0;
		int stars = n;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= spaces; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= stars; j++) {
				if (i <= n / 2 && i != 1 && j > 1 && j != stars)
					System.out.print("\t");
				else
					System.out.print("*\t");
			}
			System.out.println();

			if (i <= n / 2) {
				++spaces;
				stars -= 2;
			} else {
				--spaces;
				stars += 2;
			}
		}
	}
}
