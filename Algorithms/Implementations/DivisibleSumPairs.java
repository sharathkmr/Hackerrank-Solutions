// https://www.hackerrank.com/challenges/divisible-sum-pairs

import java.util.Scanner;

public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if(i == j) {
					continue;
				}
				if((ar[i]+ar[j]) % k == 0) {
				//	System.out.println(ar[i]+" "+ar[j]);
					count++;
				}
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }

}
