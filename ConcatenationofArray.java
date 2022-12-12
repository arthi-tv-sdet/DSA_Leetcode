package Array_practise_Leetcode;

import java.util.Arrays;

import org.junit.Test;

public class ConcatenationofArray {

	/*
	 * 1929. Concatenation of Array
	 * 
	 * Given an integer array nums of length n, you want to create an array ans of
	 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n
	 * (0-indexed).
	 * 
	 * Specifically, ans is the concatenation of two nums arrays.
	 * 
	 * Return the array ans.
	 * 
	 * Input: nums = [1,2,1] Output: [1,2,1,1,2,1]
	 * 
	 * 
	 * Input: nums = [1,3,2,1] Output: [1,3,2,1,1,3,2,1] 
	 * 
	 * Constraints:
	 * 
	 * n == nums.length; 1 <= n <= 1000 ;1 <= nums[i] <= 1000
	 * 
	 * Pseudocode:
	 * initialize n=nums.length,create a new array ans of length 2*n
	 * traverse through array 
	 * for each iteration assign nums[i] to ans[i] and ans[i+n]
	 * return ans array
	 */
	
	@Test
	public void test1()
	{
		int nums[]= {1,2,1};
		concatenationofArrays(nums);
	}
	
	@Test
	public void test2()
	{
		int nums[]= {1,3,2,1};
		concatenationofArrays(nums);
	}

	private void concatenationofArrays(int[] nums) {
		
		int n=nums.length;
		int ans[]=new int[2*n];
		
		for(int i=0;i<nums.length;i++)
		{
			ans[i]=nums[i];
			ans[i+n]=nums[i];
		}
		System.out.println(Arrays.toString(ans));
	}
}
