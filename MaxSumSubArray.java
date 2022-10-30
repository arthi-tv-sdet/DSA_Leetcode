package kandaneAlgorithm;

import org.junit.Test;

public class MaxSumSubArray {

	/* given int array - find the maximum sum of contiguous subarray
		algorithm to solve maximum sum sub array-Kandane
		
		input nums=[-2,1,-3,4,-1,2,1,-5,4] output= 6 [4,-1,2,1]
		
		Condition-> if the sum is less than or equal to zero reset the window sum as 0
		Time Complexity= O[N]
		Space complexity= O[1]
		
		Pseudocode:
		1.Initializing maximum as 0 and currentMaximum as 0 
		2.Loop 0 to end of the length
		3.If currentMaximum length is less than zero, reset currentMaximum as 0
		4.If currentMaximum is greater than or equal to zero, add the current index value to currentMaximum 
		5.Assign maximum with max of maximum and currentMaximum
		
		
		******************************************************************
		*Kandane will not work for array having all the numbers as negative integers
		
		*There should be atleast one zero or a positive number
		*******************************************************************
	*/
	
	private void maxSumSubArray_Kandane(int nums[])
	{
		int max=0,currentMaximum=0;
		for(int i=0;i<=nums.length-1;i++)
		{
			currentMaximum=currentMaximum+nums[i];
			if(currentMaximum<0)
				currentMaximum=0;
			max=Math.max(currentMaximum, max);
		}
		System.out.println(max);
	}
	
	@Test
	public void test()
	{
		//int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
		int nums[]= {-2,-1,-3,-4,-1,-2,-1,-5,-4};
		maxSumSubArray_Kandane(nums);
	}
	
	
}
