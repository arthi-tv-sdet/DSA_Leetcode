package Hash;

import java.util.HashSet;

import org.junit.Test;

public class JewelsandStones {

	/*
	771. Jewels and Stones
	You're given strings jewels representing the types of stones that are jewels, 
	
	and stones representing the stones you have. 
	Each character in stones is a type of stone you have. 
	You want to know how many of the stones you have are also jewels.

	Letters are case sensitive, so "a" is considered a different type of stone from "A".
	
	Example 1:

		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3
		
		Example 2:

		Input: jewels = "z", stones = "ZZ"
		Output: 0
		
		Constraints:
		1 <= jewels.length, stones.length <= 50
		jewels and stones consist of only English letters.
		All the characters of jewels are unique.
		
		Pseudocode:
		create a set and all the jwels,initialise count=0
		traverse through the stones and compare each charAt with the jwels
		if jwels contains charAt stones increment count
		
		
*/
	 public void stoneCount(String jwels,String stones)
	 { int count=0;
		 HashSet <Character> jwelSet=new HashSet<>();
		 for(int i=0;i<jwels.length();i++)
		 {
			 jwelSet.add(jwels.charAt(i));
		 }
		//System.out.println(jwelSet);
		 for(int i=0;i<stones.length();i++)
		 {
			 if(jwelSet.contains(stones.charAt(i)))
				 count++;
		 }
		 System.out.println(count);
	 }
	
	 @Test
	 public void test()
	 {		
		// String jwels="aA";
		// String stones="aAAbbbb";
		 String jwels="sdeADF";
		 String stones="ZeAFZ";
		 stoneCount(jwels,stones);
	 }
	
	
}
