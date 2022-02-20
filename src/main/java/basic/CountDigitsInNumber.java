package basic;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			int c = 0;
			do {
				++c;
			} while ((n = n / 10) > 0);

			System.out.println(c);
		}
	}

}
