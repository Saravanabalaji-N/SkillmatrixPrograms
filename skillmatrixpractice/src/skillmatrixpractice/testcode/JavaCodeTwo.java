package skillmatrixpractice.testcode;

import java.util.Scanner;

public class JavaCodeTwo {

	
	public static void main(String[] args) {

		    	 Scanner scan = new Scanner(System.in);
		         int[] a = new int[3];
		         int[] b = new int[3];
		         
		        a[1]=a[0];
		         
	         for(int i=0;i<a.length;i++) {
	        	 System.out.println("a["+i+"]");
	        	 a[i] =scan.nextInt();  
	         }
	         for(int i=0;i<b.length;i++) {
	        	 System.out.println("b["+i+"]");
	        	b[i]=  scan.nextInt();  
	        	
	         }
		     
		         int alice=0,bob=0;
		         for (int i=0;i<3;i++)
		         {
		         if (a[i]>b[i])
		         {
		                 alice++;
		         }
		         else if(b[i]>a[i])
		         {
		             bob++;
		         }
		     }
		     System.out.println("alice point :"+alice);
		     System.out.println("bob point :"+bob);
		
	}
}
