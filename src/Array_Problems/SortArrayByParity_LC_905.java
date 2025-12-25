package Array_Problems;
/**
 * 
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

 

Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 */
public class SortArrayByParity_LC_905 {

	public static void main(String[] args) {
		int nums[] = {3,1,2,4};
			int ans[] = sortArrayParity(nums);
			System.out.println("Sort by Parity ");
			for(int k:ans) {
				System.out.print(k+" ");
			}
	}

	private static int[] sortArrayParity(int[] nums) {
		
		int j=0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				int t=nums[i];
				nums[i]=nums[j];
				nums[j]=t;
				j++;
			}
		}
		
		return nums;
	}

}
