// https://www.hackerrank.com/challenges/angry-professor

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int count=1;
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                if(a[a_i] <= 0) {
                	count++;
                }
            }
            
            if(count < k) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
        }
        in.close();
	}
}