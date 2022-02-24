package nados.pattern;

import java.util.Iterator;
import java.util.Scanner;

/**
 * https://nados.io/question/pattern-1
 * 
 * @author mario
 *
 */
public class Pattern1 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}
