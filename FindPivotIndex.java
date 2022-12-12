class Solution {
    public int pivotIndex(int[] nums) {
        


        /**
        
        https://leetcode.com/problems/find-pivot-index/
        
        Pseudocode:
        
        declare totalsum,windowsum variables
        traverse through nums and add all the nums and store in totalsum
        in another loop remove each number from total sum and check if window sum and total sum are equal
        if both are equal return the index value
        if no index return -1
        
        Time: O[N]
        Space: O[1]
         */
//total sum ,window sum
         
 int totalsum=0,windowsum=0;
 for(int i=0;i<nums.length;i++)
 {
     totalsum=totalsum+nums[i];
 }

 for(int i=0;i<nums.length;i++)
 { totalsum=totalsum-nums[i];
     
     if(totalsum==windowsum)

     return i;

     windowsum=windowsum+nums[i];
 }

         

         return -1;
    }
}
