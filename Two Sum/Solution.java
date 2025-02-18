
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (map.containsKey(y) && map.get(y) != i) {
                return new int[]{i, map.get(y)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSums(nums, 9);
        for (int x : result) {
            System.out.println(x);
        }
    }
}
