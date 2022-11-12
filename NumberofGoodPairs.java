package DSA_Array;

import org.junit.Test;

public class NumberofGoodPairs {

	
	
	
	/*
	 * 1512. Number of Good Pairs
	 * 
	 * Given an array of integers nums, return the number of good pairs.
	 * 
	 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
	 * 
	 * 
	 * Testcases: 
	 * 
	 * Positive: Input: nums = [1,2,3,1,1,3] Output: 4
	 * 
	 * Negative: Input: nums = [1,2,3] Output: 0
	 * 
	 * Edge: 	Input: nums = [1,1,1,1] Output: 6
	 * 
	 * 
	 * Pseudocode: BruteForce
	 * 
	 * declare a variable count
	 * traverse through the array with 2 for loops i and j
	 * compare each nums[i] to nums[j]
	 * if both are equal increment count
	 * 
	 
	 Time: O[N]
	 Space:O[1]
	 
	 */
			private void goodPairs(int nums[])
			{
				int count=0;
				for(int i=0;i<=nums.length-1;i++)
				{
					for(int j=i+1;j<=nums.length-1;j++)
					{
						if(nums[i]==nums[j])
							count++;
					}
				}
				System.out.println(count);
			}
			
			@Test
			public void test1()
			{
				int nums[]={1,2,3,1,1,3};
				goodPairs(nums);
			}
			
			@Test
			public void test2()
			{
				int nums[]={1,2,3};
				goodPairs(nums);
			}
	
			@Test
			public void test3()
			{
				int nums[]={1,1,1,1};
				goodPairs(nums);
			}
	
}
