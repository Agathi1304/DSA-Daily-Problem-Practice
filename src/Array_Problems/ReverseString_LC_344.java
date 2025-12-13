package Array_Problems;

import java.util.Arrays;

/**
 * 
 * Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
 */


public class ReverseString_LC_344 {

	public static void main(String[] args) {
		
		char[] s= { 'h','e','l','l','o'};
		reverseS(s);
		System.out.print("Reverse character Array : "+Arrays.toString(s));

	}

	private static void reverseS(char[] s) {
	
		int left=0,right=s.length-1;
		
		while(left<right) {
			char t=s[left];
			s[left]=s[right];
			s[right]=t;
			left++;
			right--;
		}
	}

}
