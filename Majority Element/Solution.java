import java.util.Map;
import java.util.HashMap;


public class Solution{
    public static int majorityElement(int[] nums){
        Map<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            h.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(h.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }

        return 0;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
}