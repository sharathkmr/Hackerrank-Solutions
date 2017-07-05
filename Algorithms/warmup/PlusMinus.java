// https://www.hackerrank.com/challenges/plus-minus

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
        // tol to hold number of -ve numbers, +ve numbers and zeros.
        double[] tol = new double[3];
        
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] < 0) {
                tol[0]++;
            } else if (arr[arr_i] > 0) {
                tol[1]++;
            } else {
                tol[2]++;
            }
        }
        
        System.out.printf("%.6f\n", tol[0]/n);
        System.out.printf("%.6f\n", tol[1]/n);
        System.out.printf("%.6f\n", tol[2]/n);
    }

}
