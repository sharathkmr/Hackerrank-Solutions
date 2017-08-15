// https://www.hackerrank.com/challenges/taum-and-bday

import java.util.Scanner;

/*
input/output
--------------
5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

20
37
12
35
12
--------------

 */

public class TaumAndBday {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            
            long sum = 0;
            
            if(b*x < b*(y+z)) {
            	sum = sum + b*x;
            } else {
            	sum = sum + (b*(y+z));
            }
            
            if(w*y < w*(x+z)) {
            	sum = sum + w*y;
            } else {
            	sum = sum + w*(x+z);
            }
            System.out.println(sum);
        }
        in.close();
    }

}
