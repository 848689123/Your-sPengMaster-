package Solution400_500;

import java.util.Arrays;

public class Solution400 {
    public static void main(String[] args) {
        long sum = 0;
        for(int i=0;i<=9;i++)
            sum+=(int)Math.pow(10, i) * 9 * (i + 1);
        System.out.println(findNthDigit(196));
    }

    public static int findNthDigit(int n) {
        if(n < 10)  return n;
        long sum = 0;
        int i;
        for(i = 0; n >= sum ; i++)
            sum += Math.pow(10, i) * 9 * (i + 1);
        int sum2 = (int)(sum - (long)Math.pow(10, i-1) * 9 * i);  //记录剩下多少位
        int cha = n - sum2;
        int index = cha % i -1;
        if(cha % i == 0)    cha--;
        cha = cha/i+1;
        int t = (int)Math.pow(10, i-1);
        for(int j = 1; j < cha; j++)
            t++;
        String s = String.valueOf(t);
        if(index == -1)  index = s.length()-1;
        int result = s.charAt(index) - '0';
        return result;
    }
}
