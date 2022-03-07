package nados.functions_and_arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/decimal-to-any-base?zen=true
 * 
 * @author mario
 *
 */
public class DecimalToAnyBase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getValueInBase(n, b);
		System.out.println(dn);
	}

	public static int getValueInBase(int n, int b) {
		int mul = 0;
		int res = 0;

		while (n != 0) {
			int rem = n % b;
			res += ((int) Math.pow(10, mul++)) * rem;
			n /= b;
		}

		return res;
	}

}
