package DSA_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class UncommonWords {

	/*
	 * 884. Uncommon Words from Two Sentences
	 * 
	 * A sentence is a string of single-space separated words where each word
	 * consists only of lowercase letters.
	 * 
	 * A word is uncommon if it appears exactly once in one of the sentences, and
	 * does not appear in the other sentence.
	 * 
	 * Given two sentences s1 and s2, return a list of all the uncommon words. You
	 * may return the answer in any order.
	 * 
	 * Example 1:
	 * 
	 * Input: s1 = "this apple is sweet", s2 = "this apple is sour" Output:
	 * ["sweet","sour"]
	 * 
	 * Example 2:
	 * 
	 * Input: s1 = "apple apple", s2 = "banana" Output: ["banana"]
	 * 
	 * Constraints:
	 * 
	 * 1 <= s1.length, s2.length <= 200 s1 and s2 consist of lowercase English
	 * letters and spaces. s1 and s2 do not have leading or trailing spaces. All the
	 * words in s1 and s2 are separated by a single space.
	 * 
	 * 
	 * Psudocode:
	 * 
	 * create a map key-string and value- Integer iterate through given array for
	 * each string add the string to map key and increment if occurence is more for
	 * all the values with 1 add the corresponding keys to a list
	 * 
	 
	 Time: O[N]
	 Space: O[N]
	 */

	@Test
	public void test() {
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		findUncommonString(s1, s2);
		
	}

	private void findUncommonString(String s1, String s2) {

		HashMap<String, Integer> hmap = new HashMap<>(); //O{N]
		//int occurence=1;
		ArrayList<String> uncommonL = new ArrayList<>(); //O[N]
		
		
		String[] splitS1 = s1.split(" "); //O[N]
		String[] splitS2 = s2.split(" "); //O[N]
		for (int i = 0; i < splitS1.length; i++) { //O[N]
			hmap.put(splitS1[i], hmap.getOrDefault(splitS1[i], 0) + 1);

		}
		for (int i = 0; i < splitS2.length; i++) { O[M]
			hmap.put(splitS2[i], hmap.getOrDefault(splitS2[i], 0) + 1);

		}

		// System.out.println(hmap);

		
		for (Map.Entry<String, Integer> entry: hmap.entrySet()) {//O[N]
			  
			 if (entry.getValue()==1)
				 
			 {
				 uncommonL.add(entry.getKey());
			 }
		  
		  
		  }
		 String res[]=new String[uncommonL.size()]; O[N]
       
       for(int i=0;i<uncommonL.size();i++)//O[N]
       {
           res[i]=uncommonL.get(i);
       }
		
		 
		 System.out.println(Arrays.toString(res));
		
	}

}
