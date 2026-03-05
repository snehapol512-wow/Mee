package Arrays.Problems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 3},
                {0, 0, 0},
                {0, 0, 4}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;
        int zeroCount = 0;
        int nonzeroCount = 0;
        // Traverse the matrix
        for(int i =0; i<rows; i++) {
            for(int j=0; i<cols; i++){
                if(matrix[i][j] ==0) {
                    zeroCount++;
                }else{
                    nonzeroCount++;
                }
            }
        }
        System.out.println("Zeros: " + zeroCount);
        System.out.println("Non Zeros: " + nonzeroCount);
        System.out.println(zeroCount > nonzeroCount ? "Sparse" : "Not sparse");
    }
}
