// https://www.hackerrank.com/challenges/countingsort2

import java.util.Scanner;

public class CountingSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		int[] res = new int[100];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
			res[ar[i]]++;
		}
		sc.close();
		for (int i = 0; i < res.length; i++) {
			while(res[i] > 0) {
				System.out.print(i+" ");
				res[i]--;
			}
		}
	}

}
