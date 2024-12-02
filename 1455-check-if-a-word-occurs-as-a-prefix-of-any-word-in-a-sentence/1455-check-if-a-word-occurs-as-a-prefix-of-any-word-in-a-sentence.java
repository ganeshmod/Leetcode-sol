class Solution {
    public int isPrefixOfWord(String sen, String search) {

  String[]arr=sen.split(" ");
  int n=arr.length;
  for(int i=0;i<n;i++){
    if(arr[i].startsWith(search))return i+1;
  }

return -1;


    }

}