package DSA_Array;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	/*283. Move Zeroes
	 * 
	 * Given an integer array nums, move all 0's to the 
	 * end of it while maintaining the relative order of the non-zero elements.
	 * 
	 * Note that you must do this in-place without making a copy of the array.
	 * 
	 * Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
		
		Pseudocode- 2 pointer
		1. traverse through the array
		2. take two pointers p1=index 0 and p2=p1+1)
		3. if p1 or p2 is 0 swap, increment p1 and p2
		4. else if p1 and p2 are 0 increment p2
		5. return the array
		
		Time: O[N]
		Space: O[1]
		*/
	
	private void moveZeros(int nums[])
	{
		int p1=0,p2=1;
			
		while(p1<=nums.length-1 && p2<=nums.length-1&& nums[p2]!=0)
		{
			
			if(nums[p1]==0 &&nums[p2]!=0 || nums[p1]!=0 && nums[p2]==0)
			{
				int temp=nums[p1];
				nums[p1]=nums[p2];
				nums[p2]=temp;
				p1++;p2++;
				
			}
			else if(nums[p1]!=0&&nums[p2]!=0)
			{
				p2++;
			}
			else if(nums[p1]==0 && nums[p2]==0)
			{
				p2++;
			}
			
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	
	@Test
	public void movezeroPositive()
	
	{
		//int nums[]= {0,1,0,3,12};
		//int nums[]= {0,2,3,0};
		//int nums[]= {0};
		int nums[]= {1,0};
		moveZeros(nums);
	}
	
	
	   
    }

