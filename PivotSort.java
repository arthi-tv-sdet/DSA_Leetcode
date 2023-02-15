package Mng_Session;

import java.util.Arrays;

import org.junit.Test;

public class ArrayPivot {

	/**
	 * Given an input integer array and a pivot number, keep all the array elements less than pivot at left side of array and all the elements greater than pivot at right side of array. Pivot is guaranteed to be in the array
eg: int[] arr = {9,5,12,10,14,3,10}; pivot=10
int[] output = {9,5,3,10,10,12,14};

test data:
int  [] arr={1,4,2,3,2} pivot=1  output={1,2,2,3,4}
int  [] arr={10,13,4,6,5} pivot=4 output={4,5,6,10,13}

Pseudocode:
set pointers i=0 j=length-1 and k=0 index
loop till k is less than equal to j
if k element is is less than given pivot swap k and i
increment k and i
if k is greater than pivot swap j and k and decrement j
if k and pivot are equal increment k
finally return arr

Time: O[N]
Space: O[1]


	 */
	
	
	@Test
	public void test()
	{
		int  [] arr={4,5,6,10,13};int  pivot=4 ;
		System.out.println(sortPivot(arr, pivot));
	}
	
	public String sortPivot(int arr[],int pivot)
	{
		
		int i = 0; // index of the first occurrence of pivot in the array
	    int j = arr.length - 1; // index of the last occurrence of pivot in the array
	    int k = 0; // current index being examined

	    while (k <= j) {
	        if (arr[k] < pivot) {
	            // swap arr[k] with arr[i] and move both indices
	            int temp = arr[k];
	            arr[k] = arr[i];
	            arr[i] = temp;
	            i++;
	            k++;
	        } else if (arr[k] > pivot) {
	            // swap arr[k] with arr[j] and move j index
	            int temp = arr[k];
	            arr[k] = arr[j];
	            arr[j] = temp;
	            j--;
	        } else {
	            // arr[k] == pivot, no swap needed, just move k index
	            k++;
	        }
	    }
		return Arrays.toString(arr);
}
}
