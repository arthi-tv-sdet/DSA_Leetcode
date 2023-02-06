package Medium;

import org.junit.Test;

import junit.framework.Assert;

public class MaxProductSubArray {

	//152. Maximum Product Subarray

	/*Pseudocode:

		declare temp=1,max=integer minimum
		traverse from 0 to length-1
		multiply temp and nums[i]
		every iteration find max of max and temp
		if product is 0 set temp as 1
		traverse from back and follow above steps till 0
		finally return max
		
		Time: O[N]
		space:O[1]
		
		*/
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
		int nums[]= {2,3,-2,4};
		System.out.println(maxProd(nums));
		Assert.assertEquals(maxProd(nums), 6);
	}
	
	@Test
	public void test2()
	{
		int nums[]= {-2,0,-1};
		System.out.println(maxProd(nums));
		Assert.assertEquals(maxProd(nums), 0);
	}
	
	private int maxProd(int nums[]) {
		
		int max=Integer.MIN_VALUE,temp=1;
		for(int i=0;i<nums.length;i++)
		{
		    temp=temp*nums[i];
		    max=Math.max(temp,max);
		   
		   if(temp==0)
		   temp=1;
		    
		}
		temp=1;
		for(int i=nums.length-1;i>=0;i--)
		{
		    temp=temp*nums[i];
		    max=Math.max(temp,max);
		    if(temp==0)
		   temp=1;
		}
		return max;
		
		
		

	}
	
}
