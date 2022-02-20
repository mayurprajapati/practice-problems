package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DigitsOfANumber {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
//			usingCollection(n);
			usingDivisor(n);
		}
	}

	public static void usingDivisor(int n) {
		int nod = 0;
		int temp = n;

		while (temp != 0) {
			temp = temp / 10;
			nod++;
		}

		// getting power of 10 for nod
		// e.g. if the number is 2019 then nod will become 4 and Math.pow (nod - 1)will
		// give 1000
		int div = (int) Math.pow(10, nod - 1);

		while (div != 0) {
			System.out.println(n / div);
			// saving remainder
			n = n % div;
			// decrementing divisor
			div /= 10;
		}
	}

	public static void usingCollection(int n) {
		List<Integer> digits = new ArrayList<Integer>();

		while (n != 0) {
			digits.add(n % 10);
			n = n / 10;
		}

		Collections.reverse(digits);
		System.out.println(digits);
	}

}
