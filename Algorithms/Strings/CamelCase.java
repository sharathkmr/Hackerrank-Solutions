// https://www.hackerrank.com/challenges/camelcase

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        char[] split = s.toCharArray();
        int count=0;
        for(int i=0;i<split.length;i++) {
            int ascii = (int)split[i];
            if(ascii > 64 && ascii < 91 ) {
                count++;
            }
        }
        System.out.print(count+1);

	}

}
