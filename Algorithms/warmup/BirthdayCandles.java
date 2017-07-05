// https://www.hackerrank.com/challenges/birthday-cake-candles

import java.util.Scanner;

public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
	}
	
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		int max_len = 0;
		int count = 0;
		// to find the maximum height in array ar
        for (int i = 0; i < ar.length; i++) {
			if(max_len < ar[i]) {
				max_len = ar[i];
			}
		}
        // to find the number of candles with has max height
        for (int i = 0; i < ar.length; i++) {
			if(max_len == ar[i]) {
				count++;
			}
		}
        return count;
    }

}
