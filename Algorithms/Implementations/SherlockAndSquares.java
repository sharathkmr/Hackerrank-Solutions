// https://www.hackerrank.com/challenges/sherlock-and-squares

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		while(n-- > 0) {
			int range1 = in.nextInt();
			int range2 = in.nextInt();
			
			System.out.println(Math.floor(Math.sqrt(range2))- Math.ceil(Math.sqrt(range1))+1);
		}
		in.close();
	}

}
