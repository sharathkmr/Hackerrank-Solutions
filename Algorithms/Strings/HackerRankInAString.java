// https://www.hackerrank.com/challenges/hackerrank-in-a-string

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            System.out.println(checkHackerrank(s));
        }
        in.close();
	}
	
	public static String checkHackerrank(String s) {
		String op = "hackerrank";
		if(s.length() < op.length()) {
			return "NO";
		}
		
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
        	if(j < op.length() && s.charAt(i) == op.charAt(j)) {
        		j++;
        	}
		}
     //   System.out.println("j: "+j);
        if(j == op.length()) {
        	return "YES";
        } else {
        	return "NO";
        }
	}
}
