package DSA_Array;

import java.util.Arrays;

import org.junit.Test;

public class MaxProdofTwoinArray {

	/*
	 * 1464. Maximum Product of Two Elements in an Array
	 * 
	 *  
	 * Input: nums = [3,4,5,2]
		Output: 12 
	 * 
	 * Pseudocode (brute force):
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
	 * Pseudocode: 2 pointers
	 * initialize 2 pointers start=0,end=1, maxProd=Integer.MIN_VALUE,product=1
	 * decrement 1 to value of start and end and find the product
	 * compare maxProd and product for each iteration and return the maxProd
	 * 
	*/
	
	
	private void MaxProdofTwoinArray_BF(int nums[])
	{
		if(nums.length!=0) {
			Arrays.sort(nums);
			int output= (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
			System.out.println("output:" +output);
		}
		else
			System.out.println("Empty array -could not find Max product");
	}
	
	private void MaxProdofTwoinArray_2P(int nums[])
	{
		int start=0,end=1,maxProd=Integer.MIN_VALUE,product=1,len=nums.length-1;
		
		if(nums.length!=0)
		{
		while(start<end && end <len && start<len)
			
		{
			product=nums[start]-- * nums[end]--;
			maxProd=Math.max(maxProd, product);
			start++; end++;
		}
		if(!(maxProd<=0))
		System.out.println("output : "+maxProd);
		else
			System.out.println("output : "+product);
		}
		
			else
		System.out.println("Empty array -could not find Max product");
				
				
	}


	
	@Test
	public void MaxProdNegative()
	{
		int nums[]={};
		///MaxProdofTwoinArray_BF(nums);
		MaxProdofTwoinArray_2P(nums);
	}
	
	@Test
	public void MaxProdEdge()
	{
		int nums[]={-1,-1};
	//	MaxProdofTwoinArray_BF(nums);
		MaxProdofTwoinArray_2P(nums);
	}
	
	@Test
	public void MaxProdPositive()
{
	int nums[]={3,4,5,2};
	//MaxProdofTwoinArray_BF(nums);
	MaxProdofTwoinArray_2P(nums);
}
}
