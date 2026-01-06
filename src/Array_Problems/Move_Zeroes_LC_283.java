package Array_Problems;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

 */

/*
 * Solving by checking array elements !=0 if it means 
 * then introduce new pointer variable to give value
 * then after tracking then again using that as start loop till end to make array elements as 0
 */
public class Move_Zeroes_LC_283 {

	public static void main(String[] args) {
		
		int nums[]  = {0,1,0,3,12};
		int ans[] = moveZeros(nums);
		System.out.print("Move all zeros at end : ");
		for(int k:ans)
		{
			System.out.print(k+" ");
		}
	AnotherApproachMovingZero(nums);

	}

	private static void AnotherApproachMovingZero(int[] nums) {
		
		int j=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int t=nums[i];
				nums[i]=nums[j];
				nums[j]=t;
				j++;
			}
		}
		System.out.println("Another approach ");
		
		for(int k:nums) {
			System.out.print(k+" ");
		}
		
		
	}

	private static int[] moveZeros(int[] nums) {
		
		int j=0;
		for(int num:nums) {
			if(num!=0) {
				nums[j]=num;
				j++;
			}
		}
		
		for(int i=j;i<nums.length;i++) {
			nums[i]=0;
		}
		
		return nums;
	}

}
