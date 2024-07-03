class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        Set<Character> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(sentence.charAt(i));
        }
        int count=st.size();
        if(count==26){
            return true;

        }
        else{
            return false ;
        }
    }
}