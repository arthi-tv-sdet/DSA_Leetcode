package DSA_String;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Anagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise. 
	 * 
	 * An Anagram is a word or phrase formed by rearranging the letters
	 * of a different word or phrase, typically using all the original letters
	 * exactly once. 
	 * 
	 * Constrains: s and t consist of lowercase English letters.
	 * 
	 * 
	 * Input: s = "anagram", t = "nagaram" Output: true
	 * 
	 * 
	 * Pseudocode: bruteforce
	 * 
	 * if the length of s and t are not equal return - not an anagram
	 * if the length of s and t are equal continue below steps
	 * create two int arrays sarr and tarr of length 26 letters to store the occurences of the characters in s and t
	 * traverse through the string s from 0 till length-1
	 * for each character at i of string s and t increment the index value of charAt(i)-ascii value of 'a'
	 * return the boolean value after comparing both arrays
	 * formula-> sarr[string.charAt(i)-'a']++
	 * 
	 * 
	 * 
	 * 
	 * Pseudocode: using HashMap
	 * 
	 * if the length of s and t re not equal- return false
	 * if the length of s and t are equal- continue below steps
	 * declare a hash map of key character and value integer
	 * traverse through each string from 0 to length-1
	 * for each character at string add to map if not available or increment the value if available already
	 * compare both maps and return boolean value
	 
	 * 
	 * Time O[N]
	 * Space O[N]
	 */

	

	private void anagram_Bruteforce(String s,String t)
	{// int a=s.charAt(0)-'a';///this approach is only for input that has all lower case

		if(s.length()!=t.length())
			System.out.println("false");
		
		else
			if(s.length()==t.length())
			{
				int sarr[]=new int[26];
				int tarr[]=new int[26];

				for(int i=0;i<s.length();i++)
				{
					sarr[s.charAt(i)-'a']++;
					tarr[t.charAt(i)-'a']++;

				}System.out.println(Arrays.equals(sarr, tarr));
			}
	}
		
		private void anagram_HashMap(String s, String t)
		{
			if(s.length()!=t.length())
				System.out.println("false");
			else
				if(s.length()==t.length())
				{
					HashMap<Character,Integer> hm1=new HashMap<Character,Integer>();
					HashMap<Character,Integer> hm2=new HashMap<Character,Integer>();
					
					for(int i=0;i<s.length();i++)
					{
					// sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
						hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
						hm2.put(t.charAt(i),hm2.getOrDefault(t.charAt(i),0)+1);
					}
					
					System.out.println(hm1.equals(hm2));
				}
					
		}
		

@Test
public void test()
{
	
	anagram_Bruteforce("stop","pos");
	anagram_HashMap("rope","pore");
}

}
