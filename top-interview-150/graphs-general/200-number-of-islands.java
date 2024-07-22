//QN : https://leetcode.com/problems/number-of-islands/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayDeque;
class Solution {
    public int numIslands(char[][] grid) {

        if (grid == null) {
            return 0;
        }

        int numIslands = 0;
        
        int[][] directions = { {1,0}, {0,1}, {-1,0}, {0, -1} };
        int rows = grid.length;
        int cols = grid[0].length;
        

        for (int n = 0 ; n < rows; n++) {

            for (int m = 0 ; m < cols; m++) {
                
                if (grid[n][m] == '1') {
                    //found land
                    numIslands++;
                    ArrayDeque<int[]> q = new ArrayDeque<int[]>();
                    q.offer(new int[]{n, m});
                    grid[n][m] = '0';
                    
                    while (!q.isEmpty()) {
                        int[] curr = q.poll();
                        int x = curr[0];
                        int y = curr[1];

                        for (int[] dir : directions) {

                            int newX = x + dir[0];
                            int newY = y + dir[1];

                            if ( (newX >= 0) && (newY >= 0) && (newX < grid.length) && (newY < grid[0].length) && ( grid[newX][newY] == '1' )) {
                                q.offer(new int[]{newX, newY});
                                grid[newX][newY] = '0';
                            }
                        }
                    }

                }
            }
        }
        return numIslands;
    }
}