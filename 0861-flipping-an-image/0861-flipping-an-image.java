class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        int n=image.length;//rows
        int m=image[0].length;//coloms
          int[][] result=new int[n][m];
for(int i=0;i<n;i++){
    for(int j=m-1;j>=0;j--){
        if(image[i][m-1-j]==0){
           result[i][j]=1;
        }
        else{
            result[i][j]=0;
        }
    }
}
return result;
    }
}