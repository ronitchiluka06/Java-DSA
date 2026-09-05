// Set Matrix Zeroes -Better soln
import java.util.Scanner;

public class Arrays29 {

    public static void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m = matrix[0].length;
        int a[] = new int[n];
        int b[] = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0){
                    a[i] =1;
                    b[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i] == 1 || b[j] == 1 ){
                    matrix[i][j] =0;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
