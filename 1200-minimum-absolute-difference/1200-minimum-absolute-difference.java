class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        List<List<Integer>>list=new ArrayList<>();
        int mini=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
         mini=Math.min(mini,(arr[i]-arr[i-1]));
        }
     for(int i=0;i<arr.length-1;i++){
      
        for(int j=i+1;j<arr.length;j++){
           
            if((arr[j]-arr[i])==mini){
                  list.add(Arrays.asList(arr[i],arr[j]));
            }

        }
       

     }

return list;
    }

}