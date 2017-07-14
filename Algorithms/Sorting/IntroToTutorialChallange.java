// https://www.hackerrank.com/challenges/tutorial-intro

import java.util.Scanner;

public class IntroToTutorialChallange {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int l = in.nextInt();
        int[] input = new int[l];
        for(int i=0; i<l; i++) {
            input[i] = in.nextInt();
            if(input[i] == v) {
                System.out.println(i);
            }
        }
        in.close();
    }
}
