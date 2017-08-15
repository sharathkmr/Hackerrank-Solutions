// https://www.hackerrank.com/challenges/service-lane

import java.util.Scanner;

/*
input/output

8 5
2 3 1 2 3 2 3 3
0 3
4 6
6 7
3 5
0 7

1
2
3
2
1

--------------

5 5
1 2 2 2 1
2 3
1 4
2 4
2 4
2 3

2
1
1
1
2

 */

public class ServiceLane {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int max = 3;
            for (int h = i; h <= j; h++) {
				if(max > width[h]) {
					max = width[h];
				}
			}
            System.out.println(max);
        }
        in.close();
	}
}
