package DSA_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Test;

public class FindAllNumbersDisappearedinanArray {

	/*
	 * 448. Find All Numbers Disappeared in an Array
	 * 
	 * Given an array nums of n integers where nums[i] is in the range [1, n],
	 * return an array of all the integers in the range [1, n] that do not appear in
	 * nums.
	 * 
	 * Testdata 1: nums = [4,3,2,7,8,2,3,1] Output: [5,6]
	 * 
	 * Testdata 2: ums=[1,1] output=[2]
	 * 
	 * Pseudocode:Bruteforce
	 * initialize  arrrayList nums,res, counter =0 n=nums.length
	 * traverse through the array and add all in numList
	 * for each increment of counter check if the value is present in nums
	 * add to res of the number is not present
	 * return the arraylist  res
	 * 
	 * Pseudocode: Using HashSet
	 * Add the given nums array in a numSet
	 * traverse through the set for each count if not in set 
	 * add in res list
	 * return res list
	 */
	@Test
	public void test()
	{
		int nums[]= {4,3,2,7,8,2,3,1};
		int nums1[]= {1,1};
		numsDisappeared_BF(nums);
		numsDisappeared(nums1);
	}

	private void numsDisappeared_BF(int[] nums) {

		ArrayList<Integer> numList=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		int n=nums.length,count=1;

		for(int i=0;i<n;i++)
		{
			numList.add(nums[i]);

		}
		//System.out.println(numList);
		for(int i=count;count<=n;count++)
		{
			if(!numList.contains(count))
			{
				res.add(count);
			}
			
		}
		System.out.println(res);
	}

	private void numsDisappeared(int[] nums) {

			ArrayList<Integer> res=new ArrayList<>();
			HashSet<Integer> numsSet=new HashSet<>();
			int count=1,n=nums.length;
			
			for(int i=0;i<nums.length;i++)
			{
				numsSet.add(nums[i]);
			}
			for(int j=count;count<=n;count++)
			{
				if(!numsSet.contains(count))
				{
					res.add(count);
				}
			}
		System.out.println(res);
	}
}
