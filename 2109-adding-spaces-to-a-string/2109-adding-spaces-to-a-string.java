class Solution {
    public String addSpaces(String s, int[] spaces) {
   int count=0;
   StringBuilder sb=new StringBuilder();
   
   int i=0;
   int j=0;
   while(i<s.length()&& j<spaces.length ){
      if(i!=spaces[j]){
       sb.append(s.charAt(i));
        i++;
        }
      else{
        sb.append(" ");
        j++;
      }
   }

  while(i<s.length()){
    sb.append(s.charAt(i));
    i++;
  }

return sb.toString();
    }
}