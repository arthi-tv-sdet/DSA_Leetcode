class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
       //Pseudocode
       // find the sum of alice
    //find the sum of bob
           // Math.abs(alice-bob)
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
