// https://www.hackerrank.com/challenges/bon-appetit

import java.util.Scanner;

public class BonAppetit {

	static void bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
		int res = 0;
		// calculating the total cost
		for (int i = 0; i < ar.length; i++) {
			if(i == k) {
				continue;
			} else {
				res = res + ar[i];
			}
		}
		// comparing the split amount and charged amount
		if((res/2) == b) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(b - (res/2));
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        in.close();
        bonAppetit(n, k, b, ar);
    }

}
