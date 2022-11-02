package Hash;

import java.util.HashSet;

import org.junit.Test;

public class ContainsDuplicateII {

	
	
	/*
	 * 219. Contains Duplicate II
	 * 
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * tc 1:
	 * 
	 * Input: nums = [1,2,3,1], k = 3 Output: true 
	 * 
	 * tc 2:
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true 
	 * 
	 * tc 3:
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105
	 *  -109 <= nums[i] <= 109 
	 *  0 <= k <= 105
	 * 
	 * 
	 * Pseudocode:
	 * create a set
	 * traverse through each element in nums using two for loops i and j
	 * if nums[i]==nums[j] and less abs{i-j) less than equal to k 
	 * add nums[i] to set
	 * if set is not empty return true
	 * else return false
	 * 
	 */
	
	
	public void containsDuplicateII(int nums[],int k)

	{	HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<=nums.length-1;i++)
		{
			for(int j=i+1;j<=nums.length-1;j++)
			{
				if(nums[i]==nums[j]&&Math.abs(i-j)<=k)
				{
					hs.add(nums[i]);
				}
				
			}
				}
		if(!hs.isEmpty())
			System.out.println("True");
		else
			System.out.println("False");
	}

	@Test
	public void test()
	{
		//int nums[]= {1,2,3,1};
		//int nums[]= {1,0,1,1};
		int nums[]= {1,2,3,1,2,3};
		int k=2;
		containsDuplicateII(nums,k);
	}
	
	
}
