package Solution400_500;

public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        int board = 0;
        int col = grid.length;
        int row = grid[0].length;
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                if(grid[i][j]==1){
                    if(i==0||grid[i-1][j]==0)
                        board++;
                    if(j==0||grid[i][j-1]==0)
                        board++;
                }
            }
        }
        return 2*board;
    }
}
