package DSA_Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrangeforGivenRange {

	/*
	 * input nums[]= {5,7,2,9,1,14,12,10,5,3}
	 * 
	 * arrange the given input array in below order:
	 * 1 to 3 --> should be in front
	 * 4 to 10 --> should be in middle
	 * 11 to 15 --> should be at last
	 * 
	 * total length 15
	 * 
	 * 
	 * 
	 * Pseudocode_BF:
	 * traverse through the nums array
	 * if nums[i] is less than or equal to 3-> add to temp1 list
	 * if nums[i] is >=4 and <=10 -> add to temp2 list
	 * if nums[i] is >=11 and <=15 -> add to temp3 list
	 * create a res array to combine all
	 * 
	 * 
	 * try 3 pointers algorithm for optimized solution
	 * Pseudocode_3 pointers:
	 * initialize three pointers low,mid,high
	 * if mid index value == low, swap low and middle and increment low and middle pointer by 1
	 * if mid index value == middle, increment middle pointer by 1
	 * if mid index value==high, swap high and middle and decrement high by 1
	 * break the loop when mid<=high 
	 * 
	 * 
	
	*/
	@Test
	public void test()
	{
		int nums[]= {5,7,2,9,1,14,12,10,5,3};
		arrangeRange_3P(nums);
		arrangeRange_3P(nums);
	}
	
	public void arrangeRange_3P(int nums[])
	{
		int low=0,mid=1,high=nums.length-1,temp=0;
		
		while(mid<=high)
		{
			if(nums[mid]<=3)
			{
				temp=nums[low];
				nums[low]=nums[mid];
				nums[mid]=temp;
				mid++;low++;
			}
			else
				if(nums[mid]>=4 && nums[mid]<=10)
				{
					mid++;
				}
				else
					if(nums[mid]>=11&&nums[mid]<=15)
					{
						temp=nums[high];
						nums[high]=nums[mid];
						nums[mid]=temp;
						high--;
										
					}
		}
		System.out.println(Arrays.toString(nums));
	}
	
	
	
	
	
	
	public void arrangeOrder(int nums[])
	{
		List<Integer> temp1=new ArrayList<>();
		List<Integer> temp2=new ArrayList<>();
		List<Integer> temp3=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<=3)
			{
				temp1.add(nums[i]);
			}
			else
				if(nums[i]>=4 && nums[i]<=10)
				{
					temp2.add(nums[i]);
				}
				else if(nums[i]>=11 && nums[i]<=15)
				{
					temp3.add(nums[i]);
				}
		}
		temp1.addAll(temp2);
		temp1.addAll(temp3);
		
		
		System.out.println(temp1);
		
		
	}
}
