// 36.Valid Sudoku
//time complexity: O(1) - since the board size is fixed (9x9), the time complexity is constant.
import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++) {

            for(int j = 0; j < 9; j++) {

                char num = board[i][j];

                if(num != '.') {

                    String row = num + "row" + i;
                    String col = num + "col" + j;
                    String box = num + "box" + (i/3) + (j/3);

                    // duplicate found
                    if(set.contains(row) ||
                       set.contains(col) ||
                       set.contains(box)) {

                        return false;
                    }

                    // store all
                    set.add(row);
                    set.add(col);
                    set.add(box);
                }
            }
        }

        return true;
    }
}