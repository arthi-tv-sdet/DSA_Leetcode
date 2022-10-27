package DSA_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class MaxProd {

	
	private void MaxProd_BF(int nums[])
	{	
		
		ArrayList <Integer> numsL=new ArrayList<>( nums.length);
		for (Integer i : nums) {
			numsL.add(i);
		}
		
		Collections.sort(numsL);
		int maxProd=(numsL.get(numsL.size()-1)-1)*(numsL.get(numsL.size()-2)-1);
		System.out.println(maxProd);
	}
	
	@Test
	public void MaxProdPositive()
{
	int nums[]={3,4,5,2};
	MaxProd_BF(nums);
}
}
