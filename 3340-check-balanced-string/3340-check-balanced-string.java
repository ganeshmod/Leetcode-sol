class Solution {
    public boolean isBalanced(String num) {
   
    int even=0;
    int odd=0;
    for(int i=0;i<num.length();i++){
        if(i%2==0){
           int e=num.charAt(i)-'0';
           even+=e;
        }
        else{
            int o=num.charAt(i)-'0';
            odd+=o;
        }
    }
   if(even==odd)  {
    return true;
   }
   else{
    return false;
   }
     
    }
}