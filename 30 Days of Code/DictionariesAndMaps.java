// https://www.hackerrank.com/challenges/30-dictionaries-and-maps

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String []argh){
		Map<String, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.get(s) == null) {
            	System.out.println("Not found");
            } else {
            	System.out.println(s+"="+map.get(s));
            }
            
        }
        in.close();
    }

}
