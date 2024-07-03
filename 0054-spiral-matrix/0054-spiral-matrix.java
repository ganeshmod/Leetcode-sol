class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list=new ArrayList<>();
        /*there will be four direction 
        dir 0=left to right move krenge top will constant in this case 
        dir=1 top to bottom move krenge and in which column will be constant 
        dir2=right to left move krenge and in which row will be constant 
        dir3=bottom to top move krenge in which coloumns constant hoga */
        int m  = matrix.length;//rows
        int n= matrix[0].length;//columns
        int top=0;
        int down=m-1;
        int left =0;
        int right =n-1;
        int dir=0;
        while(top<=down && left<=right){
            if(dir == 0){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);

                }
                top++;
            }
            if(dir==1){
                for(int i=top;i<=down;i++){
                    list.add(matrix[i][right]);
                }
                right--;

            }
            if(dir==2){
                for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
               down--;

            }
            if(dir==3){
                for(int i=down;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
            dir++;
            if(dir==4){
                dir=0;
            }
        }
        return list;
    }
}