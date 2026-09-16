// Print the complete Pascal triangle
import java.util.*;

public class Arrays36 {
    public static List<Integer> generateRow(int row){
        List<Integer>ansRow = new ArrayList<>();
        int ans = 1;
        ansRow.add(ans);
        for(int col=1;col<row;col++){
            ans = ans * (row-col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=n; i++){
            ans.add(generateRow(i));
        }

        for (List<Integer> row : ans) {
            System.out.println(row);
        }

    }
}
