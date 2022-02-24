package nados.basic;

import java.util.Scanner;

// https://nados.io/question/prime-factorisation-of-a-number
public class PrimeFactorization {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			int d = 2;
			/**
			 * if p * q = n then !p > n || !q > n
			 */
			while (n != 1 && d * d <= n) {
				if (n % d == 0) {
					n /= d;
					System.out.print(d + " ");
				} else
					d++;
			}

			// handle cases like 5 * 1, since we are using p * n = n logic
			// try numbers 1440, 46
			if (n != 1)
				System.out.print(n);
		}
	}

}
