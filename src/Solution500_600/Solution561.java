package Solution500_600;

import java.util.Arrays;

public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int r = 0;
        for (int i = 1; i < nums.length; i = i + 2)
            r += nums[i];
        return r;
    }

}
