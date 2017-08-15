// https://www.hackerrank.com/challenges/acm-icpc-team

import java.util.Arrays;
import java.util.Scanner;

/*
input/output
------------
4 5
10101
11100
11010
00101

5
2
-----------
 */

public class AcmIcpcTeam {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int topics = 0;
        int[] teams = new int[m];
        
        
        for (int i = 0; i < topic.length; i++) {
			for (int j = i; j < topic.length; j++) {
				if(i == j) {
					continue;
				}
				int topicsCov = 0;
				int iter = m;
				while(iter > 0) {
				//	System.out.println(topic[i].charAt(m-iter)+" "+topic[j].charAt(m-iter)+" m: "+m+" iter: "+iter);
					if(topic[i].charAt(m-iter) == '1' || topic[j].charAt(m-iter) == '1') {
						
						topicsCov++;
					}
					if(topics < topicsCov) {
						topics = topicsCov;
					}
					
					iter--;
				}
				teams[topicsCov-1]++;
				
			//	System.out.println(topic[i]+" : "+topic[j]+" topicsCov: "+topicsCov);
			//	System.out.println("finalIter: topics "+topics+" teams: "+Arrays.toString(teams));
			}
		}
     //   System.out.println("final: topics "+topics+" teams: "+Arrays.toString(teams));
     //   System.out.println("max topics covered team: "+teams[topics-1]);
        System.out.println(topics);
        System.out.println(teams[topics-1]);
        in.close();
    }

}
