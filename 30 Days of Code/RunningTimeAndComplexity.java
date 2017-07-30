// https://www.hackerrank.com/challenges/30-running-time-and-complexity

import java.util.Scanner;

/*

3
1000000007
100000003
1000003

Prime
Not prime
Prime

1
1

Not prime

*/

public class RunningTimeAndComplexity {

	public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++) {
        	int j = in.nextInt();
        	System.out.println(isPrime(j) ? "Prime":"Not prime");
        }
        in.close();
    }
	
	public static boolean isPrime(int n) {
		if(n < 2) {
            return false;
        }
		int sqrt = (int) Math.sqrt(n);
    	for (int k = 2; k <= sqrt; k++) {
			if(n%k == 0) {
				return false;
			}
		}
    	return true;
	}

}
