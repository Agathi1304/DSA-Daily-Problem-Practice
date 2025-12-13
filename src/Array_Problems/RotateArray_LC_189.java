package Array_Problems;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 */


public class RotateArray_LC_189 {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,4,5,6,7};
		int k=3;
		Reversektimes(nums,k);
		System.out.print("Reverse K times : " +Arrays.toString(nums));
		
		System.out.println();
		int nums1[]= {-1,-100,3,99};
		ReverseArrayK(nums1,2);
		System.out.println("Approach II -> while loop :"+Arrays.toString(nums1));
		
	}
	
	private static void ReverseArrayK(int[] nums, int k) {
		
		
		while(k>0) {
			int t= nums[nums.length-1];
			for(int i=nums.length-1;i>0;i--) {
				nums[i]=nums[i-1];
			}
			nums[0]=t;
			k--;
		}
		
	}

	private static void Reversektimes(int nums[],int k) {
		
		k=k%nums.length;
		
		reverse(nums,0,nums.length-1);
		
		reverse(nums,0,k-1);
		
		reverse(nums,k,nums.length-1);
	}
	
	private static void reverse(int nums[],int left,int right) {
		
		while(left<right) {
			int t=nums[left];
			nums[left]=nums[right];
			nums[right]=t;
			left++;
			right--;
		}
	}

}
