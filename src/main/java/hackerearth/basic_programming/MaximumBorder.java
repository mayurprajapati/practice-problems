package hackerearth.basic_programming;

import java.util.Scanner;

/**
 * DOC:
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/maximum-border-9767e14c/
 * 
 * @author mario
 */
public class MaximumBorder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tests = s.nextInt();
		while (tests-- > 0) {
			int n = s.nextInt(), m = s.nextInt();

			String[] rows = new String[n];
			for (int i = 0; i < rows.length; i++) {
				rows[i] = s.nextLine();
			}
		}
	}

}
