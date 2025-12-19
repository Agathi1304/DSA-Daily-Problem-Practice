package Array_Problems;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters_LC_3 {

	public static void main(String[] args) {
		
		String s="pwwkew";
		System.out.print("Longest Substring without Repeating character "+longRepChar(s));

	}

	private static int longRepChar(String s) {
		
		Set<Character> set = new HashSet<>();
		int start=0,max=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			while(set.contains(ch)) {
				set.remove(s.charAt(start));
				start++;
			}
			set.add(ch);
			max=Math.max(max, i-start+1);
		}
		
		return max;
	}

}
