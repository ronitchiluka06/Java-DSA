// merge intervals

import java.util.*;

public class Arrays46 {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;
        int m = intervals[0].length;
        int ans[][] = new int[n][2];
        int index =0;
        for(int i=0;i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(index > 0 && end <= ans[index -1][1]){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(intervals[j][0] <= end && end < intervals[j][1]){
                    end = Math.max(end, intervals[j][1]);
                    
                }
                else{
                    break;
                }
                
            }
            ans[index][0] = start;
            ans[index][1] = end;
            index++;
        }
        return Arrays.copyOf(ans, index);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m =2;
        int intervals[][]= new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                intervals[i][j]= sc.nextInt();
            }
        }

        int[][] result = merge(intervals);

        System.out.println(Arrays.deepToString(result));

    }
}
