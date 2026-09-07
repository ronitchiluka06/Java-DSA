// Rotate Array by 90 degree - Optimal Sol

public class Arrays30 {
    public static void rotateMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int right = m - 1;

            for (int j = 0; j < m / 2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][right];
                matrix[i][right] = temp;

                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotateMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
