// https://www.hackerrank.com/challenges/sock-merchant

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
        // Complete this function
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if((ar[i]!=-1 && ar[j]!=-1) && (i != j) && ar[i] == ar[j]) {
					count++;
					ar[i] = -1;
					ar[j] = -1;
				}
			//	System.out.println(Arrays.toString(ar));
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        in.close();
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }

}
