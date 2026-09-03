// Find the longest Consecutive sequence in an array

import java.util.HashSet;
import java.util.Set;

public class Arrays27 {
    public static int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int longestSeq =0;

        for(int num : nums){
            set.add(num);
        }

        for(int elem : set){
            int length =1;
            int currentElem = elem;
            if(!set.contains(currentElem-1)){
                int startingElem = currentElem;
                int nextElem = startingElem +1;
                while(set.contains(nextElem)){
                    length++;
                    nextElem++;
                }
                
            }
            longestSeq = Math.max(length, longestSeq);
        }
        return longestSeq;
    }
    public static void main(String args[]){
        int nums[] = {5,4,12,13,2,11,1,14,8,3,9,9,0};
        System.out.println(longestConsecutive(nums));
    }
}
