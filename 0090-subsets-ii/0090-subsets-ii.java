class Solution {
    public static void print(int []nums,Set<ArrayList<Integer>> ans, ArrayList<Integer> arr,int i,int n){
      if(i==n){
         ans.add(new ArrayList<>(arr));
		return;
      }
      print(nums,ans,arr,i+1,n);
	arr.add(nums[i]);
	print(nums,ans,arr,i+1,n);
	arr.remove(arr.size()-1);



    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
         Set<ArrayList<Integer>> ans = new HashSet<>();
         ArrayList<Integer> arr=new ArrayList<>();
         print(nums,ans,arr,0,n);
        

		 List<List<Integer>> result=new ArrayList<>(ans) ;
		  return result;
        
    }
    
}