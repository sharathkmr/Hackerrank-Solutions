// https://www.hackerrank.com/challenges/runningtime

import java.util.Scanner;

public class RunningTimeofAlgorithms {

	public static void insertionSort(int[] A){
        int shifts = 0;
        for(int i = 0; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j > -1 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
                shifts++;
            }
            A[j + 1] = value;
        }
        System.out.println(shifts);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
      //  System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        in.close();
        insertionSort(ar);
    }

}
