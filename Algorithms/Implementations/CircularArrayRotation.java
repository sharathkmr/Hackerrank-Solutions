// https://www.hackerrank.com/challenges/circular-array-rotation

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int q = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			b[a_i] = a[a_i];
		}
		k = k % n;
		for (int i = 0; i < n; i++) {
			int temp = (n-k+i)%n;
			a[i] = b[temp];
		}
		for (int a0 = 0; a0 < q; a0++) {
			int m = in.nextInt();
			System.out.println(a[m]);
		}
		in.close();
	}
}
