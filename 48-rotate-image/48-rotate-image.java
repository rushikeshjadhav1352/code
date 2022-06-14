class Solution {
    public void rotate(int[][] matrix) {
        int rows=0,columne= matrix.length-1;
        int columns=0,rowe= matrix.length-1;
        int compareo=1;
        int i;
        int k;
        int j;
        int l;

        for(int a=0;a<matrix.length;a++){
            for(int b=0;b< matrix.length;b++){
                System.out.print(matrix[a][b]+" ");
            }
         
        }
            for(i = rows,k=columns;i<=rowe && k<=columne;i++,k++){

                for(j=i,l=k;j<=columne && l<=rowe;j++,l++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[l][k];
                    matrix[l][k]=temp;

                }

            }
      
        rows=0;
            while(rows<=rowe) {
                while (columns <= columne) {
                    int temp = matrix[rows][columns];
                    matrix[rows][columns] = matrix[rows][columne];
                    matrix[rows][columne] = temp;
                    columns++;
                    columne--;
                }
                rows++;
                columns=0;
                columne=matrix.length-1;
            }

       
        
    }
}