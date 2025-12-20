package StackProblems;

import java.util.Stack;

/**
 * 
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4
 

Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
 */
public class LargestRectangleinHistogram_LC_84 {

	public static void main(String[] args) {
		
		int heights[] = { 2,1,5,6,2,3};
		System.out.print("Largest Rectangle n Historam : "+LarRectHist(heights));

	}

	private static int LarRectHist(int[] heights) {
		
		Stack<Integer> st= new Stack<>();
		int max=0;
		
		for(int i=0;i<heights.length;i++) {
			
			int h= (i==heights.length)?0:heights[i];
			
			while(!st.isEmpty() && h<heights[st.peek()]) {
				int pop=st.pop();
				int height=heights[pop];
				int width = st.isEmpty()?i:i-st.peek()-1;
				max=Math.max(max, width*height);
			}
			st.push(i);
		}
		
		return max;
	}

}
