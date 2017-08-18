// https://www.hackerrank.com/challenges/mars-exploration

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String msg = "SOS";
        int count = 0;
        int j=0;
        for (int i = 0; i < S.length(); i++) {
			if(j == msg.length()) {
				j=0;
			}
		//	System.out.println(S.charAt(i) +" : "+ msg.charAt(j));
			if(S.charAt(i) != msg.charAt(j)) {
				count++;
			}
			j++;
		}
        System.out.println(count);
        in.close();
    }
	
}
