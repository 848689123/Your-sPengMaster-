package Solution300_400;

public class Solution367 {
    public boolean isPerfectSquare(int num) {
        for(int i = 1; i <= 46340; i++){
            if(i * i == num)
                return true;
            if(i * i > num)
                break;
        }
        return false;
    }
}
