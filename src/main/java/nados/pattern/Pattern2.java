package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-2
 * 
 * @author mario
 */
public class Pattern2 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			for (int i = n; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*\t");
				}
				System.out.println();
			}
		}
	}
}
