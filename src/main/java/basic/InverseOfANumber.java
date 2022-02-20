package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Inverse number based on number positions
 * 
 * 1 <= dig <= size(max digit)
 * 
 * input: 81456273 <br>
 * output: 82456137
 */
public class InverseOfANumber {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = Integer.parseInt(s.nextLine());

			usingMap(n);
			usingStandardWay(n);
		}
	}

	private static void usingStandardWay(int n) {
		int pos = 1;
		int inv = 0;

		while (n != 0) {
			int place = n % 10;
			int digit = pos;
			n /= 10;

			inv += digit * (int) Math.pow(10, place - 1);
			pos++;
		}

		System.out.println(inv);
	}

	private static void usingMap(int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int pos = 1;
		while (n != 0) {
			map.put(n % 10, pos);
			n = n / 10;
			pos++;
		}

		while (--pos > 0) {
			System.out.print(map.get(pos));
		}
	}
}
