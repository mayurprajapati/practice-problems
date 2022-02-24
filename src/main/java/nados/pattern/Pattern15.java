package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-15?zen=true
 * 
 * @author mario
 *
 */
public class Pattern15 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		int sp = n / 2;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			int c = num / 2 + 1;
			for (int j = 1; j <= num; j++) {
				System.out.print(c + "\t");
				if (j < num / 2 + 1) {
					c++;
				} else if (j == num / 2) {
				} else {
					c--;
				}
			}
			System.out.println();

			if (i < n / 2) {
				num += 2;
				sp--;
			} else if (i == n / 2) {
				num = n;
				sp = 0;
			} else {
				num -= 2;
				sp++;
			}
		}
	}
}
