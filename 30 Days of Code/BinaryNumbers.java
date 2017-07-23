// https://www.hackerrank.com/challenges/30-binary-numbers

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        String[] binary = Integer.toBinaryString(n).split("");
        System.out.println(Arrays.toString(binary));
        
        int count = 0;
        int max = 0;
        for (int i = 0; i < binary.length; i++) {
			if(Integer.parseInt(binary[i]) == 1) {
				count++;
				max = Math.max(max, count);
			} else { count = 0; }
		}
        System.out.println(max);
    }

}
