class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
       //Pseudocode
       // initialize Asum,Bsum to store sum of alice and bob arrays
       // find the sum of alice and bob
       // create a hashset and add bob array
       //find diff=a+b/2 to find the difference of single entity
       // traverse ethrough alice array 
       // if set contains alice[i]+diff
      //  return as array with alice[i] and alice[i]+diff
        
      //  Time: O[N]
      //  Space : O[N]    
    
          
        int Asum=0,Bsum=0;
        HashSet<Integer> bset=new HashSet<>();
        
        for(int i=0;i<aliceSizes.length;i++)
        {
             Asum=Asum+aliceSizes[i];
        }
        
         for(int i=0;i<bobSizes.length;i++)
        {
             
                 Bsum=Bsum+bobSizes[i];
                 bset.add(bobSizes[i]);
             }
        int diff=(Bsum-Asum)/2;
        
        for(int i=0;i<aliceSizes.length;i++)
        {
            if(bset.contains(aliceSizes[i]+diff))
            {
                return new int[]{aliceSizes[i],aliceSizes[i]+diff};
            }
        }
        return null;
    }
}
