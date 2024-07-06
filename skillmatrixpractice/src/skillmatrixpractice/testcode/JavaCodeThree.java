package skillmatrixpractice.testcode;

import java.util.Arrays;
import java.util.Comparator;

public class JavaCodeThree {

	public static void main(String[] args) {
        int[] value = {4, 5, 3, 7, 1};

        Integer[] indices = new Integer[value.length];
        for (int i = 0; i < value.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingInt(index -> value[index]));

        for (int i = 0; i < value.length; i++) {
            System.out.print(indices[i] + " ");
        }
    }
	
}
