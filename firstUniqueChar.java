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
	 
	 Time: O[N]
	 Space: O[1]
	 * 
	 * Pseudocode: Brute force
	 * traverse through the string
	 * compare each charAt(i) with chatAt(j)
	 * if both index has same character increment temp
	 * return the index if temp==1
	 * else return -1
	 * 
	  Time: O[N]
	 Space: O[1]
	 
	 * Pseudocode: using array
	 * initialize a character array of length 26
	 * traverse through the string
	 * for each char At (i) increment the corresponding value of char position in char Array
	 * find the index of char with value 1
	 * else return -1
	 
	  Time: O[N]
	 Space: O[N]
	 
	 * Pseudocode: using HashMap
	 * initialize a hashmap , traverse through string- add each charAt of s and occurence in key and value respectively
	 * traverse through the string if the value for the charAt of s is 1 return the key
	 
	 Time: O[N]
	 Space: O[N]
	 
	 */
	
	@Test
	public void test1() {
		String s="aabb";
		//firstUniqueChar_BF(s);
		firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}
	
	@Test
	public void test2() {
		String s="leetcode";
		//firstUniqueChar_BF(s);
		firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}

	@Test
	public void test3() {
		String s="loveleetcode";
		//firstUniqueChar_BF(s);
		firstUniqueCharArray(s);
		//firstUniqueChar(s);
	}
	
	/ * Pseudocode: Brute force
	 * traverse through the string
	 * compare each charAt(i) with chatAt(j)
	 * if both index has same character increment temp
	 * return the index if temp==1
	 * else return -1
	 * 
	  Time: O[N]
	 Space: O[1] */
		 
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
	
	 /* Pseudocode: using array
	 * initialize a character array of length 26
	 * traverse through the string
	 * for each char At (i) increment the corresponding value of char position in char Array
	 * find the index of char with value 1
	 * else return -1
	 
	  Time: O[N]
	 Space: O[N]
	*/
	
	
	 private int firstUniqueCharArray(String s)
	 {
		int arr[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)-'a']++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[s.charAt(i)-'a']==1)
			{
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
	 }
	
	/ * Pseudocode:String method
	 * traverse through the string
	 * compare the index using below methods
	 * string methods indexOf and lastIndexOf
	 * if both index are same return the index else return -1
	 
	 Time: O[N]
	 Space: O[1]
	 */ 
	
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
	
	/ * Pseudocode: using HashMap
	 * initialize a hashmap , traverse through string- add each charAt of s and occurence in key and value respectively
	 * traverse through the string if the value for the charAt of s is 1 return the key
	 
	* Time: O[N]
	* Space: O[N]
		 */
		
	 public int firstUniqChar(String s) {
  HashMap <Character,Integer> hmap=new HashMap<>();

for(int i=0;i<s.length();i++)
{
    hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
}

for(int i=0;i<s.length();i++)
{
    if(hmap.get(s.charAt(i))==1)
    return i;

}
		return -1;
    
}
}
