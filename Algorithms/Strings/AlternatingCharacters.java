// https://www.hackerrank.com/challenges/alternating-characters

import java.util.Scanner;

public class AlternatingCharacters {

	static int alternatingCharacters(String s){
        // Complete this function
		int count = 0;
		for (int i = s.length()-1; i > 0 ; i--) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
        in.close();
    }

}
