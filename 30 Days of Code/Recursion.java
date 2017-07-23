// https://www.hackerrank.com/challenges/30-recursion

import java.util.Scanner;

public class Recursion {
	
	static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int result = factorial(n);
        System.out.println(result);
    }
}
