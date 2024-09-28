class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        //greed pr l hai 
        // s pr r hai
        while(l<n && r<m)
{
    if(s[r]>=g[l]){
        r++;
        l++;
    }
    else if((s[r]<g[l])){
        r++;
    }

}  
return l;      
    }
}