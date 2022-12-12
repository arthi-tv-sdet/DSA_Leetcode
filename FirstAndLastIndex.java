//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        /**
        PSeudocode:
        if nums.length is 0 return -1 -1
            set two pointers left and right
            calculate mid - left+right /2
            
            finally return output array

        Time: O[log n]
        Space: o[N]
**/
       
    
    if(nums.length==0) 
   return new int[] {-1,-1};
    


    

			    int left=0,right=nums.length-1,mid=0;
			    
                while(left<=right)
                {
                    mid=(left+right)/2;
                    if(nums[mid]<target) left=mid+1;
                    else if(nums[mid]>target) right=mid-1;
                    else
                    {if(nums[left]<target) left++;
                    
                    else if(nums[right]>target) right--;
                    
                    else
                    
                    return new  int[] {left,right}; 
                    }
                    
                }


			   return  new int[] {-1,-1};

    }
}
