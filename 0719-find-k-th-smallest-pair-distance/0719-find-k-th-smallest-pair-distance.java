class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(nums[i],maxi);
        }
    int[] arr=new int[maxi+1];
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int d=Math.abs(nums[j]-nums[i]);
            arr[d]++;
        }

    }
    for(int m=0;m<arr.length;m++){
        k-=arr[m];
        if(k<=0){
            return m;
        }

    }
    return -1;
    }

}