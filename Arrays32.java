// count all sub array with given sum k 

import java.util.HashMap;

public class Arrays32 {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // prefix sum 0 occurs once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Check if previous prefix sum = prefixSum - k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        int ans = subarraySum(nums, k);

        System.out.println(ans);
    }
}
