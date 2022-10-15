package DSA;

import java.util.Arrays;

public class SortArrayByParity {
	
     //Pseudocode
	  //traverse through the array
    //find each element is even or odd
    //if even add to res array and increment the count
    //if odd add to res  array and increment the count
	    

	public static void main(String[] args) {
		
		int input[]={3,1,2,4};

		
int res[]=new int[input.length];
int count=0;
		for( int i=0;i<=input.length-1;i++)
		{
		if(input[i]%2==0)
		  {
		     res[count] =input[i];
		      //System.out.println(input[i]);      
		      count++;  
		  }}
		
		for(int j=0;j<=input.length-1;j++)
		{
			if(input[j]%2!=0)
			{
			res[count]=input[j];
			count++;
		}

	}	System.out.println(Arrays.toString(res));
}
}


