// https://www.hackerrank.com/challenges/apple-and-orange

import java.util.Scanner;

public class AppleAndOrange {
	
	public static void main(String[] args) {
		// readig the input
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        in.close();
        
        int noApples = 0;
        int noOranges = 0;
        
		// counting the number of apples fallen inside
        for (int i = 0; i < apple.length; i++) {
			if(apple[i] > 0 && ((apple[i]+a) >= s && (apple[i]+a) <= t)) {
				noApples++;
			}
		}
        
		// counting the number of oranges fallen inside
        for (int i = 0; i < orange.length; i++) {
			if(orange[i] < 0 && ((orange[i]+b) >= s && (orange[i]+b) <= t)) {
				noOranges++;
			}
		}
        System.out.println(noApples);
        System.out.println(noOranges);
	}

}
