package DSA_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class IntersectionII {

	/*
	 * 350. Intersection of Two Arrays II
		
		Given two integer arrays nums1 and nums2, return an array of their intersection.
		 Each element in the result must appear 
		 as many times as it shows in both arrays
		  and you may return the result in any order
		  
		  positive
		  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
			Output: [4,9]
			
			negative
			input: nums1=[] nums2[]
			output=[]
			
			Edge
			input: nums1=[0,3,5] nums2=[2,4,9] output=[]
			
		  PSEUDOCODE:
		  1. create a result  list
		  2. add elements of nums2 in another num2l list
		  3. iterate over nums1
		  4. if nums2l contains the nums1 element
		  5. add to result list	  
		  
	*/
	
		private void intersectionII(int []nums1,int []nums2)
	
		{
			List <Integer> numL1=new ArrayList<>();
			List <Integer> numL2=new ArrayList<>();
			
	        
	        
			for(int i=0;i<=nums2.length-1;i++)
			{
				numL1.add(nums2[i]);
			}
			for(int i=0;i<=nums1.length-1;i++)
				
			{
				if(numL1.contains(nums1[i]))
				{
					numL2.add(nums1[i]);
					
				}
			}
						
			
					System.out.println((Arrays.toString(numL2.toArray())));
					
		}

		
		@Test
		public void positive()
		{
			//int nums1[]= {4,9,5}, nums2[]= {9,4,9,8,4};
			int nums1[]= {1,2,2,1}, nums2[]= {2,2};
			intersectionII(nums1,nums2);
		}
		
		@Test
		public void Negative()
		{
			int nums1[]= {}, nums2[]= {};
			intersectionII(nums1,nums2);
		}
		
		@Test
		public void Edge()
		{
			//int nums1[]= {1}, nums2[]= {};
			int nums1[]= {0,3,5},nums2[]= {2,4,9};
			intersectionII(nums1,nums2);
		}
		
		
}

