package Array_Problems;

/**
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */
public class SortColors_LC_75 {

	public static void main(String[] args) {

	int nums[]= {	2,0,2,1,1,0};
	int ans[] = sortColors(nums);
	for(int k:ans) {
		System.out.print(k+" ");
	}

	}

	private static int[] sortColors(int[] nums) {
		int zerocount=0,onecount=0,twocount=0;
		for(int k:nums) {
			if(k==0) zerocount++;
			else if(k==1) onecount++;
			else if(k==2) twocount++;
		}
		
		int j=0;
		for(int i=0;i<zerocount;i++) {
			nums[j]=0;
			j++;
		}
		for(int i=0;i<onecount;i++) {
			nums[j]=1;
			j++;
		}
		for(int i=0;i<twocount;i++) {
			nums[j]=2;
			j++;
		}
		
		return nums;
	}

}
