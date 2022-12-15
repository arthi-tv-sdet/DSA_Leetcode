package DSA_String;

import org.junit.Test;

public class FirstPalindrome {



	//2108. Find First Palindromic String in the Array

	/*
	 * Given an array of strings words, 
	 * return the first palindromic string in the array. 
	 * If there is no such string, return an empty string "".

		A string is palindromic if it reads the
		 same forward and backward.

	 *
	 *Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"

Input: words = ["notapalindrome","racecar"]
Output: "racecar"

Input: words = ["notapalindrome","racecar"]
Output: "racecar"

Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.



Pseudocode:

traverse through the given string array
for each word in array
reverse the words using two pointers approach
if reverse is equal to the word return the word
else return empty string

Time: O[N]
Space: O[N]

	 *
	 */

	@Test
	public void test1()
	{
		String []words = {"abc","car","ada","racecar","cool"};
		System.out.println("palindrome -" +findFirstPalindrome(words));
	}
	@Test
	public void test2()
	{
		String []words = {"notapalindrome","racecar"};
		System.out.println("palindrome -" +findFirstPalindrome(words));
	}
	@Test
	public void test3()
	{
		String []words = {"def","ghi"};
		System.out.println("palindrome -" +findFirstPalindrome(words));
	}

	private String findFirstPalindrome(String[] words) {
		
		for(int i=0;i<words.length;i++)
	       {
	           String w=words[i];
	           char ch[]=w.toCharArray();
	           int left=0,right=ch.length-1;
	           while(left<right)
	           {
	               char temp=ch[left];
	               ch[left++]=ch[right];
	               ch[right--]=temp;

	           }
	          String rev= String.valueOf(ch);
	          if(rev.equals(w))
	          return w;
	       }
		return "";
	}
}
