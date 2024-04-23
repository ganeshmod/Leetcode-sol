class Solution {
    public static void sub(int[]nums,int i,int n,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>temp){
        if(i==n){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        //for no
        sub(nums,i+1,n,ans,temp);
        temp.add(nums[i]);
        sub( nums,i+1,n,ans,temp);
         temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
      ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
      ArrayList<Integer> temp=new ArrayList<>();

        int n=nums.length;
        sub(nums,0,n,ans,temp);

        List<List<Integer>> result = new ArrayList<>(ans);
        return result;
    }
}