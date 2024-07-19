//QN: https://leetcode.com/problems/valid-sudoku/?envType=study-plan-v2&envId=top-interview-150
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        //the idea is that we check all 81 squares.
        //for each non empty square, we need to enforce new rules for the following squares we check
        //the rules are that this number cannot appear in the same row, col, grid.
        //if a rule already exists, we return false and the grid is invalid.
        Set rules = new HashSet<Integer>();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                char curr = board[i][j];
                if (curr == '.') {
                    continue;
                }
                
                if (!rules.add("r" + i + "" + curr) || !rules.add("c" + j + "" + curr) || !rules.add("g" + i/3 + "" + j/3 + "" + curr)){
                    return false;
                } 
            }
        }
        return true;
    }
}