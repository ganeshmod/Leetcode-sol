class Solution {
    public static boolean ispalindrome(String s,int l,int r){
   while(l<r){
    if(s.charAt(l)!=s.charAt(r)){
        return false ;
    }
    l++;
    r--;
   }
   return true;
   }
   public static void backtrack(String s,int ind,int n, List<List<String>>result,List<String>curr){
    if(ind==n){
        result.add(new ArrayList<>(curr));
        return ;
    }
    for(int i=ind;i<s.length();i++){
        if(ispalindrome(s,ind,i)){
            curr.add(s.substring(ind,i+1));
            backtrack(s,i+1,n,result,curr);
            curr.remove(curr.size()-1);
        }
    }
   }
    
    public List<List<String>> partition(String s) {
        int n=s.length();
     List<List<String>>result=new ArrayList<>();
     List<String> curr=new ArrayList<>();
    backtrack(s,0,n,result,curr); 
          return result;
        
    }
}