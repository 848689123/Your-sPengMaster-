package Solution500_600;

public class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int result = 1;
        int max = (int)Math.sqrt(num);
        for(int i = 2; i <= max; i++)
            if(num % i == 0)
                num += i + (num / i);
        return result==num;
    }
}
