import java.util.ArrayList;
import java.util.List;

public class Solution204 {
    public static void main(String[] args) {
//        System.out.println(countPrimes(3));
        System.out.println('A'-'C');
    }
    public static int countPrimes(int n) {
        boolean nums[] = new boolean[n];
        for(int i=2;i<nums.length;i++)
            nums[i] = true;
        for(int i=2; i*i<nums.length; i++){
            if(nums[i]){
                for (int j=i*i;j<nums.length;j+=i)
                    nums[j] = false;
            }
        }
        int count = 0;
        for(boolean b:nums)
            count += b?1:0;
        return count;
    }
}
