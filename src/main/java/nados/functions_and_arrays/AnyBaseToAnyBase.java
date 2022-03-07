package nados.functions_and_arrays;

import java.util.Scanner;

/**
 * https://nados.io/question/any-base-to-any-base?zen=true
 * 
 * https://www.calculatorsoup.com/calculators/math/longdivision.php
 * https://www.rapidtables.com/convert/number/base-converter.html
 * 
 * @author mario
 *
 */
public class AnyBaseToAnyBase {

	/**
	 * 482 9 8 605 original: 616
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sourceBase = scn.nextInt();
		int destBase = scn.nextInt();
		int dn = getAnyBaseToAnyBase(n, sourceBase, destBase);
		System.out.println(dn);
	}

	public static int getAnyBaseToAnyBase(int n, int sourceBase, int destBase) {
		int mul = 0;
		int res = 0;

		int tmpn = n;
		while (tmpn != 0) {
			int rem = tmpn % 10;
			tmpn /= 10;
			res += ((int) Math.pow(sourceBase, mul)) * rem;
			++mul;
		}

		mul = 0;
		n = res;
		res = 0;
		while (n != 0) {
			int rem = n % destBase;
			n /= destBase;
			res += ((int) Math.pow(10, mul)) * rem;
			++mul;
		}

		return res;
	}

}
