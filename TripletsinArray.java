package DSA_Array;

import org.junit.Test;

public class TripletsinArray {

	/*
	 * 2367. Number of Arithmetic Triplets
	 * 
	 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

		i < j < k,
		nums[j] - nums[i] == diff, and
		nums[k] - nums[j] == diff.
		Return the number of unique arithmetic triplets.

		Input: nums = [0,1,4,6,7,10], diff = 3
		Output: 2
		Explanation:
		1, 2, 4) is an arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3.
		(2, 4, 5) is an arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. 
	 * 
	 * Psudocode:
	 * keep two pointers P1 and P2
	 * P1=start index and P2=P1+1;
	 * traverse through the array and find P2-P1
	 * declare a variable counter to increment if P2-P1=diff and increment P1 if P2[index]-P1[index]is greater than 2
	 * if P2-P1=diff and P2<=nums.length then increment counter and P2
	 * if P2-P1 is not equal to diff and P2<=nums.length and P1<= nums.length  increment P1 and P2
	 * return the counter value
	*/
	
		private void TripletsArray(int []nums,int diff)
		{
			int p1=0,p2=1,counter=0,dis=p2-p1;
			
			//while(p1<=nums.length-1 && p2<=nums.length-1 )
				for(int i=p1;i<=nums.length-1;i++)
					
			{
					for(int j=p2;j<=nums.length-1;j++)
					{
						
						if(nums[p2]-nums[p1]==3 && dis>2)
						{
							counter++;
							p2++;p1++;
						}
						else if (nums[p2]-nums[p1]==3 && dis<2)
						{
							counter++;p2++;
						}
					  else  if(nums[p2]-nums[p1]!=3 &&dis<2 )
					  { p1++;p2++;  }
					 // else  if(nums[p2]-nums[p1]!=3 &&dis>2 )
					 // { p2++;  }
						
				  	
			}
				
		}
				System.out.println(counter);
		}

		@Test
		public void Triplet1()
		{	int nums[]= {0,1,4,6,7,10},diff=3;
			TripletsArray(nums,diff);
		}
		
		@Test
		public void Triplet2()
		{	int nums[]= {4,5,6,7,8,9},diff=2;
			TripletsArray(nums,diff);
		}



}
