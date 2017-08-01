// https://www.hackerrank.com/challenges/the-hurdle-race

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        in.close();
        // your code goes here
        int res = 0;
        int max = 0;
		// finding max in height array
        for(int height_i=0; height_i < n; height_i++){
            if(height[height_i] > max)
                max = height[height_i];
            
        }
        if(max > k)
            res = res + (max - k);
        
        System.out.println(res);
	}
}