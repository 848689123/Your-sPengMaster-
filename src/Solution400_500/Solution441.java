package Solution400_500;

public class Solution441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(6));
    }
    public static int arrangeCoins(int n) {
        long i;
        long sum = 0;
        for(i = 1; sum  < n; i++)
            sum += i;
        i--;
        long s = i + (i * (i - 1))/2;
        if(n != s)
            return (int)i -1;
        return (int)i;
    }
}
