class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int n=g.length;
        int m=s.length;
        Arrays.sort(s);
        Arrays.sort(g);
        int l=0;
        int r=0;
        int count=0;
        while(l<n  && r<m){
            if(g[l]<=s[r]){
            r++;
            l++;
            count++;
            }
            else{
            r++;
            }
        }
        return count;
    }
}