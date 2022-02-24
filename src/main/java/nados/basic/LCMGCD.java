package nados.basic;

import java.util.Scanner;

// https://nados.io/article/gcd-and-lcm
public class LCMGCD {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n1 = Integer.parseInt(s.nextLine());
			int n2 = Integer.parseInt(s.nextLine());

			int tn1 = n1;
			int tn2 = n2;

			while (tn1 % tn2 != 0) {
				int rem = tn1 % tn2;
				tn1 = tn2;
				tn2 = rem;
			}

			System.out.println("LCM is " + tn2);
			System.out.println("GCD is " + (n1 * n2 / tn2));
		}
	}
}
