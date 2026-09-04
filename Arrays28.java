public class Arrays28 {
    public static int[][] zeroMatrix(int[][] matrix, int n, int m) {

        int[] row = new int[n];
        int[] col = new int[m];

        // Mark rows and columns that contain 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set marked rows and columns to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
    public static void main(String args[]){

    }
}
