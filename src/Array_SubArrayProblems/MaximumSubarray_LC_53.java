package Array_SubArrayProblems;

/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104'


 */

public class MaximumSubarray_LC_53 {

	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
			System.out.println("MaximumSubArrray: Approach I -> "+maxsubarrI(nums));
			System.out.print("MaximumSubArrray: Approach I -> "+maxsubarrII(nums));

	}

	private static int maxsubarrII(int[] nums) {
		
		int sum=0,max=0;
		for(int k:nums) {
			sum+=k;
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}

	private static int maxsubarrI(int[] nums) {
		
		int max=0;
		for(int start=0;start<nums.length;start++) {
			int sum=0;
			for(int end=start;end<nums.length;end++) {
				sum+=nums[end];
				max=Math.max(max, sum);
			}
		}
		return max;
	}

}
