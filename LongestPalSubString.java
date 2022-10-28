package DSA_String;

import org.junit.Test;

public class LongestPalSubString {

	/* https://leetcode.com/problems/longest-palindromic-substring/
	 * 5. Longest Palindromic Substring
	 * Given a string s, return the longest palindromic substring in s.
	 * A string is called a palindrome string 
	 * if the reverse of that string is the same as the original string.
	 * 
	 * Input: s = "babad"
		Output:  "bab"

		Input: s = "cbbd"
		Output: "bb"
		
		PSUEDOCODE:
		/ * initialize 2 pointers left and right
	 * iterate through each character in the string twice, this is to find both odd and even palindromic string
	 * for odd palindrome, both left and right starts from same index and expand from that index
	 * for even palindrome, left starts at that index and right starts at left+1 index and expand from there
* while expanding, if both left and right characters are not equal, break the loop and find the substring
	 * if the substring length is greater than previous one, then store it as longest substring
	 * once iteration is completed, return the longest substring which is palindrome
	 * 
	 *  Space: O[1]
	 *  Time: O[N*M]
	
	*/

	private void LongPalSub(String s)
	{
		int left=0,right=0,maxLen=0; String output="";
		
		for(int i=0;i<s.length()*2;i++)
		{
			left=i/2;right=left+i%2;
			while(left>=0 && right <s.length()&&s.charAt(left)==s.charAt(right))
			{
				left--;right++;
			}
		left++;
		if(maxLen<right-left)
		
		{
			maxLen=right-left;
			output=s.substring(left,right);
		}
		
		}
		
		
		System.out.println(output);
	}
	@Test
	public  void test()
	{
		String s="babad";
		LongPalSub(s);
	}
}

