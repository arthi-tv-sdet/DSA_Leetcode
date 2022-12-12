package Algorithms;

import java.util.Arrays;

import org.junit.Test;

public class sortArray {

	@Test
	public void test()
	{
		int nums[]= {3,6,2,1,-7};
		System.out.print(Arrays.toString(sortArray_sel(nums)));
		System.out.println(sortArray_bubble(nums));
	}

	

	private int[] sortArray_sel(int[] nums) {
		
		for(int i=0;i<nums.length-1;i++)
		{int piv=i;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[j]<nums[piv])
					piv=j;
			}
			
			if(piv!=i)
			{
				int temp=nums[piv];
				nums[piv]=nums[i];
				nums[i]=temp;
			}
		}
		return nums;
	}



	private int[] sortArray_in(int[] nums) {
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length;j++)
				{
				int index=j;
				
				}
				
					
			
		}
		return nums;
	}



	private int[] sortArray_bubble(int[] nums) {
		for(int i=0;i<nums.length;i++)
		{
			for(int j=1;j<nums.length-i;j++)
			{
				if(nums[j-1]>nums[j])
				{
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		
		return nums;
	}



	private int [] sortArray_as(int[] nums) {
	
			int p1=0,p2=p1+1;
			while(p1<p2 && p2<nums.length)
			{
				if(nums[p2]<nums[p1])
				{
					int temp=nums[p1];
					nums[p1]=nums[p2];
					nums[p2]=temp;
					p1++;
					p2++;
				}
				else
				{
					p1++;p2++;
				}
				
			}
		return nums;
		
	}
	
	private int [] sortArray_bf(int[] nums) {
		
		for(int i=0;i<=nums.length-2;i++)
		{
			for(int j=i+1;j<=nums.length-1;i++)
			{
				if(nums[j]<nums[i]) 
				{
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
			
		}
	return nums;
	
}

	
	
	
}
