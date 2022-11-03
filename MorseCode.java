package Hash;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class MorseCode {

	
	/*
	 * 804. Unique Morse Code Words
	 * 
	 * International Morse Code defines a standard encoding where each letter is
	 * mapped to a series of dots and dashes, as follows:
	 * 
	 * 'a' maps to ".-", 'b' maps to "-...", 'c' maps to "-.-.", and so on. For
	 * convenience, the full table for the 26 letters of the English alphabet is
	 * given below:
	 * 
	 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--
	 * ","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
	 * 
	 * Given an array of strings words where each word can be written as a
	 * concatenation of the Morse code of each letter.
	 * 
	 * For example, "cab" can be written as "-.-..--...", which is the concatenation
	 * of "-.-.", ".-", and "-...". We will call such a concatenation the
	 * transformation of a word. Return the number of different transformations
	 * among all words we have.
	 * 
	 * Input: words = ["gin","zen","gig","msg"] Output: 2
	 * Input: words = ["a"] Output: 1
	 * 
	 * 
	 * 
	 * Pseudocode:
	 * 
	 * create a hashset, initialize string=null,char c=97
	 * use a while loop to add all the morse codes in a map with key character(a-z) and value String(morsecodes)
	 * traverse through the given words [] and for each word compare the charAt with map
	 * add the value of each charAt to a set
	 * return the size of the set
	 */
	public void uniqueMorseCode(String [] words)
	{
		HashMap <Character,String> hm=new HashMap<>();
		String [] morseCode= {".-","-...","-.-.","-..",".","..-.","--.","...."
				,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		char c=97; String morse="";
		HashSet <String> morseSet=new HashSet<>();
		//while(c<=122)
		
		for(int i=0;i<morseCode.length;i++)
		{
			hm.put(c, morseCode[i]);
			c++;
		}
		//System.out.println(hm);
		
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++)
			{
				//if(hm.containsKey(words[i].charAt(j)))
				  
					morse=morse+hm.get(words[i].charAt(j));
					
				
			}
			morseSet.add(morse);
			System.out.println(morseSet);
			morse="";
		}
		System.out.println(morseSet.size());
	}
	
	public void morseCode_Array(String[] words)
	{
		
		String [] morseCode= {".-","-...","-.-.","-..",".","..-.","--.","...."
				,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		String morse="";
		HashSet <String> morseSet=new HashSet<>();
		
		
		
		for(int i=0;i<words.length;i++)
		{
			//char arr[]=words[i].toCharArray();
		
			for(int j=0;j<words[i].length();j++)
			{  
					morse=morse+morseCode[words[i].charAt(j)-'a'];				
			}
			morseSet.add(morse);
			System.out.println(morseSet);
			morse="";
		}
		System.out.println(morseSet.size());
	}
	
	@Test
	public void test()
	{
		String []words= {"gin","zen","gig","msg"};
		String [] words1= {"a"};
		morseCode_Array(words);
		morseCode_Array(words1);
	}
}
