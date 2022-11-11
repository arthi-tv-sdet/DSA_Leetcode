package DSA_Practise;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class SumofUniqueElement {

	/*
	 * 1748. Sum of Unique Elements You are given an integer array nums. The unique
	 * elements of an array are the elements that appear exactly once in the array.
	 * 
	 * Return the sum of all the unique elements of nums.
	 * 
	 * testcase 1: Input: nums = [1,2,3,2] Output: 4
	 * 
	 * testcase 2: Input: nums = [1,1,1,1,1] Output: 0 
	 * 
	 * testcase 3: Input: nums = [1,2,3,4,5] Output: 15
	 * 
	 * Constraints:
	 * 1 <= nums.length <= 100
	 * 1 <= nums[i] <= 100
	 * 
	 * 
	 * Pseudocode:
	 * create a map to store each element in nums and its occurence, initialize sum=0
	 * traverse through the nums array and add key-element, value-its occurence
	 * traverse through map 
	 * if the value of each entry is ==1 add to sum
	 * return sum
	 * 
	 * Time: O[N+M]
	 * Space: O[N]
	 */
	
	@Test
	public void test()
	{
		//int nums[]= {1,2,3,2};
		//int nums[]= {1,1,1,1,1};
		int nums[]= {1,2,3,4,5};
		uniqueSum(nums);
	}

	private void uniqueSum(int[] nums) {
		
		int sum=0;
		HashMap<Integer,Integer> numMap=new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			numMap.put(nums[i],(numMap.getOrDefault(nums[i],0)+1));
		}
		
		for(Map.Entry<Integer, Integer> entry : numMap.entrySet())
		{
			if(entry.getValue()==1)
				sum=sum+entry.getKey();
		}
		System.out.println(sum);
	}
	
}
