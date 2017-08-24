// https://www.hackerrank.com/challenges/two-strings

import java.util.Scanner;

/*
input/output
---------
2
hello
world
hi
world

YES
NO
--------

 */

public class TwoStrings {

	static String twoStrings(String s1, String s2){
        // Complete this function
		int count = 0;
		int len = (s1.length() >= s2.length()) ? s2.length():s1.length();
		for (int i = 0; i < len; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				count++;
			}
		}
		if(count > 0) {
			return "YES";
		} else {
			return "NO";
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
        in.close();
    }

}
