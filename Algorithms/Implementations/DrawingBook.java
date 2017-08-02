// https://www.hackerrank.com/challenges/drawing-book

import java.util.Arrays;
import java.util.Scanner;

/*

5
1

0

7
3

1

 */

public class DrawingBook {

	static int totalPages(int n) {
		return (n+2)/2;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        in.close();
        
        int entireBook = totalPages(n);
        
        int fromFront = totalPages(p) - 1;
        int fromBack = entireBook - fromFront - 1;
        System.out.println(Math.min(fromFront, fromBack));
    }

}
