class Solution {
    public int hIndex(int[] cit) {
        int n=cit.length;
        
        int[]arr=new int[n+1];
        for(int c:cit){
            if(c>n){
                arr[n]++;
            }
            else{
                arr[c]++;
            }
        }
        int count=0;
        for(int i=n;i>=0;i--){
            count+=arr[i];
            if(count>=i){
               return i;
            }
           
        }
        return 0;
    }
}