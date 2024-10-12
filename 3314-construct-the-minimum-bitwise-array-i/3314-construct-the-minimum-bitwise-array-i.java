class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int []arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            for(int c=0;c<=nums.get(i);c++){
                if((c|c+1)==nums.get(i)){
                    arr[i]=c;
                    break;
                }
            }
        }
        return arr;
    }
}