// https://www.hackerrank.com/challenges/30-data-types

import java.util.Scanner;

public class DataTypes {
	
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank";
		Scanner scan = new Scanner(System.in);
		 /* Declare second integer, double, and String variables. */
        int a = scan.nextInt();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        double b = scan.nextDouble();
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        scan.close();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(a+i);
        /* Print the sum of the double variables on a new line. */
		System.out.println(b+d);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);
	}

}
