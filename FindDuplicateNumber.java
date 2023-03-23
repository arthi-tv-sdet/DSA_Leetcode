class Solution {
    public int findDuplicate(int[] nums) {
        
        /*
        create a hash set= add each nums [i] in the set
        if set.add is returning false then return that nums[i]
        
        Time: O[N]
        space: O[N] 
        
        */
        
        
        //solution with hashset
        
       /* HashSet<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            if(!set.add(n))
                return n;
        }
        return 0;
        */
        
        
        /*
        using constant space:
        sort the nums array
        p1=0 p2=1 compare p1 and p2 values in nums
        if both are equal return p1 value
        else increment p1 and p2
        continue till p1 is less than p2 
        
        Time: O[NlogN]
        space:O[N]
        */
        
       /* Arrays.sort(nums);
        int p1=0,p2=1;
        while(p1<p2)
        {
            if(nums[p1]==nums[p2])
                return nums[p1];
            else
                p1++;p2++;
        }
       return 0; 
       */
        
        
    }
}
