package Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {

        int rowSize = 6; int colSize = 6;

        int start = 1;
        int[][] matrix = new int[rowSize][colSize];

        int rowStart = 0, rowEnd = rowSize - 1;
        int colStart = 0, colEnd = colSize - 1;

        while(rowStart <= rowEnd && colStart <= colEnd) {
            //step1:
            for(int c = colStart; c <= colEnd; c++) {
                matrix[rowStart][c] = start++;
            }
            //step 2:
            for(int r = rowStart + 1; r <= rowEnd; r++) {
                matrix[r][colEnd] = start++;
            }
            if(rowStart < rowEnd && colStart < colEnd) {
                //step 3:
                for(int c = colEnd - 1; c >= colStart; c--) {
                    matrix[rowEnd][c] = start++;
                }
                //step 4:
                for(int r = rowEnd - 1; r >= rowStart + 1; r--) {
                    matrix[r][colStart] = start++;
                }
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }

        //print
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
