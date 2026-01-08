package Array_Problems;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 

Constraints:

m == s.length
n == t.length
1 <= m, n <= 105
s and t consist of uppercase and lowercase English letters.
 
 */

public class MinimumWindowSubstring_LC_76 {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
		
		System.out.print("Minimum window Substring: "+minimumwindowSubString(s,t));

	}

	private static String minimumwindowSubString(String s, String t) {
		
		Map<Character,Integer> smap = new HashMap<>();
		Map<Character,Integer> tmap = new HashMap<>();
		
		for(char ch:t.toCharArray()) {
			tmap.put(ch, tmap.getOrDefault(ch, 0)+1);
		}
		int left=0,start=0,count=0;
		int min=Integer.MAX_VALUE;
		for(int right=0;right<s.length();right++) {
			char ch=s.charAt(right);
			
			smap.put(ch,smap.getOrDefault(ch, 0)+1);
			
			if(tmap.containsKey(ch) && tmap.get(ch).intValue() == smap.get(ch).intValue()) {
				count++;
			}
			
			while(tmap.size()==count) {
				if(right-left+1<min) {
					min=right-left+1;
					start=left;
				}
				char leftchar = s.charAt(left);
				smap.put(leftchar, smap.put(leftchar, smap.get(leftchar))-1);
				
				if(tmap.containsKey(leftchar) && smap.get(leftchar)<tmap.get(leftchar)) {
					count--;
					}
				left++;
			}
		}
		
		return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
	}

}
