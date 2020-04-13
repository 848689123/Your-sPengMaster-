public class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=1; i<=n; i++)
            sum += i;
        for(int x:nums)
            sum -= x;
        return sum;
    }
}
