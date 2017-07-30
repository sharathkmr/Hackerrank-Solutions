// https://www.hackerrank.com/challenges/30-regex-patterns

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RegexPatterns {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        List<String> names = new LinkedList<>();
        
        for(int a0 = 0; a0 < N; a0++){
        	String firstName = in.next();
            String emailID = in.next();
            String[] acc = emailID.split("@");
            if(acc[1].equals("gmail.com")) {
            	names.add(firstName);
            }
        }
        
        Collections.sort(names);
        for (String string : names) {
			System.out.println(string);
		}
        in.close();
    }
}
