// https://www.hackerrank.com/challenges/quicksort1

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quicksort1Partition {

	static void partition(int[] ar) {
        int pivot = ar[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        
        for (int i = 1; i < ar.length; i++) {
			if(ar[i] < pivot)
				left.add(ar[i]);
			else if(ar[i] > pivot)
				right.add(ar[i]);
			else
				equal.add(ar[i]);
		}
        printList(left);
        System.out.print(pivot+" ");
        printList(equal);
        printList(right);
    }   

    static void printArray(int[] ar) {
       for(int n: ar){
    	   if(n != 0)
    		   System.out.print(n+" ");
       }
         
    }
    
    static void printList(List<Integer> list) {
    	Iterator<Integer> i = list.iterator();
    	while(i.hasNext()) {
    		System.out.print(i.next()+" ");
    	}
    }
     
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] ar = new int[n];
         for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
         }
         in.close();
         partition(ar);
     }    

}
