package DSA;

import java.util.Arrays;

import org.junit.Test;

public class ReverseArray2P {

	
	/*
	 * 
	 * 
	 * Pseudocode:
	 * have two points- start and end. where start = index 0 and end =length-1
	 * declare a temp variable to  store the element while swapping
	 * while(start is less than end)
	 * swap number-move start to temp, end to start and then temp to end
	 * increment the start and decrement the end after each swap
	 * print the array after swapping
	 * 
	 * Testcase
	 * 
	 * Positive
	 * input[]={1,2,3,4,5}
	 * output[]={5,4,3,2,1}
	 * 
	 * Negative
	 * input[]={} output[]={}
	 * 
	 * Edge
	 * 
	 * input[]={2,1,1,2} output[]={2,1,1,2}
	 
	 Time: O[N]
	 Space: O[1]
	 * 
*/
	private void reverseArray_2P(int num[])
	{
		int start=0,end=num.length-1,temp;
		while(start<end)
		{	temp=num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
		}System.out.println(Arrays.toString(num));
	}
	
	@Test
	public void reverseArrayPositive()
	{
		int num[]= {1,2,3,4,5};
		reverseArray_2P(num);
	}
	
	@Test
	public void reverseArrayNegative()
	{
		int num[]= {};
		reverseArray_2P(num);
	}
	@Test
	public void reverseArrayEdge()
	{
		int num[]= {2,1,1,2};
		reverseArray_2P(num);
	}
	}
