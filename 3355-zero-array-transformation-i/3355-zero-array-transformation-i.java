//  class Pair{
//     int first;
//     int second;
//     pair(int first,int second){
//         this.first=first;
//         this.second=second;

//     }
//     public int getf(){
//         return first;
//     }
//     public int gets(){
//         return second;
//     }
//  }
 class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] temp=new int[nums.length+1];
        for (int i = 0; i < queries.length; i++) {
            int f = queries[i][0]; // Access first value
            int s = queries[i][1]; // Access second value
            temp[f]--;
            if(s+1<=queries.length-1)
            temp[s+1]++;
        }
        for(int i=1;i<temp.length;i++)
        {
        temp[i]+=temp[i-1];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+temp[i]>0)
            return false;
        }
        return true;




       
}
 }
