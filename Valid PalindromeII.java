package DSA_String;

import org.junit.Test;

public class PalindromeII {

	/*
		680. Valid Palindrome II
		Given a string s, 
		return true if the s can be palindrome 
		after deleting at most one character from it.


		Input: s = "aba"
		Output: true

		Input: s = "abca"
		Output: true

		Input: s = "abc"
		Output: false


		Constraints:
		1 <= s.length <= 105
		s consists of lowercase English letters.
    
    
    Pseudocode:
    set p1 =0 and p2 = last index of s
		using two pointers check if both are same for each character in s
		if true check the substring p1,p2-1 or p1+1,p2 is valid palindrome
		if any one is true return true
		else false
	 */
	@Test
	public void test1()
	{
		String s="aba";
		System.out.println(validPalindrome(s));
	}

	@Test
	public void test2()
	{
		String s="abca";
		System.out.println(validPalindrome(s));
	}
	@Test
	public void test3()
	{
		String s="abc";
		System.out.println(validPalindrome(s));
	}
	private boolean validPalindrome(String s) {
		
		int p1=0,p2=s.length()-1;
		
		while(p1<=p2)
		{
			if(s.charAt(p1)!=s.charAt(p2))
			{
				return (isPal(s,p1+1,p2) || isPal(s,p1,p2-1) );
				
			}
			p1++;
			p2--;
		}
		
		
		
		return true;
	}

	private boolean isPal(String s, int i, int j) {
		
		int p1=i, p2=j;
		
		while(p1<=p2)
		{
			if(s.charAt(p1)!=s.charAt(p2))
			{
				return false;
			}
			p1++;p2--;
		}
		return true;
	}
	
	
	
}



