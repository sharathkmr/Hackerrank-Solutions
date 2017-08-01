// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies

import java.util.Scanner;

public class BeautifulDayAtMovies {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		int end = in.nextInt();
		int div = in.nextInt();
		in.close();
		int count = 0;
		for (int i = start; i <= end; i++) {
			StringBuffer bf = new StringBuffer(Integer.toString(i));
			String iRev = bf.reverse().toString();
			
			float res = (float)(i - Integer.parseInt(iRev))/div;
			if(res < 0) {
				res = res * -1;
			}
	//		System.out.println("result: "+res);
			if(res == (int)res) {
	//			System.out.println("res: "+res);
				count++;
			}
		}
		System.out.println(count);
	}
}