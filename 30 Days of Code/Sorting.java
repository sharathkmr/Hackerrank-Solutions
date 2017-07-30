// https://www.hackerrank.com/challenges/30-sorting

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        // Write Your Code Here
        int swaps = 0;
        boolean swapped = true;
        while(swapped) {
        	swapped = false;
        	for (int j = 1; j < n; j++) {
				if(a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					swaps++;
					swapped = true;
				}
			}
        }
        System.out.println("Array is sorted in "+swaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }

}
