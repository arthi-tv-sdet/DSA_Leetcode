package Mng_Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class UniqueArray {

	
	
	/*Given three integer arrays arr1, arr2 and arr3 sorted in strictly increasing order, 

	return a sorted array of only the integers that appeared in all three arrays.


	Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]
	Output: [1,5]
	Explanation: Only 1 and 5 appeared in the three arrays.


	test data:

	ar1=[1,2,3] ar2=[2] ar3[3,4] output=[]
	ar1=[1,2,3,5] ar2=[1,2,4,5] ar3=[3,4] output=[]
	ar1=[1,2] ar2=[1,2] ar3=[1,2,3] output=[1,2]
	ar1=[1,2] ar2=[1,2] ar3=[1,2] output=[1,2]

	Pseudocode:
	create three set and add respective arrays
	using the retain all 

	Time: O[N]
	Space: O[N]
*/
	@Test
	public void test1()
	{
	int ar1[]={1,2,3};
	int [] ar2={2} ;
	int ar3[]={3,4} ;//output=[]        //[1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

	System.out.println(Arrays.toString(findUnion(ar1,ar2,ar3)));;
	}
	
	@Test
	public void test2()
	{
	int ar1[]={1,2};
	int [] ar2={1,2,4,5} ;
	int ar3[]={1,2} ;
	System.out.println(Arrays.toString(findUnion(ar1,ar2,ar3)));;
	}

	public int[] findUnion(int ar1[],int ar2[],int ar3[])
	{
		
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        Set<Integer> set3 = new HashSet<>();
	        
	        for (int num : ar1) set1.add(num);
	        for (int num : ar2) set2.add(num);
	        for (int num : ar3) set3.add(num);
	        
	        set1.retainAll(set2);
	        set1.retainAll(set3);
	        
	        int[] result = new int[set1.size()];
	        int i = 0;
	        for (int num : set1) {
	            result[i++] = num;
	        }
	        
	        Arrays.sort(result);
	        return result;
	    }


}
