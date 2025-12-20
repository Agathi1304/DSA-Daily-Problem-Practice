package StackProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 */
public class NextGreaterElement_I_LC_496 {

	public static void main(String[] args) {
		
		int nums1[] = {4,1,2};
		int nums2[] = {1,3,4,2};
		
		int ans[] = NextGreatestEle(nums1,nums2);
		
		for(int k:ans) {
			System.out.print(k+" ");
		}

	}

	private static int[] NextGreatestEle(int[] nums1, int[] nums2) {
		
		// Stack to maintain elements in decreasing order
        Stack<Integer> st = new Stack<>();
        
        // Map to store each element's next greater element in nums2
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Build the mapping of next greater elements for nums2
        for (int num : nums2) {
            // While current number is greater than the top of stack
            // It means current num is the next greater element for st.peek()
            while (!st.empty() && st.peek() < num) {
                // Map the popped element to its next greater element
                map.put(st.pop(), num);
            }
            // Push current number to stack
            st.push(num);
        }

        // Step 2: Prepare the result array for nums1
        int res[] = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            // If nums1[i] has a next greater element in map, use it
            // Otherwise, return -1
            res[i] = map.getOrDefault(nums1[i], -1);
        }

        // Step 3: Return the result array
        return res;
	}

}
