package DSA_Array;

import org.junit.Test;

public class MaximumProductSubarray {

	/*152. Maximum Product Subarray
	 * 
	 * 152. Maximum Product Subarray
		Given an integer array nums, 
		find a contiguous non-empty subarray within the array that has the largest product, 
		and return the product.

	The test cases are generated so that the answer will fit in a 32-bit integer.

		A subarray is a contiguous subsequence of the array.

		Example 1:
		Input: nums = [2,3,-2,4]
		Output: 6
		Explanation: [2,3] has the largest product 6.

		Example 2:

		Input: nums = [-2,0,-1]
		Output: 0
		Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
	 * 
	 * 
	 * Pseudocode: 2 pointers
	 * initialize variables product=1,len=nums.length-1,p1=0,p2=0,maxProd=Integer.MIN_VALUE
	 * while p1&& p2 less than len
	 * find nums[p1]*nums[p2] and store in product
	 * maxProd=Math.max(maxProd,product)
	 * increment p2 till product if maxProduct is greater than 0 
	 * if product is less than 0 return product/nums[p2]
	 * if product is greater than 0 continue untill len
	 * return the product
	 *  
	 * Time: O[N]
	 Space: O[1]
	 */

	private void MaxProdSubArray(int nums[])
	{
		int p1=0,p2=1,len=nums.length,maxProd=Integer.MIN_VALUE,prod=1;
		if(len==1)
		{
			System.out.println(nums[p1]);
		}
		else if(len>1)
		while(p1<len&&p2<len)
		{
			prod=prod*nums[p1]*nums[p2];
			
			if(prod>0)
			maxProd=Math.max(maxProd, prod);
			
			if(maxProd>0)
				p2++;
		

		if(maxProd<0)
		{p1++;
		System.out.println(prod=prod/nums[p2]);
		}
		
	
		
		else
			System.out.println(maxProd);
		}
		
	}

	private int maxProd_fromEdges(int[] nums)
	{
		int len=nums.length,maxProd=Integer.MIN_VALUE,prod=1;
		
		
		for(int i=0;i<=len-1;i++)
		{
			prod=prod*nums[i];
			maxProd=Math.max(maxProd, prod);
			if(nums[i]==0)
			{
				prod=1;
			}
			
		}
		prod=1;
		for(int j=len-1;j>=0;j--)
		{
			prod=prod*nums[j];
			maxProd=Math.max(maxProd, prod);
			if(nums[j]==0)
			{
				prod=1;
			}
		}
		System.out.println(maxProd);	
		return maxProd;	}
	
	@Test
	public void test()
	{
		//int nums[]= {2,3,-2,4};
		//int nums[]= {-1,-2,3,-4}; //output=6
		int nums[]={1};

		maxProd_fromEdges(nums);
	}

}
