// https://www.hackerrank.com/challenges/separate-the-numbers

import java.util.Arrays;
import java.util.Scanner;

public class SeperateTheNumbers {
	
	// to store the strings seperated by length
	static String[] isSeq;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            boolean res = false;
            int size = s.length();
            // length of the string by which it is divided
            int len = 1;
            
            while(len <= size/2) {
            	int index = 0;
            	int i = 0;
            	int seqDiv = len;
            	isSeq = new String[size];
            	// to divide the string according to the seqDiv
                while(index < s.length()) {
                	isSeq[i] = s.substring(index, Math.min(index + seqDiv, s.length()));
                	
                	index+= seqDiv;
                	// checks whether the int is 9|99|999 and increments the seqDiv to 2|3|4
                	if((Long.parseLong(isSeq[i]) == 9 && len == 1) || 
                			(Long.parseLong(isSeq[i]) == 99 && len == 2) || 
                			(Long.parseLong(isSeq[i]) == 999 && len == 3))
                		seqDiv++;
                	
                	i++;
                	
                }
                
                res = isSequence(isSeq);
                
                // if seq starts with 0, it ends
                if(Long.parseLong(isSeq[0]) == 0) {
                	break;
                }
                if(res)
                	break;
                len++;
            }
            if(res)
            	System.out.println("YES "+isSeq[0]);
            else
            	System.out.println("NO");
            
        }
        in.close();
	}
	
	static boolean isSequence(String[] isSeq) {
		for (int i = 0; i < isSeq.length; i++) {
			if(i==isSeq.length-1) {
				continue;
			}
			if(isSeq[i+1]==null){
				break;
			}
			if(Long.parseLong(isSeq[i])+1 != Long.parseLong(isSeq[i+1])) {
				return false;
			}
		}
		return true;
	}

}
