package StackProblems;

import java.util.Stack;

/**
 * 
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
 */
public class DailyTemperatures_LC_739 {

	public static void main(String[] args) {
		
		int nums[] = { 73,74,75,71,69,72,76,73 };
		int ans[] = Dailytemp(nums);
		for(int k:ans) {
			System.out.print(k+" ");
		}
	}

	private static int[] Dailytemp(int[] nums) {
		
		Stack<Integer> st= new Stack<>();
		int res[] = new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			
			while(!st.isEmpty() && nums[i]>nums[st.peek()]) {
				int previndex=st.pop();
				res[previndex]=i-previndex;
			}
			st.push(i);
		}
		
		return res;
	}

}
