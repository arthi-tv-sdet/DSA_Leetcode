class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        /**
        TD1: nums1[]=[1,3,5,7] nums2[]=[1,5] output=1
        TD2: nums1[]=[2,3,4,5] nums2[]=[5] output=5
        TD3: nums2[]=[1,3,4,5] nums2[]=[0] output=-1

        Pseudocode: Bruteforce-TLE
                declare min value= as Integer.max
        use two for loops
        check if each value if nums1 is present in nums2 if present keep in temp and find the min of min and temp
        finally return min

        Time: O[N*M]
        Space: O[1]

code:
int temp=0,min=Integer.MAX_VALUE;
         for(int i=0;i<nums1.length;i++)
         {
             for(int j=0;j<nums2.length;j++)
             {
        if(nums1[i]==nums2[j])
        {
        temp=nums1[i];
        min=Math.min(min,temp);
        }
             }
         }
        if(min!=Integer.MIN_VALUE)
        return min;
        return -1;


        Pseudocode: using hashset - 14ms
        add nums1 in set 1
       traverse through nums2
        if set1 has nums2 return nums2

Time: O[N]
Space: O[N]
        
        code: 
HashSet<Integer> set1=new HashSet<>();
         for(int i=0;i<nums1.length;i++)
         set1.add(nums1[i]);

         for(int i=0;i<nums2.length;i++)
         if(set1.contains(nums2[i]))
         return nums2[i];

         return -1;

         Pseudocode: 2 pointers approach (Optimised)
         take p1 in nums1 array and p2 in nums2 array both in index 0
         if p1=p2 return nums[p1]
         else return -1

         Time: O[N]
         Space: O[1]
         */
         int p1=0,p2=0;
         
         while(p1<nums1.length && p2<nums2.length)
         {
             if(nums1[p1]>nums2[p2])
              
            p2++;
            else if(nums1[p1]<nums2[p2])
            p1++;
            else
            return nums1[p1];
         }

         return -1;
         

         

    }
}
