class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
              
                mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
              }
    for(Map.Entry<Integer,Integer>e:mpp.entrySet()){
        int value=e.getValue();
        if(value>1){
            return e.getKey();
        }
    } 
    return -1;
        
    }
}