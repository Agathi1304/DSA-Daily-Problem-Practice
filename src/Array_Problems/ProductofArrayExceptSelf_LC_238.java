package Array_Problems;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 */
public class ProductofArrayExceptSelf_LC_238 {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4};
		int ans[] = productArrayexceptSelf(nums);
		
		System.out.print("Product of Array Except Self: ");
		for(int k:ans) {
			System.out.print(k+" ");
		}
	}

	private static int[] productArrayexceptSelf(int[] nums) {
		
		 int res[] = new int[nums.length];

	        for(int i=0;i<nums.length;i++){
	          int  cp=1;
	            for(int j=0;j<nums.length;j++){
	                if(i==j) continue;
	                cp*=nums[j];
	            }
	            res[i]=cp;
	        }

	        return res;
	}

}
