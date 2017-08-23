// https://www.hackerrank.com/challenges/gem-stones

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones {

	static int gemstones(String[] arr){
        Set<Character> chars = new HashSet<>();
        String arr1 = arr[0];
        int count = 0;
        for(int i=0; i < arr1.length(); i++) {
            int len = 0;
            int charCheck = 0;
            while(len < arr.length ) {
                if(arr[len].indexOf(arr1.charAt(i)) != -1){
                    charCheck++;
                }
                len++;
            }
            if(charCheck == arr.length && !chars.contains(arr1.charAt(i))) {
            	chars.add(arr1.charAt(i));
                count++;
            }
       //     System.out.println("char: "+arr1.charAt(i)+" charCheck: "+charCheck+" count: "+count);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        in.close();
        int result = gemstones(arr);
        System.out.println(result);
    }

}
