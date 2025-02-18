import java.util.HashSet;

public class Solution{
    public static  boolean isValidSudoku(char[][] board){
        //validate rows
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; i++){
                char item = board[i][j];
                if(item != '.' && !set.add(item)){
                    return false;
                }
            }
        }

        //validate columns
        for(int i = 0; i < 9; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; i++){
                char item = board[j][i];
                // if (set.contains(item)){
                //     return false;
                // } else if(item != '.'){
                //     set.add(item);
                //}
                if(item != '.' && !set.add(item)){
                    return false;
                }
            }
        }

        //validate table
        int[][] starts = {{0,0},{0,3},{0,6},
        {3,0},{3,3},{3,6},
        {6,0},{6,3},{6,6}};

        for(int[] start: starts){
            HashSet<Character> set = new HashSet<>();
            for(int i = start[0]; i < start[0] + 3; i++){
                for(int j = start[1]; j < start[1]; j++){
                    char item = board[i][j];
                    if(item != '.' && !set.add(item)){
                        return false;
                    }
                }
            }
        }

        return true;

    }
    public static void main(String[] args){
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }
}