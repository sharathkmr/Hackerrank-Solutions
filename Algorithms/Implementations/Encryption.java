// https://www.hackerrank.com/challenges/encryption

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        String[] split = s.split("");
        
        int len = s.length();
        int x = (int)Math.round(Math.sqrt(len));
        int y = (int)Math.ceil(Math.sqrt(len));
		// to create a matrix with x and y dimension
        String[][] matrix = new String[(int) Math.round(Math.sqrt(len))][(int) Math.ceil(Math.sqrt(len))];
        int index = 1;
    	// splits the matrix with the required x rows and y columns
        for (int i = 0; i < x; i++) {
        	
        	for (int j = 0; j < y; j++) {
        		if((index-1)==len) {
        			break;
        		}
				matrix[i][j] = split[index];
				index++;
			}
		}
		// printing the matrix column wise
        for (int i = 0; i < y; i++) {
        	
        	String res = "";
        	for (int j = 0; j < x; j++) {
        		if(matrix[j][i]!= null)
                {
                    res = res + matrix[j][i];
                }
        			
			}
        	System.out.print(res);
        	if(i != y-1) {
                System.out.print(" ");
            }
        		
		}
    }

}
