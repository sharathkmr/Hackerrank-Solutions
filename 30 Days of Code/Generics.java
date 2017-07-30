// https://www.hackerrank.com/challenges/30-generics

import java.util.Scanner;

class Printer <T> {

	/**
	    *    Method Name: printArray
	    *    Print each element of the generic array on a new line. Do not return anything.
	    *    @param A generic array
	    **/
	    
	    // Write your code here
	public <E> void printArray(E[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			E item = intArray[i];
			System.out.println(item);
		}
		
	}
}

public class Generics {

	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        scanner.close();
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 

}
