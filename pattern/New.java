package pattern;

import java.util.Scanner;

public class New {
	
	public static void main(String[] args) {
			String s = "BreakingBad";
			String[] r = s.split("(?=\\p{Upper})");
			int length2 = s.length();
			int l=1;
	    while(length2>0) {
	     if(s.charAt(l)<90) {
	     }
	    
	    length2--;
	    }
			String breaking = r[0];
			String bad = r[1];
			
			int length = breaking.length();
			
			int i = 0;
			int j = 0;
			String str = "";
			String st = "";
			
			while (length > 0) {
				
				if (j < breaking.length()) {
					char a = breaking.charAt(j);
					str += a;
					j++;
				}
				if (i < bad.length()) {
					char b = bad.charAt(i);
					st += b;
					i++;
				}
				System.out.print(str + st);
				System.out.println();
				length--;
			}
		}

	}
	

