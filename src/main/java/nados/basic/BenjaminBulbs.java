package nados.basic;

import java.util.Scanner;

// https://nados.io/question/the-curious-case-of-benjamin-bulbs
public class BenjaminBulbs {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			// print all perfect squares
			// perfect squares always have 2n + 1 numbers of factors

			for (int i = 1; i * i <= n; i++) {
				System.out.println(i * i);
			}
		}
	}

}
