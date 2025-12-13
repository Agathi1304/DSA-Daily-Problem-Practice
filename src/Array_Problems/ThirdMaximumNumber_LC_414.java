package Array_Problems;

/**
 * 
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */


public class ThirdMaximumNumber_LC_414 {

	public static void main(String[] args) {
		
		int nums[] = {1,2};
		int nums1[]= {2,2,3,1};
		System.out.print("Thirdmaximum number "+thirdmaxi(nums1));
		
		//Approach 2 but not working gfot long integer values
		System.out.println("");
		System.out.print("Approach 2 integer "+thiedmaximunAp2(nums));

	}

	private static int thiedmaximunAp2(int[] nums) {
		
		int first=0,second=0,third=0;
		
		for(int num :nums) {
			if(num>first) {
				third=second;
				second=first;
				first=num;
			}
			else if(num>second && num<first) {
				third=second;
				second=num;
			}
			else if(num>third && num<first && num<second) {
				third=num;
			}
		}
		
		return third!=0?third:first;
	}

	private static int thirdmaxi(int[] nums) {
		
		Long first=null,second=null,third=null;
		
		for(int n:nums) {
			long num = n;
			
			//not considering duplicates
			
			if(first!=null && first==num ||
					second!=null && second==num ||
					third!=null && third==num) {
				continue;
			}
			
			if(first == null || num> first) {
				third=second;
				second=first;
				first=num;
			}
			else if(second==null || num>second) {
				third=second;
				second=num;
			}
			else if(third==null || num>third) {
				third=num;
			}
		}
		
		return third!=null?third.intValue():first.intValue();
	}

}
