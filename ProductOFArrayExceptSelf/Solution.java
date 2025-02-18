package ProductOFArrayExceptSelf;



public class Solution{
    //brute force
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] results = new int[n];
        for(int i = 0; i < n; i++){
            int product = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            results[i] = product;
        }
        return results;
    } 
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] output = productExceptSelf(nums);
        
        for (int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : output){
            System.out.print(i + " ");
        }

    }
}