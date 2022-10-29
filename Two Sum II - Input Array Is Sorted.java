class Solution {
    public int[] twoSum(int[] numbers, int target) {
     
        /*Psudeocode:
        
        traverse through the given array
        find the sum each value
        if the sum is equal to target value 
        return indeces
            
        
        
        2 pointers
        
        initialize two pointers left =0 right =numbers.length-1
        while left and right are less than length
        find the sum of left and right
        if sum is less than target left ++
        if sum is greater than right --
        if equal to target return the left+1 and right  index
        */
    
        int output[]=new int[2];
        int  sum=0,left=0, right=numbers.length-1, len=numbers.length;
        while(left<len && right>0)
        {
          
            sum= numbers[left]+numbers[right];
            if(sum<target) left++;
            
            if(sum>target) right--;
           
            if(sum==target)
            {
               output[0]=left+1;
               output[1]=right+1;
        return output;
        }
          
        }
       
        return output;
       
        
        
        
    }
}
