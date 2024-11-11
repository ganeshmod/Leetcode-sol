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
    public int longestPalindromeSubseq(String s) {
      
       int maxi=0;
           boolean c=false;
        for(int i=0;i<s.length();i++){
              StringBuilder sb=new StringBuilder();
                for(int j=i;j<s.length();j++){
                 sb.append(s.charAt(j));
                
                if(check(sb.toString())==true){

                }
                else{
                    sb.deleteCharAt(sb.length()-1);
                }
               
                }
                 maxi=Math.max(maxi,sb.length());
                 c=true;
        }

    boolean cc=false;
StringBuilder bb=new StringBuilder();
int len=0;
  for(int i=0;i<s.length();i++){
    bb.append(s.charAt(i));
  }
  if(check(bb.toString())==true){
 cc=true;
  len=bb.length();

  }
  if(c==true && cc==true){
     maxi=Math.max(maxi,len);
  }

 



      return maxi;
    }
}