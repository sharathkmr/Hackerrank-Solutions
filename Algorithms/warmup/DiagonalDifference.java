// https://www.hackerrank.com/challenges/diagonal-difference

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(difference(a,n));
        
    }
    
    public static int difference(int a[][], int n) {
		int dif1=0;
		int dif2=0;
		int res=0;
		int x=0;
		int z=(n-1);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==j) {
					dif1=dif1+a[i][j];
				}
			
				
			}
			dif2=dif2+a[x][z];
			x++;
			z--;
		}
		
		
		if(dif1>dif2) {
			
			res=dif1-dif2;
		}else if(dif1<dif2) {
			
			res=dif2-dif1;
		}
		return res;
	}

}
