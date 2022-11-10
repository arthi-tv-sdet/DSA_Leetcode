package DSA_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class KeyBoardRow {

	/*
	 * //500. Keyboard Row
	 * 
	 * Example 1:
	 * 
	 * Input: words = ["Hello","Alaska","Dad","Peace"] Output: ["Alaska","Dad"]
	 * 
	 * Example 2:
	 * 
	 * Input: words = ["omk"] Output: []
	 * 
	 * Example 3:
	 * 
	 * Input: words = ["adsdf","sfd"] Output: ["adsdf","sfd"]
	 * 
	 * Constraints:
	 * 
	 * 1 <= words.length <= 20 
	 * 1 <= words[i].length <= 100 
	 * words[i] consists of	  English letters (both lowercase and uppercase).
	 * 
	 * Pseudocode:
	 * create 3 set to store first,second and third row characters
	 * create three variables for each row and initialize 0
	 * create a list to store result words
	 * traverse   through the array-words
	 * for each charAt if it contains in set increment respective set variable
	 * if set variable is equal to words[i].length() add to result list
	 * reset set variable after completing each word[i]
	 * repeat above steps till last word in array
	 * initialize an array of length res.size() and return the array
	 * 
	 * Time: O[N*M]+O[N]
	 * Space: O[N]
	 */
	
	
	
	
	@Test
	public void test()
	{
		String words[]= {"Hello","Alaska","Dad","Peace"};
		//String words[]= {"omk"};
		//String words[]= {"adsdf","sfd"};
		keyboardWords(words);
	}

	private void keyboardWords(String[] words) {
		
        
        HashSet<Character> fSet=new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'
                                                    ,'Q','W','E','R','T','Y','U','I','O','P'));        
    
         HashSet<Character> sSet=new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l',
                        'A','S','D','F','G','H','J','K','L'));
        
        HashSet<Character> tSet=new HashSet<>(Arrays.asList('z','x','c','v','b','n','m',
                                     'Z','X','C','V','B','N','M'));                       
                                                            
                        
        
    int fr=0,sr=0,tr=0;
   
   ArrayList <String> res=new ArrayList<>(); 
        
 
        
        for(int i=0;i<words.length;i++)//O[N]
        {
        	for(int j=0;j<words[i].length();j++)//O[M]
            {if(fSet.contains(words[i].charAt(j)))
               fr++;
            if(sSet.contains(words[i].charAt(j)))
               sr++;  
            if(tSet.contains(words[i].charAt(j)))
               tr++; 
            if(fr==words[i].length()) res.add(words[i]);
            if(sr==words[i].length()) res.add(words[i]);
            if(tr==words[i].length()) res.add(words[i]);
            } 
              
        fr=0;sr=0;tr=0;
        }
        //add the list to a string array and return
         String [] finalres=new String[res.size()];//O[N]
         for(int i=0;i<res.size();i++)
         {
             finalres[i]=res.get(i);
         }
         
         System.out.println( Arrays.toString(finalres));
		
	}
}
