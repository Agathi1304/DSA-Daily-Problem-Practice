package Array_Problems;

/**
 * 
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should return the array of nums such that the array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 

Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
 
 */
public class ReaarangeElementBy_sign_LC_2149 {

	public static void main(String[] args) {
		
		int nums[] = { 3,1,-2,-5,2,-4  };
		int ans[] = reaarangeElemSign(nums);
		System.out.println("ReArrange Element by sign : ");
		for(int k:ans) {
			System.out.print(k+" ");
		}

	}

	private static int[] reaarangeElemSign(int[] nums) {
		
		int oddcount=1,evencount=0;
		
		int res[] = new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				res[evencount]=nums[i];
				evencount+=2;
			}
			else if(nums[i]<0) {
				res[oddcount]=nums[i];
				oddcount+=2;
			}
		}
		
		return res;
	}

}
