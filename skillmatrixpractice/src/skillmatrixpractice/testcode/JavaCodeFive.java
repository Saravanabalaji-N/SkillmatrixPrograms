package skillmatrixpractice.testcode;

public class JavaCodeFive {

	  public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) {
	            return 0;
	        }
	        int j = 1; 
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        
	        return j;
	    }

	    public static void main(String[] args) {
	
	        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	       	        
	        int len2 = removeDuplicates(nums2);
	        System.out.println("Length after removing duplicates for nums2: " + len2);
	        
	        System.out.print("Modified array for nums2: ");
	        for (int i = 0; i < len2; i++) {
	            System.out.print(nums2[i] + " ");
	        }
	        System.out.println();
	    }
}
