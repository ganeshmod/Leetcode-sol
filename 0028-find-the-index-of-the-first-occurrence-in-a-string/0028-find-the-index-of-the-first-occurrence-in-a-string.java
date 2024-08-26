class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        if(n<m){
            return -1;
        }
        int i=0;
        int j=0;
        int flag=0;
       while(i<n){
        if( j<m && haystack.charAt(i)==needle.charAt(j)){
            i++;
            j++;
            flag=1;
            if(j==m){
                return i-m;
            }

        }
        else if( flag==1 &&(j>=m||haystack.charAt(i)!=needle.charAt(j))){
            j=0;
            flag=0;
            
        }
        else{
            i++;
        }

       }
        return -1;
         
    }
}