package DSA_Array;

import org.junit.Test;

public class SubarrayProdLessthanK {

	/*
	 * 713. Subarray Product Less Than K
	 * Given an array of integers nums and an integer k,
	 * return the number of contiguous subarrays 
	 * where the product of all the elements in the subarray is strictly less than k
	 * 
	 * Input: nums = [10,5,2,6], k = 100 
	 * Output: 8
	 * 
	 * Input: nums = [1,2,3], k = 0
	 * Output: 0
	 * 
	 * 
	 * 
	 * PSEUDOCODE: grow and shrink 2 pointers
	 * 
	 * 
	 * declare value for product=1,count=0, pointers start=0 end=0
	 * traverse through the array using for loop
	 * if nums[i] is less than K get the count of single element subarrays
	 * while end less than length of array find the product of end and increment
	 * while start and end product greater than or equal to K and start less than end 
	 * divide the start element from product
	 * find the difference between start and end and return
	*/
	
	
	private void subArraysLessthanK(int nums[],int k)
	
	{
		int product=1,indexCount=0,start=0,end=0;
		int len=nums.length;
		int count=Integer.MIN_VALUE;
		if(k!=0)
		{
		for(int i=0;i<len;i++)
		{ 
			if(nums[i]<k)
			indexCount++;
		}
		count=Math.max(indexCount, count);
		while(end<len)
		{
			product*=nums[end++];
			
		}
		count=Math.max(count, end);
		
		while(product>=k&& start<end)
		{
			product=product/nums[start];
			start++;
			indexCount=indexCount+end-start;
			
		}
		}
		count=Math.max(count, indexCount);
		System.out.println(count);			
		
	}
	
	
	
	/*
	 * private void subArraysLessthanK_BF(int nums[],int k) { int product=1,count=0;
	 * 
	 * for(int i=0;i<=nums.length-1;i++) { for(int j=1;j<=nums.length-1;j++) {
	 * product=nums[j]*nums[i]; if(product<k) count++; //else break; } }
	 * System.out.println(count); }
	 */
	
	@Test
	public void test()
	{
		int nums[]= {10,5,2,6};
		int k=100;
		subArraysLessthanK(nums,k);
		//subArraysLessthanK_BF(nums,k);
	}
	
	
	
}
