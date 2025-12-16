package Array_SubArrayProblems;

/**
 * You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 

Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */
public class MaximumAverageSubarrayI_LC_643 {

	public static void main(String[] args) {
		
		int nums[] = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println("MAximum Average subArray of k length Approach I : "+SubArrayAvereageklen(nums,k));
		System.out.print("MAximum Average subArray of k length Approach II : "+SubArrayAvereageklenII(nums,k));

	}

	private static double SubArrayAvereageklenII(int[] nums, int k) {
		double max=Integer.MIN_VALUE;
		for(int start=0;start<nums.length;start++) {
			double cs=0.0;
			int c=0;
			for(int end=start;end<nums.length;end++) {
				cs+=nums[end];
				c++;
				
				if(c==k) {
					max=Math.max(max, cs);
				}
			}
		}
		
		return max/k;
	}

	private static double SubArrayAvereageklen(int[] nums, int k) {
		
		double dsum=0.0;
		
		for(int i=0;i<k;i++) {
			dsum+=nums[i];
		}
		
		double max=dsum;
		
		double wsum=dsum;
		
		for(int i=k;i<nums.length;i++) {
			wsum+=nums[i]-nums[i-k];
			max=Math.max(max, wsum);
		}
		
		return max/k;
	}

}
