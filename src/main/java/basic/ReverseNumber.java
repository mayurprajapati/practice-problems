package basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());
			int nod = 0;

			// find number of digits
			int temp = n;
			while (temp != 0) {
				temp /= 10;
				nod++;
			}

			// find power of 10 for nod
			int pow = (int) Math.pow(10, nod - 1);
			int reversed = 0;
			while (n != 0) {
				// construct number based on remainder
				int rem = n % 10;
				reversed += rem * pow;
				pow /= 10;
				n /= 10;
			}

			System.out.println(reversed);
		}
	}

}
