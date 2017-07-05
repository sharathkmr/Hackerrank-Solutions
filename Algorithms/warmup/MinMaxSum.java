// https://www.hackerrank.com/challenges/mini-max-sum

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        in.close();
        // to hold 64 bit int values
        /*integers
        int - 32
        long - 64

        decimal
        float - 32
        double 64*/
        long[] sum = new long[arr.length];
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
        	
			for (int j = 0; j < arr.length; j++) {
				if(i == j) {
					continue;
				}
				sum[i] = sum[i] + arr[j];
			}
			
			// finding max values
			if(sum[i] > max) {
				max = sum[i];
			}
		}
        System.out.println(Arrays.toString(sum));
        
        long min = max;
        // finding min value
        for (int i = 0; i < sum.length; i++) {
			if(sum[i] < min) {
				min = sum[i];
			}
		}
        System.out.println(min +" "+ max);
	}

}
