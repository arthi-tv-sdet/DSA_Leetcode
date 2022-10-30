package DSA_Array;

import java.util.Arrays;

import org.junit.Test;

public class ArraySortDutchFlag {

	
	/*
	 * 	Given an array which contains inly 0,1 and 2. Sort the array in non-decreasing order
		Input: int arr={1,2,0,1,2};  
		Output: {0,1,1,2,2}
	 * 
	 *  
	 * 
	 * 
	 * Pseudocode- Dutch flag or 3 pointers Algorithm- sort in ascending order
	 * 	1.Initialize low=0, middle=0 and high=arr.length-1
		2.If the arr[middle] is 0, swap middle and low values and increment both pointer
		3.If the arr[middle] is 1, increment middle  pointer
		4.If the arr[middle] is 2, swap middle and high values and decrement high pointer
		5.Break the loop when middle<=high
		
		
	*	Pseudocode- Dutch flag or 3 pointers Algorithm- sort in descending order
	 * 	1.Initialize low=0, middle=0 and high=arr.length-1
		2.If the arr[middle] is 2, swap middle and low values and increment both pointer
		3.If the arr[middle] is 1, increment middle  pointer
		4.If the arr[middle] is 0, swap middle and high values and decrement high pointer
		5.Break the loop when middle<=high
		
		 
	 *  
	*/
	
	
	private void sortarray_Ascending(int nums[])
	{
		int p1=0,p2=1,p3=nums.length-1;
		
		while(p2<=p3)
		{
			//if(nums[p2]==0)
			if(nums[p2]==2) //for descending
			{
				int temp=nums[p2];
				nums[p2]=nums[p1];
				nums[p1]=temp;
				p1++;p2++;
			}
			else
			if(nums[p2]==1) p2++;
			else
			//if(nums[p2]==2)//
				if(nums[p2]==0) //for descending
			{
				int temp=nums[p3];
				nums[p3]=nums[p2];
				nums[p2]=temp;
				p3--;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	private void sortarray_descending_traversal(int nums[])
	{
		int p1=nums.length-1,p2=1,p3=0;
		
		while(p3<=p1)
		{
			if(nums[p2]==0)
			{
				int temp=nums[p2];
				nums[p2]=nums[p3];
				nums[p3]=temp;
				p3++;p2++;
			}
			else
			if(nums[p2]==1) p2++;
			else
			if(nums[p2]==2)
			{
				int temp=nums[p1];
				nums[p1]=nums[p2];
				nums[p2]=temp;
				p1--;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	
	@Test
	public void input()
	{
		int nums[]= {1,2,0,1,2};
		//sortarray_Ascending(nums);
		sortarray_descending_traversal(nums);
	}
}
