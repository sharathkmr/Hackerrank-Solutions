// https://www.hackerrank.com/challenges/insertionsort2

import java.util.Scanner;

/*
Sample Inputs
12
1 1 2 2 3 3 5 5 7 7 9 9

5
2 1 3 1 2


*/

public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
           // The code for Input/Output is already provided
	// insertion sorting
	// considering the 1st element sorted
	int temp;
        for (int i = 1; i < ar.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(ar[j] < ar[j-1]){
                    temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
            printArray(ar);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       in.close();
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }

}
