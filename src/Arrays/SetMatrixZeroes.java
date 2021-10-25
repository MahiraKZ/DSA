package Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        boolean isFirstRowZero = false;
        boolean isFirstColumnZero = false;

        //checking if first row contains zero
        for(int i=0;i<matrix[0].length;i++){
            if(matrix[0][i] == 0){
                isFirstRowZero = true;break;
            }
        }

        //checking if first col contains zero
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                isFirstColumnZero = true;break;
            }
        }

        //iterating through other columns
        for(int i=1;i<matrix.length;i++){
            for(int j =1;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //checking the row flag arrays and assigning zeroes
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0] == 0){
                makeRowZero(matrix,i);
            }
        }

        //checking the col flag arrays and assigning zeroes
        for(int i=1;i<matrix[0].length;i++){
            if(matrix[0][i]== 0){
                makeColumnZero(matrix,i);
            }
        }

        //checking if first row has to be made zero
        if(isFirstRowZero){
            makeRowZero(matrix,0);
        }
        //checking if first col has to be made zero
        if(isFirstColumnZero){
            makeColumnZero(matrix,0);
        }
    }

    static void makeRowZero(int[][] matrix, int row){
        for(int i=0;i<matrix[row].length;i++){
            matrix[row][i] = 0;
        }
    }

    static void makeColumnZero(int[][] matrix, int col){
        for(int i=0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }

}
