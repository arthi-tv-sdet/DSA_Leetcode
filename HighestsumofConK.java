package DSA_Array;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class HighestsumofConK {

	/* find the highest sum of consecutive K 
	 * Pseudocode

1. traverse through the array
2. keep three points p1=0,p2=k index resp
3. add the values in p1,p2 till k
4. from k to len add the nums
5. compare the maxSum values and return
	 * 
	 * 
	 * input nums=[1,5,2,3,7,1] k=3 output=12
	 * input nums=[1,4,3] k=2 output=7
	 * input nums=[] k=3 output =[]
	 * 
	 
	 Time: O[N]
	 Space:O[1]
	 */
	
	private int sumOfConsK(int nums[],int k)
	{
		int maxSum=Integer.MIN_VALUE,p=0,sum=0; //O[1]
			
		if (nums!=null && nums.length>1)
		{
			while(p<k-1)//O[N]
			{
				sum+=nums[p++];
			}
			
			while(p<nums.length)
			{
				
				sum=sum+nums[p];
				p++;
				maxSum=Math.max(sum,maxSum);
				sum=sum-nums[p-k];
				
			}
			System.out.println(maxSum);
			
		}
		return maxSum;
	}
	
	
	
	@Test
	public void PositiveTest()
	{
	int nums[]= {1,5,2,3,7,1};
	int k=3;
	sumOfConsK(nums,k);
	}
	
	@Test
	public void NegativeTest()
	{
	
	int nums[]= {};
	int k=2;
	sumOfConsK(nums,k);
	
	}
	

}
