// https://www.hackerrank.com/challenges/time-conversion

import java.util.Arrays;
import java.util.Scanner;

public class TimeConversion {

	static String timeConversion(String s) {
        // Complete this function
		String AMPM = s.substring(s.length()-2, s.length());
		// using multiple delimiters in split
		String[] time = s.split(":|PM|AM");
	//	System.out.println(Arrays.toString(time)+" "+AMPM);
		if(AMPM.equals("PM") && Integer.parseInt(time[0]) < 12) {
			time[0] = Integer.toString(Integer.parseInt(time[0])+12);
		} else if (AMPM.equals("PM") && Integer.parseInt(time[0]) == 12){
			time[0] = Integer.toString(12);
		}else if (AMPM.equals("AM") && Integer.parseInt(time[0]) == 12){
			time[0] = Integer.toString(00)+0;
		}
		return time[0]+":"+time[1]+":"+time[2];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
