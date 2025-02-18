import java.util.*;

public class Solution{
        public static int numJewelsInStones(String jewels, String stones) {
            HashSet<Character> jewelSet = new HashSet<>();
            int count = 0;
            
            for(char c: jewels.toCharArray()){
                jewelSet.add(c);
            }
            for(char s:stones.toCharArray()){
                if(jewelSet.contains(s)){
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbb"));
    }
    
}