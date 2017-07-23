// https://www.hackerrank.com/challenges/30-2d-arrays

import java.util.Scanner;
import java.util.Arrays;

/*
sample input/output
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

19

sample input/output

0 -4 -6 0 -7 -6
-1 -2 -6 -8 -3 -1
-8 -4 -2 -8 -8 -6
-3 -1 -2 -5 -7 -4
-3 -5 -3 -6 -6 -6
-3 -6 0 -8 -6 -7

-19

sample input/output

-1 -1 0 -9 -2 -2
-2 -1 -6 -8 -2 -5
-1 -1 -1 -2 -3 -4
-1 -9 -2 -4 -4 -5
-7 -3 -3 -2 -9 -9
-1 -3 -1 -2 -4 -5

-6

 */

public class Arrays2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		// initialize -ve number for -ve hourglass sums
		int max = -1000;
		for (int i = 0; i < arr.length; i++) {
			int[] row = arr[i];
			for (int j = 0; j < row.length; j++) {
			//	System.out.println("i : "+i+" j "+j);
				if(i <= arr.length-3 && j <= row.length-3) {
					// finding 3X3 sub matrix
					int[][] subMat = subSet(arr, i, j, 3, 3);
					for (int[] sub : subMat) {
						System.out.println(Arrays.toString(sub));
					}
					int sum = maxHourGlass(subMat);
					System.out.println("sum : "+sum);
					System.out.println();
					
					if(max < sum)
						max = sum;
				}
			}
		}
		System.out.println(max);
		in.close();
	}
	
	// to find the sum of hour glass matrix from submatrix
	public static int maxHourGlass(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {
				// other than middle row i.e 2nd row every element is summed up
				if((i != matrix.length-2 && j != 0) || (i != matrix.length-2 && j!= matrix.length-1)) {
				//	System.out.println("i "+i+" j "+j);
					sum = sum + matrix[i][j];
				} else if( i == j) {
					// for the diagonal element
					sum = sum + matrix[i][j];
				}
					
			}
		}
		return sum;
	}
	
	// to find the 3 by 3 sub matrix
	public static int[][] subSet(int[][] matrix, int x, int y, int row, int col) {
		int[][] a = new int[row][col];
		int j = 0;
		for (int i = x; i < x + row; i++) {
			a[j] = Arrays.copyOfRange(matrix[i], y, y + col);
			j++;
		}
		return a;
	}
}
