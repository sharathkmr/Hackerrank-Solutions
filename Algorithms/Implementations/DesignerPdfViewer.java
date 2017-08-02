// https://www.hackerrank.com/challenges/designer-pdf-viewer

import java.util.Scanner;

public class DesignerPdfViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        int max_h = 0;
        int max_alpha = 0;
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] c = word.toCharArray();
        for (char d : c) {
        	// to find the array index of letter in word
			int index = (int)d - 97;
		//	System.out.println(index);
			// find max height in the word
			if(max_h < h[index]) {
            	max_h = h[index];
            	max_alpha = index+1;
            }
		}
        System.out.println(max_h*word.length());
        in.close();
	}

}
