// https://www.hackerrank.com/challenges/staircase

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i = 0; i <= n; i++) {
			// string to hold the staircase
			String s = "";
			if (i != 0) {
				// this appends the spaces
				for (int j = 0; j < (n - i); j++) {
					s = s + " ";
				}
				// this appends the #
				for (int j = (n - i); j < n; j++) {
					s = s + "#";
				}
				System.out.println(s);
			}
		}
	}

}
