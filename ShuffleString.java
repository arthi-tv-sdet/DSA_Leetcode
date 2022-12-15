package DSA_String;

import org.junit.Test;

public class ShuffleString {

	//1528. Shuffle String

	/*
	 * 
	 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
		Output: "leetcode"

		Input: s = "abc", indices = [0,1,2]
		Output: "abc"
		
		
		Pseudocode:
        convert s to character array arr
        traverse through index array
        for each index given in index array swap the element in arr
        convert the arr to string 
        finally return the output string
        
	 * 
	 * */

	@Test
	public void test()
	{
		String s="codeleet";
		int indices[]= {4,5,6,7,0,2,1,3};
		System.out.println(shuffleString_1(s,indices));
		System.out.println(shuffleString_2(s,indices));
	}

	private String shuffleString_2(String s, int[] indices) {
		
		char output[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			output[indices[i]]=s.charAt(i);
		}
		return new String(output);
	}

	private String shuffleString_1(String s, int[] indices)
	{
		char arr []=s.toCharArray();
	       for(int i=0;i<indices.length;i++)
	       {
	           arr[indices[i]]=s.charAt(i);
	       }

	       String output="";
	       for(int i=0;i<arr.length;i++)
	       {
	           output=output+arr[i];
	       }

	       return output;
	}
}
