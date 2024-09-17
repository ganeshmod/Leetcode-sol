class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         List<String> result = new ArrayList<>();
     HashMap<String,Integer> map=new HashMap<>();
    String[] str1=s1.split(" ");
    String[] str2=s2.split(" ");
    for(int i=0;i<str1.length;i++){
        map.put(str1[i],map.getOrDefault(str1[i],0)+1);
    }
    for(int i=0;i<str2.length;i++){
        map.put(str2[i],map.getOrDefault(str2[i],0)+1);
    }
    for(Map.Entry<String,Integer>entry:map.entrySet()){
        if(entry.getValue()==1){
            result.add(entry.getKey());
        }
    }
        
     String[]arr=new String[result.size()];
     for(int i=0;i<arr.length;i++){
        arr[i]=result.get(i);
     }    
         
          
         return arr;    
         
    }
}