package DSA_String;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ReverseVowels_2P {

	/*345. Reverse Vowels of a String
	 * Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:

Input: s = "hello"
Output: "holle"

Example 2:

Input: s = "leetcode"
Output: "leotcede"

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
	
*
**PSEUDOCODE-2 pointer
	 * 
	 * convert input string to char array
	 * create a set and add vowels
	 * take two points p1 and p2 as index 0 and last index respectively
	 * traverse through the array and increment p1 and decrement p2 if not a vowel
	 * if p1 is a vowel then swap p1 to temp, p2 to p1 and p1 to temp 
	 * increment p1 and decrement p2
	 * return the string
	*/
	
   private String ReverseVowels(String s) {
	   //convert input string to char array
			char str[]=s.toCharArray();
			
			//create a set and add vowels
			Set<Character> vowel=new HashSet<Character>();
			Collections.addAll(vowel, 'a','e','i','o','u','A','E','I','O','U');
			
			//take two points p1 and p2 as index 0 and last index respectively
			int p1=0,p2=str.length-1; //String out=new String();
			//traverse through the array and increment p1 and decrement p2 if not a vowel
			while(p1<p2)
			{
				if(!vowel.contains(str[p1]))
				{
					p1++;
					continue;
				}
			
				if(!vowel.contains(str[p2]))
				{
					p2--;
					continue;
				}
			//	if p1 is a vowel then swap p1 to temp, p2 to p1 and p1 to temp 
				//  increment p1 and decrement p2
				char temp=str[p1];
				str[p1]=str[p2];
				str[p2]=temp;
				p1++; p2--;

		}
			
	        System.out.println( new String(str));
			return s;
	        		
   }
	
	@Test
	public void example1()
{
	String s="hello";
	
	ReverseVowels(s);


}
}
