package Solution500_600;

import java.util.Arrays;

public class Solution532 {
    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5,1,1}, 0));
    }
    public static int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        Arrays.sort(nums);
        int start = 0;
        int count = 0;
        int prev = 0x7fffffff;
        for (int i = 1; i < nums.length; i++) {
            if(prev == nums[start] || nums[i] - nums[start] > k) {
                start++;
                if (start != i) {
                    i--;
                }
            }else if (nums[i] - nums[start] == k) {
                prev = nums[start];
                start++;
                count++;
            }
        }
        return count;
    }

}
