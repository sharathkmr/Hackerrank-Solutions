// https://www.hackerrank.com/challenges/cats-and-a-mouse

import java.util.Scanner;

public class CatsAndAMouse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            if(Math.abs(x-z) < Math.abs(y-z)) {
            	System.out.println("Cat A");
            } else if(Math.abs(x-z) > Math.abs(y-z)) {
            	System.out.println("Cat B");
            } else {
            	System.out.println("Mouse C");
            }
            
        }
        in.close();
	}

}
