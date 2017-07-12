// https://www.hackerrank.com/challenges/the-grid-search

import java.util.Arrays;
import java.util.Scanner;

// solution which passed all test cases in hackerrank
public class TheGridSearch {

	static String[] G;
	static String[] P;
	// to hold large matrix
	static String[][] LGrid;
	// to hold sub matrix
	static String[][] SGrid;
	// to hold sub/small matrix dimensions
	static int r = 0;
    static int c = 0;
	// to hold large matrix dimensions
    static int R = 0;
    static int C = 0;
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            R = in.nextInt();
            C = in.nextInt();
            G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            r = in.nextInt();
            c = in.nextInt();
            P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            gridSearch();
        }
        in.close();
	}
	
	static void gridSearch() {
		LGrid = new String[R][C];
        SGrid = new String[r][c];
        // big grid
        for (int i = 0; i < R; i++) {
        	String[] temp = G[i].split("");
            temp = Arrays.copyOfRange(temp, 1, temp.length);
        	for (int j = 0; j < C; j++) {
                
				LGrid[i][j] = temp[j];
			}
		}
       
        // small grid
        for (int i = 0; i < r; i++) {
        	String[] temp = P[i].split("");
            temp = Arrays.copyOfRange(temp, 1, temp.length);
        	for (int j = 0; j < c; j++) {
				SGrid[i][j] = temp[j];
			}
		}
       
        
        int x=0;
        int y=0;
        // to hold the subset equal count
        int count = 0;
		// loop to find out the submatrix in the matrix
        for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				// if 1st element is equal then it gets the sub matrix from that point(row and column)
				// and then compares each element with the original sub matrix SGrid and if it is equal
				// loop breaks and if not again it starts searching.
				if(LGrid[i][j].equals(SGrid[x][y])) {
					if((r <= R - i) && (c <= C - j)) {
						// getting sub matrix from ith row and jth column
						String[][] subGrid = subSet(LGrid, i, j);
						for (int k = 0; k < r; k++) {
							for (int k2 = 0; k2 < c; k2++) {
								if(subGrid[k][k2].equals(SGrid[k][k2])) {
									count++;
								} 
							}
						}
						// if count equals the number of elements in sub array
						// then it breaks out of the loop as we got our result
						if(count == r*c)
							break;
                        else
                            count = 0;
					}
					if(count == r*c)
                        break;
							
				}
				
				if(count == r*c)
					break;
				
			}
            if(count == r*c)
                break;
			     
		}
		// final result
        if(count == r*c)
        	System.out.println("YES");
        else
        	System.out.println("NO");
	}
	
	// extracts a subgrid from the grid starting at x row and y column
	// and having rxc rows and columns
	static String[][] subSet(String[][] LGrid, int x, int y) {
     	String[][] a = new String[r][c];
		int j =0;
	    for (int i = x; i < x+r; i++) {
	    	a[j] = Arrays.copyOfRange(LGrid[i], y, y+c);
	    	j++;
	    }
        return a;
	}

}
