package MApProblems;

import java.util.HashMap;

/**
 * 
 * You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.

 
 

Example 1:

Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
Example 2:

Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
Output: false
Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.
 */


public class ContainsDupliaceIII_LC_220 {

	public static void main(String[] args) {
		
		int nums1[]= {1,2,3,1};
		int nums2[]= {1,5,9,1,5,9};
		
		int indexdiff=3,valueDiff=0;
		int indexdiff1=2,valueDiff1=3;
		
		System.out.println("ConatinsDupl III "+containsDuplIII(nums1,indexdiff,valueDiff));
		System.out.print("ConatinsDupl III "+containsDuplIII(nums2,indexdiff1,valueDiff1));
		
		

	}

	private static boolean containsDuplIII(int[] nums, int indexDiff, int valueDiff) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int previndex=hm.get(nums[i]);

                if( i!=previndex &&
                 Math.abs(i-previndex)<=indexDiff && 
                 Math.abs(nums[i] - nums[previndex])<=valueDiff) return true;
            }
            hm.put(nums[i],i);
        }

        return false;
	}

}
