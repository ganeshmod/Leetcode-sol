class Solution {
    public boolean isPalindrome(String s) {
         String str=s.replaceAll("[^a-zA-Z0-9]","");
        String strr=str.toLowerCase();
        int l=0;
        int r=strr.length()-1;
        while(l<=r){
       if(strr.charAt(l)==strr.charAt(r)){
        l++;
        r--;
       }
       else{
        return false ;
       }
        }
        return true;
        
    }
}