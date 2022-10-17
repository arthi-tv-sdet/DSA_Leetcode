package DSA;

import java.util.Arrays;

import org.junit.Test;

public class MaxProdofTwoinArray {

	/*
	 * 1464. Maximum Product of Two Elements in an Array
	 * 
	 * Pseudocode:
	 * 
	 * Input: nums = [3,4,5,2]
		Output: 12 
	 * 
	 * 
	 * sort the given array
	 * i=num[length-1] j=num[length-2]
	 * return the value of (i-1)*(j-1)
	 * 
	 * 
	 * Testcases
	 * 
	 * Positive: {3,4,5,2} ---> output: 12
	 * Negative: {} -----> output: 
	 * Edge: {5,5,5,5}---> output: 16
	 * 
	 * 
	*/
	
	
	private void MaxProdofTwoinArray(int nums[])
	{
		if(nums.length!=0) {
			Arrays.sort(nums);
			int output= (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
			System.out.println("output:" +output);
		}
		else
			System.out.println("Empty array -could not find Max product");
	}
	
	
	
	@Test
	public void MaxProdNegative()
	{
		int nums[]={};
		MaxProdofTwoinArray(nums);
	}
	
	@Test
	public void MaxProdEdge()
	{
		int nums[]={5,5,5,5};
		MaxProdofTwoinArray(nums);
	}
	
	@Test
	public void MaxProdPositive()
{
	int nums[]={3,4,5,2};
	MaxProdofTwoinArray(nums);
}
}
