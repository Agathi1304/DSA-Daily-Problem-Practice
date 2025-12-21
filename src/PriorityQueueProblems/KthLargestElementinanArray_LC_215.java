package PriorityQueueProblems;

import java.util.PriorityQueue;

/**
 * 
 * Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 */
public class KthLargestElementinanArray_LC_215 {

	public static void main(String[] args) {
		
		int nums[]= {3,2,3,1,2,4,5,5,6};
		System.out.print("Kth largets element in an Array : "+kthLargest(nums,4));

	}

	private static int kthLargest(int[] nums,int k) {
		
		  // Create a min-heap (PriorityQueue in Java is a min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Iterate through all numbers in the array
        for (int num : nums) {

            // Add the current number into the heap
            pq.add(num);

            // If heap size exceeds k, remove the smallest element (top of min-heap)
            // This ensures that only the k largest elements remain in the heap
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // After processing all elements, the top (smallest in heap)
        // represents the Kth largest element overall
        return pq.peek();
	}

}
