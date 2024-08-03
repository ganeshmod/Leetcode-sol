class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
       int i=0;
       int j=0;
       while(j<target.length){
        if(arr[i]!=target[j]){
             
            return false ;
           
        }
      i++;
      j++;


       }
       return true;
        
    }
}