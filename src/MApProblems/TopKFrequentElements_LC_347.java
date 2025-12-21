package MApProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Example 2:

Input: nums = [1], k = 1

Output: [1]

Example 3:

Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]

 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements_LC_347 {

	public static void main(String[] args) {
		
		int nums[] = {1,2,1,2,1,2,3,1,3,2};
		int ans[] = TopKfrequent_Elements(nums,2);
		
		System.out.println("Top K frequent Elements: ");
		for(int k:ans) {
			System.out.print(k+" ");
		}
	}

	private static int[] TopKfrequent_Elements(int[] nums, int k) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		
		list.sort((a,b)-> b.getValue()-a.getValue());
		
		int res[] = new int[k];
		
		for(int i=0;i<k;i++) {
			res[i]=list.get(i).getKey();
		}
		
		return res;
		
	}

}
