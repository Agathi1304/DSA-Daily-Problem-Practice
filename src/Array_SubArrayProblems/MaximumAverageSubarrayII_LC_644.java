package Array_SubArrayProblems;

/**
 * You are given an integer array nums with n elements and an integer k.

Your task is to find a contiguous subarray whose length is at least k that has the maximum possible average value. Return this maximum average value.

In other words, among all subarrays with length greater than or equal to k, you need to find the one with the highest average (sum of elements divided by the number of elements) and return that average value.

The answer will be accepted if it has a calculation error less than 10^-5 from the correct answer.

For example, if nums = [1, 12, -5, -6, 50, 3] and k = 4, you need to check all subarrays with length 4, 5, and 6:

Subarrays of length 4: [1, 12, -5, -6] with average 0.5, [12, -5, -6, 50] with average 12.75, [-5, -6, 50, 3] with average 10.5
Subarrays of length 5: [1, 12, -5, -6, 50] with average 10.4, [12, -5, -6, 50, 3] with average 10.8
Subarray of length 6: [1, 12, -5, -6, 50, 3] with average 9.16667
The maximum average among all these subarrays is 12.75.
 */
public class MaximumAverageSubarrayII_LC_644 {

	public static void main(String[] args) {
		
		int nums[] = { 1, 12, -5, -6, 50, 3};
		int k=4;
		System.out.print("Maximum Average subArray - II : "+subArrayavgII(nums,k));

	}

	private static double subArrayavgII(int[] nums, int k) {
		double max=0.0;
		for(int start=0;start<nums.length;start++) {
			double cs=0.0;
			int c=0;
			for(int end=start;end<nums.length;end++) {
				cs+=nums[end];
				c++;
				if(c>=k) {
					max=Math.max(max, cs/c);
				}
			}
		}
		
		
		return max;
	}

}
