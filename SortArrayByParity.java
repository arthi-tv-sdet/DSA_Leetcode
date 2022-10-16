package DSA;

import java.util.Arrays;

import org.apache.poi.hpsf.Array;
import org.junit.Test;
//905. Sort Array By Parity
public class SortArrayByParity {
	
	/*Pseudeocode:
	 * traverse through the array 
	 * find each element is even or odd 
	 * if even add  to res array and increment the count
	 * if odd add to res array and increment the count
	 * print the res array
	 * 
	 * 
	 * 
	 * Test cases:
	 * Positive {3,1,2,4}
	 * Negative {}
	 * Edge {1,1,1,1}
	 */	    

	private void sortArrayByParity(int []input) 
	{
			
			int res[]=new int[input.length];
			int count=0;
			for( int i=0;i<=input.length-1;i++)
				{
					if(input[i]%2==0)
						{
							res[count] =input[i];
		      //System.out.println(input[i]);      
							count++;  
						}
					
				}
		
			for(int j=0;j<=input.length-1;j++)
				{
					if(input[j]%2!=0)
						{
							res[count]=input[j];
							count++;
						}
			
				}	
			
			System.out.println(Arrays.toString(res));
			//return res;
	}
	
	@Test
	public void sortArrayByParityPositive()
	{
		int input[]={3,1,2,4};
		
		sortArrayByParity(input);
	}
	
	@Test
	public void sortArrayByParityNegative()
	{
		int input[]={};
		
		sortArrayByParity(input);
	}
	
	@Test
	public void sortArrayByParityEdge()
	{
		int input[]={1,1,1,1};
		
		sortArrayByParity(input);
	}
	
}


