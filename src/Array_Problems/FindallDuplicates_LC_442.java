package Array_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * 442. Find All Duplicates in an Array
Solved
Medium
Topics
premium lock icon
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.
 */
public class FindallDuplicates_LC_442 {

	public static void main(String[] args) {
		
		int nums[]= {4,3,2,7,8,2,3,1};
		System.out.print(alldupList(nums));
	}

	private static List<Integer> alldupList(int[] nums) {
		List<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int k:nums) {
			map.put(k, map.getOrDefault(k, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> en:map.entrySet()) {
			if(en.getValue()>1) {
				list.add(en.getKey());
			}
		}
		
		return list;
	}

}
