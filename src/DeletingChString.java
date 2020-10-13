/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class DeletingChString extends ConsoleProgram {

		
	   public void run(){
	        String output1 = removeAllOccurrences("This is a test", 't');
	        println(output1);
	        String output2 = removeAllOccurrences("Summer is here", 'e');
	        println(output2);
	        String output3 = removeAllOccurrences("---0---", '-');
	        println(output3);
	    }

	    private String removeAllOccurrences(String str, char c) {

	        char[] strArray = str.toCharArray();
	        char[] outputArray = new char[strArray.length];
	        int outputArrayIndex = 0;
	        for (int i = 0; i < strArray.length; i++) {
	            char s = strArray[i];
	            if (s != c) {
	                outputArray[outputArrayIndex] = s;
	                outputArrayIndex++;
	            }

	        }
	        return new String(outputArray, 0, outputArrayIndex);

	    }
		
	}
		
		
	


