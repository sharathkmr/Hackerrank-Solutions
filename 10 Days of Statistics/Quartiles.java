// https://www.hackerrank.com/challenges/s10-quartiles

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
sample input/output
10
3 7 8 5 12 14 21 15 18 14

7
13
15

sample input/output
9
3 7 8 5 12 14 21 13 18

6
12
16
 */

public class Quartiles {
	
	// lis to store medians indexes
	private static List<Integer> med = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		int q1 = 0;
		int q3 = 0;
		Arrays.sort(input);
		// find the median of the array and then using the index of median
		// divide the array and then find the medians of the divided arrays
		int q2 = median(input);
		if(med.size() == 1) {
			q1 = median(Arrays.copyOfRange(input, 0, med.get(0)));
			q3 = median(Arrays.copyOfRange(input, med.get(0)+1, input.length));
		} else if(med.size() == 2) {
			q1 = median(Arrays.copyOfRange(input, 0, med.get(0)));
			q3 = median(Arrays.copyOfRange(input, med.get(1)+1, input.length));
		}
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
	}
	
	public static int median(int[] input) {
		Arrays.sort(input);
		if(input.length%2 == 0) {
			med.add(input.length/2);
			med.add((input.length-1)/2);
			return ((input[input.length/2]+input[(input.length/2)-1])/2);
		} else {
			med.add(input.length/2);
			return input[(int) Math.ceil(input.length/2)];
		}
	}

}
