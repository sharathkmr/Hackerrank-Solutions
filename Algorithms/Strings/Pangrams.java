// https://www.hackerrank.com/challenges/pangrams

import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(isPangram(s));
		in.close();
	}
	
	public static String isPangram(String s) {
		
		int[] alpha = new int[26];
		char[] temp = s.toLowerCase().toCharArray();
	//	System.out.println(Arrays.toString(temp));
		for (int i = 0; i < temp.length; i++) {
			if(temp[i] != 32) {
			//	System.out.println(temp[i]);
				alpha[temp[i]-97]++;
			}
		}
	//	System.out.println(Arrays.toString(alpha));
		
		for (int ascii : alpha) {
			if(ascii == 0) {
				return "not pangram";
			}
		}
		return "pangram";
	}

}
