package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-7?zen=true
 * 
 * @author mario
 *
 */
public class Pattern7 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			int space = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= space; j++) {
					System.out.print("\t");
				}
				System.out.println("*\t");
				space++;
			}
		}
	}
}
