// https://www.hackerrank.com/challenges/counting-valleys

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		int count = 1;
		String[] temp = s.split("");
		int valleys = 0;
		for (int i = 0; i < temp.length; i++) {
			if(count == -1 && temp[i].equals("U")) {
				valleys++;
			}
			if(temp[i].equals("U")) {
				count++;
			} else {
				count--;
			}
		}
		System.out.println(valleys);
		
		in.close();
	}

}
