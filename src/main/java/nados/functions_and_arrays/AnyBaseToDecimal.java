package nados.functions_and_arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/any-base-to-decimal?zen=true
 * 
 * @author mario
 *
 */
public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = scn.nextInt();
		int dn = getValueIndecimal(n, b);
		System.out.println(dn);
	}

	public static int getValueIndecimal(int n, int b) {
		int mul = 0;
		int res = 0;

		while (n != 0) {
			int rem = n % 10;
			res += ((int) Math.pow(b, mul++)) * rem;
			n /= 10;
		}

		return res;
	}

}
