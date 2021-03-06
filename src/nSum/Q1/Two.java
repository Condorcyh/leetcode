package nSum.Q1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 车一晗
 * @Date 2022/07/07
 **/
public class Two {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int other = target - nums[i];
            if (map.containsKey(other) && map.get(other) != i) {
                return new int[]{i, map.get(other)};
            }
        }
        return new int[]{-1, -1};
    }
}
