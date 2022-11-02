package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class MajorityElement {

	/*
	 * 169. Majority Element
	 * 
	 * Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than n/2 times. You may
	 * assume that the majority element always exists in the array.
	 * 
	 * tc 1: Input: nums = [3,2,3] Output: 3
	 * 
	 * 
	 * 
	 * tc 2: Input: nums = [2,2,1,1,1,2,2] Output: 2
	 * 
	 * 
	 * Constraints:
	 * 
	 * n == nums.length 1 <= n <= 5 * 104 -109 <= nums[i] <= 109
	 * 
	 * 
	 * 
	 * Pseudocode- using HashMap
	 * 
	 * find the length of array n and len=n/2 create a hashmap with key as element
	 * and value as the occcurence count get the values of the map and compare the
	 * len if value is equal to len return the respective key
	 * 
	 * 
	 * Time Complexity: O[N]
	 * Space Complexity: O[N]
	 * 
	 */

	public void majorityElement(int nums[]) {
		int n = nums.length, len = n / 2;

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i <= nums.length - 1; i++) {
			hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
		}
		//System.out.println(hm);
		
		for (Entry<Integer,Integer> entry: hm.entrySet()) {
			
			if((entry.getValue()>len))
			{
				System.out.println(entry.getKey());
				break;
			}
		}
		  
		}
		 
	

	@Test
	public void test() {
		//int nums[] = { 3, 2, 3 };
		int nums[]= {2,0,1,0,0,0,2};
		majorityElement(nums);

	}
}
