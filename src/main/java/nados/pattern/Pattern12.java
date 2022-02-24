package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-12?zen=true
 * 
 * @author mario
 *
 */
public class Pattern12 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n1 + "\t");
				int sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
			System.out.println();
		}
	}
}
