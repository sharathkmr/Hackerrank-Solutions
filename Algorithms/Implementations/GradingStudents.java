// https://www.hackerrank.com/challenges/grading/problem

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        in.close();
        int[] result = solve(grades);
     //   System.out.println("**** RESULT ****");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
	}
	
	static int[] solve(int[] grades){
        // Complete this function
        for(int i=0; i<grades.length; i++) {
        //	System.out.println("after round "+Math.round((float)grades[i]/5));
        //	System.out.println("after mul "+Math.round((float)grades[i]/5)*5);
        //	System.out.println("after sub "+((Math.round((float) grades[i]/5)*5) - grades[i]));
        	int diff = ((Math.round((float)grades[i]/5)*5) - grades[i]);
            
            if(diff < 3 && diff >= 0&& grades[i] > 37) {
          //  	System.out.println(grades[i]);
            	grades[i] = (Math.round((float)grades[i]/5)*5);
            }
        }
        return grades;
    }

}
