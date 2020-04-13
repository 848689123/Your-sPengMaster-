package Solution400_500;

public class Solution453 {
    public static void main(String[] args) {
        System.out.println(minMoves(new int[]{3,9,7,4,5,8,1,4,6,2,7}));
    }
    public static int minMoves(int[] nums) {
        int min = nums[0];
        int result = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>min)
                result += nums[i]-min;
            else{
                result += i*(min-nums[i]);
                min = nums[i];
            }
        }
        return result;
    }
}
