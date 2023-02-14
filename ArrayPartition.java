class Solution {
    public int arrayPairSum(int[] nums) {
        
/**
pseudocode:
sort the array 
iterate over the array
for each iteration add minimum of i and i+1 values to sum value
return the sum

Time: O[nlogN]
Space: O[1]


 */
   Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum = sum +Math.min(nums[i],nums[i+1]);
        }

        return sum;
    }
}
