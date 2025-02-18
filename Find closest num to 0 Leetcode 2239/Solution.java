// package Find closest num to 0 Leetcode 2239;

public class Solution {
    public static void main(String[] args) {
        Soln s = new Soln();
        int [] nums = {-4,-2,-1,4,8};
        System.out.println("Hello");
        System.out.println("closest number = "+s.findClosestNumber(nums));
    }
    
}
class Soln {
    public boolean contains(int[] nums, int value){
        for(int c : nums){
            if(c == value){
                return true;
            }
        }
        return false;
    }
    public int findClosestNumber(int[] nums){
        int closest = nums[0];
        for (int x : nums){
            if(Math.abs(x) < Math.abs(closest)){
                closest = x;
            }
        }
        if(closest < 0 && contains(nums, Math.abs(closest))){
            return Math.abs(closest);
        } else {
            return closest;
        }
    }
    
}