package Array_SubArrayProblems;

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107
 */


public class SubarraySumEqualsK_LC_560 {

	public static void main(String[] args) {
		
		int nums[] = {1,1,1};
		int k=2;
		System.out.print("Total number od sub-array equals to K : "+subArrayEaualk(nums,k));
	}

	private static int subArrayEaualk(int[] nums, int k) {
		
		int c=0;
		for(int start=0;start<nums.length;start++) {
			int cs=0;
			for(int end=start;end<nums.length;end++) {
				cs+=nums[end];
				if(cs==k) {
					c++;
				}
			}
		}
		
		return c;
	}

}
