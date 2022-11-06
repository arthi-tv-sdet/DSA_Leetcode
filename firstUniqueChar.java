package DSA_Practise;

import java.util.HashMap;

import org.junit.Test;

public class FirstUniqueCharacter {

	/*
	 * 
	 * 387. First Unique Character in a String
	 * 
	 * testcase 1: s = "leetcode" Output: 0
	 * 
	 * testcase 2: s = "loveleetcode" Output: 2
	 * 
	 * testcase 3: s = "aabb" Output: -1
	 * 
	 * Pseudocode:String method
	 * traverse through the string
	 * compare the index using below methods
	 * string methods indexOf and lastIndexOf
	 * if both index are same return the index else return -1
	 * 
	 * Pseudocode: Brute force
	 * traverse through the string
	 * compare each charAt(i) with chatAt(j)
	 * if both index has same character increment temp
	 * return the index if temp==1
	 * else return -1
	 * 
	 * Pseudocode: using array
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		String s="aabb";
		//firstUniqueChar_BF(s);
		firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}
	
	//@Test
	public void test2() {
		String s="leetcode";
		firstUniqueChar_BF(s);
		//firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}

	//@Test
	public void test3() {
		String s="loveleetcode";
		//firstUniqueChar_BF(s);
		firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}
	private int firstUniqueChar_BF(String s) {
		
		int temp=0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					temp++;
				}
			}
			if(temp>1)
			{
				break;
			}
			else
			if(temp==1)
			{
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
	}
	 private void firstUniqueCharArray(String s)
	 {
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		//System.out.println(hm);
		if(hm.containsValue(1))
		{
			System.out.println(hm.containsValue(1));
		}
	 }
	
	 private int firstUniqueChar(String s)
	 {
		for(int i=0;i<s.length();i++)
		{
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
			{
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
		
	 }
}
