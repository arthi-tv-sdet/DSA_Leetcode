package DSA_Array;

import org.junit.Test;

public class MergeStringsAlternate {

	/*
	 * 1768. Merge Strings Alternately
	 * 
   Testcases:
	 * word1: a b c word2: p q r merged: a p b q c r
	 * word1: abcd word2: ef
   * word1: cd word2: efghi
	 *  
	 * 
	 * Pseudocode:
	 * initialize output string, keep 2 pointers p1 and p2 for each word
	 * traverse on each string using while loop if w1 and w2 are less than string length
	 * for each charAt if there is value of string concatenate with the output
	 * 
	 
	 Time: O[N]
	 Space: O[N]
	*/
	
	
	
	private void mergeStrings_2P(String w1, String w2) {
		
		String output=""; int p1=0,p2=0,len1=w1.length(),len2=w2.length();
		
		while(p1<len1||p2<len2)
		{
			if(p1<len1)
			{
				output=output+String.valueOf(w1.charAt(p1));
				p1++;
			}
			
			if(p2<len2)
			{
				output=output+String.valueOf(w2.charAt(p2));
				p2++;
			}
		}

		System.out.println(output);
		
	}
	@Test
	public void test() 
	{
		
		mergeStrings_2P("abc","def");
		mergeStrings_BF("abc","def");
		//mergeStrings_2P("abcd","ef");
		mergeStrings_BF("abcd","ef");
		//mergeStrings_2P("cd","efghi");
	}

}
