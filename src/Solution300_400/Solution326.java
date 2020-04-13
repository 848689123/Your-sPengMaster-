package Solution300_400;

public class Solution326 {
    public boolean isPowerOfThree(int n) {
        if(n == 0)  return true;
        int result = 1;
        for(int i = 1; result < n ;i++){
            result *= 3;
            if(result==n)
                return true;
        }
        return false;
    }
}
