// https://www.hackerrank.com/challenges/picking-numbers

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
	
	static int limit = 100;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] count = new int[limit];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            count[a[a_i]]++;
        }
     //   System.out.println(Arrays.toString(count));
        in.close();
        int max = 0;
        for (int i = 0; i < count.length-1; i++) {
			int sum = count[i]+count[i+1];
			if(max < sum) {
				max = sum;
			}
		}
        System.out.println(max);
	}

}
