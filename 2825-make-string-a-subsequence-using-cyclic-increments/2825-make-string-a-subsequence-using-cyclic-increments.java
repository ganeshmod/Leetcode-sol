class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
  int i=0;
  int j=0;
  if(str1.equals(str2))return true;
 
  while(i<str1.length()&& j<str2.length()){
      if(str1.charAt(i)==str2.charAt(j) || (((str1.charAt(i)-'a'+1)%26 +'a'))==str2.charAt(j))
      {
       j++;
      }
     if(j==str2.length()) 
   {
    return true;
   }
    i++;


    }
    return false;
    
    }}
