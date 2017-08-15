// https://www.hackerrank.com/challenges/repeated-string

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        in.close();
        
        System.out.println(getCount(s,n));
   	}

	private static long getCount(String s, long n) {
		long repeat = n/s.length();
		long remainder = n%s.length();
		
		long count = 0;
		long remCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a') {
				count++;
				if(i < remainder) {
					remCount++;
				}
			}
		}
		return ((count * repeat) + remCount);
	}
}
