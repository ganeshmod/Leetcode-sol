class Solution {
    public void setZeroes(int[][] matrix) {
       int row=matrix.length;
       int col=matrix[0].length;
        List<Integer>row1=new ArrayList<>();
        List<Integer>col1=new ArrayList<>();       
       for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(matrix[i][j]==0){
             row1.add(i);
             col1.add(j);
            }
        }
       } 
       int irow=-1;
       int jcol=-1;
       int i=0;
       int j=0;
       while(i<row1.size()&& j<col1.size()){
                 irow = row1.get(i);
                 jcol=col1.get(j);
       for(int k = irow-1;k>=0;k--){
        matrix[k][jcol]=0;
       }
       for(int k=irow+1;k<row;k++){
        matrix[k][jcol]=0;
       }
       for(int l=jcol+1;l<col;l++){
        matrix[irow][l]=0;
       }
       for(int l=jcol-1;l>=0;l--){
        matrix[irow][l]=0;
       }
       i++;
       j++;
       }
       for(int m=0;i<row;i++){
        for(int n=0;j<col;j++){
            System.out.print(matrix[m][n]+" ");
        }
        System.out.println();
       }
    }
}