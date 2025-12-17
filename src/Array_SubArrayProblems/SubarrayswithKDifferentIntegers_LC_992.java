package Array_SubArrayProblems;

import java.util.HashMap;

/**
 * 
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [1,2,1,2,3], k = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
Example 2:

Input: nums = [1,2,1,3,4], k = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 

Constraints:

1 <= nums.length <= 2 * 104
1 <= nums[i], k <= nums.length
 * @param args
 */
public class SubarrayswithKDifferentIntegers_LC_992 {

	public static void main(String[] args) {
		
		int nums[]= {1,2,1,2,3};
		
		int k=2;
		
		int ans=subarrayk(nums,k)-subarrayk(nums,k-1);
		
		System.out.print("Sub Array with K different Integer : "+ans);

	}
	
	
	private static int subarrayk(int nums[],int k) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int count=0,left=0;
		
		for(int i=0;i<nums.length;i++) {
			
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
			
			while(map.size() > k) {
				map.put(nums[left],map.get(nums[left])-1);
				if(map.get(nums[left])==0) {
					map.remove(nums[left]);
				}
				left++;
			}
			count+=i-left+1;
		}
		
		return count;
	}

}
