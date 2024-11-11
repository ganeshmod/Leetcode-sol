class Solution {
     public static boolean check(String st){
        int i=0;
        int j=st.length()-1;
        while(i<=j){
            if(st.charAt(i)!=st.charAt(j)){
              return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
            if(check(s.substring(i,j+1))){
                count++;
            }
          }
        }
        return count;
    }

}