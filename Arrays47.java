// merge intervals

import java.util.*;

public class Arrays47 {
    public static List<List<Integer>> merge(List<List<Integer>> intervals) {
        int n = intervals.size();
        int m = 2;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);
            if(ans.size() == 0 || start > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(start,end));
            }
            else {
                int previousEnd = ans.get(ans.size()-1).get(1);
                ans.get(ans.size()-1).set(1,Math.max(previousEnd, end));
            }
            
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        List<List<Integer>> intervals = new ArrayList<>(List.of(
            new ArrayList<>(List.of(1,3)),
            new ArrayList<>(List.of(2,6)),
            new ArrayList<>(List.of(8,10)),
            new ArrayList<>(List.of(15,18))
        ));
        

        System.out.println(merge(intervals));

    }
}
