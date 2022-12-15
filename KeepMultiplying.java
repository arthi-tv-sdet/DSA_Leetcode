class Solution {
    public int findFinalValue(int[] nums, int original) {
        /**Pseudocode:
        initialize a hashset and add all nums value
        Traverse through the array 
        if original value is in set multiply original by 2
        else return orignial
        */

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);

        }
        int i=nums.length;
        while(i>0)
        { if(set.contains(original))  
         original=2*original;
        
        else
        return original;

        }
       return original; 
    }
}
