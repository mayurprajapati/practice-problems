package nados.pattern;

import java.util.Scanner;
/**
 * https://nados.io/question/pattern-6?zen=true
 * 
 * @author mario
 *
 */
public class Pattern6 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			int space = 1;
			int star = n / 2 + 1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= star; j++)
					System.out.print("*\t");
				for (int j = 1; j <= space; j++)
					System.out.print("\t");
				for (int j = 1; j <= star; j++)
					System.out.print("*\t");

				if (i <= n / 2) {
					star--;
					space += 2;
				} else {
					star++;
					space -= 2;
				}

				System.out.println();
			}
		}
	}

}
