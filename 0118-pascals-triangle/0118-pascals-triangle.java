class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>list=new ArrayList<>(i+1);
            int j=0;
            while(j<=i){
                if(j==0||j==i){
                    list.add(1);
                    j++;
                }
                else{
                list.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                    j++;
                }

            }
            ans.add(list);
        }
        return ans;
    }
}