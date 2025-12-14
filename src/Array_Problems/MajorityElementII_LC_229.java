package Array_Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */


public class MajorityElementII_LC_229 {

	public static void main(String[] args) {
		
		int nums[] = { 1,2 };
		System.out.print(" Majortiy Element II , greater than n/3 : "+majorityII(nums));

	}

	private static List<Integer> majorityII(int[] nums) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int k:nums) {
			map.put(k,map.getOrDefault(k, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry :map.entrySet()){
			if(entry.getValue() > nums.length/3) {
				list.add(entry.getKey());
			}
		}
		
		return list;
	}

}
