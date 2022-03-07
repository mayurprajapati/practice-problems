package nados.functions_and_arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/any-base-subtraction?zen=true
 * 
 * @author mario
 *
 */
public class AnyBaseSubstraction {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		int d = getSum(b, n1, n2);
		System.out.println(d);
	}

	public static int getSum(int b, int n1, int n2) {
		n1 = getValueIndecimal(n1, b);
		n2 = getValueIndecimal(n2, b);
		return getValueInBase(n2 - n1, b);
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
