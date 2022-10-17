package DSA;

import java.util.Arrays;

import org.junit.Test;

public class SortArrayWoInbuiltMethod {

	
	//sort an integer array without using in-built method
	
	/*Psudeocode
	 * given array arr[5]={10,1,3,0,7}
	 * 
	 *1. traverse through the array using two loops(outer and inner for loop)
	 *2. compare arr[i] with arr[i+1] 
	 *3. if arr[i] is greater than arr[i+1] then swap it with temp variable
	 *4. return the sorted input array
	 * 
	 * 
	 * Testcases
	 * Positive {10,1,3,0,7} {-4,0,-10,-2,5,1}
	 * Negative  {}
	 * Edge {2,3,4,5}
	 * 
	 * 
	 */


 private void sortWOBuiltin(int[] arr)
 { int temp=0;
	 
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 for(int j=i+1; j<=arr.length-1;j++)
			 
		 {
			 if(arr[i]>arr[j])
				 {
				 temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
				 
				 }
			 
		 }
	 }
	 System.out.println(Arrays.toString(arr));
 }

 @Test
 public void sortWOBuiltinPositive()
 {
	 int arr[]= {10,1,3,0,7};
	 int arr1[]= {-4,0,-10,-2,5,1};
	 sortWOBuiltin(arr);	
	 sortWOBuiltin(arr1);	
 }

 @Test
 public void sortWOBuiltinNegative()
 {
	 int arr[]= {};
	 sortWOBuiltin(arr);
 }

 @Test
 public void sortWOBuiltinEdge()
 {
	 int arr[]= {2,3,4,5};
	 sortWOBuiltin(arr);
 }








}
