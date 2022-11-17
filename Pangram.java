package Collections_learning;

import java.util.HashSet;

import org.junit.Test;

public class Pangram {

	
	
	//1832. Check if the Sentence Is Pangram
	
	/*
	 * Pseudocode: add each char from sentence to a a hashset
	 *  if the size of set ==26 return true else false
	 *  
	 *  Time: O[N]
	 *  Space:O[N]
   
   public void  pangram(String sentence)
	{
	     int len=sentence.length();
	        HashSet<Character> res=new HashSet<>();
	        
	        for(int i=0;i<len;i++)
	        {   
	            res.add(sentence.charAt(i));
	            if(res.size()==26)
	           return true;
	           
	            
	        }
	       
	        return false;
	            
	    }
   
   Pseudocode:
	 */ set 2 pointers left and right
   *add each char from  sentence to set 
   * add left and right characters
   * increment left decrement right
   * return true if set.size =26 else false
   
   Time: O[N/2] Space: O[N]
	
	 public boolean checkIfPangram(String sentence) {
  
                  
        int left=0,len=sentence.length(),right=len-1;
        
        HashSet<Character> res=new HashSet<>();
        
        while(left<right)
        {   
            res.add(sentence.charAt(left++));
            
             res.add(sentence.charAt(right--));
            if(res.size()==26)
                return true;
           
        }
       
        
            return false;
    }
	
	
@Test
public void test()

{
	String sentence="thequickbrownfoxjumpsoverthelazydog";
	pangram(sentence);
}

}
