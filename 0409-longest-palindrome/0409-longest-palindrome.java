class Solution {
    public int longestPalindrome(String s) {
int n=s.length();
   Map<Character,Integer>mpp=new HashMap<>();
   for(int i=0;i<n;i++){
    mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i),0)+1);
   }
   int count=0;
   boolean sch=false;
   for(Map.Entry<Character,Integer>e:mpp.entrySet()){
    int m=e.getValue();
    if(m%2==0){
        count=count+m;
    }
    else if(m%2==1){
        if(sch==false){
            count++;
            sch=true;
        }
     
    }
    
   }
     return count;   
    }
}