package nados.basic;

import java.util.Scanner;

// https://nados.io/question/rotate-a-number
public class RotateANumber {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine()); // 31495
			int r = Integer.parseInt(s.nextLine()); // 1

			// find number of digits
			int temp = n; // 31495
			int digits = 0;
			while (temp != 0) {
				temp = temp / 10;
				digits++;
			}
			// digits = 5

			r = r % digits;
			if (r < 0)
				r = digits + r;
			// r = 1

//			usingMathLib(n, r, digits);
			usingStandardWay(n, r, digits);
		}
	}

	private static void usingStandardWay(int n, int r, int digits) {
		int div = 1, mult = 1;

		for (int i = 1; i <= digits; i++) {
			if (i <= r)
				div *= 10;
			else
				mult *= 10;
		}

		int quotiont = n / div;
		int remainder = n % div;
		System.out.println(remainder * mult + quotiont);
	}

	private static void usingMathLib(int n, int r, int digits) {
		int left = digits - r; // 4
		int right = digits - left; // 1

		int leftRem = n % (int) Math.pow(10, right); // 5
		n = n / (int) Math.pow(10, right); // 3149
		int rotate = (((int) Math.pow(10, left)) * leftRem) + n; // 53195
		System.out.println(rotate);
	}

}
