class Solution {
   
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row-1;i++){
            for(int j=i+1;j<col;j++){
               int temp=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                int swap=matrix[i][col-1-j];
                matrix[i][col-1-j]=matrix[i][j];
                matrix[i][j]=swap;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }

    }
}