// https://www.hackerrank.com/challenges/quicksort4

import java.util.Scanner;

public class RunningTimeofQuicksort {
	// insetion sort shiftings
	static int isShifts = 0;
	// quicksort shiftings
	static int qsShifts = 0;

	// insertion sort
	public static void insertionSort(int[] A) {

		for (int i = 0; i < A.length; i++) {
			int value = A[i];
			int j = i - 1;
			while (j > -1 && A[j] > value) {
				A[j + 1] = A[j];
				j = j - 1;
				isShifts++;
			}
			A[j + 1] = value;
			// printArray(A);
		}
	}

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
				qsShifts++;
			}
		}

		// swap ar[i+1] and pivot
		int temp = ar[i + 1];
		ar[i + 1] = ar[high];
		ar[high] = temp;
		qsShifts++;
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
		// System.out.println();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		int[] inAr = ar.clone();
		in.close();
		quickSort(ar, 0, ar.length - 1);
		insertionSort(inAr);
		System.out.println(isShifts-qsShifts);
	}

}