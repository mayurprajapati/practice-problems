package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-11?zen=true
 * 
 * @author mario
 *
 */
public class Pattern11 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int c = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c++ + "\t");
			}
			System.out.println();
		}
	}
}
