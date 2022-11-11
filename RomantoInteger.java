class Solution {
    public int romanToInt(String s) {
        
            
        HashMap<Character,Integer> romanMap=new HashMap<>();
        
        int output=0,right=s.length()-1;
        
        romanMap.put('I',1); romanMap.put('V',5);
        romanMap.put('X',10); romanMap.put('L',50);
        romanMap.put('C',100); romanMap.put('D',500); romanMap.put('M',1000);
        
        for(int i=right;i>=0;i--)
        {   
                
            
            if(s.charAt(i)=='I'&& i<s.length()-1 && (s.charAt(i+1)=='V'|| s.charAt(i+1)=='X'))
                output=output-1;
            else if(s.charAt(i)=='X'&& i<s.length()-1 && (s.charAt(i+1)=='L'|| s.charAt(i+1)=='C'))
                output=output-10;
             else if(s.charAt(i)=='C'&& i<s.length()-1 && (s.charAt(i+1)=='M'|| s.charAt(i+1)=='D'))
                output=output-100;
            else 
                 output=output+romanMap.get(s.charAt(i));
        }
       return output; 
    }
}
