// https://www.hackerrank.com/challenges/permutation-equation

import java.util.Scanner;

public class SequenceEquation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = in.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < input.length; j++) {
			//	System.out.println("i "+i+" j "+input[j]);
				if(i == input[j]) {
					int index= j+1;
					for (int k = 0; k < input.length; k++) {
						if(index == input[k]) {
							System.out.println(k+1);
						}
					}
				}
			}
		}
		in.close();
	}

}
