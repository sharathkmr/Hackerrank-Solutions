// https://www.hackerrank.com/challenges/s10-weighted-mean

import java.text.DecimalFormat;
import java.util.Scanner;

/*
sample input/output
10
10 40 30 50 20 10 40 30 50 20
1 2 3 4 5 6 7 8 9 10

31.1

 */

public class WeightedMean {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int[] weights = new int[n];
		for (int i = 0; i < n; i++) {
			weights[i] = sc.nextInt();
		}
		sc.close();
		
		float num=0;
		float dec = 0;
		
		for (int i = 0; i < n; i++) {
			num = num + (input[i] * weights[i]);
			dec = dec + weights[i];
		}
		DecimalFormat df = new DecimalFormat("#.0");
		System.out.println(df.format(num/dec));
	}
}
