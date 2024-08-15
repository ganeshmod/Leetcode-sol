class Solution {
    public boolean containsDuplicate(int[] nums) {
       
        int[] arr=new int[(int)1e5+1];
       
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i:arr){
            if(i>=2){
                return true ;
            }
        }
        return false;
    }
}