// https://www.hackerrank.com/challenges/30-scope

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference {
	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
  		this.elements = a;
	}

	public void computeDifference() {
		// TODO Auto-generated method stub
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if(i == j) {
					continue;
				}
				int diff = 0;
				if(elements[i] > elements[j]) {
					diff = elements[i] - elements[j];
				} else {
					diff = elements[j] - elements[i];
				}
				if(maximumDifference < diff) {
					maximumDifference = diff;
				}
			}
		}
	}
}
