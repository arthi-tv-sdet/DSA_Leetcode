package DSA;

import java.util.Arrays;

import org.junit.Test;

public class findArrayIndexforTargetSum {

	public static void main(String args[]) {
		
		/*
	     * Psuedocode:
	     * 
	     * 0) validation: check array size.. if it is less than 2, return empty array 
	     * 1) traverse through array from 0 to n-1 index
	     * 2) add the indice values and 
	     * 3) compare against the target
	     * 4) If it matches, store the start - end index
	     * 5) Else, continue 
	     * 6) Finally, return the last matching index !!
	     * 7) If there are no matches --> then return empty array !!
	     * 
	     */
		
		int[] input= {3,4,5,6};
		int target=11;
		int sum=0;
		int size=input.length;
	
		{
			for(int i=0;i<=size-1;i++)
			{
				for (int j=i+1;j<=size-1;j++)
				 {sum=input[i]+input[j];
				
				if(sum==target)
				{
					System.out.println(Arrays.toString( new int[] {i,j}) ); 
					
				}
			}
		}
	
	}
		
	
	}}

