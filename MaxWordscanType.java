package DSA_Practise;

import java.util.HashSet;

import org.junit.Test;

public class MaxWordscanType {

	
	/*
	 * 1935. Maximum Number of Words You Can Type
	 * 
	 * There is a malfunctioning keyboard where some letter keys do not work. All
	 * other keys on the keyboard work properly.
	 * 
	 * Given a string text of words separated by a single space (no leading or
	 * trailing spaces) and a string brokenLetters of all distinct letter keys that
	 * are broken, return the number of words in text you can fully type using this
	 * keyboard.
	 * 
	 * Input: text = "hello world", brokenLetters = "ad" 
	 * 
	 * Output: 1
	 * 
	 * Input: text = "leet code", brokenLetters = "lt" 
	 * Output: 1
	 * 
	 * Input: text = "leet code", brokenLetters = "e"
	 * Output: 0
	 * 
	 * 
	 * Pseudocode:
	 * 
	 * create a set to store all broken letters, wordLength=0,wordCount=0
	 * split the given input text into String array words
	 * traverse through words 
	 * for each charAt if not in set increment wordLength by 1
	 * if wordLength==words[i].length() increment wordCount by 1
	 * return the wordCount
	 * 
   Time: O[N]
   Space: O[N]
	 */
	
	@Test
	public void test()
	{
		//String text="leet code",brokenLetters="e";
		//String text = "hello world", brokenLetters = "ad" ;
		String text="leet code",brokenLetters="lt";
		MaxWords(text,brokenLetters);
	}
	
	private void MaxWords(String text,String brokenLetters)
	{
		 int wordLength=0,wordCount=0; //O[1]
         HashSet<Character> broken=new HashSet<>();//O[N]
        for(int i=0;i<brokenLetters.length();i++)
        {
            broken.add(brokenLetters.charAt(i));
        }
        
        String[] words=text.split(" "); //hello world//O[N]
       
        for(int i=0;i<words.length;i++)//O[N]
        {
            int len=words[i].length();
            for(int j=0;j<len;j++)//O[N]
            {
               if(!broken.contains(words[i].charAt(j)))
               {  wordLength++;}
                else 
                    break;
                  
                 if(wordLength==len)
                     wordCount++;
                
            }wordLength=0; 
            
        }
	        System.out.println(wordCount);
	        
	}
}
