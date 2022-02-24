package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-14?zen=true
 * 
 * @author mario
 *
 */
public class Pattern14 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			sol(n);
		}
	}

	private static void sol(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
