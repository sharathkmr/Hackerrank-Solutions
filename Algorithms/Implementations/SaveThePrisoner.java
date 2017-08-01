// https://www.hackerrank.com/challenges/save-the-prisoner

import java.util.Scanner;

public class SaveThePrisoner {

	static int saveThePrisoner(int n, int m, int s) {
        // Complete this function
		int res = (m+s-1)%n;
        if(res == 0) {
            res = n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        in.close();
    }
}