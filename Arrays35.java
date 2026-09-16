// Print a specific row of pascal's triangle- optimal
import java.util.Scanner;

public class Arrays35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row  = sc.nextInt();
        int ans =1;
        System.out.println(ans);
        for(int i=1;i<row;i++){
            ans = ans*(row - i);
            ans /= i;
            System.out.println(ans);
        }
    }
}
