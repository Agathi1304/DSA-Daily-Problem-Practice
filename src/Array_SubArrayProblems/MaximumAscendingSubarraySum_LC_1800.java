package Array_SubArrayProblems;

/**
 * 
 * Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

 

Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:

Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:

Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
public class MaximumAscendingSubarraySum_LC_1800 {

	public static void main(String[] args) {
		
		int nums[]= {10,20,30,5,10,50};
		System.out.print("Minimum ascending subarray : "+maxiGoodSubarray(nums));
	}

	private static  int maxiGoodSubarray(int[] nums) {
		
		int max=nums[0];
		
		for(int start=0;start<nums.length;start++) {
			int cs=nums[start];
			for(int end=start+1;end<nums.length;end++) {
				if(nums[end]>nums[end-1]) {
					cs+=nums[end];
				}
				else break;
				
				max=Math.max(max, cs);
			}
		}
		
		return max;
	}

}
