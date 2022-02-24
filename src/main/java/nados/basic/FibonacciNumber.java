package nados.basic;

import java.util.Scanner;

// https://nados.io/question/print-fibonacci-numbers-till-n
public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		int n1 = 0, n2 = 1;
		System.out.println(n1);

		for (int i = 1; i < n; i++) {
			int sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
		}
	}

}
