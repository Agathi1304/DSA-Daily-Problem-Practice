package MApProblems;

import java.util.HashMap;

/**
 * 
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 

 */
public class ContainsDupliacte_II_LC_219 {

	public static void main(String[] args) {
		
		int nums[] = {1,2,3,1};
		int nums1[]= {1,0,1,1};
		int nums2[] = {1,2,3,1,2,3};
		int k_distance=3;
		int k1_distance=1;
		int k2_distance=2;
		
		System.out.println("Contains Duplicate II -> "+duplicateII(nums,k_distance));
		System.out.println("Contains Duplicate II -> "+duplicateII(nums1,k1_distance));
		System.out.println("Contains Duplicate II -> "+duplicateII(nums2,k2_distance));
	}

	private static boolean duplicateII(int[] nums, int k_distance) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(hm.containsKey(nums[i])) {
				int previndex = hm.get(nums[i]);
				
				if( i-previndex <= k_distance) return true;
			}
			hm.put(nums[i], i);
		}
		return false;
	}

}
