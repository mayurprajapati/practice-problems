package nados.basic;

import java.util.Scanner;

// https://nados.io/question/pythagorean-triplet
public class PythagorasTriplet {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = Integer.parseInt(s.nextLine());
			int b = Integer.parseInt(s.nextLine());
			int c = Integer.parseInt(s.nextLine());

			sol1(a, b, c);
			sol2(a, b, c);
		}
	}

	private static void sol2(int a, int b, int c) {
		if (a > c) {
			c = a + c;
			a = c - a;
			c = c - a;
		}

		if (b > c) {
			c = b + c;
			b = c - b;
			c = c - b;
		}

		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	private static void sol1(int a, int b, int c) {
		boolean isPythagorasTriplet = false;
		for (int i = 0; i < 3; i++) {
			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
				isPythagorasTriplet = true;
				break;
			} else {
				int temp = a;
				a = b;
				b = c;
				c = temp;
			}
		}

		System.out.println(isPythagorasTriplet);
	}

}
