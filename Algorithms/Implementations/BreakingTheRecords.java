// https://www.hackerrank.com/challenges/breaking-best-and-worst-records

import java.util.Scanner;

/*

input/output

9
10 5 20 20 4 5 2 25 1

2 4
--------------------

10
3 4 21 36 10 28 35 5 24 42

4 0
--------------------
100
503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503 503

0 0
---------------------
6
0 9 3 10 2 20

3 0

 */

public class BreakingTheRecords {

	static int[] getRecord(int[] s){
        // Complete this function
		int[] count = new int[2];
		int max = 0;
		int min = Integer.MAX_VALUE;
		boolean flag = true;
		for (int i = 0; i < s.length; i++) {
			// initialzing the values at first
			if(max == 0 && flag) {
				max = s[i];
				min = s[i];
				flag = false;
			//	System.out.println("max: "+max+" min "+min);
				continue;
			}
			
			if(s[i] > max) {
				max = s[i];
				count[0]++;
			} else if(s[i] < min && min != Integer.MAX_VALUE) {
				min = s[i];
				count[1]++;
			}
			
		//	System.out.println("max: "+max+" min "+min);
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        in.close();
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
