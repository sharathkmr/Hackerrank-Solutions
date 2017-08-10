// https://www.hackerrank.com/challenges/migratory-birds

import java.util.Scanner;

public class MigratoryBirds {
	
	static int migratoryBirds(int n, int[] ar, int max) {
        // Complete this function
		int[] counts = new int[max];
		int res = 0;
		int maxCount = 0;
		// counting the bird type using counting sort algorithm
		for (int i = 0; i < ar.length; i++) {
			counts[ar[i]-1]++;
		}
		// getting the max bird type
		for (int i = 0; i < counts.length; i++) {
			if(maxCount < counts[i]) {
				maxCount = counts[i];
				res = i+1;
			}
		}
		return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int max = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
            if(max < ar[ar_i]) {
            	max = ar[ar_i];
            }
        }
        in.close();
        int result = migratoryBirds(n, ar, max);
        System.out.println(result);
    }

}
