import java.util.*;

public class Arrays33 {
    public static long nCr(int n, int r) {

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }

        return res;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c =sc.nextInt();

        System.err.println(""+nCr(r - 1, c - 1)); 
    }
}
