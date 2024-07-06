package skillmatrixpractice.testcode;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class JavaCodeTen {

	static int digit(int n)
	{
	    LinkedHashSet<Integer> s = new LinkedHashSet<>();

	    while (n != 0)
	    {
	        int d = n % 10;

	        if (s.contains(d))
	        {
	            return 0;
	        }
	        s.add(d);
	        n = n / 10;
	    }

	    return 1;
	}

	static int calculate(int L, int R)
	{
	    int answer = 0;
	
	    for (int i = L; i < R + 1; ++i)
	    {
	        answer = answer + digit(i);
	    }
	 
	    return answer;
	}
	 
	public static void main(String[] args)
	{
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the start value :");
	    int value1=sc.nextInt();
	    System.out.println("enter the end value :");
	    int value2=sc.nextInt();
	     
	    System.out.println(calculate(value1, value2));
	}
	}
	

