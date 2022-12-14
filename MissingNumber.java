class Solution {
    public int missingNumber(int[] nums) {
        
/*
Pseudocode:

add all numbers in a set
count from 0 to n
check if the number is present in set after counting

Time: O[N]
Space: O[N]

* */

HashSet<Integer> set= new HashSet<>();
int n=nums.length;
for(int i=0;i<nums.length;i++)
{
    set.add(nums[i]);
}

for(int i=0;i<=n;i++)
{
    if(!set.contains(i)) return i;
}

return -1;

    }
}
