// https://www.hackerrank.com/challenges/quicksort2

import java.util.Scanner;

public class Quicksort2Sorting {
		
	static int index = 0;
	
		// recursive quicksort
		static void quickSort(int[] ar, int low, int high) {
	        if(low < high) {
	        	int pi = 0;
	        	if(index == 0) {
	        		pi = partitionArray(ar, low, high);
	        		index = pi;
	        	} else {
	        		pi = partitionArray(ar, low, high);
	        	}
	        	 
	        	
	        	quickSort(ar, low, pi - 1);  // Before pi
	        	
	        	quickSort(ar, pi + 1, high); // After pi
	            
				if(high - low >= 2) {
	            	if(high > index) {
	            		print(ar, low, high+1);
	            	} else {
	            		print(ar, low, high);
	            	}
	            	
		            
	            }
	            
	        }
	    }
		
		/* This function takes last element as pivot,
	    places the pivot element at its correct
	    position in sorted array, and places all
	    smaller (smaller than pivot) to left of
	    pivot and all greater elements to right
	    of pivot */
		static int partitionArray(int[] ar, int low, int high) {
			int pivot = ar[low];
			int i = low - 1; // index of smaller element
			for (int j = low; j <= high; j++) {
				if(ar[j] <= pivot) {
					i++;
					// swapping ith element and jth element
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
					
				}
			}
			
			// swapping pivot in the ith place
			int temp = ar[i];
			ar[i] = ar[low];
			ar[low] = temp;
			print(ar, low, high);
			return i+1;		
		}
		
		static void print(int[] array, int left, int right) {
			for (int i = left; i < right; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println("");
		}

	    static void printArray(int[] ar) {
	        for(int n: ar){
	           System.out.print(n+" ");
	        }
	          System.out.println("");
	     }
	      
	     public static void main(String[] args) {
	          Scanner in = new Scanner(System.in);
	          int n = in.nextInt();
	          int[] ar = new int[n];
	          for(int i=0;i<n;i++){
	             ar[i]=in.nextInt(); 
	          }
	          in.close();
	          quickSort(ar, 0, ar.length-1);
	          printArray(ar);
	      }

}
