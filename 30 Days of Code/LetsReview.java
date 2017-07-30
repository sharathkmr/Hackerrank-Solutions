// https://www.hackerrank.com/challenges/30-review-loop

import java.util.Scanner;

public class LetsReview {
	
	static String[] out;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			String[] temp = s.split("");
			out = new String[2];
			for (int j = 0; j < temp.length; j++) {
				if(j%2 == 0) {
					if(out[0] == null) { out[0] = temp[j]; }
					else { out[0]+= temp[j]; }
				} else {
					if(out[1] == null) { out[1] = temp[j]; }
					else { out[1]+= temp[j]; }
				}
			}
			System.out.println(out[1]+" "+out[0]);
		}
		in.close();
	}
}
