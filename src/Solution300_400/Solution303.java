package Solution300_400;

public class Solution303 {
    /**
     * 实际题目中NumArrsy无返回值
     */
    private int[] sums;
    public void NumArray(int[] nums) {
        sums = new int[nums.length+1];
        for(int i=0; i<nums.length; i++)
            sums[i+1] = nums[i] + sums[i];
    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}
