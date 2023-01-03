package RetargetCommon;

import java.util.HashMap;

import org.junit.Test;

public class EqualityOfTwoArrays {

	
//	We will write Java code to find if two one dimensional arrays are equal. 
//	For this problem, two arrays will be equal if:-
//	1.  Lengths of both arrays are the same.
//	2. Both arrays contain the same element in the same order. 
//	I have tried to explain the logic in such a way that will help you to crack interviews
//	for SDET and Test Automation profiles. 
	
	/* for single dimensional arrays
	 * positive data:  arr1={1,2,3,4} arr2={1,2,3,4}
	 * negative data: arr1={1} arr2={1,2,3,4}
	 * edge: arr1={} arr2={}

	 * Pseudocode:bruteforce
	 * 	 * check if both arrays are of same length
	 * if yes proceed to check if each element is the same
	 * Time: O[N]
	 * space: O[1]
	 * 
	 * PSeudocode: Hashing
	 * use two hashmaps and get the index and the value of both arrays
	 * compare both maps and return boolean
	 * */
	
	@Test
	public void example1()
	{	
		int []arr1={1} ;int arr2[]={};
		System.out.println(findEqualArray_BF(arr1,arr2) );
		System.out.println(findEqualArray(arr1,arr2) );
		
	}
	@Test
	public void example2()
	{	
		int []arr1={1,2,3,4}; int arr2[]={1,2,3,4};
		
		System.out.println(findEqualArray_BF(arr1,arr2) );
		System.out.println(findEqualArray(arr1,arr2) );
		
		
	}
	private boolean findEqualArray(int[] arr1, int[] arr2) {
		
		if(arr1.length==0 || arr2.length==0)return false;
		if(arr1.length!=arr2.length)return false;
		else
		{
			HashMap<Integer,Integer> map1=new HashMap<>();
			HashMap<Integer,Integer> map2=new HashMap<>();
			
			for(int i=0;i<arr1.length;i++)
			{map1.put(i, arr1[i]);
			map2.put(i,arr2[i]);
		}
			if(map1.equals(map2))
				return true;
					return false;
	}}
	@Test
	public void example3()
	{	
		
		int arr1[]={1} ;int []arr2={1,2,3,4};
		
		System.out.println(findEqualArray_BF(arr1,arr2) );
		System.out.println(findEqualArray(arr1,arr2) );
	}


private boolean findEqualArray_BF(int[] arr1, int[] arr2) {
	if(arr1.length==0 || arr2.length==0)return false;
	if(arr1.length!=arr2.length)return false;
	else
	{
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
			return false;
		}
	}
	}
	return true;
}
}
