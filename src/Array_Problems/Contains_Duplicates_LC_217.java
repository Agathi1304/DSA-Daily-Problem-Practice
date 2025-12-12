package Array_Problems;

import java.util.Arrays;
import java.util.HashSet;

/**
 *  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

/*
 * Solving by using two ways HashSet and for loop duplicate detection comparing next to next elements
 */
public class Contains_Duplicates_LC_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,1,1,3,3,4,3,2,4,2};
		int nums1[]= {1,2,3,4};
		boolean hashset = hashSet_Method_containsDuplicate(nums);
		System.out.println("Hash Set Approach :"+hashset);
		boolean forloopdetection = forloop_Detection_ContainsDuplicate(nums1);
		System.out.print("For loop detection approach : "+forloopdetection);
				
		}

	private static boolean forloop_Detection_ContainsDuplicate(int[] nums) {

     Arrays.sort(nums);
     for(int i=1;i<nums.length;i++) {
    	 if(nums[i]==nums[i-1]) return true;
	  }
     return false;
	}

	private static boolean hashSet_Method_containsDuplicate(int[] nums) {
		
	HashSet<Integer> hs= new HashSet<>();
	
	for(int num:nums) {
		if(hs.contains(num)) return true;
		hs.add(num);
	}
		return false;
	}

}
