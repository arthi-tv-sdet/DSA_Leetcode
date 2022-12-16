class Solution {
    public int singleNumber(int[] nums) {
        
/**Pseudocode:
create ahashmap with key nums value and value its occurence
traverse through the nums array
add each nums 
if the value of nums element is 1 return 1 else return 0

Time: O[N]
Space:O[N]


 */



       HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<nums.length;i++)
{
map.put(nums[i],map.getOrDefault(nums[i],0)+1);

}
for(Map.Entry<Integer,Integer> entry: map.entrySet())
{
if(entry.getValue()==1)
    return entry.getKey();
} 
     return 0;   
    } 
}
