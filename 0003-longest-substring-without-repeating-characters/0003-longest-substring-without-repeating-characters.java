class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l=0;
        int r=0;
        int max=0;
        Set<Character> visit= new HashSet<>();
        while(r<s.length()){
            char c=s.charAt(r);
            if(visit.add(c)){
                max=Math.max(max,r-l+1);
                r++;
            }
            else{
                while(s.charAt(l)!=c){
                    visit.remove(s.charAt(l));
                    l++;

                }
            }
        }
    }
}