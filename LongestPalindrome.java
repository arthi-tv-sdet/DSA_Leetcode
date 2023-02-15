package Mng_Session;

import java.util.HashSet;

import org.junit.Test;

public class longestPal {
/**
 * s="abccccdd" => 7
 * s="abc" => 0
 * s="aab" => 3
 * s="ccaa" => 0
 * 
 * 
 * Pseudocode:
 * create a hashset - add the characters
 * if each char in string  increment  len by 2 and remove the value from set
 * else add to set
 * if set size is greater than 0 return lenvalue +1
 * else return len value
 * 
 * Time: O[N]
 * space:O[N]
 * 
 */
	
	@Test
	public void test()
	{
		String s="abccccdd";
		System.out.println(longPal(s));
	}
	
	
	
	public int longPal(String s)
	{
		  HashSet<Character>set=new HashSet<>();
	        int len=0;
	        for(char c:s.toCharArray()){
	            if(set.contains(c)){
	                len+=2;
	                set.remove(c);
	            }else{
	                set.add(c);
	            }
	        }
	        if(set.size()>0){
	            return len+1;
	        }else{
	            return len;
	        }
	}
}
