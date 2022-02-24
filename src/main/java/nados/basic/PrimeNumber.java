package nados.basic;

import java.util.Scanner;

// https://nados.io/article/primes-till-n
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = Integer.parseInt(s.nextLine());

		int sqrt = (int) Math.sqrt(num);
		for (int i = 2; i <= sqrt; i++) {
			if (num % i == 0) {
				System.out.println("Not prime");
				return;
			}
		}

		System.out.println("Prime");
	}

}
