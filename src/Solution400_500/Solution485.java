package Solution400_500;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1)
                temp++;
            if(nums[i] == 0 || i == nums.length){
                max = Math.max(temp, max);
                temp = 0;
            }
        }
        return max;
    }
}
