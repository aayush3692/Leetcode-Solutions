
import java.util.*;
public class Solution {
    public static List<String> summaryRanges(int[] nums)  {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;

        while(i < nums.length) {
            int start = nums[i];

            while (i < nums.length -1 && nums[i]+1 ==  nums[i+1]) {
                i++;
            }

            if (start != nums[i]) {
                ans.add(String.valueOf(start) + "->"+String.valueOf(nums[i]));
            } else {
                ans.add(String.valueOf(nums[i]));
            }
            i++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};
        List <String> ans = summaryRanges(nums);

        System.out.println(ans);
        List <String> ans1 = summaryRanges(nums2);

        System.out.println(ans1);

    }
}