package Array_practise_Leetcode;

import java.util.Arrays;

import org.junit.Test;

public class RunningSum {

	
	/*
	 * 1480. Running Sum of 1d Array
	 * 
	 * Given an array nums. We define a running sum of an array as runningSum[i] =
	 * sum(nums[0]…nums[i]).
	 * 
	 * Return the running sum of nums.
	 * 
	 * Input: nums = [1,2,3,4] Output: [1,3,6,10]
	 * 
	 * Input: nums = [1,1,1,1,1] Output: [1,2,3,4,5]
	 * 
	 * Input: nums = [3,1,2,10,1] Output: [3,4,6,16,17]
	 * 
	 * 
	  
	 * Pseudocode:
	 * initialize output array of same length of num, count=0
	 * add the 0th index value to output
	 * traverse through the array
	 * for each value of i using another for loop2 find the sum of values from j till index 0
	 * store it to count
	 * assign count value to output[i]
	 * reset count to 0
	 * finally return the output array
	 * 
	 * Time complexity: O[N *M]
	 * Space complexity: O[N]
	 */
	@Test
	public void test1() {
		
		int nums[]= {1,2,3,4};
		runningSum(nums);
	}

	@Test
	public void test2() {
		
		int nums[]= {1,1,1,1,1};
		runningSum(nums);
	}
	
	@Test
	public void test3() {
		
		int nums[]= {3,1,2,10,1};
		runningSum(nums);
	}
	private void runningSum(int[] nums) {
		
		  int count=0;
	       int output[]=new int[nums.length];//O[N]
	       
	       output[0]=nums[0];
	        for(int i=1;i<=nums.length-1;i++)//O[N]
	        {   
	        		            
	            for(int j=i;j>=0;j--)//O[M]
	            {
	                count=count+nums[j];
	               output[i]=count;
	            }
	            
	            count=0;
	        }
	        System.out.println(Arrays.toString(output));
		
	}
	
}
