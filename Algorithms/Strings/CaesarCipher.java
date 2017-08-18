// https://www.hackerrank.com/challenges/caesar-cipher-1

import java.util.Scanner;

/*
input/output
----------------
90
!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U
62

!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E
-----------------------
100
DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.
45

WGYcqh?u5a*5<EPuzl6?O5{3F].1aZ)io1OPj4(!][WS3Z)kbLC.VfNc9]7Zse?OrxC2wBIXP4ZRP*lvM8(oan9pVk]j!7xrthr.
----------------------------------
53
6DWV95HzxTCHP85dvv3NY2crzt1aO8j6g2zSDvFUiJj6XWDlZvNNr
87

6MFE95QigCLQY85mee3WH2laic1jX8s6p2iBMeODrSs6GFMuIeWWa
-------------------------------------

 */

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		// if the input value is more than 26
		int k = in.nextInt()%26;
		System.out.println("k: "+k);
		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			if(c >= 65 && c <= 90 || c >= 97 && c <= 122) {
				if(c+k > 90 && c <= 90) {
					System.out.print((char)(64+(c+k)-90));
				} else if(c+k > 122) {
					System.out.print((char)(96+(c+k)-122));
				} else {
					System.out.print((char)(c+k));
				}
				
			} else {
				System.out.print((char)c);
			}
		}
		in.close();
	}

}
