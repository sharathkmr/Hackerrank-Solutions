// https://www.hackerrank.com/challenges/30-nested-logic

import java.util.Scanner;

/*
1 1 2010
31 12 2009

10000

23 12 1234
19 9 2468

0
*/

public class NestedLogic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		
		if(y1 > y2) {
			System.out.println(10000);
		} else {
			if(m1 > m2 && y1 == y2) {
				System.out.println(500*(m1-m2));
			} else {
				if(d1 > d2 && m1 == m2) {
					System.out.println(15*(d1-d2));
				} else {
					System.out.println(0);
				}
			}
		}
		
		in.close();
	}

}
