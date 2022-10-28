package DSA_Array;

import java.util.Arrays;

import org.junit.Test;

public class ShuffleArray {

	/* 1470. Shuffle the Array
	 * 
	 * Pseudocode:2 pointers
	 * 
	 * Input: nums = [2,5,1,3,4,7], n = 3
	 *	Output: [2,3,5,4,1,7] 
	 * 
	 * given array with 2n elements
	 * take two pointers p1=0 and p2=len/2
	 * traverse through array while p1 and p2 <len
	 * declare a temp variable to hold p1
	 * swap the p1 with p2
	 * again swap p2 to p1
	 * increment p1 and p2
	 * return nums array
	 * 
	 * 	
	 * Pseudocode: using new array of length 2N
	 * create a new array of length 2n
	 * initialize pointers p1=0,p2=n+1 and i for new array res
	 * traverse through the given array nums using while loop
	 * insert into res array for each iteration from p1 to n
	 * insert into res array for each iteration from p2 to length-1
	 * 
	*/
	
	
	private void  ShuffleArray_newArray(int[] nums,int n) 
	
	{
		int res[]=new int[2*n], p1=0,p2=n,i=0;
		
		while(p1<n)
		{
			res[i]=nums[p1];
			i++;p1++;
			res[i]=nums[p2];
			i++;p2++;
			
		}
		
		System.out.println(Arrays.toString(res));
		
	}
	
	

	private void ShuffleArray_2p(int[] nums, int n) {
		
		int len=nums.length,p1=1,p2=n;
		
		while(p1>=1&&p2<=len-2)
		{
			int temp=nums[p1];
			nums[p1]=nums[p2];
			nums[p2]=temp;
			p1--;
			p2++;
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	@Test
	public void shuffleArrayPositive()
	{	
		int nums[]= {2,5,1,3,4,7}, n=3;
		ShuffleArray_newArray(nums,n);
		//ShuffleArray_2p(nums,n);
	}
}

