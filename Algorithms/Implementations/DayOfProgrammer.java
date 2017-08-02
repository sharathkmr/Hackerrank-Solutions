// https://www.hackerrank.com/challenges/day-of-the-programmer

import java.util.Scanner;

/*
input/output
2200

13.09.2200

1700
12.09.1700

2000
12.09.2000
 */

public class DayOfProgrammer {

	static String solve(int year) {
		// Complete this function
		// julian calender
		if(year >= 1700 && year <= 1917) {
			if (year % 4 == 0) {
				return "12" + ".09." + year;
			} else {
				return "13" + ".09." + year;
			}
		} else if(year == 1918) { // transition
			return "26" + ".09." + year;
		} else {
			// Gregorian calender
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				return "12" + ".09." + year;
			} else {
				return "13" + ".09." + year;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		String result = solve(year);
		System.out.println(result);
	}

}
