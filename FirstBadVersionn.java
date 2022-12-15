/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//278. First Bad Version
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        /**Pseudocode:
        binary search algorithm
        left right mid
        mid=left+(right-left)/2 */

int left=1,right=n;

while(left<=right)
{
    int mid=left+(right-left)/2;
    if(!isBadVersion(mid))
{left=mid+1;}
    
     else   if(isBadVersion(mid))
    {
        if(!isBadVersion(mid-1))
       {return mid;
       } 
    
    right=mid-1;
    }
}
    
return -1;
    }
}
