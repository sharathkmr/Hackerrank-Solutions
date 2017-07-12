// https://www.hackerrank.com/challenges/matrix-rotation-algo

import java.util.Scanner;

public class MatrixLayerRotation {

	static int m;
	static int n;
	static int r;
    
    static int[][] rotated;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		r = in.nextInt();
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		
		int rotations = 1;
		while(rotations <= r) {
			rotated = rotateMatrix(matrix, m, n);
			rotations++;
		}
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" ");
			}
            System.out.println();
		}
		
		

	}
	
	static int[][] rotateMatrix(int[][] matrix, int m,int n) {
		/*
		 Store the last element of last row, this
	     element will replace last element of current
	     row
	     
		 Move elements of first row from the remaining rows
		 Move elements of first column from the remaining columns
		 Move elements of last row from the remaining rows
		 Move elements of last column from the remaining rows
		 
		 
		 */
		int row = 0;
		int col = 0;
		int prev = 0;
		int curr = 0;
		
		while(row < m && col < n) {
			if(row+1 == m || col+1 == n)
				break;
			
			// Store the first element of next row, this
	        // element will replace first element of current
	        // row
	        prev = matrix[row + 1][n-1];
	        
			/* Move elements of first row from the remaining rows */
	        for (int i = n-1; i >= col; i--)
	        {
	            curr = matrix[row][i];
	            matrix[row][i] = prev;
	            prev = curr;
	        }
	        row++;
	        
	        /* Move elements of first column from the remaining rows */
	        if (col < n)
	        {
	            for (int i = row; i < m; i++)
	            {
	                curr = matrix[i][col];
	                matrix[i][col] = prev;
	                prev = curr;
	            }
	        }
	        
	        
	        col++;
	        
	        /* Move elements of last row from the remaining rows */
	        if (row < m)
	        {
	        	for (int i = col; i < n; i++)
	            {
	                curr = matrix[m-1][i];
	                matrix[m-1][i] = prev;
	                prev = curr;
	            }
	        }
	        m--;
	        
	        /* Move elements of last column from the remaining columns */
	        for (int i = m-1; i > row-1; i--)
	        {
	        	curr = matrix[i][n-1];
	            matrix[i][n-1] = prev;
	            prev = curr;
	        }
	        
	        n--;
	       
		
	}
        return matrix;
}

}
