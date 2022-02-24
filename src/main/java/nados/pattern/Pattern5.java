package nados.pattern;

import java.util.Scanner;

/**
 * https://nados.io/question/pattern-5?zen=true
 * 
 * @author mario
 *
 */
public class Pattern5 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			int space = n / 2;
			int star = 1;

			for (int i = 1; i <= n; i++) {
				int j;
				for (j = 1; j <= space; j++)
					System.out.print("\t");
				for (j = 1; j <= star; j++)
					System.out.print("*\t");

				System.out.println();

				if (i <= n / 2) {
					space--;
					star += 2;
				} else {
					space++;
					star -= 2;
				}
			}
		}
	}

}
