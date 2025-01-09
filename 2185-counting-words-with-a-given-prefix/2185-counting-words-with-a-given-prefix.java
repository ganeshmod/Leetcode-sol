class Solution {
    public int prefixCount(String[] words, String pref) {
     int count=0;
     int n=words.length;
     for(int i=0;i<n;i++){
        String str=words[i];
        if(str.length()>=pref.length()){
            int j=0;
            int k=0;
            boolean flag=false;
            while(j<str.length() && k<pref.length()){
                if(str.charAt(j)==pref.charAt(k)){
                    if(j==pref.length()-1){
                        flag=true;
                    }
                     j++;k++;
                }
                else{
                    j=0;
                    k=0;
                    break;
                }
            }
            if(flag==true){
                count++;
            }
        }
       
     }

 return count;

    }
}