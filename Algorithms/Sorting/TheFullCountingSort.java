// https://www.hackerrank.com/challenges/countingsort4

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheFullCountingSort {
	
	private static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = Integer.parseInt(in.nextLine());
		
	    Map<Integer, ArrayList<String>> out = new HashMap<Integer, ArrayList<String>>();
		for (int i = 0; i < 100; i++) {
			out.put(i, new ArrayList<String>());
		}
		
		for (int i = 0; i < n; i++) {
			String[] temp = in.nextLine().split(" ");
			int key = Integer.parseInt(temp[0]);
			String value = (i < n/2) ? "-" : temp[1];
			ArrayList<String> list = out.get(key);
			list.add(value);
		}
	    
		in.close();
	    for (int i = 0; i < out.size(); i++) {
			ArrayList<String> list = out.get(i);
			for (String string : list) {
				System.out.print(string+" ");
			}
		}
	}

}