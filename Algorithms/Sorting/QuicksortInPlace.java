// https://www.hackerrank.com/challenges/quicksort3

import java.util.Scanner;

public class QuicksortInPlace {

	/*
	 * This function partitions the array takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places the elements smaller than pivot to the left
	 * and greater elements to the right
	 * 
	 */
	static int partition(int ar[], int low, int high) {
		int pivot = ar[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// swapping ar[i] and ar[j] elements if ar[j] is less than pivot
			// basic ascending order based on pivot
			if (ar[j] <= pivot) {
				i++;
				// swapping ith element and jth element in the array
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}

		// swap ar[i+1] and pivot
		int temp = ar[i + 1];
		ar[i + 1] = ar[high];
		ar[high] = temp;
		// printing array at end of partitioning
		printArray(ar);
		return i + 1;
	}

	// recursive quicksort
	static void quickSort(int ar[], int low, int high) {
		if (low < high) {
			int pi = partition(ar, low, high);

			quickSort(ar, low, pi - 1); // left side elements of pivot
			quickSort(ar, pi + 1, high); // right side elements of pivot
		}
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		quickSort(ar, 0, ar.length - 1);
		
	}

}
