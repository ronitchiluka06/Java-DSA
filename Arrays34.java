// Print a specific row of pascal's triangle 
import java.util.Scanner;

public class Arrays34 {
    public static long  nCr(int n, int r) {

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);

    
        }
        return res;
        
    }
    public static void row(int r) {
        for(int i=1;i<=r;i++){
            System.out.println(nCr(r-1 , i-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        
        row(r);
        
    }
}
