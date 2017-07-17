// https://www.hackerrank.com/challenges/s10-interquartile-range

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InterquartileRange {

	// list to store the median indexes
	private static List<Integer> med = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int[] freq = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			freq[i] = sc.nextInt();
			sum = sum + freq[i];
		}
		sc.close();
		// to store the freq generated matrix
		int[] in = new int[sum];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			int count = freq[i];
			while(count > 0) {
				in[index] = input[i];
				index++;
				count--;
			}
		}
		
		float q1 = 0;
		float q3 = 0;
		Arrays.sort(in);
		float q2 = median(in);
		if(med.size() == 1) {
			q1 = median(Arrays.copyOfRange(in, 0, med.get(0)));
			q3 = median(Arrays.copyOfRange(in, med.get(0)+1, in.length));
		} else if(med.size() == 2) {
			q1 = median(Arrays.copyOfRange(in, 0, med.get(0)));
			q3 = median(Arrays.copyOfRange(in, med.get(1)+1, in.length));
		}
		
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println(df.format(q3-q1));
	}
	
	public static float median(int[] input) {
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		if(input.length%2 == 0) {
			med.add(input.length/2);
			med.add((input.length-1)/2);
			return ((float)(input[input.length/2]+input[(input.length/2)-1])/2);
		} else {
			med.add(input.length/2);
			return input[(int) Math.ceil(input.length/2)];
		}
	}
	
	/* method to convert the given array and frequency to
	 the original array
	 input
	 ar[]
	 6 12 8 10 20 16
	 freq[]
5 4 3 2 1 5

output
[6, 6, 6, 6, 6, 8, 8, 8, 10, 10, 12, 12, 12, 12, 16, 16, 16, 16, 16, 20]

*/
	public static int[] freqArray(int[] ar, int[] freq) {
		int sum = 0;
		for (int i = 0; i < freq.length; i++) {
			sum = sum + freq[i];
		}
		
		System.out.println("sum: "+sum);
		int[] in = new int[sum];
		int index = 0;
		for (int i = 0; i < ar.length; i++) {
			int count = freq[i];
			System.out.println("count: "+count);
			while(count > 0) {
				in[index] = ar[i];
				index++;
				count--;
			}
		}
		return in;
	}

}
