// https://www.hackerrank.com/challenges/insertionsort1

import java.util.Scanner;

/*
Sample input
10
2 3 4 5 6 7 8 9 10 1

sample output
2 3 4 5 6 7 8 9 10 10
2 3 4 5 6 7 8 9 9 10
2 3 4 5 6 7 8 8 9 10
2 3 4 5 6 7 7 8 9 10
2 3 4 5 6 6 7 8 9 10
2 3 4 5 5 6 7 8 9 10
2 3 4 4 5 6 7 8 9 10
2 3 3 4 5 6 7 8 9 10
2 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10

*/

public class InsertionSortPart1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        in.close();
        insertIntoSorted(ar);
    }
    
    // to print the array ar
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
	
	public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int val = ar[ar.length-1];
        boolean b = false;
        for(int i=ar.length-2;i>=0;i--){
         //   System.out.println(ar[i]+" "+val);
            if(ar[i] > val) {
                ar[i+1] = ar[i];
                printArray(ar);
            } else {
                ar[i+1] = val;
                b = true;
                printArray(ar);
                break;
            }
        }
        // if val is less than all numbers in array
        if(!b)
        {
            ar[0] = val;
            printArray(ar);
        }
    }

}
