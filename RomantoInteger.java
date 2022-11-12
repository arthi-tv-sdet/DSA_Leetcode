package DSA_Practise;

import java.util.HashMap;

import org.junit.Test;

public class RomantoInt {

	/*
	 * 13. Roman to Integer
	 * 
	 * Input: s = "III" Output: 3
	 * 
	 * Input: s = "LVIII" Output: 58
	 * 
	 * Input: s = "MCMXCIV" Output: 1994
	 * 
	 * Constraints: 
	 * 1 <= s.length <= 15
	 *  s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M'). 
	 *  It is guaranteed that s is a valid roman numeral in the range [1, 3999].
	 *  
	 *  Pseudocode:
	 *  create a hashMap, initialize variable for output
	 *  add all the roman key and its value in map
	 *  traverse through the given roman string 
	 *  for each charAt check the constraints 
	 *  if charAt is I and charAt(i+1) is V or X- sum=sum-1
	 *  if charAt is X and charAt(i+1) is L or C- sum=sum-10
	 *  if charAt is C and charAt(i+1) is M or D- sum=sum-100
	 *  else add all the values for each charAt
	 *  return output
	 *  
	 *  TIme: O[N]
	 *  Space:O[N]
	 */
	
	@Test
	public void test()
	{
		String s="MCMXCIV";
		romantoInt(s);
	}

	private void romantoInt(String s) {
		 HashMap<Character,Integer> romanMap=new HashMap<>(); //O[N]
	        
	        int output=0,right=s.length()-1;
	        
	        romanMap.put('I',1); romanMap.put('V',5);
	        romanMap.put('X',10); romanMap.put('L',50);
	        romanMap.put('C',100); romanMap.put('D',500); romanMap.put('M',1000);
	        
	        for(int i=right;i>=0;i--)//O[N}
	        {   
	                
	            
	            if(s.charAt(i)=='I'&& i<s.length()-1 && (s.charAt(i+1)=='V'|| s.charAt(i+1)=='X'))
	                output=output-1;
	            else if(s.charAt(i)=='X'&& i<s.length()-1 && (s.charAt(i+1)=='L'|| s.charAt(i+1)=='C'))
	                output=output-10;
	             else if(s.charAt(i)=='C'&& i<s.length()-1 && (s.charAt(i+1)=='M'|| s.charAt(i+1)=='D'))
	                output=output-100;
	            else 
	                 output=output+romanMap.get(s.charAt(i));
	        }
		System.out.println(output);
	}
	
}
