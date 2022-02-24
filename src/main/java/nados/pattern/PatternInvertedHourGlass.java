package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-inverted-hour-glass?zen=true
 * 
 * @author mario
 *
 */
public class PatternInvertedHourGlass {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int nst = n, nsp = 0;
		for (int i = 0; i < n; i++) {
			for (int sp = 0; sp < nsp; sp++)
				System.out.print("	");
			for (int st = 0; st < nst; st++) {
				if (i < n / 2 || st == 0 || st == nst - 1 || i == n - 1)
					System.out.print("*	");
				else
					System.out.print("	");
			}
			System.out.println();
			if (i < n / 2) {
				nsp += 1;
				nst -= 2;
			} else {
				nsp -= 1;
				nst += 2;
			}
		}
	}
}
