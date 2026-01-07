package Array_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 

Constraints:

1 <= s.length, p.length <= 3 * 104
s and p consist of lowercase English letters.
 */
public class FindAllAnagramString_LC_438 {

	public static void main(String[] args) {
		
		String s="abab",p="ab";
		System.out.print("All Anagaram in String : "+findAllAnagram(s,p));

	}

	private static List<Integer> findAllAnagram(String a, String b) {
		
		int s1[] = new int[256];
		int s2[] = new int[256];
		List<Integer> list = new ArrayList<>();
		
		for(char ch:b.toCharArray()) s2[ch]++;
		
		for(int i=0;i<a.length();i++) {
			char ch = a.charAt(i);
			
			s1[ch]++;
			
			if(i>=b.length()) {
				s1[a.charAt(i-b.length())]--;
			}
			
			if(Arrays.equals(s1, s2)) {
				list.add(i-b.length()+1);
			}
		}
		
		return list;
	}

}
