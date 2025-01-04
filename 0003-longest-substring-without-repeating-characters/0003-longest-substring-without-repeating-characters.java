class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ") || s.length()==1){
            return 1;
        }

      int maxi=0;
       int n=s.length() ;
       for(int i=0;i<n;i++){
        Set<Character>set=new HashSet<>();
        for(int j=i;j<n;j++){
          char ch=s.charAt(j);
          if(!set.contains(ch)){
                set.add(ch);
             maxi=Math.max(maxi,set.size());
          }
          else{
           
            set.clear();
            break;
          }
        }
       }
    return maxi;



    }
}