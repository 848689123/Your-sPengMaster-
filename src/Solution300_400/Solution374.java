package Solution300_400;

public class Solution374 {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int middle = 0;
        while(left <= right){
            middle = left + (right -left) / 2;
            if(guess(middle) > 0)
                left = middle + 1;
            else if(guess(middle) < 0)
                right = middle - 1;
            else return middle;
        }
        return middle;
    }
    public int guess(int x){
        return 0;
    }
}
