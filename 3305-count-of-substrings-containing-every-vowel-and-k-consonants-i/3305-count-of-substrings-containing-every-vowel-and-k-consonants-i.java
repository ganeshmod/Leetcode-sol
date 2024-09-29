class Solution {
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int ans=0;
        for(int i=0;i<n;i++){
            HashSet<Character> v= new HashSet<>();
            int c=0;
            for(int j=i;j<n;j++){
                if(word.charAt(j)=='a'||word.charAt(j)=='e'||
                word.charAt(j)=='i'||word.charAt(j)=='o'||
                word.charAt(j)=='u'){
                    v.add(word.charAt(j));
                }else{
                    c++;
                }
                if(v.size()==5&&c==k) ans++;
            }
            
        }
        return ans;
    }
}