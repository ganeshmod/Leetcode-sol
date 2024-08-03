class Solution {
    public int minFlips(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int rcount=0;
       for(int i=0;i<n;i++)
       {
        int j=0,k=m-1;
        while(j<m)
        {
            if(grid[i][j]==grid[i][k]){
                j++;
                k--;
            }
            else{
                rcount++;
                j++;
                k--;
            }
        }
       }
       int ccount=0;
       for(int c=0;c<m;c++){
        int r1=0;
        int rn=n-1;
        while(r1<rn){
            if(grid[r1][c]==grid[rn][c]){
                r1++;
                rn--;
            }
            else{
                    ccount++;
                     r1++;
                rn--;

            }
        }
       }
       return Math.min(rcount,ccount);
    }
}