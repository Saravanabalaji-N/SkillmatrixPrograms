package skillmatrixpractice.testcode;

import java.util.Scanner;

public class JavaCodeOne {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line1 = scanner.nextLine().split(" ");
 
        int numToCount = scanner.nextInt();

        int count = 0;
        for (String numStr : line1) {
            int num = Integer.parseInt(numStr);
            if (num == numToCount) {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
