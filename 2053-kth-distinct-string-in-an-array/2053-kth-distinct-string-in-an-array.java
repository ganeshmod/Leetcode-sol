class Solution {
    public String kthDistinct(String[] arr, int k) {
        String ans="";
        Map<String ,Integer> map=new HashMap<>();
       
       List<String> list=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       for(String s:arr){
        if(map.get(s)==1){
            list.add(s);
        }
       }
        
        if(list.size()>=k){
       ans =list.get(k-1);
        }
        
       
return ans;
    }
}
