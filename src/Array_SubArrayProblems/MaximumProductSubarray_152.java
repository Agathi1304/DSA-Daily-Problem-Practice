package Array_SubArrayProblems;

/**
 * 
 * Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Note that the product of an array with a single element is the value of that element.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray_152 {

	public static void main(String[] args) {
		
		int nums[] = {2,3,-2,4};
		System.out.print("Maximum product subArray : "+maxSubArrayProduct(nums));

	}

	private static int maxSubArrayProduct(int[] nums) {
		int max=Integer.MIN_VALUE;
		
		for(int start=0;start<nums.length;start++) {
			int cp=1;
			for(int end=start;end<nums.length;end++) {
				cp*=nums[end];
				max=Math.max(cp,max);
			}
		}
		
		return max;
	}

}
