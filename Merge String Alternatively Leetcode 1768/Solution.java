// package Merge String Alternatively Leetcode 1768;

public class Solution {
    public static String mergeAlternatively(String word1, String word2){
        int A = word1.length();
        int B = word2.length();
        int a = 0, b =0;
        StringBuilder result = new StringBuilder();
        while(a < A && b < B){
            result.append(word1.charAt(a++));
            result.append(word2.charAt(b++));
        }
        while(a < A){
            result.append(word1.charAt(a++));
        }
        while( b < B){
            result.append(word2.charAt(b++));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternatively(word1, word2));
    }
}
