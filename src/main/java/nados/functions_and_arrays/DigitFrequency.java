package nados.functions_and_arrays;

import java.util.Scanner;

/**
 * https://nados.io/article/digit-frequency?zen=true
 * 
 * @author mario
 *
 */
public class DigitFrequency {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d = scn.nextInt();
		int f = getDigitFrequency(n, d);
		System.out.println(f);
	}

	public static int getDigitFrequency(int n, int d) {
		int f = 0;
		while (n != 0) {
			if (n % 10 == d)
				f++;
			n /= 10;
		}

		return f;
	}

}
