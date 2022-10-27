package DSA_Array;

import org.junit.Test;

public class MaxConsecOnesIII {

	/*1004. Max Consecutive Ones III
	 * 
	 * Given a binary array nums and an integer k, 
	 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
	 * 
	 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
	 * Output: 6 
	 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
	 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
	 * 
	 * 
	 * Pseudocode:
	 * 
	 * declare count=0 start=0,len=nums.length,maxCount=Integer.MIN_VALUE
	 * while loop 1 traverse through the array in loop till k
	 * while loop2 traverse from k to length of array 
	 * while start is less than k and nums[start]!=0 count++
	 * find Math.max(count,maxCount
	 * while start > k and less than len and nums[start]!=0 count++
	 * else nums[start++]
	 * find Math.max(count,maxCOunt)
	*/
	
	
	

	private void MaxConsOnes(int[] nums, int k) {
		int count=0,maxCount=Integer.MIN_VALUE,start=0,len=nums.length;
		
		while(start<k)
		{
			if(nums[start]!=0)
				start++;count++;
		}
		maxCount=Math.max(count, maxCount);
		
		while(start>k&&start<len)
		{
			if(nums[start]!=0)
				start++;
				count++;
			
		}
		maxCount=Math.max(maxCount, count);
		System.out.println(maxCount);
	}
	
	@Test
	public void test()
	{
		int nums[]= {1,1,1,0,0,0,1,1,1,1,0},k=2;
		MaxConsOnes(nums,k);
	
}
}
