package DSA;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Test;

public class Intersection {

	
	//349. Intersection of Two Arrays
	/*Given two integer arrays nums1 and nums2, 
	 * return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
	 * 
	 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
		Output: [2]
		
	 * Pseudocode:
	 * 
	 * traverse through each element of nums1 and nums2 and add it to set1 and 2
	 *if set 1 elements matches with set 2
   print the elements
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	*/
	
	
	private void intersectArray(int nums1[],int nums2[])
	{ 
		
		HashSet <Integer> temp1=new HashSet<>();
		HashSet <Integer> temp2=new HashSet<>();	
		for(int i=0;i<=nums1.length-1;i++)
		{
			temp1.add(nums1[i]);
		}
		for(int j=0;j<=nums2.length-1;j++)
		{
			temp2.add(nums2[j]);
				
		}
		if(temp1.retainAll(temp2))
			
		System.out.println(temp1);

	}


@Test
public void intersectArrayPositive()
{
	int nums1[]= {1,2,2,1}, nums2[]= {2,2}; intersectArray(nums1,nums2);
}

@Test
public void intersectArrayNegative()
{
	int nums1[]= {1,2,2,1}, nums2[]= {}; intersectArray(nums1,nums2);
}

@Test
public void intersectArrayEdge()
{
	int nums1[]= {0,3,9}, nums2[]= {1,2,2,1}; intersectArray(nums1,nums2);
}
}
