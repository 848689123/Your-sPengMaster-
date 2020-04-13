public class Solution283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                count++;
            if(nums[i]!=0)
                nums[i-count] = nums[i];
        }
        for(int i=count+1;i<nums.length;i++)
            nums[count] = 0;
    }
}
