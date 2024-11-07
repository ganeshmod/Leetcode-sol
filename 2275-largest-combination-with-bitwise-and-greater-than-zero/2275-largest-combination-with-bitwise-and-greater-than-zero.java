class Solution {
    public int largestCombination(int[] candi) {
        int max=0;
        
    int previouscount=0;
       for(int i=0;i<candi.length-1;i++)  {
        int count=0;
        int bit=candi[i];
            for(int j=i+1;j<candi.length;j++){

             int checkprevious=bit;
              bit&=candi[j];
              if(bit>0 ){
              count++;
              bit=bit;
              }
             else{
                count--;
                bit=checkprevious;
             }
               
            }
            if(count>previouscount){
                max=count;
                previouscount=count;
            }

       }
       return max+1;
    }
}