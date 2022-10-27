package DSA_String;

import org.junit.Test;

public class ReversePrefixofWord {

	/*
	 * 2000. Reverse Prefix of Word
	 * Input: word = "abcdefd", ch = "d"
		Output: "dcbaefd"
		Explanation: The first occurrence of "d" is at index 3. 
		Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
	 * 
	 * 
	 *  
	 *  PSEUDOCODE:
	 *  
	 *  find the index for given char c
	 *  create a new stringbuilder and reverse the substring
	 *  append to string builder and return
	 *  
	 *  
	 *  
	 *  
	 *  
	 * 
	*/
	
	private String reversePrefix(String word,char c)
	{
		final int index=word.indexOf(c)+1;
		
		System.out.println( new StringBuilder (word.substring(0, index))
				.reverse().append(word.substring(index)).toString());
		
		return word;
	}
	
	
	
	@Test
	public void test() {
		//String word="abcdefd";
		//	char c='d';
		String word="abcd";
		char c='z';
		reversePrefix(word,c);
	}
}
