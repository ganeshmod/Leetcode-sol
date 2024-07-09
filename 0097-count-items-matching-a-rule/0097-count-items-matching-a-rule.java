class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> vec: items){
            String type=vec.get(0);
            String color=vec.get(1);
            String name=vec.get(2);
 if ((ruleKey.equals("type") && ruleValue.equals(type)) ||
                (ruleKey.equals("color") && ruleValue.equals(color)) ||
                (ruleKey.equals("name") && ruleValue.equals(name))){
                count++;}
            }
        

   return count ;


    }
}