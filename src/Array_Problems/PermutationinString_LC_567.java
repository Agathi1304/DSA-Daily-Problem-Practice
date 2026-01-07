package Array_Problems;

import java.util.Arrays;

/**
 * 
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
 */
public class PermutationinString_LC_567 {

	public static void main(String[] args) {
		
		String s1="ab",s2="eidboaoo";
		System.out.print("Permutation in String : "+PermutationString(s1,s2));

	}

	private static boolean PermutationString(String a, String b) {
		
		int s1[] = new int[256];
		int s2[]= new int[256];
		
		for(char ch:a.toCharArray()) s1[ch]++;
		
		for(int i=0;i<b.length();i++) {
			char ch=b.charAt(i);
			s2[ch]++;
			if(i>=a.length()) {
				s2[b.charAt(i-a.length())]--;
			}
			if(Arrays.equals(s1, s2)) return true;
		}
		
		return false;
	}

}
