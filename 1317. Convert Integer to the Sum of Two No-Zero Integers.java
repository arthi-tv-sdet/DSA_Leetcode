class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        
        
        
      /*  Pseudocode:
       
       for given input n find the n-1 value
       find the quotient for given integer input n and n-1 values
       if quotient is not 0 return n and n-1
      
      
      */
        .java
        int m=n-1;
        
        int q1=n/10, q2=m/10;
        
        int output[]=new int[2];
        while(m<n&&m!=0&&n!=0)
        {
        if(q1||q2)
        if(q1!=0 &&q2!=0)
         output[0]=q1;
        output[1]=q2;
        
        return output;
        }
    }
    
}
