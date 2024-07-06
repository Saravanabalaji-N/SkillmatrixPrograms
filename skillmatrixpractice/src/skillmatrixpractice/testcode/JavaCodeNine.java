package skillmatrixpractice.testcode;

import java.util.Scanner;

public class JavaCodeNine {

	 public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the values :");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	        	
	            arr[i] = scanner.nextInt();
	        }

	        int gcd = arr[0];
	        for (int i = 1; i < n; i++) {
	            gcd = findGCD(gcd, arr[i]);
	            if (gcd == 1) {
	                break; 
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] / gcd + " ");
	        }

	        scanner.close();
	    }
	}
	

