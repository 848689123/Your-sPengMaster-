package Solution500_600;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if(r*c!=row*col)
            return nums;
        int cnt = 0;
        int []nums2 = new int[r*c];
        for(int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                nums2[cnt++] = nums[i][j];
            }
        }
        cnt = 0;
        int [][]reshape = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++)
                reshape[i][j] = nums2[cnt++];
        }
        return reshape;
    }
}
