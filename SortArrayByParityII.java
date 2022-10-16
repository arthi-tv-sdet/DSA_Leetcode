package DSA;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayByParityII {


	/*
	 * Pseudocode traverse through the array find each element is even or odd if
	 * even add to even index of res array if odd add to odd index of res array
	 * 
	 */
	/*
	 * Testdata positive {4, 2, 5, 7} negative {} edge {3,3,2,2}
	 */

	private void sortArrayByParityII(int[] input) 
	{

		int res[] = new int[input.length];
		int count = 0;
		

		for( int i=0;i<=input.length-1;i++)
		{
			if(input[i]%2==0)
				{
					res[count] =input[i];
      //System.out.println(input[i]);      
					count=count+2;  
				}
			
		}
count=1;
	for(int j=0;j<=input.length-1;j++)
		{
			if(input[j]%2!=0)
				{ 
					res[count]=input[j];
					count=count+2;
				}
	
		}	
	
	System.out.println(Arrays.toString(res));
	}

	@Test
	public void sortArraybyParityIIPositive() {
		int input[] = { 4, 2, 5, 7 };
		sortArrayByParityII(input);
	}

	@Test
	public void sortArraybyParityIINegative() {
		int input[] = {};
		sortArrayByParityII(input);
	}

	@Test
	public void sortArraybyParityIIEdge() {
		int input[] = { 2, 3, 3, 2 };
		sortArrayByParityII(input);
	}
}
