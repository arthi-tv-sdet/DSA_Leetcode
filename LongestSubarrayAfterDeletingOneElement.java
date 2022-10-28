package DSA_Array;

import org.junit.Test;

public class LongestSubarrayAfterDeletingOneElement {

	/*1493. Longest Subarray of 1's After Deleting One Element
	 * 
	 * 
	 * Given a binary array nums, you should delete one element from it.
	 * 
	 * Return the size of the longest non-empty subarray 
	 * containing only 1's in the resulting array. Return 0 if there is no such subarray
	 * 
	 * Input: nums = [1,1,0,1]  Output: 3
	 * Input: nums = [0,1,1,1,0,1,1,0,1] Output: 5
	 * Input: nums = [1,1,1] Output: 2
	 * 
	 * 
	 * Pseudocode:
	 * 
	 * keep two pointers start and end and initialize 0 , count=1, maxLength=Integer.MIN_VALUE
	 * traverse through the array till end is less than length of array
	 * if right is 0 then reduce count and increment end till next zero
	 * if count is -1 then increment start 
	 * if counter value is 0 or 1 find maxLength(maxLength,end-start)
	 * 
	 *  
	*/
			private void LongSubArray(int[] nums)
			{
				int start=0,end=0,maxLength=Integer.MIN_VALUE,count=1;
				
				if(nums.length==0||nums.length==1)
					
					System.out.println(nums.length);
				
				if(nums.length>1)
					while(end<nums.length)
					{
						if(nums[end]==0)
						{
							count--;
						}
						if(count<0)
						{
							if(nums[start]==0)
							{
								count++; start++;
							}
						}
						if(count>=0&&count<=1)
							maxLength=Math.max(maxLength, end-start);
						end++;
					}
				System.out.println(maxLength);
			}
	
			@Test
			public void test1()
			{
				int nums[]= {1,1,0,1};
				LongSubArray(nums);
			}
			
			@Test
			public void test2()
			{
				int nums[]= {0,1,1,1,0,1,1,0,1};
				LongSubArray(nums);
			}
			
			@Test
			public void test3()
			{
				int nums[]= {};
				LongSubArray(nums);
			}
	 		
}
