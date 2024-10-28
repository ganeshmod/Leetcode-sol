class Solution {
    public int possibleStringCount(String word) {
        
      int[] arr=new int[26]  ;
      Arrays.fill(arr,0);
      for(int i=0;i<word.length();i++){
        arr[word.charAt(i)-'a'] +=1;
      }
      int count=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>1){
         count+=arr[i]-1;

        }

      }
      return count+1;
    }
}