// https://www.hackerrank.com/challenges/s10-basic-statistics

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(mean(input));
		System.out.println(median(input));
		System.out.println(mode(input));
	}
	
	// mean
	public static float mean(int[] input) {
		float sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum/input.length;
	}
	
	// median
	public static float median(int[] input) {
		// sorting the arrays before finding median
		Arrays.sort(input);
		if(input.length%2 == 0) {
			return ((float)(input[input.length/2]+input[(input.length/2)-1])/2);
		} else {
			return input[(int) Math.ceil(input.length/2)];
		}
	}
	
	// mode
	public static int mode(int[] a) {
	    int maxValue = 0, maxCount = 0;

	    for (int i = 0; i < a.length; ++i) {
	        int count = 0;
	        for (int j = 0; j < a.length; ++j) {
	            if (a[j] == a[i]) ++count;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            maxValue = a[i];
	        }
	    }

	    return maxValue;
	}

}
