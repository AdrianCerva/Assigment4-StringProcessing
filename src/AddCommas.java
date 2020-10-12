/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class AddCommas extends ConsoleProgram {
	public void run() {
		while(true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() ==0) break;
			println(addCommasToNumericString(digits));
		}
	}
	
	private String addCommasToNumericString(String digits) {
         String result = " ";
         for(int i = 1; i <= digits.length(); ++i ) {
        	 char ch = digits.charAt(digits.length() - i);
        	 if(i % 3 == 1 && i > 1) {
        		 result = "," + result;
        	 }
        	 result = ch + result;
         }
         return result;
       } 
		
		
	}


