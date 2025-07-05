package R_7_5;

public class minNum_maxCol {
    public static void solve(int [][] matrix){
        int min = matrix [0][0];
        int minCol = 0;

           for(int i=1;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    minCol = j;
                }
            }
        }
        int max = matrix[0][minCol];
        for(int i=0;i<3;i++){
            if(matrix[i][minCol]>max){
                max = matrix[i][minCol];
            }
        }
        System.out.println("Min : " +min+ "Max from col " +max);
    }


public static void main(String[] args) {
    int[][] matrix = {
            {5,8,3},
            {9,1,7},
            {4,6,2}
    };
    solve(matrix);
}
}