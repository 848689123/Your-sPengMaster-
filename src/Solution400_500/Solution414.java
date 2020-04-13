package Solution400_500;

public class Solution414 {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
    public static int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int num : nums)
            max1 = Math.max(num, max1);
        for(int num : nums){
            if(num == max1)
                continue;;
            max2 = Math.max(num, max2);
        }
        for(int num : nums){
            if(num == max1 || num == max2)
                continue;;
            max3 = Math.max(num, max3);
        }
        return (int) (max3 == Long.MIN_VALUE ? max1 : max3);
    }
}
