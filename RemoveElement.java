package DSA_Array;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class RemoveElement {

	/*
	27. Remove Element
	
	Pseudocode:
	sort the given array
	traverse through the array
	if nums[i]==val then nums[i]=""
	else increment i
	
	
	Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
	*/
	
	private void revmoveElement(int nums[], int val)
	{
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==val)
			{
				nums[i]= 0;
			}
			else if(nums[i]!=val)
			{
				i++;
			}
		
		
		}
		
		Collections.reverse(Arrays.asList(nums)); 
	        System.out.println(Arrays.toString(nums));
			
		
	}
	
	
	@Test
	public void removeElementPositive() {
		int nums[]= {3,2,2,3};
		int val=3;
		revmoveElement(nums,val);
	}
}
