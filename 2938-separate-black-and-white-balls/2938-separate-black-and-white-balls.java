class Solution {
    public long minimumSteps(String s) {
        
       int tswap=0;
       int tblack=0;
       for(int i=0;i<s.length();i++)  {
         if(s.charAt(i)=='0'){
             tswap+=(long)tblack;
         }
         else{
            tblack++;
         }
       }
       return tswap;
    }
}