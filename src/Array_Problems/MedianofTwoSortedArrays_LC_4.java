package Array_Problems;

import java.util.Arrays;

/**
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
public class MedianofTwoSortedArrays_LC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums1[] = {1,2};
		int nums2[]= {3,4};
		
		double medianofsortedArrya = medianofTwoSortedarray(nums1,nums2);
		System.out.print("Median of two sortedintegers : "+medianofsortedArrya);

	}

	private static double medianofTwoSortedarray(int[] nums1, int[] nums2) {
		
		int res[] = new int[nums1.length+nums2.length];
		int j=0;
		double median =0.0;
		for(int i=0;i<nums1.length;i++) {
			res[j]=nums1[i];
			j++;
		}
		
		for(int i=0;i<nums2.length;i++) {
			res[j]=nums2[i];
			j++;
		}
		
		Arrays.sort(res);
		
		int resultarrlen=res.length;
		
		if(resultarrlen%2!=0) return res[resultarrlen/2];
		
		else if(resultarrlen%2==0) {
			 median = (res[resultarrlen/2]+res[(resultarrlen/2-1)])/2.0;
		}
		
		return median;
	}

}
