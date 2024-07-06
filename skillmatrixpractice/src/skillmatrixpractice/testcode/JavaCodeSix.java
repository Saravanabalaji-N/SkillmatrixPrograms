package skillmatrixpractice.testcode;

import java.util.Scanner;

public class JavaCodeSix {

	  public static int lengthOfLastWord(String s) {

	        s = s.trim();
	        
	        int length = 0;
	        int lastIndex = s.length() - 1;
	        
	        for (int i = lastIndex; i >= 0; i--) {
	            if (s.charAt(i) == ' ') {
	                break;
	            }
	            length++;
	        }
	        
	        return length;
	    }
	    
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        String input = sc.next();
	
	        
	        System.out.println("Length of last word in \"" + input + "\": " + lengthOfLastWord(input));
	     
	    }
}
