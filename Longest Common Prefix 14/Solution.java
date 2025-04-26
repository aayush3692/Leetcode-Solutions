public class Solution {
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }

        int min_length = Integer.MAX_VALUE;
        for(String s: strs) {
            if (s.length() < min_length) {
                min_length = s.length();
            }
        }

        int i = 0; 
        while(i < min_length) {
            for(String s: strs) {
                if (s.charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }

        return strs[0].substring(0,i);
    }
    public static void main(String[] args) {
        // Solution s = new Solution();
        String[] q = {"flowz","flow","flowht"};

        System.out.println(longestCommonPrefix(q));

    }
}