package Array_practise_Leetcode;

import java.util.ArrayList;

import org.junit.Test;

public class BackspaceStringCompare {

	/*
	 * 844. Backspace String Compare
	 * 
	 * Given two strings s and t, return true if they are equal when both are typed
	 * into empty text editors. '#' means a backspace character.
	 * 
	 * Note that after backspacing an empty text, the text will continue empty.
	 * 
	 * 
	 * Input1: s = "ab#c", t = "ad#c" Output: true
	 * 
	 * Input2: s = "ab##", t = "c#d#" Output: true
	 * 
	 * Input3: s = "a#c", t = "b" Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length, t.length <= 200 
	 * s and t only contain lowercase letters and '#' characters	
	 * 
	 *   // Pseudocode:
        // create 2 array lists
        //     traverse through each string and add each char in each arraylist
        // if charAt=='#' remove the last element from list
        //     compare both list and return true or false
	 * 
	 * Time: O[N]
	 * Space: O[N]
	 * 
	 * 
	  //Pseudocode: Using stack
        // create a stack for each string
        // traverse through the string
        // push each character into stack
        // if the charAt is # pop from stack
        // if both stacks are equal return true
        // else return false
	
	Time: O[N] Space: O[N]
	 */
	@Test
	public void test()
	{
		String s="ab#c",t="ad#c";
		backSpaceString(s,t);
	}
	
	public void backSpaceString(String s, String t)
	{
		  ArrayList <Character> list1=new ArrayList<>();
	         ArrayList <Character> list2=new ArrayList<>();
	        
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='#' && list1.size()!=0)
	            {
	                list1.remove(list1.size()-1);
	            }
	            
	            list1.add(s.charAt(i));
	        }
	        
	        
	        for(int i=0;i<t.length();i++)
	        {
	            if(t.charAt(i)=='#' && list2.size()!=0)
	            {
	                list2.remove(list2.size()-1);
	            }
	            
	            list2.add(t.charAt(i));
	        }
	        
	        
	         
	        if(list1.equals(list2))
	            {System.out.println("true");}
	        else
	        {  System.out.println("false");}
	}
	
	 public boolean backspaceCompare(String s, String t) {
       
                 
      Stack <Character> stackS=new Stack<>();
      Stack <Character> stackT=new Stack<>();
        
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!='#' )
        stackS.push(s.charAt(i));
        else
            if(s.charAt(i)=='#' && !stackS.isEmpty())
                stackS.pop();
        
    }
          for(int j=0;j<t.length();j++)
          { 
              if(t.charAt(j)!='#' )
        stackT.push(t.charAt(j));
        else
            if(t.charAt(j)=='#' && !stackT.isEmpty())
                stackT.pop();
        }
       
       
    
        if(stackS.equals(stackT))
            return true;
            
            
                return false;
    }
}
