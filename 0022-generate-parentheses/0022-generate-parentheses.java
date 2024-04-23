class Solution {
    public static void parenthesis(int n,int left,int right ,List<String>ans,StringBuilder temp){
        if(left+right==2*n){
            ans.add(temp.toString());
            return ;}
            //left parenthesis
            if(left<n){
               temp.append('(');
               parenthesis(n,left+1,right,ans,temp);
               temp.deleteCharAt(temp.length() - 1);
               //
            }
            //right  parenthesis
            if(right<left){
                temp.append(')');
                parenthesis(n,left,right+1,ans,temp);
                 temp.deleteCharAt(temp.length() - 1);
            }
        
    }
    public List<String> generateParenthesis(int n) {
          List<String> ans=new ArrayList<>();
          StringBuilder  temp =new  StringBuilder(); ;
          parenthesis(n,0,0,ans,temp);
          return ans;
        
    }
}