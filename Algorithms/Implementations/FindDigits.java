// https://www.hackerrank.com/challenges/find-digits

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = Integer.parseInt(in.nextLine());
            int count = 0;
            String[] temp = Integer.toString(n).split("");
            // starting from index 1 as the input includes a space in the starting
            for (int i = 1; i < temp.length; i++) {
				if(Integer.parseInt(temp[i]) != 0 && (n%Integer.parseInt(temp[i])) == 0) {
					count++;
				}
			}
            System.out.println(count);
        }
        in.close();
    }

}
